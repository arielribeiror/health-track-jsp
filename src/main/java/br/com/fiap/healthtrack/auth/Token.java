package br.com.fiap.healthtrack.auth;

import java.time.LocalDateTime;

/**
 * 
 * @author Grupo 23
 * @version 1.0
 */
public class Token {
	/**
	 * Token to application security formed by username + password + expiration date
	 */
	private String token;
	
	/**
	 * Expiration date set by the application
	 */
	private LocalDateTime expiration;
	
	/**
	 * Get token by any project class
	 * @return token
	 */
	public String getToken() {		
		return token;
	}
	
	/**
	 * Set and generate Token 
	 * @param username entered by user at login 
	 * @param password entered by user at login
	 */
	public void setToken(String username, String password) {
		this.expiration = 
			LocalDateTime.of(
				LocalDateTime.now().getYear() + 1, 
				LocalDateTime.now().getMonth(), 
				LocalDateTime.now().getDayOfMonth(), 
				LocalDateTime.now().getHour(), 
				LocalDateTime.now().getMinute(), 
				LocalDateTime.now().getSecond()
			);
		this.token = username + password + this.expiration;
		System.out.println(String.format("Token: %s", token));
	}
}
