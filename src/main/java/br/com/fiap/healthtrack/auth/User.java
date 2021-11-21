package br.com.fiap.healthtrack.auth;

import java.time.LocalDate;

/**
 * 
 * @author Grupo 23
 * @version 1.0
 */
public class User {
	/**
	 * User Id to uniqueness
	 */
	private String userId;
	/**
	 * User first name
	 */
	private String firstName;
	/**
	 * User last name
	 */
	private String lastName;
	/**
	 * User birthday
	 */
	private LocalDate birthday;
	/**
	 * User email
	 */
	private String email;
	/**
	 * User username (login)
	 */
	String username;
	/**
	 * User password
	 */
	String password;
	/**
	 * User image to avatar
	 */
	private String image;
	/**
	 * User availability status in the application
	 */
	private Boolean enable;

	/**
	 * User Constructor
	 * 
	 * @param userId    to uniqueness
	 * @param firstName to user first name
	 * @param lastName  to user last name
	 * @param birthday  to user birthday
	 * @param email     to user email
	 * @param username  to user username and uniqueness
	 * @param password  to user password and security
	 * @param image     to user image profile avatar
	 * @param enable    to user activate or deactivate
	 */
	public User(String userId, String firstName, String lastName, LocalDate birthday, String email, String username,
			String password, String image, Boolean enable) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.email = email;
		this.username = username;
		this.password = password;
		this.image = image;
		this.enable = enable;
	}

	/**
	 * Add user method
	 */
	public void addUser() {
		System.out.println(
				String.format("%s, com o username %s, foi criado com sucesso!", firstName + ' ' + lastName, username));
	}

	/**
	 * Get user by username
	 * 
	 * @param username to check uniqueness
	 * @return username
	 */
	public String getUserByUsername(String username) {
		if (username != this.username) {
			System.out.println("Usuário não encontrado");
		} else {
			System.out.println(String.format("Usuário %s encontrado!", username));
		}
		return username;
	}

	/**
	 * Get user by id
	 * 
	 * @param userId to check uniqueness
	 * @return username
	 */
	public String getUserById(String userId) {
		if (userId != this.userId) {
			System.out.println("Usuário não encontrado");
		} else {
			System.out.println(String.format("Usuário %s encontrado!", username));
		}
		return username;
	}

	/**
	 * Edit user
	 * 
	 * @param userId    to check uniqueness
	 * @param firstName to update user first name
	 * @param lastName  to update user last name
	 * @param birthday  to update user birthday
	 * @param email     to update user email
	 * @param username  to update user username
	 * @param password  to update user password
	 * @param image     to update user image profile avatar
	 * @param enable    to update user active status
	 */
	public void editUser(String userId, String firstName, String lastName, LocalDate birthday, String username,
			String email, String password, String image, Boolean enable) {
		if (userId != this.userId) {
			System.out.println("Usuário não encontrado");
		} else {
			System.out.println(String.format("%s, com o username %s, foi alterado com sucesso!",
					firstName + ' ' + lastName, username));
		}
	}

	/**
	 * Edit user status availability in the application
	 * 
	 * @param userId to check uniqueness
	 * @param enable to change user active status
	 */
	public void editUserStatus(String userId, Boolean enable) {
		if (userId != this.userId) {
			System.out.println("Usuário não encontrado");
		} else {
			System.out.println(String.format("%s, com o username %s, foi %s com sucesso!", firstName + ' ' + lastName,
					username, enable ? "ativado" : "desativado"));
		}
	}
}
