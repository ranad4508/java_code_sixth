
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dinesh
 */
@WebServlet("/viewbooks")
public class ViewBooks extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<table>");
        pw.println("<tr>\n" +
"                    <td><input type=\"text\" name=\"title\" readonly/>Title</td>\n" +
"                </tr>");
        pw.println("");
        pw.println("");
        pw.println("");
        pw.println("");
        pw.println("");
        pw.println("");
        pw.println("");
        pw.println("</table>");

    }
}
