<%-- 
    Document   : addPro
    Created on : May 26, 2023, 10:21:48 AM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="<c:url value="/product/updatePro_handler.do"/>" method="post">
    Name: <input type="text" name="name" placeholder="Name Product"> </br>
    Description: <input type="text" name="description" placeholder="Description Product"> </br>
    <input type="submit" name="op" value="Update">
    <input type="submit" name="op" value="Cancel">
</form>
