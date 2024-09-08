
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet("/SessionTrack")
public class SessionTrack extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        try {
            PrintWriter pw = response.getWriter();
            pw.println("<br>Session id:" + session.getId());
            pw.println("<br>creation Time:" + session.getCreationTime());
            pw.println("<br>last Accessed Time:" + session.getLastAccessedTime());
            session.setMaxInactiveInterval(60);
            if (session.isNew()) {
                pw.println("<br>Hello user ");
            } else {
                pw.println("<br>Welcome  back  ");

            }
            pw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
