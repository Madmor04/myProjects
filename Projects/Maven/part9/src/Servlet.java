import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.Enumeration;

@WebServlet("/test")
public class Servlet extends HttpServlet {
    public static void connection() throws Exception{
        String userL = "root";
        String userP = "lifecell";
        String url = "jdbc:mysql://localhost:3306";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(url,userL,userP); Statement statement = connection.createStatement()){
            statement.executeUpdate("drop table users");
            statement.executeUpdate("create table if not exists users(id MEDIUMINT not null auto_increment, name char(30) not null, password char(30) not null)");
            statement.addBatch("insert into users (name,author) values (one, two)");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String one  = req.getParameter("one");
        String two  = req.getParameter("two");
        resp.getWriter().write("<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "one = " + one +
                "two = " + two +
                "<form action='test' method='post'>" +
                "<input type ='text' name='one' placeholder='hello'/>" +
                "<input type='text' name='two' placeholder='Syka'/>" +
                "<input type='submit' name='submit'/>" +
                "</form>" +
                "</body>" +
                "</html>");

    }
}
