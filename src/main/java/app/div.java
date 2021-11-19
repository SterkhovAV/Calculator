package app;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/div")
public class div extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setHeader("Content-Type", "text/html; charset=UTF-16LE");
        PrintWriter out = resp.getWriter();
        String first=req.getParameter("first");
        String second=req.getParameter("second");
        try {
            int a=Integer.parseInt(first);
            int b=Integer.parseInt(second);
//            if (((long)a-(long)b)<Integer.MIN_VALUE || ((long)a-(long)b)>Integer.MIN_VALUE)
//                out.println("Результат выходит за область вычислений");
//            else out.println(a-b);
            if (b==0) throw new NumberFormatException();
            out.println((float)a/(float)b);
        } catch (NumberFormatException e) {
            out.println("Некорректный ввод значений");
        }

    }
}