<%-- 
    Document   : crudPro
    Created on : May 26, 2023, 11:46:48 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<table border="1" width="4" cellspacing="4">
    <thead>
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="product" items="${list}" >
            <tr>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>
                    <a href="<c:url value="/product/detail.do?id=${product.id}"/>">View</a>
                    <a href="<c:url value="/admin/deletePro.do?id=${product.id}"/>">Delete</a>                
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<nav>
    <ul style="display: flex; justify-content: center">
        <c:forEach var="i" begin="1" end="${endP}">
            <li class="page-item" style="list-style: none; padding-right: 20px"><a class="page-link" href="<c:url value="/admin/crudPro.do?page=${i}" />">${i}</a></li>
            </c:forEach>
    </ul>
</nav>
<a href="<c:url value="/home/success.do"/>">Back</a>
