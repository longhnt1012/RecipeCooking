<%-- 
    Document   : editProfile
    Created on : May 14, 2023, 8:57:34 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <form action="<c:url value="/account/editProfile_handler.do" />" method="post">
        <div class="mb-3 mt-3">
            <label for="email" class="form-label">Email:</label>
            <input type="hidden" class="form-control" id="email" name="password" placeholder="id" value="${sessionScope.account.password}">
            <input type="hidden" class="form-control" id="email" name="id" placeholder="id" value="${sessionScope.account.id}">
            <input type="hidden" class="form-control" id="email" name="role" placeholder="id" value="${sessionScope.account.role}">
            <input type="hidden" class="form-control" id="email" name="email" placeholder="Your email" value="${sessionScope.account.email}">
            <input disabled type="email" class="form-control" id="email" name="email" placeholder="Your email" value="${sessionScope.account.email}">

        </div>
        <div class="mb-3">
            <label for="name" class="form-label">Name:</label>
            <input type="text" class="form-control" id="name" placeholder="Your name" name="newName" value="${sessionScope.account.name}" required="required">
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Address:</label>
            <input type="text" class="form-control" id="address" placeholder="Your address:" name="newAddress" value="${sessionScope.account.address}" required="required">
        </div>   
        <div class="mb-3">
            <label for="phone" class="form-label">Phone:</label>
            <input type="text" class="form-control" id="number" placeholder="Your phone" name="newPhone" value="${sessionScope.account.phone}" required="required">
        </div>            
        <button type="submit" name="op" value="confirm">Confirm</button>
        <button type="submit" name="op" value="cancel"> Cancel</button>
    </form>
    <i style="color:red;">${message}</i>
