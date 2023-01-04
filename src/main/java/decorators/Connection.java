package decorators;

import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Connection {
    private static Connection connection;
    private final java.sql.Connection jdbcConnection;

    @SneakyThrows
    private Connection() {
        jdbcConnection = DriverManager.getConnection("jdbc:sqlite:database.sqlite3");
    }

    @SneakyThrows
    public void executeQuery( String query) {
        System.out.println("Opened database successfully");
        Statement stmt = jdbcConnection.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
    }
    @SneakyThrows
    public PreparedStatement prepareStatement(String sql){
        return jdbcConnection.prepareStatement(sql);
    }

    @SneakyThrows
    public static Connection getInstance() {
        if (connection == null) {
            connecti    on = new Connection();
        }
        return connection;
    }
}
