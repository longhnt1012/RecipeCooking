<%-- 
    Document   : login
    Created on : Jun 22, 2023, 4:01:12 PM
    Author     : truc0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="MainController" method="POST">
            User ID<input type="text" name="userID" required=""/></br>
            Password<input type="password" name="password" required=""/></br>
            <input type="submit" name="action" value="Login"/>
            <input type="reset" value="Reset"/>
        </form>
        <%
            String error=(String) request.getAttribute("ERROR");
            if(error==null) error="";
        %>
        <%= error %>
    </body>
</html>
