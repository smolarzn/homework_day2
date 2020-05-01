import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet("/servlet25")
public class Servlet25 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int[] randoms = random();
        resp.getWriter().println(Arrays.toString(randoms) + "<br>");
        resp.getWriter().println(Arrays.toString(arrayOfRandomsInOrder(randoms)));
    }



    private static int[] random() {
        Random random = new Random();
        int[] arrayOfRandoms = new int[10];
        for (int i = 0; i < arrayOfRandoms.length; i++) {
            arrayOfRandoms[i] = random.nextInt(100) + 1;
        }
        return arrayOfRandoms;
    }

    private static int[] arrayOfRandomsInOrder(int[] randoms) {
        Arrays.sort(randoms);
        return randoms;
    }

}
