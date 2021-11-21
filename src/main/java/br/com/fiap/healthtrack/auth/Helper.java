package br.com.fiap.healthtrack.auth;

import java.time.LocalDate;

/**
 * 
 * @author Grupo 23
 * @version 1.0
 */
public class Helper extends User {
	/**
	 * professional category
	 */
	private String professionalCategory;
	/**
	 * Professional specialty
	 */
	private String specialty;
	/**
	 * Professional registry
	 */
	private String professionalRegistry;
	/**
	 * Account bank id
	 */
	private String accountId;

	/**
	 * Helper constructor
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
	public Helper(String userId, String firstName, String lastName, LocalDate birthday, String email, String username,
			String password, String image, Boolean enable, String professionalCategory, String specialty,
			String professionalRegistry, String accountId) {
		super(userId, firstName, lastName, birthday, email, username, password, image, enable);
	}

	/**
	 * @return the professionalCategory
	 */
	public String getProfessionalCategory() {
		return professionalCategory;
	}

	/**
	 * @param professionalCategory the professionalCategory to set
	 */
	public void setProfessionalCategory(String professionalCategory) {
		this.professionalCategory = professionalCategory;
	}

	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	/**
	 * @return the professionalRegistry
	 */
	public String getProfessionalRegistry() {
		return professionalRegistry;
	}

	/**
	 * @param professionalRegistry the professionalRegistry to set
	 */
	public void setProfessionalRegistry(String professionalRegistry) {
		this.professionalRegistry = professionalRegistry;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}



	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}



	/**
	 * Change professional category method
	 */
	public void changeProfessionalCategory() {
		System.out.println(String.format("%s alterado com sucesso!", professionalCategory));
	}

	/**
	 * Add professional category method
	 */
	public void addProfessionalCategory() {
		System.out.println(String.format("%s criado com sucesso!", professionalCategory));
	}

	/**
	 * Change professional specialty method
	 */
	public void changeSpecialty() {
		System.out.println(String.format("%s alterado com sucesso!", specialty));
	}

	/**
	 * Add professional specialty method
	 */
	public void addSpecialty() {
		System.out.println(String.format("%s criado com sucesso!", specialty));
	}

	/**
	 * Change professional registry method
	 */
	public void changeProfessionalRegistry() {
		System.out.println(String.format("%s alterado com sucesso!", professionalRegistry));
	}

	/**
	 * Add professional registry method
	 */
	public void addProfessionalRegistry() {
		System.out.println(String.format("%s criado com sucesso!", professionalRegistry));
	}

	/**
	 * Change bank account
	 * @param accountId
	 */
	public void changeAccount(String accountId) {
		System.out.println(String.format("%s alterado com sucesso!", accountId));
	}

	/**
	 * Add bank account
	 * @param accountId
	 */
	public void addAccount(String accountId) {
		System.out.println(String.format("%s criado com sucesso!", accountId));
	}
}
