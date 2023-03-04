package exercise2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DbConnect;

public class Exercise2 {
    public static int deleteData() {
        final String sql = "DELETE FROM companies" +
                "WHERE id = 2";
        int affectedRow = 0;

        try {
            Connection conn = new DbConnect().connect();
            Statement stmt = conn.createStatement();
            affectedRow = stmt.executeUpdate(sql);

            if (affectedRow == 0) {
                System.out.println("No lines deleted!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affectedRow;
    }
}