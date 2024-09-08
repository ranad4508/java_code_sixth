import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/addition")
public class Sum extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest
            request,HttpServletResponse response){
        response.setContentType("text/html");
        int a =Integer.parseInt(request.getParameter("num1"));
        int b=Integer.parseInt(request.getParameter("num2"));
        int c =a+b;
        
        try{
        PrintWriter pw=response.getWriter();
        pw.println("<html><body><h1> The sum of "
                + " "+a+" and "+b+" is "+c+" "
                        + "</h1></body></html>");
        
        pw.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    }
    
   
    
    
}