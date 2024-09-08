
import javax.servlet.http.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/factorial")

/**
 *
 * @author Dinesh
 */
public class Factorial extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        int a = Integer.parseInt(request.getParameter("num"));
        int factorial = 1;
        for (int i = a; i > 0; i--) {
            factorial = i * factorial;
        }
        try {
            try (PrintWriter pw = response.getWriter()) {
                pw.println("<html><body><h1> The Factorial of number " + " " + a + " is " + factorial + "</h1></body></html>");
            }
        } catch (IOException e) {
            System.out.println("Exception occurs: " + e.getMessage());
        }
    }

}
