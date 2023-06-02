<%-- 
    Document   : crudAcc
    Created on : May 16, 2023, 11:48:45 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table border="1" width="4" cellspacing="4" cellpadding="2">
    <thead>
        <tr>

            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Password</th>
            <th>ROLE</th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="account" items="${list}" >
            <tr>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.address}</td>
                <td>${account.phone}</td>
                <td>${account.email}</td>
                <td>${account.password}</td>
                <td>${account.role}</td>
                <td>
                    <a href="<c:url value="/admin/edit.do?id=${account.id}"/>">Edit</a>
                    <a href="<c:url value="/admin/remove.do?id=${account.id}"/>">Remove</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<nav>
    <ul style="display: flex; justify-content: center">
        <c:forEach var="i" begin="1" end="${endP}">
            <li class="page-item" style="list-style: none; padding-right: 20px"><a class="page-link" href="<c:url value="/admin/crudAcc.do?page=${i}" />">${i}</a></li>
            </c:forEach>
    </ul>
</nav>
<a href="<c:url value="/home/success.do"/>">Back</a>


