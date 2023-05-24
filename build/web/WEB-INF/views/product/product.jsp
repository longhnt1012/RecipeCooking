<%-- 
    Document   : product
    Created on : May 21, 2023, 3:40:39 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<table border="1" width="4" cellspacing="4">
    <thead>
        <tr>
            <th>No.</th>
            <th>Name</th>
            <th>Description</th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="product" items="${list}" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>
                <a href="<c:url value="/product/detail.do?id=${product.id}"/>">View</a>
            </td>
        </tr>
        </c:forEach>
    </tbody>
</table>

<a href="<c:url value="/home/success.do"/>">Back</a>


