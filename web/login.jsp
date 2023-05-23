<%-- 
    Document   : login
    Created on : May 23, 2023, 3:15:24 PM
    Author     : Thành Long
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <form action="MainController" method="POST">
            User ID: <input type="text" name="userID" required="" placeholder="User ID">
            Password: <input type="password" name="password" required="" placeholder="Password">
        </form>
    </body>
</html>
