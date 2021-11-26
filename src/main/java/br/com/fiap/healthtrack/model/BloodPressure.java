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
   * @param actualAt         to date time register
   */
  public BloodPressure(String bloodPressureId, int systolicPressure, int diastolicPressure, Date actualAt) {
    this.bloodPressureId = bloodPressureId;
    this.systolicPressure = systolicPressure;
    this.diastolicPressure = diastolicPressure;
    this.actualAt = actualAt;
  }

  public BloodPressure() {}

  public String getBloodPressureId() {
    return bloodPressureId;
  }

  public void setBloodPressureId(String bloodPressureId) {
    this.bloodPressureId = bloodPressureId;
  }

  public int getSystolicPressure() {
    return systolicPressure;
  }

  public void setSystolicPressure(int systolicPressure) {
    this.systolicPressure = systolicPressure;
  }

  public int getDiastolicPressure() {
    return diastolicPressure;
  }

  public void setDiastolicPressure(int diastolicPressure) {
    this.diastolicPressure = diastolicPressure;
  }

  public Date getActualAt() {
    return actualAt;
  }

  public void setActualAt(Date actualAt) {
    this.actualAt = actualAt;
  }

  @Override
  public String toString() {
    return "BloodPressure [bloodPressureId=" + bloodPressureId + ", systolicPressure=" + systolicPressure
        + ", diastolicPressure=" + diastolicPressure + ", actualAt=" + actualAt + "]";
  }

}
