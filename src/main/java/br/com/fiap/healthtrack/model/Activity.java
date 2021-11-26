package br.com.fiap.healthtrack.model;

import java.sql.Date;

/**
 * @author Grupo 23
 * @version 1.0
 */
public class Activity {
    /**
     * Activity Id to uniqueness
     */
    private String activityId;
    /**
     * Activity type
     */
    private String type;
    /**
     * Caloric loss
     */
    private int caloricLoss;
    /**
     * Effective date of registration
     */
    private Date actualAt;
    /**
     * Description of Activity
     */
    private String description;

    /**
     * Activity Constructor
     *
     * @param activityId  to uniqueness
     * @param type        to activity classify
     * @param caloricLoss to user caloric loss
     * @param actualAt    to date time register
     * @param description to identify activity
     */
    public Activity(String activityId, String type, int caloricLoss, Date actualAt, String description) {
        this.activityId = activityId;
        this.type = type;
        this.caloricLoss = caloricLoss;
        this.actualAt = actualAt;
        this.description = description;
    }

  public Activity() {}

  public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaloricLoss() {
        return caloricLoss;
    }

    public void setCaloricLoss(int caloricLoss) {
        this.caloricLoss = caloricLoss;
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
        return "Activity [activityId=" + activityId + ", type=" + type + ", caloricLoss=" + caloricLoss + ", actualAt="
                + actualAt + ", description=" + description + "]";
    }

}
