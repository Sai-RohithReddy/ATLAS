package com.mysql;

import java.sql.*;

public class MySQLDMLCommands {
    public static void main(String[] args) throws SQLException {

//        Creating a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

//        Create statement/query
        Statement stmt = con.createStatement();
        String insertQuery = "INSERT INTO STUDENT VALUES(103, \"ROHITH\")";
        String updateQuery = "UPDATE STUDENT SET SNAME = \"ROHITH REDDY\" WHERE SID=103";
        String deleteQuery = "DELETE FROM STUDENT WHERE SID = 103";
        String selectQuery = "SELECT * FROM STUDENT";

//        Exectue statement/query
//        stmt.execute(insertQuery);
        ResultSet rs = stmt.executeQuery(selectQuery);

        while (rs.next()) {
            int sId = rs.getInt("sid");
            String sName = rs.getString("sname");
            System.out.println(sId + ", " + sName);
        }

//        Close connection
        con.close();

        System.out.println("Query executed...");
    }
}
