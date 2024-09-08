<%-- 
    Document   : OddEvenJSP
    Created on : Aug 6, 2024, 8:35:49 AM
    Author     : Dinesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Odd Even</title>
    </head>
    <body>
        <form action="#" method="get">
            <input type="text" name="num"/>
            <input type="submit" value="submit"/>

        </form>
        <%
            String num = request.getParameter("num");
            if (num != null) {
                int a = Integer.parseInt(num);
                if (a % 2 == 0) {
                    out.println("<h1> Even</h1>");
                } else {
                    out.println("<h1>Odd</h1>");
                }
            }
        %>
    </body>
</html>
