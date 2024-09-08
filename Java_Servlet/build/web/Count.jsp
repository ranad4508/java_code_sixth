<%-- 
    Document   : Count
    Created on : Aug 6, 2024, 8:26:10 AM
    Author     : Dinesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Count Visits</title>
    </head>
    <body>
        <%! int count=0;%>
        <%
            out.print("Page has been visited "+ ++count + " times.");
        %>
    </body>
</html>
