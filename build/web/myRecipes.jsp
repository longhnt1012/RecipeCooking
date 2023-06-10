<%-- 
    Document   : myRecipes
    Created on : Jun 10, 2023, 10:19:57 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- Title -->
        <title>Yummy Blog - Food Blog Template</title>
        <link rel="stylesheet" href="fonts-2/themify-icons/themify-icons.css">
        <!-- Favicon -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link href="css/style.css" rel="stylesheet">

        <!-- Responsive CSS -->
        <link href="css/responsive/responsive.css" rel="stylesheet">

        <link href="css/MyRecipes.css" rel="stylesheet">

        <style>
            /* Buy tikets modal */
            .modal {
                position: fixed;
                left: 0;
                bottom: 0;
                top: 0;
                right: 0;
                background-color: rgba(0, 0, 0, 0.5);
                display: none;
                align-items: center;
                justify-content: center;
            }

            .open{
                display: flex;
            }

            .modal-container {
                background-color: #fff;
                width: 900px;
                max-width: calc(100% - 32px);
                min-height: 200px;
                position: relative;
                animation: modalFadeIn ease 0.3s;
            }

            header.modal-header {
                background-color: #009688!important;
                color: #fff;
                height: 130px;
                display: flex;
                align-items: center;
                justify-content: center;
                font-size: 30px;
                letter-spacing: 4px;
                margin-bottom: 15px;
            }

            .modal-close {
                position: absolute;
                right: 0;
                font-size: 12px;
                color: #fff;
                padding: 8px 16px;
                cursor: pointer;
            }

            .modal-close:hover {
                background-color: #ccc;
                color: #000;
            }

            .modal-body {
                padding: 0 16px;
                font-size: 15px;
            }

            .modal-label {
                display: block;
                margin-bottom: 12px;
            }

            .modal-input {
                padding: 10px;
                border: 1px solid #ccc;
                width: 100%;
                font-size: 15px;
                margin-bottom: 24px;
            }

            .buy-tickets {
                background-color: #009688!important;
                color: #fff;
                width: 100%;
                /* margin: 15px auto; */
                padding: 17px;
                border: none;
                text-transform: uppercase;
                cursor: pointer;
                font-size: 15px;
            }
            .buy-tickets:hover {
                background-color: #ccc;
                color: #000;
            }

            .modal-footer {
                text-align: right;
                padding: 16px;
                font-size: 15px;
            }

            .modal-footer a{
                color: #2196F3!important;
            }

            @keyframes modalFadeIn {
                from {
                    opacity: 0;
                    transform: translateY(-140px);
                }
                to {
                    opacity: 1;
                    transform: translateY(0);
                }
            }
        </style>
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
                            <div class="col-8 col-sm-8">
                                <div class="search_button justify-content-end align-items-center d-flex">
                                    <a class="searchBtn" href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                </div>
                                <div class="search-hidden-form justify-content-end align-items-center ">
                                    <form action="MainController" method="GET">
                                        <input type="text" name="search" id="search-anything" placeholder="Search Anything...">
                                        <input type="submit" name="action" value="Search" class="d-none">
                                        <span class="searchBtn"><i class="fa fa-times" aria-hidden="true"></i></span>
                                    </form>
                                </div>
                            </div>
                            <div class="login_register_area d-flex col-4 col-sm-4">
                                <div class="login">
                                    <a href="login.html">Sign in</a>
                                </div>
                                <div class="register">
                                    <a href="register.html">Sign up</a>
                                </div>
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
                                    <li class="nav-item">
                                        <a class="nav-link" href="categories.jsp">Categories</a>
                                    </li>
                                    <li class="nav-item  active">
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
                            <h2>My recipes Page</h2>
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
                                <li class="breadcrumb-item active" aria-current="page">My recipes Page</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <section class="blog_area section_padding_0_80">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="row">
                            <div class="col-4">
                                <ul class="navbar-nav">
                                    <li class="nav-item">
                                        <button class="btn-myRecipes">
                                            <a class="nav-link" href="#">ALL(2)<span
                                                    class="sr-only">(current)</span></a>
                                        </button>
                                    </li>
                                    <li class="nav-item">
                                        <button class="btn-myRecipes">
                                            <a class="nav-link" href="#">SAVE(2)</a>
                                        </button>
                                    </li>
                                    <li class="nav-item">
                                        <button class="btn-myRecipes">
                                            <a class="nav-link" href="mainpage.html">FAVORITE(0)</a>
                                        </button>
                                    </li>
                                </ul>
                            </div>

                            <div class="col-md-4">
                                <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                    <!-- Post Thumb -->
                                    <div class="post-thumb">
                                        <img src="img/blog-img/Milktea.png" style="width: 350px;
                                             height: 230px;" alt="">
                                    </div>
                                    <!-- Post Content -->
                                    <div class="post-content">
                                        <div class="post-meta d-flex">
                                            <div class="post-author-date-area d-flex">
                                                <!-- Post Author -->
                                                <div class="post-author">
                                                    <a href="#">By Thành Long</a>
                                                </div>
                                                <!-- Post Date -->
                                                <div class="post-date">
                                                    <a href="#">May 19, 2017</a>
                                                </div>
                                            </div>
                                            <!-- Post Comment & Share Area -->
                                            <div class="post-comment-share-area d-flex">
                                                <!-- Post Favourite -->
                                                <div class="post-favourite">
                                                    <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i> 10</a>
                                                </div>
                                                <!-- Post Comments -->
                                                <div class="post-comments">
                                                    <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i> 12</a>
                                                </div>
                                                <!-- Post Share -->
                                                <div class="post-share">
                                                    <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The Cotswolds</h4>
                                        <button class="btn js-buy-tickets" href="#">
                                            ...
                                        </button>
                                    </div>
                                </div>
                            </div>

                            <div class="col-md-4">
                                <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                    <!-- Post Thumb -->
                                    <div class="post-thumb">
                                        <img src="img/blog-img/2.jpg" style="width: 350px;
                                             height: 230px;" alt="">
                                    </div>
                                    <!-- Post Content -->
                                    <div class="post-content">
                                        <div class="post-meta d-flex">
                                            <div class="post-author-date-area d-flex">
                                                <!-- Post Author -->
                                                <div class="post-author">
                                                    <a href="#">By Marian</a>
                                                </div>
                                                <!-- Post Date -->
                                                <div class="post-date">
                                                    <a href="#">May 19, 2017</a>
                                                </div>
                                            </div>
                                            <!-- Post Comment & Share Area -->
                                            <div class="post-comment-share-area d-flex">
                                                <!-- Post Favourite -->
                                                <div class="post-favourite">
                                                    <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i> 10</a>
                                                </div>
                                                <!-- Post Comments -->
                                                <div class="post-comments">
                                                    <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i> 12</a>
                                                </div>
                                                <!-- Post Share -->
                                                <div class="post-share">
                                                    <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <a href="recipedetail.jsp">
                                            <h4 class="post-headline">Where To Get The Best Sunday Roast In The Cotswolds
                                            </h4>
                                        </a>
                                        <button class="btn js-buy-tickets" href="#">
                                            ...
                                        </button>
                                    </div>
                                </div>
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
        <div class="modal js-modal">
            <div class="modal-container js-modal-container">
                <div class="modal-close js-modal-close">
                    <i class="ti-close"></i>
                </div>

                <div class="modal-body text-center">
                    <label class="modal-label" for="quantity">
                        <i class="ti-shopping-cart"></i>
                        <div class="nav-item">
                            <button class="btn-myRecipes">
                                <a class="nav-link" href="planPage.html">MAKE PLAN</a>
                            </button>
                        </div>
                    </label>

                    <label class="modal-label" for="email">
                        <i class="ti-user"></i>
                        <div class="nav-item">
                            <button class="btn-myRecipes">
                                <a class="nav-link" href="#">SHARE</a>
                            </button>
                        </div>
                    </label>

                    <label class="modal-label" for="email">
                        <i class="ti-user"></i>
                        <div class="nav-item">
                            <button class="btn-myRecipes">
                                <a class="nav-link" href="shoppingList.html">Ingredient List</a>
                            </button>
                        </div> 
                    </label>

                    <label class="modal-label" for="email">
                        <i class="ti-user"></i>
                        <div class="nav-item">
                            <button class="btn-myRecipes">
                                <a class="nav-link" href="#">Remove</a>
                            </button>
                        </div> 
                    </label>

                </div>

                <footer class="modal-footer">
                    <p class="modal-help">Need <a href="">help?</a></p>
                </footer>
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

        <script>
            const buyBtns = document.querySelectorAll('.js-buy-tickets');
            const modal = document.querySelector('.js-modal');
            const close = document.querySelector('.js-modal-close');
            const modalContainer = document.querySelector('.js-modal-container');

            function showBuytickets() {
                modal.classList.add('open');
            }

            function hideBuytickets() {
                modal.classList.remove('open');
            }

            for (const buyBtn of buyBtns) {
                buyBtn.addEventListener('click', showBuytickets);
            }

            close.addEventListener('click', hideBuytickets);

            modal.addEventListener('click', hideBuytickets);

            modalContainer.addEventListener('click', function (event) {
                event.stopPropagation();
            });

        </script>
    </body>
</html>
