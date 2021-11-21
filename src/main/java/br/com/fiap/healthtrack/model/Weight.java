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

  /**
   * Get weight
   */
  public void addWeight() {
    System.out.println(String.format("Novo peso, de %sKg, foi adicionado com sucesso!", weight));
  }

  /**
   * Get weight by id
   *
   * @param weightId to check uniqueness
   * @return weight to user register
   */
  public Double getWeightById(String weightId) {
    if (weightId != this.weightId) {
      System.out.println("Peso não encontrado");
    } else {
      System.out.println(String.format("Peso de %sKg encontrado!", weight));
    }
    return weight;
  }

  /**
   * Edit weight
   *
   * @param weightId to check uniqueness
   * @param weight   to user register
   */
  public void editWeight(String weightId, Double weight) {
    if (weightId != this.weightId) {
      System.out.println("Peso não encontrado");
    } else {
      System.out.println("Peso alterado com sucesso!");
    }
  }

  @Override
  public String toString() {
    return "Weight [weightId=" + weightId + ", weight=" + weight + ", actualAt=" + actualAt + "]";
  }

}
