package br.com.fiap.healthtrack.model;

import java.sql.Date;

/**
 * @author Grupo 23
 * @version 1.0
 */
public class Food {
  /**
   * Food Id to uniqueness
   */
  private String foodId;
  /**
   * Activity type
   */
  private String type;
  /**
   * Caloric gain
   */
  private int caloricGain;
  /**
   * Effective date of registration
   */
  private Date actualAt;
  /**
   * Description of Activity
   */
  private String description;

  /**
   * @param foodId      to uniqueness
   * @param type        to food classify
   * @param caloricGain to user caloric gain
   * @param actualAt    to date time register
   * @param description to identify food
   */
  public Food(String foodId, String type, int caloricGain, Date actualAt, String description) {
    this.foodId = foodId;
    this.type = type;
    this.caloricGain = caloricGain;
    this.actualAt = actualAt;
    this.description = description;
  }

  public Food() {}

  public String getFoodId() {
    return foodId;
  }

  public void setFoodId(String foodId) {
    this.foodId = foodId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getCaloricGain() {
    return caloricGain;
  }

  public void setCaloricGain(int caloricGain) {
    this.caloricGain = caloricGain;
  }

  public Date getActualAt() {
    return actualAt;
  }

  public void setActualAt(Date actualAt) {
    this.actualAt = actualAt;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Food [foodId=" + foodId + ", type=" + type + ", caloricGain=" + caloricGain + ", actualAt=" + actualAt
        + ", description=" + description + "]";
  }

}
