<%-- 
    Document   : success
    Created on : May 14, 2023, 12:21:51 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<div>
    <h2>SUCCESS</h2>

    <a href="<c:url value="/account/editProfile.do"/>">Edit Profile</a>
    <a href="<c:url value="/account/logout.do"/>">Logout</a>
    <a href="<c:url value="/account/changePass.do"/>">Change Password</a>
    <a href="<c:url value="/product/product.do"/>">View Product</a>  
    <c:if test="${account.role == 'ADMIN' and account != null}">
        <a href="<c:url value="/admin/crudAcc.do"/>">CRUD ACCOUNT</a>
        <a href="<c:url value="/admin/crudPro.do"/>">CRUD PRODUCT</a>
        <a href="<c:url value="/admin/manaCmts.do"/>">Manager Comments</a>
    </c:if>
    <a href="<c:url value="/favourite/favourite.do"/>">My favourite</a>
    <c:if test="${account != null}">
        <a href="<c:url value="/product/myPro.do"/>">My Product</a>
        <a href="<c:url value="/product/addPro.do"/>">Add Product</a>
    </c:if>
</div>