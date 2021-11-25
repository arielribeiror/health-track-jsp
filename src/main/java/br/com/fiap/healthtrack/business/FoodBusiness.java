package br.com.fiap.healthtrack.business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.healthtrack.model.Food;

public class FoodBusiness {
	List<Food> foodList = new ArrayList<>();

	ConnectionManager connectionManager = new ConnectionManager();
	
	public List<Food> getAll() {
		try {
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement("SELECT FOOD_ID, DESCRIPTION, CALORIC_GAIN, ACTUAL_AT, FOOD_TYPE FROM T_FOOD food INNER JOIN T_FOOD_FOOD_TYPE foodTypeJoin ON food.FOOD_ID = foodTypeJoin.T_FOOD_FOOD_ID INNER JOIN T_FOOD_TYPE foodType ON foodType.food_type_id = foodTypeJoin.T_FOOD_TYPE_FOOD_TYPE_ID ORDER BY actual_at DESC");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				String foodId = result.getString("FOOD_ID");
				String foodType = result.getString("FOOD_TYPE");
				String description = result.getString("DESCRIPTION");
				int caloricGain = result.getInt("CALORIC_GAIN");
				java.sql.Date actualAt = result.getDate("ACTUAL_AT");
				foodList.add(new Food(foodId, foodType, caloricGain, actualAt, description));
			}
			connectionManager.closeConnection();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o getAll de food");
			e.printStackTrace();
		}
		return foodList;
	}
	
	public void insert(Food food, String userId) {
		try {
			String query = "INSERT INTO T_FOOD (FOOD_ID, DESCRIPTION, CALORIC_GAIN, ACTUAL_AT, T_USER_USER_ID) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement(query);
			stmt.setString(1, food.getFoodId());
			stmt.setString(2, food.getDescription());
			stmt.setInt(3, food.getCaloricGain());
			stmt.setDate(4, food.getActualAt());
			stmt.setString(5, userId);
			stmt.executeQuery();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o INSERT de food");
			e.printStackTrace();
		}
	}
	
	
}
