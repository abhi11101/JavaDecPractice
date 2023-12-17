package org.com.abhi.JDBC.MySQL;

import java.sql.*;

public class MainClass {

    public static void main(String[] args) {

        String sql = "Select name,description from office where episode=38";
        String username = "root";
        String password ="11101996";
        String url = "jdbc:mysql://localhost:3306/ott";
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement =connection.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            resultset.next();
            String name = resultset.getString(1);
            String description = resultset.getString(2);
            System.out.println(name + "\n"+ description);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
