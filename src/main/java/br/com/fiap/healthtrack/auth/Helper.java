package br.com.fiap.healthtrack.auth;

import java.time.LocalDate;

/**
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
   *
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
    super();
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

}
