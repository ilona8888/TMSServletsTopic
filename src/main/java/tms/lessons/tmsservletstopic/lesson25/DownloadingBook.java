package tms.lessons.tmsservletstopic.lesson25;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/book")
public class DownloadingBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //take data from scope
        ServletContext servletContext = getServletContext();
        ;
        String fileName = (String) servletContext.getAttribute("fileName");
        String filePath = (String) servletContext.getAttribute("filePath");


        File file = new File(filePath);

        //check if the file exists
        if (!file.exists()) {
            resp.setContentType("text/plain; charset=UTF-8");
            resp.getWriter().write("Книга не найдена");
            return;
        }

        //Download file
        resp.setContentType("application/pdf");
        resp.setHeader("Content-Disposition",
                "attachment; filename=\"" + fileName + "\"");
        Files.copy(file.toPath(), resp.getOutputStream());

        //print request's time
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

    }


}
