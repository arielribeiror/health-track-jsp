package br.com.fiap.healthtrack.auth;

import java.sql.Date;

/**
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
  private Date birthday;
  /**
   * User email
   */
  private String email;
  /**
   * User username (login)
   */
  private String username;
  /**
   * User password
   */
  private String password;
  /**
   * User image to avatar
   */
  private String image;
  /**
   * User availability status in the application
   */
  private Boolean enable;

  private String gender;

  private Double height;

  public User() {
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

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

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }
}
