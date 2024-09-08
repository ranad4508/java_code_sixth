/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dinesh
 */
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/oddeven")
public class OddEven extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        int a = Integer.parseInt(request.getParameter("num1"));
        String c;
        if (a % 2 == 0) {
            c = "even";
        } else {
            c = "odd";
        }

        try {
            PrintWriter pw = response.getWriter();
            pw.println("<html><body><h1> The number is  " + c + " </h1></body></html>");

            pw.close();
        } catch (IOException ex) {
        }

    }

}
