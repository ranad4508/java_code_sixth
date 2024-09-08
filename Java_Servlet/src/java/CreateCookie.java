import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setCookie")
public class CreateCookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String data = request.getParameter("data");
        Cookie cookie = new Cookie("MyCookie", data);
        response.addCookie(cookie);
        PrintWriter pw = response.getWriter();
        pw.println("<h1>Cookie has been set.</h1> ");
        pw.println(data);
        pw.close();
        
    }
}
