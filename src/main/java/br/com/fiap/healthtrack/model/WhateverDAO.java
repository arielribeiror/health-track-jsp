package br.com.fiap.healthtrack.model;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.business.*;
import br.com.fiap.healthtrack.business.ActivityBusiness;

public class WhateverDAO {

  public static void main(String[] args) {
    ActivityTypeBusiness activityTypeBusiness = new ActivityTypeBusiness();
    ActivityBusiness activityBusiness = new ActivityBusiness();

    BloodPressureBusiness bloodPressureBusiness = new BloodPressureBusiness();

    FoodTypeBusiness foodTypeBusiness = new FoodTypeBusiness();
    FoodBusiness foodBusiness = new FoodBusiness();

    WeightBusiness weightBusiness = new WeightBusiness();

//		insertActivityTypeJoin(activityTypeBusiness);
//		insertActivityType(activityTypeBusiness);
    getAllActivityType(activityTypeBusiness);

//		insertActivity(activityBusiness);
    getAllActivity(activityBusiness);

//		insertBloodPressure(bloodPressureBusiness);
    getAllBloodPressure(bloodPressureBusiness);

//		insertFoodTypeJoin(foodTypeBusiness);
//		insertFoodType(foodTypeBusiness);
    getAllFoodType(foodTypeBusiness);

//		insertFood(foodBusiness);
    getAllFood(foodBusiness);

//		insertWeight(weightBusiness);
    getAllWeight(weightBusiness);
  }

  private static void getAllActivityType(ActivityTypeBusiness activityTypeBusiness) {
    List<ActivityType> activityTypeList = activityTypeBusiness.getAll();

    for (ActivityType activityTypeItem : activityTypeList) {
      System.out.println(activityTypeItem);
    }
  }

  private static void getAllActivity(ActivityBusiness activityBusiness) {
    List<Activity> activityList = activityBusiness.getAll();

    for (Activity activityItem : activityList) {
      System.out.println(activityItem);
    }
  }

  private static void getAllBloodPressure(BloodPressureBusiness bloodPressureBusiness) {
    List<BloodPressure> bloodPressureList = bloodPressureBusiness.getAll();

    for (BloodPressure bloodPressureItem : bloodPressureList) {
      System.out.println(bloodPressureItem);
    }
  }

  private static void getAllFoodType(FoodTypeBusiness foodTypeBusiness) {
    List<FoodType> foodTypeList = foodTypeBusiness.getAll();

    for (FoodType foodTypeItem : foodTypeList) {
      System.out.println(foodTypeItem);
    }
  }

  private static void getAllFood(FoodBusiness foodBusiness) {
    List<Food> foodList = foodBusiness.getAll();

    for (Food foodItem : foodList) {
      System.out.println(foodItem);
    }
  }

  private static void getAllWeight(WeightBusiness weightBusiness) {
    List<Weight> weightList = weightBusiness.getAll();

    for (Weight weightItem : weightList) {
      System.out.println(weightItem);
    }
  }

  @SuppressWarnings("unused")
  private static void insertActivity(ActivityBusiness activityBusiness) {
    Calendar calendar = Calendar.getInstance();
    java.util.Date currentDate = calendar.getTime();
    java.sql.Date date = new java.sql.Date(currentDate.getTime());
    activityBusiness.insert("a6ef9146-08d0-4ab6-af17-59488419dc89", 275, date, "Treino membros superiores",
        "0375dabf-2a75-4083-90df-c8649b77d861");
    activityBusiness.insert("62b712fc-b30d-40c0-bb4a-9e6090496cfb", 120, date, "Caminhada rápida pós expediente",
        "0375dabf-2a75-4083-90df-c8649b77d861");
    activityBusiness.insert("1fd78e56-a6b7-4dbb-9c04-85c6851d9375", 330, date, "Corrida pós almoço",
        "0375dabf-2a75-4083-90df-c8649b77d861");
    activityBusiness.insert("0bcdc11b-02d0-4f96-ab44-82b80240c3ae", 275, date, "Nado costas matinal",
        "0375dabf-2a75-4083-90df-c8649b77d861");
    activityBusiness.insert("28e2ac85-4259-413c-b9cd-d784a1de0864", 100, date, "Caminhada",
        "0375dabf-2a75-4083-90df-c8649b77d861");
  }

  public static void insertActivityType(ActivityTypeBusiness activityTypeBusiness) {
    activityTypeBusiness.insert("c2c48796-f283-4dc5-9418-6532f846f651", "Caminhada");
    activityTypeBusiness.insert("c9d29bdf-4596-421a-a6d6-73a098f7dde2", "Academia");
    activityTypeBusiness.insert("fb10bc3a-7920-47f3-b950-46755f836223", "Corrida");
    activityTypeBusiness.insert("38b7e718-fd67-4e9a-a09a-c5581ff94715", "Natação");
    activityTypeBusiness.insert("618727b0-6301-4f42-95c4-b89ba22aa68e", "Luta");
  }

  public static void insertActivityTypeJoin(ActivityTypeBusiness activityTypeBusiness) {
    activityTypeBusiness.insertJoinTable("62b712fc-b30d-40c0-bb4a-9e6090496cfb", "c2c48796-f283-4dc5-9418-6532f846f651");
    activityTypeBusiness.insertJoinTable("1fd78e56-a6b7-4dbb-9c04-85c6851d9375", "fb10bc3a-7920-47f3-b950-46755f836223");
    activityTypeBusiness.insertJoinTable("0bcdc11b-02d0-4f96-ab44-82b80240c3ae", "38b7e718-fd67-4e9a-a09a-c5581ff94715");
    activityTypeBusiness.insertJoinTable("a6ef9146-08d0-4ab6-af17-59488419dc89", "c9d29bdf-4596-421a-a6d6-73a098f7dde2");
  }

  public static void insertBloodPressure(BloodPressureBusiness bloodPressureBusiness) {
    Calendar calendar = Calendar.getInstance();
    java.util.Date currentDate = calendar.getTime();
    java.sql.Date date = new java.sql.Date(currentDate.getTime());
    bloodPressureBusiness.insert("a7ef5e7b-4a48-4d09-ab90-001286b71000", 10, 7, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
    bloodPressureBusiness.insert("f857c52a-755e-45f4-908e-aa3fcf8a1acf", 10, 6, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
    bloodPressureBusiness.insert("74adc025-9456-4afb-a139-eeb61a28fa82", 11, 7, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
    bloodPressureBusiness.insert("86fc0548-4e4a-4668-a7ea-e545916e5824", 12, 8, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
    bloodPressureBusiness.insert("0863268f-391f-44e2-aa52-119bdbae99ba", 10, 7, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
  }

  @SuppressWarnings("unused")
  private static void insertFood(FoodBusiness foodBusiness) {
    Calendar calendar = Calendar.getInstance();
    java.util.Date currentDate = calendar.getTime();
    java.sql.Date date = new java.sql.Date(currentDate.getTime());
    foodBusiness.insert("2058df6c-b6a0-44d6-a32e-edffc0542817", "Ovos mexidos e um mamão inteiro", 180, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
    foodBusiness.insert("27190d39-d598-49e8-8207-2395b815fc2a", "Arroz, feijão, bife e batata frita", 870, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
    foodBusiness.insert("1e9cf13b-39f4-41f4-8d52-7262126a157b", "Pães com Nutella", 330, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
    foodBusiness.insert("0585903b-832a-4f7a-b21b-d215e6b0f3aa", "Crepioca com presunto e queijo", 695, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
    foodBusiness.insert("ce430821-27db-46b0-8ba3-a0131cbf0b96", "Banana com aveia", 145, date,
        "0375dabf-2a75-4083-90df-c8649b77d861");
  }

  public static void insertFoodType(FoodTypeBusiness foodTypeBusiness) {
    foodTypeBusiness.insert("5aedee10-3e47-4d80-9fa2-4d100892e083", "Café da manhã");
    foodTypeBusiness.insert("80a00608-32ec-4d3f-9748-d2623c8d7492", "Almoço");
    foodTypeBusiness.insert("42ebb5b1-97f9-4674-b9ca-e7d45767e232", "Café da tarde");
    foodTypeBusiness.insert("e86adace-c64c-4d33-8878-6ebd5538562f", "Jantar");
    foodTypeBusiness.insert("1baa34a9-a129-4131-be0c-ec1745d7934f", "Ceia");
  }

  public static void insertFoodTypeJoin(FoodTypeBusiness foodTypeBusiness) {
    foodTypeBusiness.insertJoinTable("2058df6c-b6a0-44d6-a32e-edffc0542817", "5aedee10-3e47-4d80-9fa2-4d100892e083");
    foodTypeBusiness.insertJoinTable("27190d39-d598-49e8-8207-2395b815fc2a", "80a00608-32ec-4d3f-9748-d2623c8d7492");
    foodTypeBusiness.insertJoinTable("1e9cf13b-39f4-41f4-8d52-7262126a157b", "42ebb5b1-97f9-4674-b9ca-e7d45767e232");
    foodTypeBusiness.insertJoinTable("0585903b-832a-4f7a-b21b-d215e6b0f3aa", "e86adace-c64c-4d33-8878-6ebd5538562f");
    foodTypeBusiness.insertJoinTable("ce430821-27db-46b0-8ba3-a0131cbf0b96", "1baa34a9-a129-4131-be0c-ec1745d7934f");
  }

  public static void insertWeight(WeightBusiness weightBusiness) {
    Calendar calendar = Calendar.getInstance();
    java.util.Date currentDate = calendar.getTime();
    java.sql.Date date = new java.sql.Date(currentDate.getTime());
    weightBusiness.insert("a7ef5e7b-4a48-4d09-ab90-001286b71000", 61.5, date, "0375dabf-2a75-4083-90df-c8649b77d861");
    weightBusiness.insert("f857c52a-755e-45f4-908e-aa3fcf8a1acf", 62.8, date, "0375dabf-2a75-4083-90df-c8649b77d861");
    weightBusiness.insert("74adc025-9456-4afb-a139-eeb61a28fa82", 59.8, date, "0375dabf-2a75-4083-90df-c8649b77d861");
    weightBusiness.insert("86fc0548-4e4a-4668-a7ea-e545916e5824", 60.5, date, "0375dabf-2a75-4083-90df-c8649b77d861");
    weightBusiness.insert("0863268f-391f-44e2-aa52-119bdbae99ba", 59.9, date, "0375dabf-2a75-4083-90df-c8649b77d861");
  }

}
