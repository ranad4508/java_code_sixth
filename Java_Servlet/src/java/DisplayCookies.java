
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dinesh
 */
public class DisplayCookies extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        Cookie[] cookie1 = request.getCookies();
        PrintWriter pw = response.getWriter();
        pw.println("<h1>Cookies:</h1>");
        for(int i = 0; i < cookie1.length; i++){
            String name = cookie1[i].getName();
            String value = cookie1[i].getValue();
            
            pw.println("Name: "+name + " Value: "+value);
            
        }
        pw.close();
    }
}
