<%-- 
    Document   : changePass
    Created on : May 16, 2023, 3:21:54 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<form action="<c:url value="/account/changePass_handler.do"/>" method="post">
    <input type="hidden" name="id" value="${sessionScope.account.id}">
    Password: <input type="password" name="oldPassword" placeholder="Old Password" required="required"></br>  
    New Password: <input type="password" name="newPassword" placeholder="New Password" required="required"></br>
    Confirm Password: <input type="password" name="reNewPassword" placeholder="Confirm Password" required="required"></br>
    <button type="submit" name="op" value="change">Change</button>
    <button type="submit" name="op" value="cancel">Cancel</button>
</form>
    <i style="color: red">${message}</i>
