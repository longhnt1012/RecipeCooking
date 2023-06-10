<!DOCTYPE html>
<html lang="en">

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

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
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
                                        <input type="text" name="search" id="search-anything"
                                               placeholder="Search Anything...">
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
                                    <li class="nav-item active">
                                        <a class="nav-link" href="homepage.html">Home <span
                                                class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="recipes.jsp">Recipes</a>
                                    </li>
                                    <li class="nav-item">
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
        
        <div class="breadcumb-nav">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
                            <li class="breadcrumb-item active" aria-current="page">Drink</li>
                            <li class="breadcrumb-item active" aria-current="page">Milk Tea</li>
                        </ol>
                    </nav>
                </div>
            </div>
        </div>
    </div>
        <!-- ****** Blog Area Start ****** -->
        <section class="blog_area section_padding_0_80">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-12 col-sm-12 col-md-4 col-lg-4">
                        <div class="row">
                            <div class="col-12">
                                <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                    <div class="post-thumb">
                                        <img src="img/blog-img/Milktea.png" alt="Milk Tea">
                                    </div>
                                </div>
                            </div>
                            <div class="col-4 col-md-4">
                                <div class="saved-favorite">
                                    <!--                                    <form action="MainController" method="POST">
                                                                            <input type="submit" name="action" value="Save"
                                                                                   style="padding:8px 30px 8px 30px; background-color: #fc6c3f;border-radius: 12px;color: white;border: 2px solid ;">
                                                                        </form>-->
                                    <a style="padding:8px 30px; background-color: #fc6c3f;border-radius: 12px;color: white;border: 2px solid ;" href="myRecipes.jsp">Save</a>
                                </div>
                            </div>
                            <div class="col-4 col-md-4">
                                <div class="saved-favorite">
                                    <!--                                    <form action="MainController" method="POST">
                                                                            <input type="submit" name="action" value="Save"
                                                                                   style="padding:8px 30px 8px 30px; background-color: #fc6c3f;border-radius: 12px;color: white;border: 2px solid ;">
                                                                        </form>-->
                                    <a style="padding:8px 30px; background-color: #fc6c3f;border-radius: 12px;color: white;border: 2px solid ;" href="myRecipes.jsp">Print</a>
                                </div>
                            </div>
                            <div class="col-4 col-md-4">
                                <div class="saved-favorite">
                                    <!--                                    <form action="MainController" method="POST">
                                                                            <input type="submit" name="action" value="Save"
                                                                                   style="padding:8px 30px 8px 30px; background-color: #fc6c3f;border-radius: 12px;color: white;border: 2px solid ;">
                                                                        </form>-->
                                    <a style="padding:8px 30px; background-color: #fc6c3f;border-radius: 12px;color: white;border: 2px solid ;" href="myRecipes.jsp">Share</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-sm-12 col-md-8 col-lg-8">
                        <div class="post-content">
                            <a href="#">
                                <h1 class="post-headline">Milk Tea</h1>
                            </a>
                            <div class="post-meta d-flex">
                                <div class="post-author-date-area d-flex">
                                    <!-- Post Author -->
                                    <div class="post-author">
                                        By <a href="#" style="font-size: 14px;">Thành Long</a>
                                    </div>
                                    <div class="star-rating ">
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star"></span>
                                        <span class="fa fa-star"></span>
                                    </div>
                                </div>


                            </div>
                            <div class="rating-count">

                                <a href="#rate">

                                    <i class="fa-solid fa-thumbs-up"></i>

                                    <span style="color:black; ">110 ratings</span></a>

                                <a href="#comment" style="margin-left: 30px; color: black;"><i class="fa-solid fa-comment"></i> 125 comments</a>
                                <!--Share link-->

                            </div>
                            <div class="row mt-4 mb-4">
                                <div class="col-12" style="display: flex;
                                     justify-content: left;">
                                    <i class="fa-sharp fa-solid fa-timer"></i>
                                    <div>
                                        <h5><span>CookingTime: 25 mins</span></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12">
                                <h4>Description</h4>
                                <p>Do you like milk tea?<br>
                                Yes, I have passionate with milk-tea. If I don't drink milk tea in one day, I can die
                            </p>
                            </div>
                            </div>
                            
                            <div class="row ">
                                <div class="col-12 col-md-12 col-lg-12" style="">
                                    <span><h4>Nutritional:</h4></span>
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
                                    1000g
                                </div>
                                <div class="col-2 col-md-2 col-lg-2"
                                     style="background-color: beige;border-style: solid;border-width: 2px 2px 2px 2px;text-align: center;  ">
                                    <span><b>salt</b></span><br>
                                    10
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="row">
                    <div class="col-12 col-md-5 col-lg-5 mt-5">
                        <h4>Ingredients:</h4>
                        <nav class="navbar navbar-expand-lg ">
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#yummyfood-nav"
                                    aria-controls="yummyfood-nav" aria-expanded="false" aria-label="Toggle navigation"><i
                                    class="fa fa-bars" aria-hidden="true"></i> Menu</button>
                            <!-- Menu Area Start -->
                            <div class="collapse navbar-collapse justify-content-center" id="yummyfood-nav">
                                <ul class="navbar-nav" id="yummy-nav">
                                    <li class="nav-item"  style="background-color: beige;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center;">
                                        <a class="nav-link" href="mainpage.html">50ml milk <span
                                                class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="nav-item"  style="background-color: beige;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center;">
                                        <a class="nav-link" href="recipes.jsp">120ml tea</a>
                                    </li>
                                    <li class="nav-item"  style="background-color: beige;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center;">
                                        <a class="nav-link" href="categories.jsp">ice</a>
                                    </li>
                                    <li class="nav-item"  style="background-color: beige;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center;">
                                        <a class="nav-link" href="myRecipes.jsp">sugar</a>
                                    </li>
                                    <li class="nav-item"  style="background-color: beige;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center;">
                                        
                                    </li>
                                </ul>
                            </div>
                        </nav>
                    </div>
                    <div class="col-12 col-md-5 col-lg-5 mt-5">
                        <h4>Instruction</h4>
                        <h5>Step 1:</h5>
                        <p>First, b?n b? s?a và trà tr?n v?i nhau sau ?ó coi có u?ng ???c không.N?u th?y ngon thì u?ng , n?u
                            không ngon c?ng nên u?ng </p>
                        <h5>Step 2:</h5>
                        <P>B? ?ó vào và th??ng th?c ly n??c t? pha.</P>
                    </div>
                </div>
        </section>

        <!-- ****** Instagram Area Start ****** -->
        
        
        
         <!-- ****** Blog Area End ****** -->
                    <section class="blog_area section_padding_0_80">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-12 ">
                                    <!-- col-lg-8 -->
                                    <div class="row">
                                        <div class="col-12 col-md-12 col-lg-12" style="text-align: center;">
                                            <h2 style="margin-bottom: 30px;">Related Recipes</h2>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                                <!-- Post Thumb -->
                                                <div class="post-thumb">
                                                    <img src="img/blog-img/Milktea.png" style="width: 350px;
                                                         height: 234px;" alt="">
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

                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                                <!-- Post Thumb -->
                                                <div class="post-thumb">
                                                    <img src="img/blog-img/2.jpg" alt="">
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
                                                    <a href="#">
                                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The Cotswolds
                                                        </h4>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                                <!-- Post Thumb -->
                                                <div class="post-thumb">
                                                    <img src="img/blog-img/2.jpg" alt="">
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
                                                    <a href="#">
                                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The Cotswolds
                                                        </h4>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                                <!-- Post Thumb -->
                                                <div class="post-thumb">
                                                    <img src="img/blog-img/2.jpg" alt="">
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
                                                    <a href="#">
                                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The Cotswolds
                                                        </h4>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                                <!-- Post Thumb -->
                                                <div class="post-thumb">
                                                    <img src="img/blog-img/2.jpg" alt="">
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
                                                    <a href="#">
                                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The Cotswolds
                                                        </h4>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                                <!-- Post Thumb -->
                                                <div class="post-thumb">
                                                    <img src="img/blog-img/2.jpg" alt="">
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
                                                    <a href="#">
                                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The Cotswolds
                                                        </h4>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-12 col-md-12 col-lg-12" style="text-align:  center;margin-top:30px">

                                            <a class="show-more-button" href="recipes.jsp" style=" border-color:#fc6c3f;border-style: solid;padding: 15px 25px 15px 25px;color: black;border-radius: 10px">
                                                Show more
                                            </a>

                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
        <!-- ****** Our Creative Portfolio Area End ****** -->

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