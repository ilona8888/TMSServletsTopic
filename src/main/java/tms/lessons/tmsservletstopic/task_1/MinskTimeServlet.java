package tms.lessons.tmsservletstopic.task_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/minsk")
public class MinskTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZonedDateTime minskTime = ZonedDateTime.now(ZoneId.of("Europe/Minsk"));

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Время в Минске "  + minskTime.format(fmt) + "</h1>");
        out.println("</body></html>");
    }
}
