<%-- 
    Document   : favorite
    Created on : Jun 26, 2023, 10:53:37 PM
    Author     : phamt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

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
<body>
    
    
<div style="background-color: rgba">
    <div class="container">
        <div class="row">
            <div class="col-12 col-md-12 col-lg-12" style="text-align: center;"><h1>Favorite</h1></div>
            <c:if test="${size == 0 and LOGIN_USER != null}">
                <p class="text-center align-content-lg-center">Don't have anything here</p>
            </c:if>
            <c:if test="${LOGIN_USER != null}">
                <c:forEach var="favorite" items="${list}">
                    <div class="col-6 col-md-3 col-lg-3 my-favorite">
                        <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                            <!-- Post Thumb -->
                            <div class="post-thumb">
                                <a>
                                    <img src="${favorite.img}" alt="" style="height: 180px; width: 100%; margin-bottom: 10px">
                                </a>
                            </div>
                            <!-- Post Content -->
                            <div class="post-content">
                                <div class="row">

                                    <div class="col-10 col-md-10 col-lg-10" style="text-align: center">
                                        <a href="MainController?action=RecipeDetail&recipeID=${favorite.recipeID}">
                                           <h4 class="post-headline" style="text-align: center; font-size: 27px">${favorite.recipeName}</h4>
                                        </a>
                                    </div>
                                    <div class="col-2 col-md-2 col-lg-2">
                                        <a class=" material-symbols-outlined nav-item dropdown" href="#" id="yummyDropdown" role="button"
                                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: black;float:right;padding-top: 15px">more_vert</a>
                                        <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                            <form action="MainController?recipeID=${favorite.recipeID}&userID=${LOGIN_USER.userID}" method="POST">
                                                <button class="dropdown-item" type="submit" name="action" value="RemoveFromFavorite">Remove</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach> 
            </c:if>

            <c:if test="${LOGIN_USER == null}">
                <p>Please Sign in to view your recipe</p>
            </c:if>
        </div>
    </div>
</div>
    
    
    
    
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
                                <li class="nav-item active">
                                    <a class="nav-link" href="mainpage.html">Home <span
                                            class="sr-only">(current)</span></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="recipespage.jsp">Recipes</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="categories.jsp">Categories</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button"
                                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">My Recipes</a>
                                    <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                        <a class="dropdown-item" href="login.jsp">Add a recipe</a>

                                        <a class="dropdown-item" href="login.jsp">My favorites</a>
                                        <a class="dropdown-item" href="login.jsp">Saved</a>

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
</html>