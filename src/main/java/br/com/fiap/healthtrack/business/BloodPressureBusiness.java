package br.com.fiap.healthtrack.business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.healthtrack.model.BloodPressure;

public class BloodPressureBusiness {
	List<BloodPressure> bloodPressureList = new ArrayList<>();

	ConnectionManager connectionManager = new ConnectionManager();

	public List<BloodPressure> getAll() {
		try {
			PreparedStatement stmt = connectionManager
					.getConnection()
					.prepareStatement("SELECT BLOOD_ID, SYSTOLIC_PRESSURE, DIASTOLIC_PRESSURE, ACTUAL_AT FROM T_BLOOD_PRESSURE ORDER BY actual_at DESC");
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				String bloodId = result.getString("BLOOD_ID");
				int systolicPressure = result.getInt("SYSTOLIC_PRESSURE");
				int diastolicPressure = result.getInt("DIASTOLIC_PRESSURE");
				java.sql.Date actualAt = result.getDate("ACTUAL_AT");
				bloodPressureList.add(new BloodPressure(bloodId, systolicPressure, diastolicPressure, actualAt));
			}
			connectionManager.closeConnection();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o getAll de bloodPressure");
			e.printStackTrace();
		}
		return bloodPressureList;
	}
	
	public void insert(BloodPressure pressure, String userId) {
		try {
			String query = "INSERT INTO T_BLOOD_PRESSURE (BLOOD_ID, SYSTOLIC_PRESSURE, DIASTOLIC_PRESSURE, ACTUAL_AT, T_USER_USER_ID) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = connectionManager
				.getConnection()
				.prepareStatement(query);
			stmt.setString(1, pressure.getBloodPressureId());
			stmt.setInt(2, pressure.getSystolicPressure());
			stmt.setInt(3, pressure.getDiastolicPressure());
			stmt.setDate(4, pressure.getActualAt());
			stmt.setString(5, userId);
			stmt.executeQuery();
		} catch (SQLException e) {
			System.err.println("Não foi possível realizar o INSERT de bloodPressure");
			e.printStackTrace();
		}
	}
}
