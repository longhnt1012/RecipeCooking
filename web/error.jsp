<%-- 
    Document   : error
    Created on : Jul 11, 2023, 10:57:09 AM
    Author     : Thành Long
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>Hey man, try again!!!</h1>
        ${requestScope.ERROR}
    </body>
</html>
