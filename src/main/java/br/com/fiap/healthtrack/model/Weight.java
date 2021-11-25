package br.com.fiap.healthtrack.model;

import java.sql.Date;

/**
 * @author Grupo 23
 * @version 1.0
 */
public class Weight {
  private String weightId;
  private Double weight;
  private Date actualAt;

  /**
   * Weight Constructor
   *
   * @param weightId to uniqueness
   * @param weight   to user register
   * @param actualAt to date time register
   */
  public Weight(String weightId, Double weight, Date actualAt) {
    this.weightId = weightId;
    this.weight = weight;
    this.actualAt = actualAt;
  }

  public Weight() {}

  public String getWeightId() {
    return weightId;
  }

  public void setWeightId(String weightId) {
    this.weightId = weightId;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Date getActualAt() {
    return actualAt;
  }

  public void setActualAt(Date actualAt) {
    this.actualAt = actualAt;
  }

  @Override
  public String toString() {
    return "Weight [weightId=" + weightId + ", weight=" + weight + ", actualAt=" + actualAt + "]";
  }

}
