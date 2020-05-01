import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@WebServlet("/servlet23")
public class Servlet23 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Path path = Paths.get("/home/natalia/Desktop/CodersLab/modul_3/homework_day2/src/main/java/oop.txt");
        try {
            for (String line : Files.readAllLines(path)) {
                response.getWriter().println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
