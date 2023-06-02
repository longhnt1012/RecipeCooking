<%-- 
    Document   : Create_Recipes
    Created on : May 31, 2023, 9:22:09 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <link href="style.css" rel="stylesheet">

        <!-- Responsive CSS -->
        <link href="css/responsive/responsive.css" rel="stylesheet">

        <link href="css/Create_Recipes.css" rel="stylesheet">

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
        <header class="header_area">
            <div class="container">
                <div class="row">
                    <!-- Logo Area Start -->
                    <div class="col-12">
                        <div class="logo_area text-center">
                            <a href="index.html" class="yummy-logo">Life to eat</a>
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
                                        <a class="nav-link" href="index.html">Home <span
                                                class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button"
                                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pages</a>
                                        <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                            <a class="dropdown-item" href="index.html">Home</a>
                                            <a class="dropdown-item" href="archive.html">Archive</a>
                                            <a class="dropdown-item" href="single.html">Single Blog</a>
                                            <a class="dropdown-item" href="static.html">Static Page</a>
                                            <a class="dropdown-item" href="contact.html">Contact</a>
                                        </div>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="recipes.jsp">recipes</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">Categories</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="archive.html">Archive</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">About</a>
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

        <!-- ****** Create recipes Area Start ****** -->
        <div class="container">
            <div class="content-responsive">
                <div class="content-wrapper">
                    <div class="table-title row">
                        <div class="col-sm-5">
                            <h2>Create Recipes</h2>
                        </div>
                        <div class="col-sm-7">
                            <a data-target="#addProductModal" data-toggle="modal" class="btn">Save</a>
                        </div>
                    </div>
                    <div class="container">
                        <form action="MainController" method="POST">
                            <div class="row">
                                <h4 class="post-headline mt-15">Title</h4>
                                <input class="form-control" type="text" name="recipeName" placeholder="Give your recipe a name"/>
                            </div>
                            <div class="row justify-content-center mt-15">
                                <button class="btn" type="button" name="recipeImage">Add source</button>
                            </div>
                            <div class="row">
                                <label class="post-headline mt-15"><h4>Description</h4></label>
                                <input class="form-control" type="text" name="recipeDescription" placeholder="Introduce your recipe"/>
                            </div>
                            <div class="row inputContainer">
                                <label class="post-headline mt-15"><h4>Ingredients</h4></label>
                                <input class="form-control" type="text" name="recipeDescription" placeholder="Add one or multiple items"/>                
                            </div>
                            <h4 class="post-headline row mt-15">Prep Time</h4>
                            <div class="row">
                                <div class="col-6 hihi">
                                    <input class="form-control" type="text" name="recipePrepTime" placeholder="Hours"/>
                                </div>
                                <div class="col-6 hihi1">
                                    <input class="form-control" type="text" name="recipePrepTime" placeholder="Minutes"/>
                                </div>
                            </div>
                            <h4 class="post-headline row mt-15">Cooking Time</h4>
                            <div class="row">
                                <div class="col-6 hihi">
                                    <input class="form-control" type="text" name="recipeCookingTime" placeholder="Hours"/>
                                </div>
                                <div class="col-6 hihi1">
                                    <input class="form-control" type="text" name="recipeCookingTime" placeholder="Minutes"/>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- ****** Create recipes Area End ****** -->

        <!-- ****** Instagram Area Start ****** -->
        <div style="margin-top: 30px" class="instargram_area owl-carousel section_padding_100_0 clearfix" id="portfolio">

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="img/instagram-img/1.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="img/instagram-img/2.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="img/instagram-img/3.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="img/instagram-img/4.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="img/instagram-img/5.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="img/instagram-img/6.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="img/instagram-img/1.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="img/instagram-img/2.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <!-- ****** Our Creative Portfolio Area End ****** -->

        <!-- ****** Footer Social Icon Area Start ****** -->
        <div class="social_icon_area clearfix">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="footer-social-area d-flex">
                            <div class="single-icon">
                                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i><span>facebook</span></a>
                            </div>

                            <div class="single-icon">
                                <a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i><span>GOOGLE+</span></a>
                            </div>

                            <div class="single-icon">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i><span>Instagram</span></a>
                            </div>


                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ****** Footer Social Icon Area End ****** -->

        <!-- ****** Footer Menu Area Start ****** -->
        <footer class="footer_area">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="footer-content">
                            <!-- Logo Area Start -->
                            <div class="footer-logo-area text-center">
                                <a href="index.html" class="yummy-logo">Life to eat</a>
                            </div>
                            <!-- Menu Area Start -->
                            <nav class="navbar navbar-expand-lg">
                                <button class="navbar-toggler" type="button" data-toggle="collapse"
                                        data-target="#yummyfood-footer-nav" aria-controls="yummyfood-footer-nav"
                                        aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"
                                                                                        aria-hidden="true"></i> Menu</button>
                                <!-- Menu Area Start -->
                                <div class="collapse navbar-collapse justify-content-center" id="yummyfood-footer-nav">
                                    <ul class="navbar-nav">
                                        <li class="nav-item active">
                                            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Features</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Categories</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Archive</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">About</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Contact</a>
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
                            <p>Copyright @2023 All rights reserved | This template is made with <i class="fa fa-heart-o"
                                                                                                   aria-hidden="true"></i> by "Life to eat clean"</p>
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
        <!-- Create recipe -->
        <script>
            const inputContainer = document.querySelector('.inputContainer');
            function createInputBox() {
                const newInput = document.createElement('input');
                newInput.classList.add('form-control', 'mt-15');
                newInput.type = 'text';
                newInput.placeholder = 'Add one or multiple items';
                inputContainer.appendChild(newInput);
            }
            inputContainer.addEventListener('change', function (event) {
                const lastInput = event.target;
                // Check if the last input box is not empty
                if (lastInput.value.trim() !== '') {
                    createInputBox();
                }
            });

        </script>
    </body>
</html>
