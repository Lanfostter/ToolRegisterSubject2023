package com.example.demo.listener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.example.demo.Const;
import com.example.demo.Login;
import com.example.demo.RegisterSubject;
import com.example.demo.dto.CourseRegisterViewDto;
import com.example.demo.dto.CourseSubjectDto;
import com.example.demo.dto.LoginExtDto;
import com.example.demo.dto.StudentCourseRegisterViewDto;
import com.example.demo.dto.StudentCourseSubjectDto;
import com.example.demo.dto.SubjectRegistrationDto;
import com.example.demo.dto.TimeTableDto;
import com.example.demo.dto.UserDto;

@Component
public class ApplicationStartupListener implements ApplicationListener<ContextRefreshedEvent>, InitializingBean {
	@Autowired
	Environment env;

	@Override
	public void afterPropertiesSet() throws Exception {
		Login login = new Login();
		Const.URL_STRING = env.getProperty("url");
		Const.SEMESTER_STRING = env.getProperty("semester");
		LoginExtDto loginExtDto = new LoginExtDto();
		loginExtDto.setUsername("admin");
		loginExtDto.setPassword("admin");
		ObjectWriter mapper1 = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String jsonString1 = null;
		try {
			jsonString1 = mapper1.writeValueAsString(loginExtDto);
		} catch (JsonGenerationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (JsonMappingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String logString = login
				.postLogin(loginExtDto.getUsername(), loginExtDto.getPassword(), "https://" + login.url, jsonString1)
				.getBody();
		// danh sách mã sinh viên
		List<UserDto> dtos = list("list_student.json");
		for (UserDto dto : dtos) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(logString);
					System.out.println(login.token_type + " " + login.access_token);
					RegisterSubject subject = new RegisterSubject();
					Long id = null;
					try {
						// sinh viên tự đăng nhập
//						id = subject.getCurrentUser(login.access_token, login.token_type);
						// admin đăng ký cho sinh viên
						id = subject.findStudentByStudentCode(dto.getUsername(), login.access_token, login.token_type);
					} catch (KeyManagementException | NoSuchAlgorithmException | CertificateException
							| KeyStoreException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (NoSuchFieldException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnrecoverableKeyException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					StudentCourseRegisterViewDto studentCourseRegisterViewDto = null;
					try {
						studentCourseRegisterViewDto = subject.testRegisterSubject(login.access_token, login.token_type,
								id);
					} catch (UnrecoverableKeyException | KeyManagementException | NoSuchAlgorithmException
							| CertificateException | KeyStoreException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					CourseRegisterViewDto courseRegisterViewDto = studentCourseRegisterViewDto
							.getCourseRegisterViewObject();
					for (SubjectRegistrationDto registrationDto : courseRegisterViewDto
							.getListSubjectRegistrationDtos()) {
						for (CourseSubjectDto courseSubjectDto : registrationDto.getCourseSubjectDtos()) {
							ObjectWriter mapper = new ObjectMapper().writer().withDefaultPrettyPrinter();
							try {
								String jsonString = mapper.writeValueAsString(courseSubjectDto);
								System.out.println(courseSubjectDto.getDisplayName());
								StudentCourseSubjectDto scsDto = subject.addRegister(login.access_token,
										login.token_type, jsonString, id);
							} catch (JsonGenerationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (JsonMappingException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (UnrecoverableKeyException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (KeyManagementException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (NoSuchAlgorithmException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (CertificateException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (KeyStoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						}

					}
				}

			});
			System.out.println(thread.getName() + " start");
			thread.start();
		}
	}

	public List<UserDto> list(String fileJson) {
		Object object;
		JSONParser jsonParser = new JSONParser();
		List<UserDto> dtos = new ArrayList<>();
		try {
			URL url = getClass().getClassLoader().getResource(fileJson);
			FileReader fileReader = new FileReader(url.getPath());
			object = jsonParser.parse(fileReader);
			JSONArray jsonStus = (JSONArray) object;
			for (Object jsonObj : jsonStus) {
				UserDto dto = new UserDto();
				JSONObject jsonObject = (JSONObject) jsonObj;
				dto.setUsername((String) jsonObject.get("username"));
				dto.setPassword((String) jsonObject.get("password"));
				dtos.add(dto);
			}
			System.out.println(jsonStus);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dtos;

	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub

	}

}
