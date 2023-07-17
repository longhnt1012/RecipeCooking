<%-- 
    Document   : recipeDetail
    Created on : Jun 26, 2023, 2:14:47 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Flavorful Creations</title>

        <!-- Favicon -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link href="style.css" rel="stylesheet">

        <!-- Responsive CSS -->
        <link href="css/responsive/responsive.css" rel="stylesheet">
        <link rel="icon" href="<c:url value="/img/core-img/favicon.icon"/>">

        <!-- Core Stylesheet -->
        <link href="<c:url value="/style.css"/>" rel="stylesheet">

        <!-- Responsive CSS -->
        <link href="<c:url value="/css/responsive/responsive.css"/>" rel="stylesheet">
        <link rel="stylesheet" href="<c:url value="/fonts-2/themify-icons/themify-icons.css"/>">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"/>
    </head>

    <body>
        <!-- Preloader Start -->
        <div id="preloader">
            <div class="yummy-load"></div>
        </div>

        <!-- Background Pattern Swither -->
        <div id="pattern-switcher">
            Bg Pattern
        </div>
        <div id="patter-close">
            <i class="fa fa-times" aria-hidden="true"></i>
        </div>

        <!-- ****** Top Header Area Start ****** -->
        <div class="top_header_area">
            <div class="container">
                <div class="row">
                    <div class="col-5 col-sm-6">
                        <!--  Top Social bar start -->
                        <div class="top_social_bar">
                            <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-google" aria-hidden="true"></i></a>
                        </div>
                    </div>
                    <!--  Login Register Area -->
                    <div class="col-7 col-sm-6">
                        <div class="signup-search-area d-flex align-items-center justify-content-end">
                            <div class="col-8 col-sm-8">
                                <div class="search_button justify-content-end align-items-center d-flex">
                                    <a class="searchBtn" href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                </div>
                                <div class="search-hidden-form justify-content-end align-items-center ">
                                    <form action="MainController" method="POST">
                                        <input type="text" name="search" id="search-anything"
                                               placeholder="Search Anything...">
                                        <input type="submit" name="action" value="SearchHome" class="d-none">
                                        <span class="searchBtn"><i class="fa fa-times" aria-hidden="true"></i></span>
                                    </form>
                                </div>
                            </div>
                            <c:if test="${LOGIN_USER ==null}" >
                                <div class="login_register_area d-flex col-4 col-sm-4">
                                    <div class="login">
                                        <a href="login.jsp">Sign in</a>
                                    </div>
                                    <div class="register">
                                        <a href="register.html">Sign up</a>
                                    </div>
                                </div>
                            </c:if>
                            <c:if test="${LOGIN_USER !=null}">
                                <div class="login_register_area d-flex col-4 col-sm-4">
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button"
                                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><h7>${sessionScope.LOGIN_USER.userName}</h7></a>
                                        <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                            <a class="dropdown-item" href="#">Your Profile</a>

                                            <a class="dropdown-item" href="#">Change Password</a>
                                            <a class="dropdown-item" href="MainController?action=SavedPage&userID=${LOGIN_USER.userID}">My Saved</a>
                                            <form action="MainController" method="POST">
                                                <input class="dropdown-item" type="submit" name="action" value="Log out">
                                            </form>


                                        </div>
                                    </li>
                                </div>
                            </c:if>
                        </div>
                    </div>


                </div>
            </div>
        </div>
        <!-- ****** Top Header Area End ****** -->

        <!-- ****** Header Area Start ****** -->
        <header class="header_area">
            <div class="container">
                <div class="row">
                    <!-- Logo Area Start -->
                    <div class="col-12">
                        <div class="logo_area text-center">
                            <a href="mainpage.jsp" class="yummy-logo">Flavorful Creations</a>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12">
                        <nav class="navbar navbar-expand-lg">
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#yummyfood-nav"
                                    aria-controls="yummyfood-nav" aria-expanded="false" aria-label="Toggle navigation"><i
                                    class="fa fa-bars" aria-hidden="true"></i> Menu</button>
                            <!-- Menu Area Start -->
                            <div class="collapse navbar-collapse justify-content-center" id="yummyfood-nav">
                                <ul class="navbar-nav" id="yummy-nav">
                                    <li class="nav-item active">
                                        <c:if test="${LOGIN_USER == null}">
                                            <a class="nav-link" href="mainpage.jsp">Home <span
                                                    class="sr-only">(current)</span></a>
                                            </c:if>
                                            <c:if test="${LOGIN_USER != null}">
                                            <a class="nav-link" href="mainpage_user.jsp">Home <span
                                                    class="sr-only">(current)</span></a>
                                            </c:if>

                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="MainController?action=RecipePage">Recipes</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="categories.jsp">Categories</a>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button"
                                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">My Recipes</a>
                                        <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                            <a class="dropdown-item" href="createrecipe.jsp">Add a recipe</a>

                                            <a class="dropdown-item" href="MainController?action=FavoritePage&userID=${LOGIN_USER.userID}">My favorites</a>
                                            <a class="dropdown-item" href="MainController?action=SavedPage&userID=${LOGIN_USER.userID}">Saved</a>

                                        </div>
                                    </li>

                                    <li class="nav-item">
                                        <a class="nav-link" href="MainController?action=PlanningPage&userID=${LOGIN_USER.userID}">Meal Plan</a>
                                    </li>

                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <div class="breadcumb-nav">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="#"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Categories</li>
                                <li class="breadcrumb-item active" aria-current="page">Keto</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <section class="blog_area section_padding_0_80" style="margin-top: 15px">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-12 col-sm-12 col-md-4 col-lg-4">
                        <div class="row">
                            <div class="col-12">
                                <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                    <div class="post-thumb">
                                        <img src="${recipe.imageRecipe}" alt="StuffedChicken"/>
                                    </div>  
                                </div>
                            </div>
                            <div class="col-4 col-md-4">
                                <div class="saved-favorite">
                                    <form action="MainController?recipeID=${recipe.recipeID}&userID=${LOGIN_USER.userID}"  method="POST">
                                        <input type="submit" name="action" value="Save"
                                               style="padding:8px 30px 8px 30px; background-color: #fc6c3f;border-radius: 12px;color: white;border: 2px solid ;">
                                    </form>
                                </div>
                            </div>
                            <div class="col-4 col-md-4">
                                <div class="print-recipe">
                                    <button onclick="window.print()"
                                            style="padding: 8px 40px 8px 40px;background-color:white ;border-radius: 12px;border: 2px solid #fc6c3f;color: #fc6c3f;">Print</button>
                                </div>
                            </div>
                            <div class="col-4 col-md-4">
                                <div class="saved-favorite">
                                    <form action="MainController" method="POST">
                                        <input type="submit" name="action" value="Share"
                                               style="padding:8px 30px 8px 30px; background-color: #fc6c3f;border-radius: 12px;color: white;border: 2px solid ;">
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-sm-12 col-md-8 col-lg-8">
                        <div class="post-content">
                            <a href="#">
                                <h1 class="post-headline" >${recipe.recipeName}</h1>
                            </a>
                            <div class="post-meta d-flex">
                                <div class="post-author-date-area d-flex">
                                    <!-- Post Author -->
                                    <div class="post-author">
                                        By <a href="#" style="font-size: 14px;">${recipe.userName}</a>
                                    </div>
                                    <div class="star-rating">
                                        <form action="<c:url value="MainController?action=RecipeDetail&userID=${LOGIN_USER.userID}&recipeID=${recipe.recipeID}"/>" method="post">
                                            <c:if test="${LOGIN_USER == null}">
                                                <button type="button" class="fa fa-star " style="cursor: pointer; border: none; background: none;" onclick="setRating(1)" data-toggle="modal" data-target="#Login"></button>
                                                <button type="button" class="fa fa-star " style="cursor: pointer; border: none; background: none;" onclick="setRating(2)" data-toggle="modal" data-target="#Login"></button>
                                                <button type="button" class="fa fa-star " style="cursor: pointer; border: none; background: none;" onclick="setRating(3)" data-toggle="modal" data-target="#Login"></button>
                                                <button type="button" class="fa fa-star " style="cursor: pointer; border: none; background: none;" onclick="setRating(4)" data-toggle="modal" data-target="#Login"></button>
                                                <button type="button" class="fa fa-star " style="cursor: pointer; border: none; background: none;" onclick="setRating(5)" data-toggle="modal" data-target="#Login"></button>
                                            </c:if>

                                            <c:if test="${LOGIN_USER != null}">
                                                <button type="submit" class="fa fa-star <c:if test="${rating.scoreUser >= 1}">checked</c:if>" onclick="setRating(1)" style="cursor: pointer; border: none; background: none;" name="op" value="one"></button>
                                                <button type="submit" class="fa fa-star <c:if test="${rating.scoreUser >= 2}">checked</c:if>" onclick="setRating(2)" style="cursor: pointer; border: none; background: none;" name="op" value="two"></button>
                                                <button type="submit" class="fa fa-star <c:if test="${rating.scoreUser >= 3}">checked</c:if>" onclick="setRating(3)" style="cursor: pointer; border: none; background: none;" name="op" value="three"></button>
                                                <button type="submit" class="fa fa-star <c:if test="${rating.scoreUser >= 4}">checked</c:if>" onclick="setRating(4)" style="cursor: pointer; border: none; background: none;" name="op" value="four"></button>
                                                <button type="submit" class="fa fa-star <c:if test="${rating.scoreUser == 5}">checked</c:if>" onclick="setRating(5)" style="cursor: pointer; border: none; background: none;" name="op" value="five"></button>
                                            </c:if>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <div class="row mt-4 mb-4">
                                <div class="col-4" style="display: flex;
                                     justify-content: start;
                                     align-items: center;
                                     gap: 1rem;padding-left: 34px;">
                                    <span class="material-symbols-outlined" style="font-size:30px; color:black">
                                        star
                                    </span>

                                    <div>
                                        <span style="color:black; ">${totalRate} ratings</span>
                                    </div>
                                </div>
                                <div class="col-4" style="display: flex;
                                     justify-content: center;
                                     align-items: center;
                                     gap: 1rem">
                                    <i class="ti-comment bookmark" style="font-size:23px; color:black;"></i>
                                    <span style="color:black; float: right;">${noFb} Feedback</span>
                                </div>
                            </div>       

                            <div class="row mt-4 mb-4">
                                <div class="col-4" style="display: flex;
                                     justify-content: center;
                                     align-items: center;
                                     gap: 1rem">
                                    <i class="ti-timer" style="font-size: 30px;"></i>
                                    <div>
                                        <span>Cooking: ${recipe.cookingTime} mins</span>
                                    </div>
                                </div>

                                <div class="col-4" style="display: flex;
                                     justify-content: center;
                                     align-items: center;
                                     gap: 1rem">
                                    <c:if test="${LOGIN_USER == null }">
                                        <button class="bi bi-heart"  style="font-size:23px; color:black;cursor: pointer; border: none;" 
                                                data-toggle="modal" data-target="#Login"></button>
                                    </c:if>
                                    <c:if test="${favorite == null and LOGIN_USER != null}">
                                        <form action="MainController?recipeID=${recipe.recipeID}" method="POST" >
                                            <input type="hidden" name="userID" value="${LOGIN_USER.userID}">
                                            <button class="bi bi-heart"  style="font-size:23px; color:black;cursor: pointer; border: none;" type="submit" name="action" value="Favorite"></button>
                                        </form>
                                    </c:if>
                                    <c:if test="${favorite != null and LOGIN_USER != null}">
                                        <button class="bi bi-heart-fill"  style="font-size:23px; color:black;cursor: pointer; border: none;"
                                                data-toggle="modal" data-target="#RemoveFavorite"></button>
                                    </c:if>
                                    <span style="padding-left: 5px;"> Like: ${fSize}</span>
                                </div>

                                <div class="col-4" style="display: flex;
                                     justify-content: center;
                                     align-items: center;
                                     gap: 1rem">
                                    <c:if test="${LOGIN_USER == null }">
                                        <button class="bi bi-bookmark"  style="font-size:23px; color:black;cursor: pointer; border: none;" 
                                                data-toggle="modal" data-target="#Login"></button>
                                    </c:if>
                                    <c:if test="${save == null and LOGIN_USER != null}">
                                        <form action="MainController?recipeID=${recipe.recipeID}" method="POST" >
                                            <input type="hidden" name="userID" value="${LOGIN_USER.userID}">
                                            <button class="bi bi-bookmark"  style="font-size:23px; color:black;cursor: pointer; border: none;" type="submit" name="action" value="SavedRecipe"></button>
                                        </form>
                                    </c:if>
                                    <c:if test="${save != null and LOGIN_USER != null}">
                                        <button class="bi bi-bookmark-fill"  style="font-size:23px; color:black;cursor: pointer; border: none;"
                                                data-toggle="modal" data-target="#RemoveSaved"></button>
                                    </c:if>
                                    <span style="padding-left: 5px;"> Saved: ${sSize}</span>
                                </div>
                            </div>
                            <p> 
                                ${recipe.description}
                            </p>
                            <div class="row " >
                                <div class="col-2 col-md-2 col-lg-12 mb-2">
                                    <h4 style="background-color: #fafafa; text-align: center;" > <span><b>Nutrional</b></span></h4>
                                </div>
                                <div class="col-2 col-md-2 col-lg-2 "
                                     style="background-color: beige;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center;">
                                    <span><b>kcal</b></span><br>
                                    550
                                </div>
                                <div class="col-2 col-md-2 col-lg-2"
                                     style="background-color: beige;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center;">
                                    <span><b>fat</b></span><br>
                                    20
                                </div>
                                <div class="col-2 col-md-2 col-lg-2"
                                     style="background-color: beige;border-style: solid;border-width: 2px 0px 2px 2px; text-align: center; ">
                                    <span><b>protein</b></span><br>
                                    1
                                </div>
                                <div class="col-2 col-md-2 col-lg-2"
                                     style="background-color: beige;border-style: solid;border-width:2px 0px 2px 2px;text-align: center; ">
                                    <span><b>carbs</b></span><br>
                                    5
                                </div>
                                <div class="col-2 col-md-2 col-lg-2"
                                     style="background-color: beige;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center; ">
                                    <span><b>sugars</b></span><br>
                                    0g
                                </div>
                                <div class="col-2 col-md-2 col-lg-2"
                                     style="background-color: beige;border-style: solid;border-width: 2px 2px 2px 2px;text-align: center;  ">
                                    <span><b>salt</b></span><br>
                                    1.42g

                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="row">
                    <div class="col-12 col-md-5 col-lg-5 mt-5">
                        <h4 style="background-color: #fafafa; border: solid 2px">Ingredients</h4>
                        <div  style="border: solid 2px">
                            <ul style="background-color: #fafafa">
                                <li>- 450g chicken breasts</li>
                                <li>- 120g cream cheese</li>
                                <li>- 2 tbsp green pesto</li>
                                <li>- 2 tbsp Parmesan cheese, finely grated</li>
                                <li>- ½ tsp avocado oil</li>
                                <li>- ¼ tsp sea salt</li>
                                <li>- ¼ tsp ground black pepper</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-12 col-md-5 col-lg-5 mt-5">
                        <h4 style="background-color: #fafafa; border: solid 2px">Steps</h4>
                        <div  style="background-color: #fafafa; border: solid 2px">
                            <c:forEach var="step" items="${LIST_STEP}">
                                <h5>Step ${step.stepNumber}:</h5>
                                <p>${step.instructions}</p>
                            </c:forEach>
                        </div>

                    </div>
                </div>

                <!--Comment -->
                <div class="container mt-9 mb-9 m-md-5">
                    <div class="row height d-flex justify-content-center align-items-center">
                        <div class="col-md-12" >
                            <div class="card">
                                <div class="p-4"  style="background-color: #fafafa">
                                    <h4>Comments</h4>
                                </div>
                                <form action="MainController" method="POST">
                                    <div class="mt-3 d-flex flex-row align-items-center p-3 form-color">
                                        <input type="number" hidden name="userID" value="${LOGIN_USER.userID}">
                                        <input type="number" hidden name="recipeID" value="${recipe.recipeID}">
                                        <input type="text" hidden name="userName" value="${LOGIN_USER.userName}">
                                        <input type="text" class="form-control" placeholder="Enter your comment..." name="content">
                                        <p class="small mb-0" style="color: #aaa;">
                                            <c:if test="${LOGIN_USER != null}">
                                                <button type="submit" name="action" value="Feedback" class="btn btn-outline-success">Post</button>
                                            </c:if>
                                            <c:if test="${LOGIN_USER == null}">
                                                <button type="button" data-toggle="modal" data-target="#Login" class="btn btn-outline-success">Post</button>
                                            </c:if>
                                        </p>
                                    </div>
                                </form>
                                ${message}
                                <div class="mt-2"  style="background-color: #fafafa">
                                    <c:forEach var="fb" items="${feedbacks}">
                                        <c:if test="${fb.status == 'true'}">
                                            <div class="d-flex flex-row p-3"> 
                                                <img src="img/sidebar-img/HT.jpeg" width="40" height="40" class="rounded-circle mr-3">
                                                <div class="w-100" style="background-color: #fafafa">
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <div class="d-flex flex-row align-items-center"> 
                                                            <span class="mr-2">${fb.userName}</span> 
                                                        </div> 
                                                        <small>${fb.feedBackDate}</small>
                                                    </div>
                                                    <p class="text-justify comment-text mb-0">${fb.content}</p>
                                                </div>
                                            </div>
                                        </c:if>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </section>

        <footer class="footer_area">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="footer-content">
                            <!-- Logo Area Start -->
                            <div class="footer-logo-area text-center">
                                <a href="index.html" class="yummy-logo">Flavorful Creations</a>
                            </div>
                            <!-- Menu Area Start -->
                            <nav class="navbar navbar-expand-lg">
                                <button class="navbar-toggler" type="button" data-toggle="collapse"
                                        data-target="#yummyfood-footer-nav" aria-controls="yummyfood-footer-nav"
                                        aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"
                                                                                        aria-hidden="true"></i> Menu</button>
                                <!-- Menu Area Start -->
                                <div class="collapse navbar-collapse justify-content-center" id="yummyfood-footer-nav">
                                    <ul class="navbar-nav" id="yummy-nav">
                                        <li class="nav-item">
                                            <a class="nav-link" href="mainpage.jsp">Home <span
                                                    class="sr-only">(current)</span></a>
                                        </li>
                                        <li class="nav-item active">
                                            <a class="nav-link" href="recipespage.jsp">Recipes</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="categories.jsp">Categories</a>
                                        </li>
                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button"
                                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">My Recipes</a>
                                            <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                                <c:if test="${LOGIN_USER ==null}">
                                                    <a class="dropdown-item" href="login.jsp">Add a recipe</a>

                                                    <a class="dropdown-item" href="login.jsp">My favorites</a>
                                                    <a class="dropdown-item" href="login.jsp">Saved</a>
                                                </c:if>
                                                <c:if test="${LOGIN_USER !=null}">
                                                    <a class="dropdown-item" href="createrecipe.jsp">Add a recipe</a>

                                                    <a class="dropdown-item" href="favorite.jsp">My favorites</a>
                                                    <a class="dropdown-item" href="saved.jsp">Saved</a>
                                                </c:if>


                                            </div>
                                        </li>

                                        <li class="nav-item">
                                            <a class="nav-link" href="login.html">Meal Plan</a>
                                        </li>

                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <!-- Copywrite Text -->
                        <div class="copy_right_text text-center">
                            <p>Enjoy your life <i class="fa fa-heart-o"
                                                  aria-hidden="true"></i> by "Flavorful Creations"</p>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <div class="modal fade" id="RemoveFavorite" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLongTitle">Are you sure?</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Removing this recipe will delete it permanently from favorite recipes and posts on your profile.
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <form action="MainController?recipeID=${recipe.recipeID}&userID=${LOGIN_USER.userID}" method="POST">
                            <button type="submit" name="action" value="RemoveFavoriteRecipe" class="btn btn-primary">Remove</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!--        DIALOG REMOVING SAVED-->      
        <div class="modal fade" id="RemoveSaved" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLongTitle">Are you sure?</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">2  &times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Removing this recipe will delete it permanently from save recipes and posts on your profile.
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <form action="MainController?recipeID=${recipe.recipeID}&userID=${LOGIN_USER.userID}" method="POST">
                            <button type="submit" name="action" value="RemoveSavedRecipe" class="btn btn-primary">Remove</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!--        DIALOG LOGIN TO ...-->      
        <div class="modal fade" id="Login" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLongTitle">Notification</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Please sign up to do anything !!!
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <a href="login.jsp"><button type="button" name="op" value="remove" class="btn btn-primary">Sign in</button></a>
                    </div>
                </div>
            </div>
        </div>
        <!-- ****** Footer Menu Area End ****** -->

        <!-- Jquery-2.2.4 js -->
        <script src="js/jquery/jquery-2.2.4.min.js"></script>
        <!-- Popper js -->
        <script src="js/bootstrap/popper.min.js"></script>
        <!-- Bootstrap-4 js -->
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <!-- All Plugins JS -->
        <script src="js/others/plugins.js"></script>
        <!-- Active JS -->
        <script src="js/active.js"></script>
    </body>