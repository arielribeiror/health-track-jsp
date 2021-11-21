package br.com.fiap.healthtrack.model;

import java.sql.Date;

/**
 * @author Grupo 23
 * @version 1.0
 */
public class BloodPressure {
  /**
   * Blood pressure id to uniqueness
   */
  private String bloodPressureId;
  /**
   * Systolic pressure
   */
  private int systolicPressure;
  /**
   * Diastolic pressure
   */
  private int diastolicPressure;
  /**
   * Effective date of registration
   */
  private Date actualAt;

  /**
   * Blood Pressure Constructor
   *
   * @param bloodPressureId   to uniqueness
   * @param systolicPressure  to user systolic pressure
   * @param diastolicPressure to user diastolic pressure
   * @param actualAt2         to date time register
   */
  public BloodPressure(String bloodPressureId, int systolicPressure, int diastolicPressure, Date actualAt) {
    this.bloodPressureId = bloodPressureId;
    this.systolicPressure = systolicPressure;
    this.diastolicPressure = diastolicPressure;
    this.actualAt = actualAt;
  }

  /**
   * Get blood pressure
   */
  public void addBloodPressure() {
    System.out.println(String.format("Pressão sanguínea, de %s por %s, foi adicionada com sucesso!", systolicPressure, diastolicPressure));
  }

  /**
   * Get blood pressure by id
   *
   * @param bloodPressureId to check uniqueness
   * @return systolicPressure/diastolicPressure
   */
  public String getBloodPressureById(String bloodPressureId) {
    if (bloodPressureId != this.bloodPressureId) {
      System.out.println("Pressão sanguínea não encontrada");
    } else {
      System.out.println(String.format("Pressão sanguínea, de %s por %s, encontrada!", systolicPressure, diastolicPressure));
    }
    return systolicPressure + "/" + diastolicPressure;
  }

  /**
   * Edit blood pressure
   *
   * @param bloodPressureId   to check uniqueness
   * @param systolicPressure  to user blood pressure
   * @param diastolicPressure to user blood pressure
   */
  public void editBloodPressure(String bloodPressureId, int systolicPressure, int diastolicPressure) {
    if (bloodPressureId != this.bloodPressureId) {
      System.out.println("Pressão sanguínea não encontrada");
    } else {
      System.out.println("Pressão sanguínea alterada com sucesso!");
    }
  }

  @Override
  public String toString() {
    return "BloodPressure [bloodPressureId=" + bloodPressureId + ", systolicPressure=" + systolicPressure
        + ", diastolicPressure=" + diastolicPressure + ", actualAt=" + actualAt + "]";
  }

}
