<%-- 
    Document   : login
    Created on : May 14, 2023, 12:37:14 AM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>LOGIN FORM</h1>
<form action="<c:url value="/account/login_handler.do" />" method="post">
    Email: <input type="text" name="email" placeholder="Email"></br>
    Password: <input type="password" name="password" placeholder="Password"></br>
    <button type="submit" name="op" value="login">Login</button>
    <button type="submit" name="op" value="cancel">Cancel</button>
</form>
<i style="color: red">${message}</i>

