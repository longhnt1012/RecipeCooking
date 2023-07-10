<%-- 
    Document   : Tag
    Created on : Jun 20, 2023, 4:15:08 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            ${RECIPE.recipeName} 
            <h1>Has Category</h1>
            <form action="ManageCategoryOfRecipeController" method="POST">
                <c:forEach var="item" items="${LIST_CATEGORY}">
                    <input type="checkbox" name="category" value="${item.categoryID}" title="${item.categoryName}"
                           <c:forEach var="cor" items="${COR}">
                               <c:if test="${cor.categoryID == item.categoryID}">
                                   checked=""
                               </c:if>
                           </c:forEach>
                           />
                    
                    <input type="hidden" name="categoryID" value="${item.categoryID}"/>

                    <label>${item.categoryName}</label>
                </c:forEach>
                <input type="hidden" name="recipeID" value="${RECIPE.recipeID}"/>
                <button type="submit" name="action" value="Tag">Tag</button>
            </form>
            
        </div>
        <script>

            var inputhiddens = document.querySelectorAll('input[name="categoryID"]');
            var checkboxes = document.querySelectorAll('input[name="category"]');
            
            for (let i = 0; i < checkboxes.length; i++) {
                checkboxes[i].onclick = function (e) {
                    if(e.target.checked) {
                        selectedCategoryHandler(i);
                    }
                    else {
                        removedCategoryHandler(i);
                    }
                };
            }
            
            function selectedCategoryHandler(i) {
                inputhiddens[i].setAttribute("name", "selectedCategory");
            }
            
            function removedCategoryHandler(i) {
                inputhiddens[i].setAttribute("name", "removedCategory");
            }
            
            ${message}
            
        </script>
    </body>
</html>
