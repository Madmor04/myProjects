package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception{
        String rootName = "root";
        String rootPass = "lifecell";
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(url,rootName, rootPass)){
            System.out.println("weadsadsad");
        }
    }
}
