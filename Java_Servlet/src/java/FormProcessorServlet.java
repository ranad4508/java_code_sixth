import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/processForm")
public class FormProcessorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Read form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        // Set attributes to be forwarded to the JSP
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        
        // Forward the request to the JSP page
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
