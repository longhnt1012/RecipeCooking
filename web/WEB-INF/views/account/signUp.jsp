<%-- 
    Document   : signUp
    Created on : May 14, 2023, 1:06:46 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<form action="<c:url value="/account/signUp_handler.do" />" method="post">
            <div class="mb-3">
                <label for="name" class="form-label">Name:</label>
                <input type="text" class="form-control" id="name" placeholder="Your name" name="name" value="" required="required">
            </div>
            <div class="mb-3">
                <label for="address" class="form-label">Address:</label>
                <input type="text" class="form-control" id="address" placeholder="Your address:" name="address" value="" required="required">
            </div>
            <div class="mb-3 mt-3">
                <label for="email" class="form-label">Email:</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Your email" value="" required="required">
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password:</label>
                <input type="password" class="form-control" id="password" placeholder="Your password" name="password" value="" required="required">
            </div>
            <div class="mb-3">
                <label for="repassword" class="form-label">Password:</label>
                <input type="password" class="form-control" id="repassword" placeholder="Confirm password" name="repassword" value="" required="required">
            </div>      
            <div class="mb-3">
                <label for="phone" class="form-label">Phone:</label>
                <input type="text" class="form-control" id="number" placeholder="Your phone" name="phone" value="" required="required">
            </div>            
            <button type="submit" name="op" value="signUp"> Sign Up</button>
            <button type="submit" name="op" value="cancel"> Cancel</button>
        </form>
        <i style="color:red;">${message}</i>
        
