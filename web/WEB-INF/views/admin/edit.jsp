<%-- 
    Document   : edit
    Created on : May 17, 2023, 8:36:22 AM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="<c:url value="/admin/edit_handler.do" />" method="post">
    <div class="mb-3">
        <label for="name" class="form-label">ID:</label>
        <input disabled type="text" value="${account.id}" required="required">
        <input type="hidden" name="id" value="${account.id}" required="required">      
    </div>
    <div class="mb-3">
        <label for="name" class="form-label">Name:</label>
        <input type="text" class="form-control" id="name" placeholder="Your name" name="newName" value="${account.name}" required="required">
    </div>
    <div class="mb-3">
        <label for="address" class="form-label">Address:</label>
        <input type="text" class="form-control" id="address" placeholder="Your address:" name="newAddress" value="${account.address}" required="required">
    </div>   
    <div class="mb-3">
        <label for="phone" class="form-label">Phone:</label>
        <input type="text" class="form-control" id="number" placeholder="Your phone" name="newPhone" value="${account.phone}" required="required">
    </div>
    <div class="mb-3">
        <label for="phone" class="form-label">Email:</label>
        <input type="email" class="form-control" id="email" name="newEmail" placeholder="Your email" value="${account.email}" required="required">
    </div> 
    <div class="mb-3">
        <label for="phone" class="form-label">Password:</label>
        <input type="text" class="form-control" id="email" name="newPassword" placeholder="password" value="${account.password}" required="required">
    </div>
    <div class="mb-3">
        <label for="phone" class="form-label">Confirm Password:</label>
        <input type="text" class="form-control" id="email" name="reNewPassword" placeholder="password" value="${account.password}" required="required">
    </div>
    <div class="mb-3">
        <label for="phone" class="form-label">Role:</label>
        <input type="text" class="form-control" id="email" name="newRole" placeholder="role" value="${account.role}" required="required">
    </div> 
    <button type="submit" name="op" value="confirm">Confirm</button>
    <button type="submit" name="op" value="cancel"> Cancel</button>
</form>
