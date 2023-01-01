package com.example.demo;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.poi.ss.formula.functions.T;
import org.bson.json.JsonObject;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.StudentCourseRegisterViewDto;
import com.example.demo.dto.StudentCourseSubjectDto;
import com.example.demo.dto.StudentDto;


public class RegisterSubject {
	public StudentCourseRegisterViewDto testRegisterSubject(String accessToken, String tokenType, Long stuId) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, UnrecoverableKeyException, KeyManagementException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenType + " " + accessToken);
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		String url = Const.URL_STRING + "/api/cs_reg_mongo/findByPeriod/" + stuId + "/" + Const.SEMESTER_STRING;
		KeyStore clientStore = Login.getKeystore();
		SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
		sslContextBuilder.useProtocol("TLS");
		sslContextBuilder.loadKeyMaterial(clientStore, Const.passwordSSL.toCharArray());
		sslContextBuilder.loadTrustMaterial(clientStore);

		SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(
				sslContextBuilder.build());
		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory)
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		HttpEntity<T> entity = new HttpEntity<T>((T) null, headers);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		ResponseEntity<StudentCourseRegisterViewDto> response = restTemplate.exchange(url, HttpMethod.GET, entity,
				StudentCourseRegisterViewDto.class);
		return response.getBody();
	}

	public StudentCourseSubjectDto addRegister(String accessToken, String tokenType, String json, Long stuId) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, UnrecoverableKeyException, KeyManagementException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenType + " " + accessToken);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		KeyStore clientStore = Login.getKeystore();
		SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
		sslContextBuilder.useProtocol("TLS");
		sslContextBuilder.loadKeyMaterial(clientStore, Const.passwordSSL.toCharArray());
		sslContextBuilder.loadTrustMaterial(clientStore);

		SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(
				sslContextBuilder.build());
		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory)
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		String url = Const.URL_STRING + "/api/cs_reg_mongo/add-register/" + stuId + "/" + Const.SEMESTER_STRING;
		HttpEntity<String> request = new HttpEntity<String>(json, headers);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		ResponseEntity<StudentCourseSubjectDto> response = restTemplate.postForEntity(url, request,
				StudentCourseSubjectDto.class);
		return response.getBody();
	}

	public Long getCurrentUser(String accessToken, String tokenType) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, UnrecoverableKeyException, KeyManagementException {
		String url = Const.URL_STRING+"/api/student/getstudentbylogin";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenType + " " + accessToken);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		KeyStore clientStore = Login.getKeystore();
		SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
		sslContextBuilder.useProtocol("TLS");
		sslContextBuilder.loadKeyMaterial(clientStore, Const.passwordSSL.toCharArray());
		sslContextBuilder.loadTrustMaterial(clientStore);

		SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(
				sslContextBuilder.build());
		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory)
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		HttpEntity<T> entity = new HttpEntity<T>((T) null, headers);
		ResponseEntity<StudentDto> response = restTemplate.exchange(url, HttpMethod.GET, entity, StudentDto.class);
		System.out.println(response.getBody().getId());
		return response.getBody().getId();
	}
	
	public Long findStudentByStudentCode(String studentCode, String accessToken, String tokenType) throws ParseException, JsonGenerationException, JsonMappingException, IOException, NoSuchFieldException, SecurityException, NoSuchAlgorithmException, CertificateException, KeyStoreException, UnrecoverableKeyException, KeyManagementException {
		String url = Const.URL_STRING+"/api/student/studentCodeDto/" + studentCode + "/1/100";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenType + " " + accessToken);
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		HttpEntity<T> entity = new HttpEntity<T>((T) null, headers);
		KeyStore clientStore = Login.getKeystore();
		SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
		sslContextBuilder.useProtocol("TLS");
		sslContextBuilder.loadKeyMaterial(clientStore, Const.passwordSSL.toCharArray());
		sslContextBuilder.loadTrustMaterial(clientStore);

		SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(
				sslContextBuilder.build());
		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory)
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		ResponseEntity<JSONObject> response = restTemplate.exchange(url, HttpMethod.GET, entity, JSONObject.class);
		ArrayList<Object> arrayList = (ArrayList<Object>) response.getBody().get("content");
		Long id= null;
		for(Object object : arrayList) {
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			String json = ow.writeValueAsString(object);
			JSONParser parser = new JSONParser();
			JSONObject jsonObject = (JSONObject) parser.parse(json);
			
			id =  Long.parseLong(jsonObject.get("id").toString());
			System.out.println(jsonObject.get("displayName"));

		}
		return id;
	}
}
