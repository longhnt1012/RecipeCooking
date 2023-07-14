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
                                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><h7>Hi Long${sessionScope.USER_ID.fullName}</h7></a>
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
        <!--Create Recipes-->
        <div class="container">
            <div class="content-responsive">
                <div class="content-wrapper">
                    <div class="table-title row">
                        <div class="col-sm-5">
                            <h2>Create Recipes</h2>
                        </div>

                    </div>
                    <div class="container">
                        <form action="MainController" method="POST">

                            <!--Ingerdient -->
                            <div class="row">
                                <label class="post-headline mt-15"><h4>Ingredients</h4></label>
                            </div>
                            <div class="row" >

                                <div class="col-7" style="margin-left: -25px">
                                    <input class="form-control" type="text" name="ingredientName" placeholder="Typing Ingredients" style="margin-left: 10px; margin-right: 10px" >
                                </div>

                                <div class="col-2"> 
                                    <input class="form-control" type="number" step="0.1" name="quantity" min="1" placeholder="Amount" style="margin-left: 10px" >
                                </div>
                                <div class="col-2" style="display: inline-table,margin-top: 2px">
                                    <input class="form-control" type="text" name="unit" placeholder="Unit" style="margin-left: 10px" >

                                </div>
                                <div class="input_fields_wrap" style="margin-top: 20px">
                                    <button class="add_field_button">+ Add More Ingredients</button>
                                </div>
                                <!-- <div class="row" >
                                     
                                 </div>-->
                            </div>

                            <!--Categories -->


                            <!-- Stepp  -->
                            <h4 class="post-headline row mt-15">Stepping</h4>
                            <div class="row" >
                                <div class="col-2 hihi">
                                    <input class="form-control" type="number" min="1" name="stepNumber" placeholder="step ..."/>
                                </div>
                                <div class="col-10 hihi1">
                                    <input class="form-control" type="text" name="instructions" placeholder="Instructions...."/>
                                </div>  
                                <div class="input_fields_wrap_Step" style="margin-top: 20px">
                                    <button class="add_field_button_Step">+ Add More Step</button>
                                </div>
                            </div>

                            <div class="table-title-1 row">
                                <div class="col-sm-12">
                                    <input type="submit" name="action" value="CreateISC" data-target="#addProductModal" data-toggle="modal" class="btn">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- Form End -->
        <footer class="footer_area">


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
        <!-- Jquery-2.2.4 js -->
        <script src="js/jquery/jquery-2.2.4.min.js"></script>
        <script src="js/js/addMore/addMoreStep.js"></script>
        <script src="js/js/addMore/addMoreIngre.js"></script>

        <!-- Popper js -->
        <script src="js/bootstrap/popper.min.js"></script>
        <!-- Bootstrap-4 js -->
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <!-- All Plugins JS -->
        <script src="js/others/plugins.js"></script>
        <!-- Active JS -->
        <script src="js/active.js"></script>
    </body>
    <style>
        .table-title-1 {
            padding-bottom: 15px;
            color: #fff;
            padding: 16px 30px;
            margin: -20px -25px 10px;
            border-radius: 20px 20px 0 0;
        }
        .table-title-1 h2 {
            margin: 5px 0 0;
            font-size: 24px;
        }
        .table-title-1 .btn {
            float: right;
            font-size: 15px;
            background: #fc6c3f;
            min-width: 50px;
            border-radius: 2px;
            border: 2px solid #959695;
            outline: none !important;
        }
        .table-title-1 .btn:hover {
            color: white;
            background-color: #e86c46;
        }

        .table-title-1 .btn i {
            float: left;
            font-size: 21px;
            margin-right: 5px;
        }
        .table-title-1 .btn span {
            color: black;
            float: left;
            margin-top: 2px;

        }

    </style>