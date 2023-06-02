<%-- 
    Document   : index
    Created on : May 14, 2023, 12:38:38 AM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
    <a href="<c:url value="/account/login.do"/>">Login</a>
    <a href="<c:url value="/account/signUp.do"/>">SignUp</a>
    <a href="<c:url value="/account/forgot.do"/>">Forgot password</a>
</div>

