package example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/posts")
public class MainServlet extends HttpServlet {
    Map<String, String> users = new HashMap<>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        users.put("VovaDeveloper", "12345678");
        users.put("SashaDeveloper", "123456789");
        String login = req.getParameter("userLogin");
        String pass = req.getParameter("userPass");
        if(users.containsKey(login)) {
            if(users.get(login).equals(pass)) {

            }
            else {
                printWriter.write("Invalid password or login");
                RequestDispatcher rd = req.getRequestDispatcher("../web/index.jsp");
                rd.include(req,resp);
            }
        }
        System.out.println(login + " " + pass);
    }
}
