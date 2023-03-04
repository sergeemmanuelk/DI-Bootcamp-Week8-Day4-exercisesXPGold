package exercise1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DbConnect;

public class Exercise1 {
    public static int updateSalary() {
        final String sql = "UPDATE companies" +
                "SET salary = 25000.00" +
                "WHERE id = 1";
        int affectedRow = 0;

        try {
            Connection conn = new DbConnect().connect();
            Statement stmt = conn.createStatement();
            affectedRow = stmt.executeUpdate(sql);

            if (affectedRow == 0) {
                System.out.println("No lines changed!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedRow;
    }
}