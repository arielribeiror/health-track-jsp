package br.com.fiap.healthtrack.model;

/**
 * @author Grupo 23
 * @version 1.0
 */
public class FoodType {
  /**
   * Type Id to uniqueness
   */
  private String typeId;
  /**
   * Food Type
   */
  private String type;

  /**
   * Food type Constructor
   *
   * @param typeId to uniqueness
   * @param type   to food classify
   */
  public FoodType(String typeId, String type) {
    this.typeId = typeId;
    this.type = type;
  }

  /**
   * @return the food type
   */
  public String getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "FoodType [typeId=" + typeId + ", type=" + type + "]";
  }

}
