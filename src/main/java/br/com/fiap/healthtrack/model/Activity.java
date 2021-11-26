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

    /**
     * Get activity
     */
    public void addActivity() {
        System.out.println(String.format("A atividade '%s', da modalidade '%s', com perda calórica de %s, foi criada com sucesso!", description, type, caloricLoss));
    }

    /**
     * Get activity by id
     *
     * @param activityId to check uniqueness
     * @return description to identify activity
     */
    public String getActivityById(String activityId) {
        if (activityId != this.activityId) {
            System.out.println("Atividade não encontrada");
        } else {
            System.out.println(String.format("Atividade %s, da modalidade %s, encontrada!", description, type));
        }
        return description;
    }

    /**
     * Get activities by Type
     *
     * @param type to activity check
     * @return description to identify activity
     */
    public String getActivitiesByType(String type) {
        if (type != this.type) {
            System.out.println("Não encontramos atividades com essa modalidade");
        } else {
            System.out.println(String.format("Atividades %s, da modalidade %s, foram encontradas!", description, type));
        }
        return description;
    }

    /**
     * Edit activity
     *
     * @param activityId  to check uniqueness
     * @param type        to activity classify
     * @param caloricLoss to user caloric loss
     * @param actualAt    to date time register
     * @param description to identify activity
     */
    public void editActivity(String activityId, String type, int caloricLoss, Date actualAt, String description) {
        if (activityId != this.activityId) {
            System.out.println("Atividade não encontrada");
        } else {
            System.out.println(String.format("A atividade '%s', da modalidade '%s', com perda calórica de %s, foi alterada com sucesso!", description, type, caloricLoss));
        }
    }

    @Override
    public String toString() {
        return "Activity [activityId=" + activityId + ", type=" + type + ", caloricLoss=" + caloricLoss + ", actualAt="
                + actualAt + ", description=" + description + "]";
    }

}
