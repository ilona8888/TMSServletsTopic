package tms.lessons.tmsservletstopic.task_2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/checkAge")
public class CheckAge extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Введите в поисковую строку возраст</h1>");
        int age = Integer.parseInt(req.getParameter("age"));
        if(age >=  18) out.println("<h3>Вы совершеннолетний</h3>");
        else out.println("<h3>Вы не совершеннолетний</h3>");
    }
}
