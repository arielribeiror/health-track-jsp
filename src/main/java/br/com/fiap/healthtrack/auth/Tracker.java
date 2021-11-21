package br.com.fiap.healthtrack.auth;

import java.time.LocalDate;

/**
 * 
 * @author Grupo 23
 * @version 1.0
 */
public class Tracker extends User {
	/*
	 * User plan
	 */
	private String plan;
	/*
	 * User level
	 */
	private String level;

	/**
	 * Tracker constructor
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param birthday
	 * @param email
	 * @param username
	 * @param password
	 * @param image
	 * @param enable
	 */
	public Tracker(String userId, String firstName, String lastName, LocalDate birthday, String email, String username,
			String password, String image, Boolean enable, String plan, String level) {
		super(userId, firstName, lastName, birthday, email, username, password, image, enable);
	}

	/**
	 * @return the plan
	 */
	public String getPlan() {
		return plan;
	}

	/**
	 * @param plan the plan to set
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * Change student plan method
	 */
	public void changePlan() {
		System.out.println(String.format("%s alterado com sucesso!", plan));
	}

	/**
	 * Add student plan method
	 */
	public void addPlan() {
		System.out.println(String.format("%s criado com sucesso!", plan));
	}

	/**
	 * Change student level method
	 */
	public void changeLevel() {
		System.out.println(String.format("%s alterado com sucesso!", level));
	}

	/**
	 * Add student level method
	 */
	public void addLevel() {
		System.out.println(String.format("%s criado com sucesso!", level));
	}

}
