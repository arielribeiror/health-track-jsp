package br.com.fiap.healthtrack.auth;

import br.com.fiap.healthtrack.business.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBusiness {
  User user = new User();

  ConnectionManager connectionManager = new ConnectionManager();

  public User getUserByUsername(String username) {
    try {
      String query = "SELECT * FROM T_USER user WHERE USER_ID = ?";
      PreparedStatement stmt = connectionManager
          .getConnection()
          .prepareStatement(query);
      stmt.setString(1, username);
      ResultSet result = stmt.executeQuery();

      while (result.next()) {
        user.setUserId(result.getString("USER_ID"));
        user.setFirstName(result.getString("FIRST_NAME"));
        user.setLastName(result.getString("LAST_NAME"));
        user.setBirthday(result.getDate("BIRTHDAY"));
        user.setEmail(result.getString("EMAIL"));
        user.setUsername(result.getString("USERNAME"));
        user.setPassword(result.getString("PASSWORD"));
        user.setEnable(result.getBoolean("ENABLE"));
        user.setGender(result.getString("GENDER"));
        user.setImage(result.getString("IMAGE"));
        user.setHeight(result.getDouble("HEIGHT"));
      }
      connectionManager.closeConnection();
    } catch (SQLException e) {
      System.err.println("Não foi possível realizar o getAll de food");
      e.printStackTrace();
    }
    return user;
  }
}
