<!doctype html>
<html lang="en">
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Flavorful Creations</title>

        <!-- Favicon -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Stylesheet -->

        <link href="style.css" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css">

        <!-- Responsive CSS -->
        <link href="css/responsive/responsive.css" rel="stylesheet">

        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">






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
        <div class="top_header_area" style="background-color: white">
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
        <header class="header_area" style="background-color: white; border-bottom: 1px solid #ebebeb">
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
                                    <li class="nav-item ">
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

                                    <li class="nav-item active">
                                        <a class="nav-link" href="planpage.jsp">Meal Plan</a>
                                    </li>

                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <section class="ftco-section">
            <div class="container">

                <div class="row">
                    <div class="col-md-12">
                        <div class="content w-180">
                            <div class="calendar-container">
                                <div class="calendar"> 
                                    <div class="year-header"> 
                                        <span class="left-button fa fa-chevron-left" id="prev"> </span> 
                                        <span class="year" id="label"></span> 
                                        <span class="right-button fa fa-chevron-right" id="next"> </span>
                                    </div> 
                                    <table class="months-table w-100"> 
                                        <tbody>
                                            <tr class="months-row">
                                                <td class="month">Jan</td> 
                                                <td class="month">Feb</td> 
                                                <td class="month">Mar</td> 
                                                <td class="month">Apr</td> 
                                                <td class="month">May</td> 
                                                <td class="month">Jun</td> 
                                                <td class="month">Jul</td>
                                                <td class="month">Aug</td> 
                                                <td class="month">Sep</td> 
                                                <td class="month">Oct</td>          
                                                <td class="month">Nov</td>
                                                <td class="month">Dec</td>
                                            </tr>
                                        </tbody>
                                    </table> 

                                    <table class="days-table w-100"> 
                                        <td class="day">Sun</td> 
                                        <td class="day">Mon</td> 
                                        <td class="day">Tue</td> 
                                        <td class="day">Wed</td> 
                                        <td class="day">Thu</td> 
                                        <td class="day">Fri</td> 
                                        <td class="day">Sat</td>
                                    </table> 
                                    <div class="frame"> 
                                        <table class="dates-table w-100"> 
                                            <tbody class="tbody">             
                                            </tbody> 
                                        </table>
                                    </div> 
                                    <button class="button" id="add-button" style="background-color: #fc6c3f">Add Recipe</button>
                                </div>
                            </div>
                            <div class="events-container" style="background-color: #fc6c3f">
                            </div>
                            <div class="dialog" id="dialog" style="background: #138496" >
                               <!-- <div class="header">
                                    <h2 class="dialog-header" style="color: black"> Add Recipe </h2>
                                </div>
                                <div style="height: 200px">
                                    <form id="form" class="form" action="MainController">
                                        <div class="row mb-4" style="overflow-y: scroll;   float: right;
                                 margin: 0px auto;
                                 display: inline-block; 
                                 padding: 0px;
                                 border-bottom-right-radius: 3px;
                                 border-top-right-radius: 3px;
                                 padding: 0;">
                                        <div class="col-12 col-md-12 ml-15 mb-4">
                                            <div class="row">
                                                <div class="col-5 col-md-5 col-lg-5">
                                                    <img src="img/sidebar-img/cach-nau-pho-bo-nam-dinh-chuan-vi-thom-ngon-nhu-hang-quan-202201250230038502.jpg">
                                                </div>
                                                <div class="col-4 col-md-4 col-lg-4" style="display: flex;align-content: center;align-items: center" >
                                                    <h4>Pho</h4>
                                                </div>
                                                <div class="col-3 col-md-3 col-lg-3" style="display: flex;align-content: center;align-items: center" >
                                                    <input  type="checkbox" value="Pho" style="padding: 10px">
                                                </div>
                                            </div>

                                        </div>
                                        <div class="col-12 col-md-12 ml-15 mb-4">
                                            <div class="row">
                                                <div class="col-5 col-md-5 col-lg-5">
                                                    <img src="img/sidebar-img/cach-nau-pho-bo-nam-dinh-chuan-vi-thom-ngon-nhu-hang-quan-202201250230038502.jpg">
                                                </div>
                                                <div class="col-4 col-md-4 col-lg-4" style="display: flex;align-content: center;align-items: center" >
                                                    <h4>Pho</h4>
                                                </div>
                                                <div class="col-3 col-md-3 col-lg-3" style="display: flex;align-content: center;align-items: center" >
                                                    <input type="checkbox" value="Pho" style="padding: 10px">
                                                </div>
                                            </div>

                                        </div>
                                        <div class="col-12 col-md-12 ml-15 mb-4">
                                            <div class="row">
                                                <div class="col-5 col-md-5 col-lg-5">
                                                    <img src="img/sidebar-img/cach-nau-pho-bo-nam-dinh-chuan-vi-thom-ngon-nhu-hang-quan-202201250230038502.jpg">
                                                </div>
                                                <div class="col-4 col-md-4 col-lg-4" style="display: flex;align-content: center;align-items: center" >
                                                    <h4>Pho</h4>
                                                </div>
                                                <div class="col-3 col-md-3 col-lg-3" style="display: flex;align-content: center;align-items: center" >
                                                    <input type="checkbox" value="Pho" style="padding: 10px">
                                                </div>
                                            </div>

                                        </div>

                                    </div>
                                    <div class="footer" align="center">
                                        <input type="button" value="Cancel" class="button" id="cancel-button">
                                        <input type="button" value="OK" class="button button-white" id="ok-button">
                                    </div>
                                        </form>
                               
                                </div>
                               -->
                               <h2 class="dialog-header" style="border-bottom: solid 1px    "> Add Recipes </h2>
                        <form class="form" id="form">
                          <div class="form-container" align="center">
                            <label class="form-label" id="valueFromMyButton" for="name">Recipe name</label>
                            <input class="input" type="text" id="name" maxlength="36">
                            <label class="form-label" id="valueFromMyButton" for="count">Time</label>
                            <input class="input" type="number" id="count" min="0" max="1000000" maxlength="7">
                            <input type="button" value="Cancel" class="button" id="cancel-button">
                            <input type="button" value="OK" class="button button-white" id="ok-button">
                          </div>
                        </form>
                      </div>
                            </div>
                        </div>
                    </div>
                </div>
        </section>
        <footer class="footer_area" style="background-color: white; border-top:solid 1px #ebebeb">
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

        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>

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




