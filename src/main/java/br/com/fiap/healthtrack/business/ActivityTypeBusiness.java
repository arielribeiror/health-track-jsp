package br.com.fiap.healthtrack.business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.healthtrack.model.ActivityType;

public class ActivityTypeBusiness {
	List<ActivityType> activityTypeList = new ArrayList<>();

	ConnectionManager connectionManager = new ConnectionManager();

	public List<ActivityType> getAll() {
		try {
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement("SELECT * FROM T_ACTIVITY_TYPE");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				String activityTypeId = result.getString("ACTIVITY_TYPE_ID");
				String activityType = result.getString("ACTIVITY_TYPE");
				activityTypeList.add(new ActivityType(activityTypeId, activityType));
			}
			connectionManager.closeConnection();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o getAll de activityType");
			e.printStackTrace();
		}
		
		return activityTypeList;
	}
	
	public void insert(String activityTypeId, String activityType) {
		try {
			String query = "INSERT INTO T_ACTIVITY_TYPE (ACTIVITY_TYPE_ID, ACTIVITY_TYPE) VALUES (?, ?)";
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement(query);
			stmt.setString(1, activityTypeId);
			stmt.setString(2, activityType);
			stmt.executeQuery();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o INSERT de activityType");
			e.printStackTrace();
		}
	}
	
	public void insertJoinTable(String activityId, String activityTypeId) {
		try {
			String query = "INSERT INTO T_ACTIVITY_ACTIVITY_TYPE (T_ACTIVITY_ID, T_ACTIVITY_TYPE_ID) VALUES (?, ?)";
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement(query);
			stmt.setString(1, activityId);
			stmt.setString(2, activityTypeId);
			stmt.executeQuery();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o INSERT de JOIN de activityType");
			e.printStackTrace();
		}
	}

}
