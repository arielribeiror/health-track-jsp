package br.com.fiap.healthtrack.business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.healthtrack.model.Activity;

public class ActivityBusiness {
	List<Activity> activityList = new ArrayList<>();
	
	ConnectionManager connectionManager = new ConnectionManager();
	
	public List<Activity> getAll() {
		try {
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement("SELECT ACTIVITY_ID, CALORIC_LOSS, ACTUAL_AT, DESCRIPTION, ACTIVITY_TYPE FROM T_ACTIVITY activity INNER JOIN T_ACTIVITY_ACTIVITY_TYPE activityTypeJoin ON activity.ACTIVITY_ID = activityTypeJoin.T_ACTIVITY_ID INNER JOIN T_ACTIVITY_TYPE activityType ON activityType.activity_type_id = activityTypeJoin.t_activity_type_id ORDER BY actual_at DESC");
			ResultSet result = stmt.executeQuery();
			
			while (result.next()) {
				String activityId = result.getString("ACTIVITY_ID");
				int caloricLoss = result.getInt("CALORIC_LOSS");
				java.sql.Date actualAt = result.getDate("ACTUAL_AT");
				String description = result.getString("DESCRIPTION");
				String activityType = result.getString("ACTIVITY_TYPE");
				activityList.add(new Activity(activityId, activityType, caloricLoss, actualAt, description));
			}
			connectionManager.closeConnection();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o getAll de activity");
			e.printStackTrace();
		}
			
		return activityList;
	}
	
	public void insert(Activity activity, String userId) {
		try {
			String query = "INSERT INTO T_ACTIVITY (ACTIVITY_ID, CALORIC_LOSS, ACTUAL_AT, DESCRIPTION, T_USER_USER_ID) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement(query);
			stmt.setString(1, activity.getActivityId());
			stmt.setInt(2, activity.getCaloricLoss());
			stmt.setDate(3, activity.getActualAt());
			stmt.setString(4, activity.getDescription());
			stmt.setString(5, userId);
			stmt.executeQuery();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o INSERT de activity");
			e.printStackTrace();
		}
	}
}
