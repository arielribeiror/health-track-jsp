package br.com.fiap.healthtrack.business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.healthtrack.model.Weight;

public class WeightBusiness {
	List<Weight> weightList = new ArrayList<>();

	ConnectionManager connectionManager = new ConnectionManager();

	public List<Weight> getAll() {
		try {
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement("SELECT WEIGHT_ID, WEIGHT, ACTUAL_AT FROM T_WEIGHT ORDER BY actual_at DESC");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				String weightId = result.getString("WEIGHT_ID");
				Double weight = result.getDouble("WEIGHT");
				java.sql.Date actualAt = result.getDate("ACTUAL_AT");
				weightList.add(new Weight(weightId, weight, actualAt));
			}
			connectionManager.closeConnection();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o getAll de weight");
			e.printStackTrace();
		}
		return weightList;
	}
	
	public void insert(String weightId, Double weight, java.sql.Date actualAt, String userId) {
		try {
			String query = "INSERT INTO T_WEIGHT (WEIGHT_ID, WEIGHT, ACTUAL_AT, T_USER_USER_ID) VALUES (?, ?, ?, ?)";
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement(query);
			stmt.setString(1, weightId);
			stmt.setDouble(2, weight);
			stmt.setDate(3, actualAt);
			stmt.setString(4, userId);
			stmt.executeQuery();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o INSERT de weight");
			e.printStackTrace();
		}
	}
}
