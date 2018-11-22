package ua.we;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class connector extends HttpServlet {
    public static void main(String[] args) throws ClassNotFoundException {
        String userl = "root";
        String userp = "lifecell";
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(url,userl,userp); PreparedStatement preparedStatement = connection.prepareStatement()) {
            preparedStatement.executeUpdate("create table if not exists ggg (id MEDIUMINT NOT NULL AUTO_INCREMENT, name CHAR(20) NOT NULL, fam CHAR(20) NOT NULL , PRIMARY KEY (id));");
            preparedStatement.executeUpdate("insert into ggg (name,fam) values ('Vova', 'Hulenko')");
            preparedStatement.executeUpdate("insert into ggg (name,fam) values ('Vlad', 'Prindyk')");
            preparedStatement.executeUpdate("insert into ggg (name,fam) values ('Vadim', 'Chitulyn')");

        }
        catch (Exception e){
            System.out.println("hello");
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
