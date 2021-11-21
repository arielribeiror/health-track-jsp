package br.com.fiap.healthtrack.auth;

import java.time.LocalDate;

/**
 * 
 * @author Grupo 23
 * @version 1.0
 */
public class Executable {

	/**
	 * User instance
	 */
	static User user = new User("1", "Ariel", "Ribeiro", LocalDate.now(), "arielribeiro@fiap.com.br", "arielribeiro", "senhaSegura123", "https://github.com/arielribeiro.png", true);
	
	/**
	 * Token instance
	 */
	static Token token = new Token();
	
	/**
	 * main method
	 * @param args default param
	 */
	public static void main(String[] args) {
		
		/**
		 * User methods call
		 */
		user.addUser();
		user.getUserByUsername("arielribeiro");
		user.getUserById("1");
		user.editUser("1", "Ariel", "Ribeiro", LocalDate.of(1992, 02, 06), "arielribeiro", "arielribeiro@fiap.com.br", "senhaMuitoSeguraMesmo", "https://github.com/arielribeiro.png", true);
		user.editUserStatus("1", false);
		
		/**
		 * Token methods call
		 */
		token.setToken(user.username, user.password);
		token.getToken();
	}
}
