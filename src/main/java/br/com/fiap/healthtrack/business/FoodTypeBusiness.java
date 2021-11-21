package br.com.fiap.healthtrack.business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.healthtrack.model.FoodType;

public class FoodTypeBusiness {
  List<FoodType> foodTypeList = new ArrayList<>();

  ConnectionManager connectionManager = new ConnectionManager();

  public List<FoodType> getAll() {
    try {
      PreparedStatement stmt = connectionManager
          .getConnection()
          .prepareStatement("SELECT * FROM T_FOOD_TYPE");
      ResultSet result = stmt.executeQuery();

      while (result.next()) {
        String foodTypeId = result.getString("FOOD_TYPE_ID");
        String foodType = result.getString("FOOD_TYPE");
        foodTypeList.add(new FoodType(foodTypeId, foodType));
      }
      connectionManager.closeConnection();
    } catch (SQLException e) {
      System.err.println("Não foi possível realizar o getAll de foodType");
      e.printStackTrace();
    }

    return foodTypeList;
  }

  public void insert(String foodTypeId, String foodType) {
    try {
      String query = "INSERT INTO T_FOOD_TYPE (FOOD_TYPE_ID, FOOD_TYPE) VALUES (?, ?)";
      PreparedStatement stmt = connectionManager
          .getConnection()
          .prepareStatement(query);
      stmt.setString(1, foodTypeId);
      stmt.setString(2, foodType);
      stmt.executeQuery();
    } catch (SQLException e) {
      System.err.println("Não foi possível realizar o INSERT de foodType");
      e.printStackTrace();
    }
  }

  public void insertJoinTable(String foodId, String foodTypeId) {
    try {
      String query = "INSERT INTO T_FOOD_FOOD_TYPE (T_FOOD_FOOD_ID, T_FOOD_TYPE_FOOD_TYPE_ID) VALUES (?, ?)";
      PreparedStatement stmt = connectionManager
          .getConnection()
          .prepareStatement(query);
      stmt.setString(1, foodId);
      stmt.setString(2, foodTypeId);
      stmt.executeQuery();
    } catch (SQLException e) {
      System.err.println("Não foi possível realizar o INSERT de JOIN de foodType");
      e.printStackTrace();
    }
  }
}
