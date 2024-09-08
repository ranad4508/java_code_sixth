import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/createUser")
public class CreateUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Read the 'name' and 'email' parameters from the request
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        // Get the current session or create a new one if it doesn't exist
        HttpSession session = request.getSession(true);
        
        // Store user information in the session
        session.setAttribute("userName", name);
        session.setAttribute("userEmail", email);
        
        // The session ID cookie (JSESSIONID) is automatically managed by the container
        
        // Set the response content type
        response.setContentType("text/html");
        
        // Respond with a confirmation message
        try (PrintWriter out = response.getWriter()) {
            out.write("User " + name + " with email " + email + " has been successfully created!");
        }
    }
}
