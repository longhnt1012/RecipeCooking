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
                                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><h7>Hi Long</h7></a>
                                    <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                        <a class="dropdown-item" href="view-public-info.html">Your Profile</a>

                                        <a class="dropdown-item" href="changepass.html">Change Password</a>
                                        <a class="dropdown-item" href="myfavorite.html">Your Saved</a>
                                        <a class="dropdown-item" href="mainpage.html" >Log Out</a>

                                    </div>
                                </li>
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
                                    <a class="nav-link" href="mainpage.jsp">Home <span
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
                                        <a class="dropdown-item" href="createrecipe.jsp">Add a recipe</a>

                                        <a class="dropdown-item" href="#">My favorites</a>
                                        <a class="dropdown-item" href="myfavorite.html">Saved</a>
                                        
                                    </div>
                                </li>

                                <li class="nav-item">
                                    <a class="nav-link" href="planpage.jsp">Meal Plan</a>
                                </li>

                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!-- ****** Header Area End ****** -->

 <div class="breadcumb-nav mb-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="#"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Categories</li>
                                <li class="breadcrumb-item active" aria-current="page">Healthy Main Dishes</li>
                                <li class="breadcrumb-item active" aria-current="page">Pho</li>
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
                                    <img src="img/sidebar-img/cach-nau-pho-bo-nam-dinh-chuan-vi-thom-ngon-nhu-hang-quan-202201250230038502.jpg" alt="Pho">
                                </div>
                            </div>
                        </div>
                        <div class="col-6 col-md-6">
                            <div class="saved-favorite">
                                <form action="MainController" method="POST">
                                    <input type="submit" name="action" value="Saved"
                                        style="padding:8px 30px 8px 30px; background-color: #fc6c3f;border-radius: 12px;color: white;border: 2px solid ;">
                                </form>
                            </div>
                        </div>
                        <div class="col-6 col-md-6">
                            <div class="print-recipe">
                                <button onclick="window.print()"
                                    style="padding: 8px 40px 8px 40px;background-color:white ;border-radius: 12px;border: 2px solid #fc6c3f;color: #fc6c3f;">Print</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-12 col-md-8 col-lg-8">
                    <div class="post-content">
                        <a href="#">
                            <h1 class="post-headline">Homemade Pho</h1>
                        </a>
                        <div class="post-meta d-flex">
                            <div class="post-author-date-area d-flex">
                                <!-- Post Author -->
                                <div class="post-author">
                                    By <a href="#" style="font-size: 14px;">Th�nh Long</a>
                                </div>
                                <div class="star-rating ">


                                    <span class="fa fa-star checked"></span>
                                    <span class="fa fa-star checked"></span>
                                    <span class="fa fa-star checked"></span>
                                    <span class="fa fa-star checked"></span>
                                    <span class="fa fa-star checked"></span>

                                </div>
                            </div>


                        </div>
                        <div class="rating-count">

                            <a href="#rate">

                                <i class="ti-bookmark bookmark" style="font-size:23px; color:black"></i>

                                <span style="color:black; ">300 ratings</span></a>

                            <a href="#comment" style="margin-left: 30px; color: black;">125 comments</a>
                           
                            
                        </div>
                        <div class="row mt-4 mb-4">
                            <div class="col-4" style="display: flex;
                            justify-content: center;
                            align-items: center;
                            gap: 1rem">

                                <i class="ti-timer" style="font-size: 30px;"></i>

                                <div>
                                    <span>Prepare: 20 mins</span><br>
                                    <span>Cooking: 7 hrs 5 mins</span>
                                </div>
                            </div>
                            <div class="col-4" style="display: flex;
                            justify-content: center;
                            align-items: center;
                            gap: 1rem">
                                <i class="ti-medall" style="font-size: 30px;"></i>
                                <span>Medium</span>
                            </div>
                            <div class="col-4" style="display: flex;
                            justify-content: center;
                            align-items: center;
                            gap: 1rem">
                                <i class="ti-heart" style="font-size:30px"></i>
                                <span>Serve 4</span>
                            </div>


                        </div>
                        <p>Authentic, Vietnamese pho soup is all about the broth! Beef bones, fish sauce, star anise, and ginger simmer for at least 6 hours, creating a complex, aromatic broth that may not be quick, but it's certainly delicious. The flavorful broth is ladled over rice noodles and thinly sliced beef and topped with fresh garnishes.
                        </p>

                        <div class="row ">
                            <div class="col-12 col-md-12 col-lg-12 mb-4">
                                <span><b>Nutrion: per serving</b></span>

                            </div>
                            <div class="col-2 col-md-2 col-lg-2 "
                                style="background-color: white;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center;">
                                <span><b>kcal</b></span><br>
                                509
                            </div>
                            <div class="col-2 col-md-2 col-lg-2"
                                style="background-color: white;border-style: solid;border-width: 2px 0px 2px 2px;text-align: center;">
                                <span><b>fat</b></span><br>
                                11
                            </div>
                            <div class="col-2 col-md-2 col-lg-2"
                                style="background-color: white;border-style: solid;border-width: 2px 0px 2px 2px; text-align: center; ">
                                <span><b>protein</b></span><br>
                                35
                            </div>
                            <div class="col-2 col-md-2 col-lg-2"
                                style="background-color: white;border-style: solid;border-width:2px 0px 2px 2px;text-align: center;border-right: solid; ">
                                <span><b>carbs</b></span><br>
                                66
                            </div>
                            
                            
                        </div>
                    </div>
                </div>

            </div>
            <div class="row">
                <div class="col-12 col-md-5 col-lg-5 mt-5 ingredients">
                    <h4>Ingredients</h4>
                    <ul style="background-color: #fafafa">
                        <li>4 pounds beef soup bones (shank and knee)
                         </li>
                        <li>1 medium onion, cut in half</li>
                        <li>5 slices fresh ginger</li>
                        <li>1 tablespoon salt</li>
                        <li>2 pods star anise
                        </li>
                        <li>2 � tablespoons fish sauce</li>
                        <li>4 quarts water</li>
                        <li> 1 (8 ounce) package dried rice noodles</li>
                        <li>1 � pounds beef top sirloin, thinly sliced</li>
                        <li>� cup chopped cilantro</li>
                        <li>1 tablespoon chopped green onion</li>
                        <li>1 � cups bean sprouts</li>
                        <li>  1 bunch Thai basil</li>
                        <li>1 medium lime, cut into 4 wedges</li>
                        <li> 1 medium lime, cut into 4 wedges</li>
                        <li>� cup hoisin sauce (Optional)</li>
                        <li>� cup chile-garlic sauce (such as Sriracha�) (Optional)</li>
                    </ul>
                </div>
                <div class="col-12 col-md-5 col-lg-5 mt-5">
                    <h4>Stepping</h4>
                  <ul>
                    <li>
                        <h5>Step 1:</h5>
                        <p>Gather all ingredients.</p>
                    </li>
                    <li>
                        <h5>Step 2:</h5>
                        <p>Preheat the oven to 425 degrees F (220 degrees C).</p>
                    </li>
                    <li>
                        <h5>Step 3:</h5>
                        <p>Place beef bones on a baking sheet and roast in the preheated oven until browned, about 1 hour.</p>
                    </li>
                    <li>
                        <h5>Step 4:</h5>
                        <p>Place onion halves on a second baking sheet and roast on another rack until blackened and soft, about 45 minutes.</p>
                    </li>
                    <li>
                        <h5>Step 5:</h5>
                        <p>Transfer beef bones and onion halves to a large stockpot. Add ginger, salt, star anise, fish sauce, and 4 quarts water; bring to a boil. Reduce heat to low and simmer for 6 to 10 hours. Strain the broth into a saucepan and set aside.

                        </p>
                    </li>
                    <li>
                        <h5>Step 6:</h5>
                        <p>Place rice noodles in a large bowl filled with room temperature water. Let soak for 1 hour. Drain.</p>
                    </li>
                    <li>
                        <h5>Step 7:</h5>
                        <p>When noodles have soaked for 1 hour, heat up the reserved broth by bringing it to a simmer.</p>
                        </li>
                    <li>
                        <h5>Step 8:</h5>
                        <p>Bring a large pot of water to a boil. Cook the noodles in the boiling water for 1 minute. Drain.</p>
                    </li>
                    <li>
                        <h5>Step 9:</h5>
                        <p>Divide noodles among 4 serving bowls; top with sirloin, cilantro, and green onion. Ladle hot broth over the top. Stir and let sit until beef is partially cooked and no longer pink, 1 to 2 minutes.</p>
                    </li>
                    <li>
                        <h5>Step 10:</h5>
                        <p>Serve with bean sprouts, Thai basil, lime wedges, hoisin sauce, and chile-garlic sauce on the side.</p>
                    </li>
                  </ul>
                </div>
            </div>
            
            <div class="container mt-5 mb-9">
                    <div class="row height d-flex justify-content-center align-items-center">
                        <div class="col-md-12" >
                            <div class="card">
                                <div class="p-4"  style="background-color: #fafafa">
                                    <h4>Comments</h4>
                                </div>
                                <div class="mt-3 d-flex flex-row align-items-center p-3 form-color"> <img src="img/sidebar-img/LG.jpeg " width="50" class="rounded-circle mr-2"> <input type="text" class="form-control" placeholder="Enter your comment..."> </div>
                                <div class="mt-2"  style="background-color: #fafafa">
                                    <div class="d-flex flex-row p-3"> <img src="img/sidebar-img/HT.jpeg" width="40" height="40" class="rounded-circle mr-3">
                                        <div class="w-100" style="background-color: #fafafa">
                                            <div class="d-flex justify-content-between align-items-center">
                                                <div class="d-flex flex-row align-items-center"> <span class="mr-2">Ho�ng Th�y</span> </div> <small>19/05/2023</small>
                                            </div>
                                            <p class="text-justify comment-text mb-0">I followed your recipe and it's amazing the food is delicious</p>
                                            <div class="d-flex flex-row user-feed"> <span class="wish"><i class="fa fa-heart mr-2"></i>29</span> <span class="ml-3"><i class="fa fa-comments-o mr-2"></i>Reply</span> </div>
                                        </div>
                                    </div>
                                    
                                    <div class="d-flex flex-row p-3"> <img src="img/sidebar-img/TD.jpeg " width="40" height="40" class="rounded-circle mr-3">
                                        <div class="w-100" style="background-color: #fafafa">
                                            <div class="d-flex justify-content-between align-items-center">
                                                <div class="d-flex flex-row align-items-center"> <span class="mr-2">TyhD Th�y D??ng</span> </div> <small>19/05/2023</small>
                                            </div>
                                            <p class="text-justify comment-text mb-0">Your recipe is awesome!!!</p>
                                            <div class="d-flex flex-row user-feed"> <span class="wish"><i class="fa fa-heart mr-2"></i>2</span> <span class="ml-3"><i class="fa fa-comments-o mr-2"></i>Reply</span> </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
    </section>
    <!--Feedback Begin-->
    
    <!--Feedback End-->
    <!-- ****** Blog Area End ****** -->
    <section class="blog_area section_padding_0_80">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 ">
                    <!-- col-lg-8 -->
                    <div class="row">
                        <div class="col-12 col-md-12 col-lg-12 mb-4">
                            <h2 >Related Recipes</h2>
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
                                                <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i>
                                                    10</a>
                                            </div>
                                            <!-- Post Comments -->
                                            <div class="post-comments">
                                                <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i>
                                                    12</a>
                                            </div>
                                            <!-- Post Share -->
                                            <div class="post-share">
                                                <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                    <a href="#">
                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The
                                            Cotswolds
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
                                                <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i>
                                                    10</a>
                                            </div>
                                            <!-- Post Comments -->
                                            <div class="post-comments">
                                                <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i>
                                                    12</a>
                                            </div>
                                            <!-- Post Share -->
                                            <div class="post-share">
                                                <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                    <a href="#">
                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The
                                            Cotswolds
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
                                                <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i>
                                                    10</a>
                                            </div>
                                            <!-- Post Comments -->
                                            <div class="post-comments">
                                                <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i>
                                                    12</a>
                                            </div>
                                            <!-- Post Share -->
                                            <div class="post-share">
                                                <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                    <a href="#">
                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The
                                            Cotswolds
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
                                                <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i>
                                                    10</a>
                                            </div>
                                            <!-- Post Comments -->
                                            <div class="post-comments">
                                                <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i>
                                                    12</a>
                                            </div>
                                            <!-- Post Share -->
                                            <div class="post-share">
                                                <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                    <a href="#">
                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The
                                            Cotswolds
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
                                                <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i>
                                                    10</a>
                                            </div>
                                            <!-- Post Comments -->
                                            <div class="post-comments">
                                                <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i>
                                                    12</a>
                                            </div>
                                            <!-- Post Share -->
                                            <div class="post-share">
                                                <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                    <a href="#">
                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The
                                            Cotswolds
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
                                                <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i>
                                                    10</a>
                                            </div>
                                            <!-- Post Comments -->
                                            <div class="post-comments">
                                                <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i>
                                                    12</a>
                                            </div>
                                            <!-- Post Share -->
                                            <div class="post-share">
                                                <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                    <a href="#">
                                        <h4 class="post-headline">Where To Get The Best Sunday Roast In The
                                            Cotswolds
                                        </h4>
                                    </a>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- ****** Instagram Area Start ****** -->
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
                                        <a class="dropdown-item" href="login.html">Add a recipe</a>

                                        <a class="dropdown-item" href="login.html">My favorites</a>
                                        <a class="dropdown-item" href="login.html">Saved</a>

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
