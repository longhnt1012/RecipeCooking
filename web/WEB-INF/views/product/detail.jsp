<%-- 
    Document   : detail
    Created on : May 21, 2023, 3:44:49 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
Name: ${product.name} </br>
Description: ${product.description} </br>
<a href="<c:url value="/cart/addToCart.do?id=${product.id}"/>">Add To Favourite</a>
<a href="<c:url value="/product/product.do"/>">Back</a>
<div class="d-flex justify-content-between align-items-center mb-4">
    <h4 class="text-dark mb-0">Comments (<span>${noCmts}</span>)</h4>                   
</div>
<form action="<c:url value="/product/addComments.do"/>" id = "cmtForm">
    <input type="number" hidden name="userId" value="${account.id}">
    <input type="text" hidden name="username" value="${account.name}">
    <input type="number" hidden name="productId" value="${product.id}">
    <div class="card mb-3">
        <div class="card-body">
            <div class="d-flex flex-start">
                <div class="w-100">
                    <div class="d-flex justify-content-between align-items-center mb-3">                                    
                        <textarea rows="4" class="w-100" name="content" form="cmtForm" placeholder="Share your thoughts about the product" required="required"></textarea>
                    </div>
                    ${message}
                    <div class="d-flex justify-content-between align-items-center">
                        <p class="small mb-0" style="color: #aaa;">
                            <button type="submit" class="btn btn-outline-success">Post</button>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div> 
</form>

<hr>
<c:forEach var= "cmt" items="${comments}">
    <div class="card mb-3">
        <div class="card-body"> 
            <div class="d-flex flex-start">
                <img class="rounded-circle shadow-1-strong me-3"
                     src="<c:url value="/img/user.png"/>" alt="avatar" width="40"
                     height="40" />
                <div class="w-100">
                    <div class="d-flex justify-content-between align-items-center mb-3">
                        <h6 class="text-primary fw-bold mb-0">
                            ${cmt.username}
                            <span class="text-dark ms-2">${cmt.content}</span>
                        </h6>
                    </div>
                    <div class="d-flex justify-content-between align-items-center">
                        <p class="small mb-0" style="color: #aaa;">
                            <a href="#!" class="link-grey">${cmt.date}</a>
                        </p>
                        <div class="d-flex flex-row">
                            <i class="fas fa-star text-warning me-2"></i>
                            <i class="far fa-check-circle" style="color: greenyellow;"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> 
</c:forEach>                                