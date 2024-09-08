import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.annotation.WebServlet;

@WebServlet("/addbook")
public class AddBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        String title = request.getParameter("title");
        String category = request.getParameter("category");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");
        String price = request.getParameter("price");

        String url = "jdbc:mysql://localhost:3306/bookstore";
        String uname = "root";
        String pwd = "";

        PrintWriter out = null;

        try {
            out = response.getWriter();
            // Step 1: Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create connection to database
            Connection con = DriverManager.getConnection(url, uname, pwd);

            // Step 3: Create SQL query
            String sql = "INSERT INTO tbl_books (Title, Category, Author, Publisher, Price) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, title);
            st.setString(2, category);
            st.setString(3, author);
            st.setString(4, publisher);
            st.setDouble(5, Double.parseDouble(price));

            // Step 4: Execute the query
            int rowsInserted = st.executeUpdate();
            if (rowsInserted > 0) {
                out.println("<html><body><h1>Book added successfully!</h1></body></html>");
            } else {
                out.println("<html><body><h1>Failed to add book.</h1></body></html>");
            }

            // Step 5: Close the connection
            st.close();
            con.close();
            out.close();
        } catch (Exception ex) {
            if (out != null) {
                out.println("<html><body><h1>Error: " + ex.getMessage() + "</h1></body></html>");
            }
            ex.printStackTrace();
        }
    }
}
