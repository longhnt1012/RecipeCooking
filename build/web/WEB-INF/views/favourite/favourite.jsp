<%-- 
    Document   : favourite
    Created on : May 24, 2023, 4:37:23 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<a href="<c:url value="/home/success.do"/>">Back</a>
<c:set var="size" value="${sessionScope.size}"/>
<p class=""><span class="h2">My Favourite</span><span class="h4">(<c:if test="${size==null}">0</c:if><c:if test="${size!=null}">${size}</c:if> item in your cart)</span></p>
<div class="card mb-4">
    <div class="card-body p-4 ">
        <c:forEach var="item" items="${sessionScope.favourite.items}" varStatus="loop">
            <div class="row align-items-center">
                <div class="col-md-2 d-flex justify-content-center">
                    <div>
                        <p class="small text-muted mb-4 pb-2">Name: ${item.product.name}</p>
                        <p class="small text-muted mb-4 pb-2">Description: ${item.product.description}</p>
                    </div>
                </div>               
                <div class="col-md-2 d-flex justify-content-center">
                    <div>
                        <a class="text-body" href="<c:url value="/favourite/removeFromFavourite.do?id=${item.product.id}"/>">Remove</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<nav>
    <ul style="display: flex; justify-content: center">
        <c:forEach var="i" begin="1" end="${endP}">
            <li class="page-item" style="list-style: none; padding-right: 20px"><a class="page-link" href="<c:url value="/favourite/favourite.do?page=${i}" />">${i}</a></li>
            </c:forEach>
    </ul>
</nav>
