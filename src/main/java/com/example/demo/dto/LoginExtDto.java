package com.example.demo.dto;

import java.io.Serializable;

public class LoginExtDto implements Serializable {
	private String username;

	private String password;
	private String url;
	private String token;

	private boolean isRunning;
	private boolean isComplete;

	private TokenExtDto retDto;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public TokenExtDto getRetDto() {
		return retDto;
	}

	public void setRetDto(TokenExtDto retDto) {
		this.retDto = retDto;
	}
}
