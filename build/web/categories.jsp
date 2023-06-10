<%-- 
    Document   : categories
    Created on : May 19, 2023, 10:58:05 PM
    Author     : Admin
--%>
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
    <div class="top_header_area">
        <div class="container">
            <div class="row">
                <div class="col-5 col-sm-6">
                    <!--  Top Social bar start -->
                    <div class="top_social_bar">
                       
                    </div>
                </div>
                <!--  Login Register Area -->
                <div class="col-7 col-sm-6">
                    <div class="signup-search-area d-flex align-items-center justify-content-end">
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
            </div>
        </div>
    </div>
    <!-- ****** Top Header Area End ****** -->

    <!-- ****** Header Area Start ****** -->
        <header class="header_area" style="background-color: #ebebeb;">
            <div class="container">
                <div class="row">
                    <!-- Logo Area Start -->
                    <div class="col-12">
                        <div class="logo_area text-center">
                            <a href="index.html" class="yummy-logo">Flavorful Creations</a>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12">
                        <nav class="navbar navbar-expand-lg ">
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#yummyfood-nav"
                                    aria-controls="yummyfood-nav" aria-expanded="false" aria-label="Toggle navigation"><i
                                    class="fa fa-bars" aria-hidden="true"></i> Menu</button>
                            <!-- Menu Area Start -->
                            <div class="collapse navbar-collapse justify-content-center" id="yummyfood-nav">
                                <ul class="navbar-nav" id="yummy-nav">
                                    <li class="nav-item">
                                        <a class="nav-link" href="homepage.html">Home <span
                                                class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="recipes.jsp">Recipes</a>
                                    </li>
                                    <li class="nav-item  active">
                                        <a class="nav-link" href="categories.jsp">Categories</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="myRecipes.jsp">My recipes</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="contact.html">Contact</a>
                                    </li>
                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
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
                    </div>
                </div>
            </div>
        </div>
        <!-- ****** Breadcumb Area End ****** -->
        <!-- ****** Welcome Categories Area Start ****** -->
        <section class="categories_area clearfix" id="about">
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-6 col-lg-4">
                    <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                        <img src="img/catagory-img/1.jpg" alt="">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Breakfast</h5>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4">
                    <div class="single_catagory wow fadeInUp" data-wow-delay=".6s">
                        <img src="img/catagory-img/2.jpg" alt="">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Lunch</h5>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4">
                    <div class="single_catagory wow fadeInUp" data-wow-delay=".9s">
                        <img src="img/catagory-img/3.jpg" alt="">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Dinner</h5>
                            </a>
                        </div>
                    </div>
                </div>
                    <div class="col-12 col-md-6 col-lg-4">
                    <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                        <img src="img/catagory-img/7.png" alt="">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Vegan</h5>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4">
                    <div class="single_catagory wow fadeInUp" data-wow-delay=".6s">
                        <img src="img/catagory-img/6.jpg" alt="">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Healthy</h5>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 col-lg-4">
                    <div class="single_catagory wow fadeInUp" data-wow-delay=".9s">
                        <img src="img/catagory-img/4.jpg" alt="">
                        <div class="catagory-title">
                            <a href="#">
                                <h5>Keto</h5>
                            </a>
                        </div>
                    </div>
                </div>
                </div>
            </div>
        </section>

    <!-- ****** Footer Menu Area Start ****** -->
                    <footer class="footer_area" style="background-color: #ebebeb;">
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
                                        <p>Copyright @2023 All rights reserved | This template is made with <i class="fa fa-heart-o"
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

