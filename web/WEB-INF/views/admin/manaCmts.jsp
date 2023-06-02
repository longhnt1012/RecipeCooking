<%-- 
    Document   : manaCmts
    Created on : May 23, 2023, 3:30:40 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table border="1">
    <thead>
        <tr>
            <th>No.</th>
            <th>ID</th>
            <th>Product ID</th>
            <th>User Id</th>
            <th>Name User</th>    
            <th>Detail</th>
            <th>Date</th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="cmt" items="${comments}" varStatus="loop">
            <tr>
                <td>${loop.count}</td>
                <td>${cmt.id}</td>
                <td>${cmt.productId}</td>
                <td>${cmt.userId}</td>
                <td>${cmt.username}</td>
                <td>${cmt.content}</td>
                <td>${cmt.date}</td>
                <td>
                    <a href="<c:url value="/admin/addCommentsFAdmin.do?id=${cmt.id}"/>">Add</a>
                    <a href="<c:url value="/admin/removeCmts.do?id=${cmt.id}"/>">Remove</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<a href="<c:url value="/home/success.do"/>">Back</a>

