import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/wordlength")
public class WordLength extends HttpServlet{
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html");
        String word=request.getParameter("word");
        int a=word.length();
        try{
        PrintWriter pw=response.getWriter();
        pw.println("<html><body><h1>The number letter the word "+word+" has is "+a+" </h1></body></html>");
        
        pw.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    }
    
   
    
    
}