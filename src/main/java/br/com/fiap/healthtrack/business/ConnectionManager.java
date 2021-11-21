package br.com.fiap.healthtrack.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private Connection connection;

    public ConnectionManager() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            openConnection();
        } catch (ClassNotFoundException e) {
            System.err.println("O Driver JDBC não foi encontrado!");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void openConnection() {
        try {
            this.connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM88095", "060292");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao Banco de Dados");
            e.printStackTrace();
        }
    }
}
