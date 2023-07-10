<<<<<<< HEAD
<%-- 
    Document   : categories
    Created on : May 19, 2023, 10:58:05 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Yummy Blog - Food Blog Template</title>

        <!-- Favicon -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link href="css/style.css" rel="stylesheet">

        <!-- Responsive CSS -->
        <link href="css/responsive/responsive.css" rel="stylesheet">
    </head>
    <body>
         <!-- ****** Top Header Area Start ****** -->
=======
    
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
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
    <div class="top_header_area">
        <div class="container">
            <div class="row">
                <div class="col-5 col-sm-6">
                    <!--  Top Social bar start -->
                    <div class="top_social_bar">
                        <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
<<<<<<< HEAD
                        <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                        <a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
                        <a href="#"><i class="fa fa-skype" aria-hidden="true"></i></a>
                        <a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a>
=======
                        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                        <a href="#"><i class="fa fa-google" aria-hidden="true"></i></a>
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
                    </div>
                </div>
                <!--  Login Register Area -->
                <div class="col-7 col-sm-6">
                    <div class="signup-search-area d-flex align-items-center justify-content-end">
<<<<<<< HEAD
                        <div class="login_register_area d-flex">
                            <div class="login">
                                <a href="register.html">Sign in</a>
                            </div>
                            <div class="register">
                                <a href="register.html">Sign up</a>
                            </div>
                        </div>
                        <!-- Search Button Area -->
                        <div class="search_button">
                            <a class="searchBtn" href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                        </div>
                        <!-- Search Form -->
                        <div class="search-hidden-form">
                            <form action="#" method="get">
                                <input type="search" name="search" id="search-anything"
                                    placeholder="Search Anything...">
                                <input type="submit" value="" class="d-none">
                                <span class="searchBtn"><i class="fa fa-times" aria-hidden="true"></i></span>
                            </form>
                        </div>
                    </div>
                </div>
=======
                        <div class="col-8 col-sm-8">
                            <div class="search_button justify-content-end align-items-center d-flex">
                                <a class="searchBtn" href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                            </div>
                            <div class="search-hidden-form justify-content-end align-items-center ">
                                <form action="MainController" method="GET">
                                    <input type="text" name="search" id="search-anything"
                                        placeholder="Search Anything...">
                                    <input type="submit" name="action" value="Search" class="d-none">
                                    <span class="searchBtn"><i class="fa fa-times" aria-hidden="true"></i></span>
                                </form>
                            </div>
                        </div>
                        <div class="login_register_area d-flex col-4 col-sm-4">
                            <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button"
                                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><h7>Hi Long${sessionScope.USER_ID.fullName}</h7></a>
                                    <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                        <a class="dropdown-item" href="view-public-info.html">Your Profile</a>

                                        <a class="dropdown-item" href="changepass.html">Change Password</a>
                                        <a class="dropdown-item" href="myfavorite.html">Your Saved</a>
                                        <form action="MainController" method="POST">
                                            <input class="dropdown-item" type="submit" name="action" value="Log out">
                                        </form>
                                        

                                    </div>
                                </li>
                        </div>
                    </div>
                </div>


>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
            </div>
        </div>
    </div>
    <!-- ****** Top Header Area End ****** -->

    <!-- ****** Header Area Start ****** -->
<<<<<<< HEAD
    <header class="footer-social-area">
=======
    <header class="header_area">
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
        <div class="container">
            <div class="row">
                <!-- Logo Area Start -->
                <div class="col-12">
                    <div class="logo_area text-center">
<<<<<<< HEAD
                        <a href="index.html" class="yummy-logo">Yummy Blog</a>
=======
                        <a href="mainpage.jsp" class="yummy-logo">Flavorful Creations</a>
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
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
                                <li class="nav-item ">
                                    <a class="nav-link" href="mainpage.jsp">Home <span
                                            class="sr-only">(current)</span></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="recipespage.jsp">Recipes</a>
                                </li>
                                <li class="nav-item active">
                                    <a class="nav-link" href="categories.jsp">Categories</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button"
                                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">My Recipes</a>
                                    <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                        <a class="dropdown-item" href="createrecipe.jsp">Add a recipe</a>

                                        <a class="dropdown-item" href="#">My favorites</a>
                                        <a class="dropdown-item" href="myfavorite.html">Saved</a>
                                        
                                    </div>
                                </li>

                                <li class="nav-item">
                                    <a class="nav-link" href="planpage.jsp">Meal Plan</a>
                                </li>
<<<<<<< HEAD
=======

>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </header>
<<<<<<< HEAD
    <!-- ****** Header Area End ****** -->
    
        <div class="breadcumb-area" style="background-image: url(img/bg-img/breadcumb.jpg);">
            <div class="container h-100">
                <div class="row h-100 align-items-center">
                    <div class="col-12">
                        <div class="bradcumb-title text-center">
                            <h2>Categories Page</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="breadcumb-nav">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="#"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Categories Page</li>
                            </ol>
                        </nav>
=======
    
     <section class="blog_area section_padding_0_80">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 ">
                    <!-- col-lg-8 -->
                    <div class="row">
                        <div class="col-12 col-md-12 col-lg-12" style="text-align: center;">
                            <h2 style="margin-bottom: 30px;">Categories</h2>
                        </div>
                      <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                        <img src="img/sidebar-img/healthymain.jpeg" alt="" style="width: 350px;height:220px; margin-left: 30px">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Healthy Main Dishes</h5>
                            </a>
                        </div>
                    </div>
                        
                        <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                            <img src="img/sidebar-img/healthyside.jpeg" alt="" style="width: 350px;height:220px; margin-left: 30px">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Healthy Side Dishes</h5>
                            </a>
                        </div>
                    </div>
                        
                      <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                          <img src="img/sidebar-img/healthy salad.jpeg" alt="" style="width: 350px;height:220px; margin-left: 30px">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Healthy Salad</h5>
                            </a>
                        </div>
                    </div>
                        <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                            <img src="img/sidebar-img/healthybreakfast.jpg" alt="" style="width: 350px;height:220px; margin-left: 30px">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Healthy Breakfast</h5>
                            </a>
                        </div>
                    </div>
                      <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                          <img src="img/sidebar-img/healthydesserts.jpg" alt="" style="width: 350px;height:220px; margin-left: 30px">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Healthy Desserts</h5>
                            </a>
                        </div>
                    </div>
                        <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                            <img src="img/sidebar-img/healthysnacks.jpeg" alt="" style="width: 350px;height:220px; margin-left: 30px">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Healthy Snacks</h5>
                            </a>
                        </div>
                    </div>
                        <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                          <img src="img/sidebar-img/healthy salad.jpeg" alt="" style="width: 350px;height:220px; margin-left: 30px">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Healthy Salad</h5>
                            </a>
                        </div>
                    </div>
                      <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                          <img src="img/sidebar-img/low-calories.jpeg" alt="" style="width: 350px;height:220px; margin-left: 30px">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Low-Calories</h5>
                            </a>
                        </div>
                    </div>
                       <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                           <img src="img/sidebar-img/low-fat.jpeg" alt="" style="width: 350px;height:220px; margin-left: 30px">
                        <div class="catagory-title">
                            <a href="searchCatagories.html">
                                <h5>Keto</h5>
                            </a>
                        </div>
                    </div>
                         <div class="col-12">
                    <div class="pagination-area d-sm-flex mt-15">
                        <nav aria-label="#">
                            <ul class="pagination">
                                <li class="page-item active">
                                    <a class="page-link" href="#">1 <span class="sr-only">(current)</span></a>
                                </li>
                                <li class="page-item"><a class="page-link" href="#">2</a></li>
                                <li class="page-item"><a class="page-link" href="#">3</a></li>
                                <li class="page-item">
                                    <a class="page-link" href="#">Next <i class="fa fa-angle-double-right" aria-hidden="true"></i></a>
                                </li>
                            </ul>
                        </nav>
                        <div class="page-status">
                            <p>Page 1 of 60 results</p>
                        </div>
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
                    </div>
                </div>
            </div>
        </div>
<<<<<<< HEAD
        <!-- ****** Breadcumb Area End ****** -->
        <!-- ****** Welcome Categories Area Start ****** -->
        <section class="categories_area clearfix" id="about">
            <div class="container">
                <div class="row">
                    <c:forEach var="item" items="${sessionScope.LIST_CATEGORIES}">
                        <div class="col-12 col-md-6 col-lg-4">
                            <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                                <img src="img/category-img/${item.image}" alt="">
                                <div class="catagory-title">
                                    <c:url var="search" value="ManageCategoryOfRecipeController">
                                        <c:param name="categoryID" value="${item.categoryID}"></c:param>
                                        <c:param name="action" value="Search"></c:param>
                                    </c:url>
                                    <a href="${search}">
                                        <h5>${item.categoryName}</h5>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </section>

      <!-- ****** Footer Menu Area Start ****** -->
    <footer class="footer_area">
=======
    </section>

    
    
    
    
    
    
    
    <!-- ****** Footer Social Icon Area End ****** -->

    <!-- ****** Footer Menu Area Start ****** -->
     <footer class="footer_area">
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="footer-content">
                        <!-- Logo Area Start -->
                        <div class="footer-logo-area text-center">
<<<<<<< HEAD
                            <a href="index.html" class="yummy-logo">Yummy Blog</a>
=======
                            <a href="index.html" class="yummy-logo">Flavorful Creations</a>
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
                        </div>
                        <!-- Menu Area Start -->
                        <nav class="navbar navbar-expand-lg">
                            <button class="navbar-toggler" type="button" data-toggle="collapse"
                                data-target="#yummyfood-footer-nav" aria-controls="yummyfood-footer-nav"
                                aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"
                                    aria-hidden="true"></i> Menu</button>
                            <!-- Menu Area Start -->
<<<<<<< HEAD
                            
=======
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
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
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
<<<<<<< HEAD
                        <p>Copyright @2018 All rights reserved | This template is made with <i class="fa fa-heart-o"
                                aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                        </p>
=======
                        <p>Enjoy your life <i class="fa fa-heart-o"
                                aria-hidden="true"></i> by "Flavorful Creations"</p>
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
                    </div>
                </div>
            </div>
        </div>
    </footer>

    <!-- ****** Footer Menu Area End ****** -->
<<<<<<< HEAD
    
=======

>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb
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
<<<<<<< HEAD
    </body>
</html>
=======
</body>
>>>>>>> da3d2f22422c1b74d756e56f2df4f6e0717353cb

