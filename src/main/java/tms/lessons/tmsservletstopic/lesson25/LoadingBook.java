package tms.lessons.tmsservletstopic.lesson25;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

@WebServlet(value = "/load-book", loadOnStartup = 1)
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024,
        maxFileSize = 10 * 1024 * 1024,
        maxRequestSize = 100 * 1024 * 1024)

public class LoadingBook extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Приложение работает");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String folderPath = "C:/Users/ilona/Desktop/books/";

        //set encoding
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();

        //take data from form
        Part filePart = req.getPart("loadFile");
        String fileName = String.valueOf(Paths.get(filePart.getSubmittedFileName()));

        File booksDirectory = new File(folderPath);

        //check if the folder exists
        if (!booksDirectory.exists()) booksDirectory.mkdirs();
        filePart.write(folderPath + fileName);
        out.println("Файл загружен");

        //Storing data for all servlets(scope)
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("filePath", folderPath + fileName);
        servletContext.setAttribute("fileName", fileName);
    }

}
