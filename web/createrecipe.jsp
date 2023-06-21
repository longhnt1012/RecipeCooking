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
                            <div class="row">
                                <label class="post-headline mt-15"><h4>Ingredients</h4></label>
                            </div>
                            <div class="row" >

                                <div class="col-12 col-md-2 col-lg-2" style="margin-left: -15px">
                                    <input class="form-control" type="number" name="amountIngredients" min="1" placeholder="Amount" >
                                </div>
                                <div class="col-12 col-md-2 col-lg-2" >
                                    <select class="form-control" name="unitIngredients" style="margin-left: 10px;padding: 5px; text-align: center">
                                        <option value="g" >g</option>
                                        <option value="Cup">cup</option>
                                        <option value="tsp">tsp</option>
                                        <option value="Tbsp">Tbsp</option>
                                        <option value="Dessertspoon">Dessertspoon</option>
                                        <option value="kg">Kg</option>
                                    </select>
                                </div>
                                
                                <div class="col-12 col-md-8 col-lg-8">
                                    <input class="form-control" type="text" name="nameIngredients" placeholder="Typing Ingredients" style="margin-left: 30px" >
                                </div>
                                

                            </div>
                            <div class="row mt-4">
                                <h6>+ Add More Ingredients</h6>
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
                            <h4 class="post-headline row mt-15">Stepping</h4>
                            <div class="row">


                                <input  class="form-control" type="text" name="recipeStepping" placeholder="Stepping" >

                            </div>
                            <h4 class="post-headline row mt-15">Nutritional: Per Serving</h4>
                            <div class="row">
                                <div class="col-3 col-md-3 col-lg-3">
                                    <div class="row mt-15 mb-15"><h6 style="text-align: center">Calories</h6></div>
                                    <div class="row">
                                        <input type="number" name="calories" placeholder="Calories" min="0" >
                                    </div>
                                </div>
                                <div class="col-3 col-md-3 col-lg-3">
                                    <div class="row mt-15 mb-15">Fat</div>
                                    <div class="row">
                                        <input type="number" name="fat" placeholder="Fat" min="0">
                                    </div>
                                </div>
                                <div class="col-3 col-md-3 col-lg-3">
                                    <div class="row mt-15 mb-15">Protein</div>
                                    <div class="row">
                                        <input type="number" name="protein" placeholder="Protein" min="0">
                                    </div>
                                </div>
                                <div class="col-3 col-md-3 col-lg-3">
                                    <div class="row mt-15 mb-15">Carbs</div>
                                    <div class="row">
                                        <input type="number" name="carbs" placeholder="Carbs" min="0">
                                    </div>
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
        <!-- Popper js -->
        <script src="js/bootstrap/popper.min.js"></script>
        <!-- Bootstrap-4 js -->
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <!-- All Plugins JS -->
        <script src="js/others/plugins.js"></script>
        <!-- Active JS -->
        <script src="js/active.js"></script>
    </body>
