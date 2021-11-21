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

  /**
   * Get food
   */
  public void addFood() {
    System.out.println(String.format("%s, em %s, com o ganho calórico de %s, foi adicionado com sucesso!",
        description, type, caloricGain));
  }

  /**
   * Get food by id
   *
   * @param foodId to check uniqueness
   * @return description to identify food
   */
  public String getFoodById(String foodId) {
    if (foodId != this.foodId) {
      System.out.println("Alimento não encontrado");
    } else {
      System.out.println(String.format("%s, em %s, encontrado!", description, type));
    }
    return description;
  }

  /**
   * Get foods by Type
   *
   * @param type to food classify
   * @return description to identify food
   */
  public String getFoodsByType(String type) {
    if (type != this.type) {
      System.out.println("Não encontramos alimentos com esse tipo");
    } else {
      System.out.println(String.format("%s, em %s, foram encontrados!", description, type));
    }
    return description;
  }

  /**
   * Edit food
   *
   * @param foodId      to check uniqueness
   * @param type        to food classify
   * @param caloricGain to user caloric gain
   * @param actualAt    to date time register
   * @param description to identify food
   */
  public void editFood(String foodId, String type, int caloricGain, Date actualAt, String description) {
    if (foodId != this.foodId) {
      System.out.println("Alimento não encontrado");
    } else {
      System.out.println(String.format("%s, em %s, com o ganho calórico de %s, foi alterado com sucesso!",
          description, type, caloricGain));
    }
  }

  @Override
  public String toString() {
    return "Food [foodId=" + foodId + ", type=" + type + ", caloricGain=" + caloricGain + ", actualAt=" + actualAt
        + ", description=" + description + "]";
  }

}
