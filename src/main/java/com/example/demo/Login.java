package com.example.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Base64;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.LoginExtDto;
import com.example.demo.dto.TokenExtDto;

public class Login {
//	http://localhost:8081/education/public/login/ext/loginnew
	public static String host = "localhost";
	public static String port = "8081";
	public static String api = "/education/public/login/ext/loginnew";
	public static String access_token = "";
	public static String token_type = "";
	public static String url = host + ":" + port + api;

	public static ResponseEntity<String> postLogin(String username, String password, String url, String jString) {
		try {
//			if(RestApiUtils.host==null|| RestApiUtils.host.length()<=0) {
//				RestApiUtils.getConfig();
//			}
			String authStr = "education_client:password";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());
			HttpHeaders headersLogin = new HttpHeaders();
//			headersLogin.add("Authorization", "Basic ZWR1Y2F0aW9uX2NsaWVudDpwYXNzd29yZA==");
			headersLogin.add("Authorization", "Basic " + base64Creds);
			headersLogin.add("Content-Type", "application/x-www-form-urlencoded");

			// headersLogin.add("Accept-Charset", "UTF-8");
			MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
			map.add("client_id", "education_client");
			map.add("grant_type", "password");
			map.add("username", username);
			map.add("password", password);
			map.add("client_secret", "password");
//			HttpEntity<String> request = new HttpEntity<String>(jString, headersLogin);
//			String body="client_id=education_client&grant_type=password&username=tuyenlt&password=Globits@123&client_secret=password";
//			HttpEntity<String> request = new HttpEntity<String>(body, headersLogin);
			KeyStore clientStore = getKeystore();
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
			HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headersLogin);
			RestTemplate restTemplate = new RestTemplate(requestFactory);
			ResponseEntity<String> responseLogin = null;
			try {
				responseLogin = restTemplate.exchange(Const.URL_STRING+"/oauth/token", HttpMethod.POST,
						request, String.class);
//				System.out.println(responseLogin.getBody());

				if (responseLogin.getBody() != null && responseLogin.getBody().length() > 0) {
					if (responseLogin.getBody().contains(",")) {
						String[] output = responseLogin.getBody().split(",");
						if (output != null && output.length > 0) {
							for (int i = 0; i < output.length; i++) {
								if (output[i] != null && output[i].contains(":")) {
									String[] acc = output[i].split(":");
									if (acc != null && acc.length > 0) {
										for (int j = 0; j < acc.length; j++) {
											if (acc[j].contains("access_token")) {
												access_token = acc[j + 1];
												access_token = access_token.replace('"', ' ');
												access_token = access_token.replace('"', ' ');
											}
											if (acc[j].contains("token_type")) {
												token_type = acc[j + 1];
												token_type = token_type.replace('"', ' ');
												token_type = token_type.replace('"', ' ');
											}
										}
									}
								}
							}
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			return responseLogin;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static <T> ResponseEntity<T> post(String username, String password, String urlLogin, String url,
			Object parameterObject, Class<T> returnType) {
//		try {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		postLogin(username, password, urlLogin, null);
//		headers.add("Authorization", com.example.tool.Login.token_type + " " + Login.access_token);
		HttpEntity<T> entity = new HttpEntity<T>((T) parameterObject, headers);
		ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.POST, entity, returnType);
		ResponseEntity<T> page = response;
		return page;
//		} catch (Exception e) {
//			e.getMessage();
////			ResponseEntity<T> page = new ResponseEntity<T>(e.getMessage());
//			e.printStackTrace();
//			return null;
//		}
	}

	public static KeyStore getKeystore()
			throws NoSuchAlgorithmException, CertificateException, IOException, KeyStoreException {
		KeyStore clientStore = KeyStore.getInstance("jks");
		//

		clientStore.load(ResourceUtil.Instance().getFileFromResourceAsStream("star.globits.net.jks"), Const.passwordSSL.toCharArray());
//		clientStore.load(ResourceUtil.Instance().getFileFromResourceAsStream("certificate.p12"),
//				"123456".toCharArray());
		return clientStore;
	}

//	public static TokenExtDto getToken(LoginExtDto dto) {
//		System.out.println("Login for user:" + dto.getUsername());
//		ResponseEntity<String> responseLogin = RestApiUtils.postLogin(dto.getUsername(), dto.getPassword(),
//				dto.getUrl());
//		TokenExtDto ret = new TokenExtDto();
//		String access_token = "";
//		String token_type = "";
//		String refresh_token = "";
//		String expires_in = "";
//		String scope = "";
//		if (responseLogin != null && responseLogin.getBody() != null && responseLogin.getBody().length() > 0) {
//			if (responseLogin.getBody().contains(",")) {
//				String[] output = responseLogin.getBody().split(",");
//				if (output != null && output.length > 0) {
//					for (int i = 0; i < output.length; i++) {
//						if (output[i] != null && output[i].contains(":")) {
//							String[] acc = output[i].split(":");
//							if (acc != null && acc.length > 0) {
//								for (int j = 0; j < acc.length; j++) {
//									if (acc[j].contains("access_token")) {
//										access_token = acc[j + 1];
//										access_token = access_token.replace('"', ' ');
//										access_token = access_token.replace('"', ' ');
//									}
//									if (acc[j].contains("token_type")) {
//										token_type = acc[j + 1];
//										token_type = token_type.replace('"', ' ');
//										token_type = token_type.replace('"', ' ');
//									}
//									if (acc[j].contains("refresh_token")) {
//										refresh_token = acc[j + 1];
//										refresh_token = refresh_token.replace('"', ' ');
//										refresh_token = refresh_token.replace('"', ' ');
//									}
//									if (acc[j].contains("expires_in")) {
//										expires_in = acc[j + 1];
//										expires_in = expires_in.replace('"', ' ');
//										expires_in = expires_in.replace('"', ' ');
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		} else {
//			System.out.println("Login fail for user:" + dto.getUsername() + ":" + dto.getPassword());
//		}
//		ret.setAccess_token(access_token.trim());
//		ret.setExpires_in(expires_in.trim());
//		ret.setRefresh_token(refresh_token.trim());
//		ret.setScope(scope.trim());
//		ret.setToken_type(token_type.trim());
//		return ret;
//	}
}
