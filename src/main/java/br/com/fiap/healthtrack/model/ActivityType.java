package br.com.fiap.healthtrack.model;

/**
 * @author Grupo 23
 * @version 1.0
 */
public class ActivityType {
  /**
   * Type Id to uniqueness
   */
  private String typeId;
  /**
   * Activity type
   */
  private String type;

  /**
   * Activity type Constructor
   *
   * @param typeId
   * @param type
   */
  public ActivityType(String typeId, String type) {
    this.typeId = typeId;
    this.type = type;
  }

  /**
   * @return the type
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
    return "ActivityType [typeId=" + typeId + ", type=" + type + "]";
  }
}
