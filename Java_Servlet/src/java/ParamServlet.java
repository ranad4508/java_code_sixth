import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/param")
public class ParamServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html");
        String name=request.getParameter("name");
        
        try{
        PrintWriter pw=response.getWriter();
        pw.println("<html><body><h1>Welcome "+name+" </h1></body></html>");
        
        pw.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    }
    
   
    
//    
}