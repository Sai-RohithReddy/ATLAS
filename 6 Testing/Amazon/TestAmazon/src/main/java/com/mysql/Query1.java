package com.mysql;

import java.sql.*;

public class Query1 {
    public static void main(String[] args) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
        ) {
            Statement stmt = con.createStatement();
            String q27 = " SELECT last_name FROM employees \n" +
                    " WHERE department_id IN \n" +
                    " (SELECT department_id FROM departments WHERE department_name = \"IT\")\n" +
                    " AND salary > \n" +
                    " (SELECT avg(salary) FROM employees);";
            ResultSet rs = stmt.executeQuery(q27);
            while (rs.next()) {
                System.out.println(rs.getString("last_name"));
            }
            System.out.println("Query executed..");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
