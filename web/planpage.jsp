<!doctype html>
<html lang="en">
    <head>

        <title>Flavorful Creations</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="calendar/css/style.css">

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

                        <div class="calendar-container" style="background-color: white; border:solid 1px #ebebeb">
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
                        <div class="dialog" id="dialog" style="background: #138496; height: 100%;"  >

                            <h2 class="dialog-header" style="border-bottom: solid 1px    "> Add Recipes </h2>
                            <form class="form" id="form"  style=" overflow-y: scroll; height: 50%; margin-left: 15%" >

                                <div class="single-widget-area popular-post-widget" style="width: 80%; ">
                                    <!-- Single Popular Post -->
                                    <!-- Single Popular Post -->
                                    <div class="single-populer-post d-flex">
                                        <img src="img/sidebar-img/2.jpg" alt="">
                                        <div class="post-content">
                                            <a href="#">
                                                <h6>The 8 Best Gastro Pubs In Bath</h6>
                                            </a>
                                            <p>Tuesday, October 3, 2017</p>
                                        </div>
                                        <label class="checkboxRadio">
                                            <input name="a" type="radio"  />
                                            <span class="primary"></span>
                                        </label>
                                    </div>
                                    <!-- Single Popular Post -->
                                    <div class="single-populer-post d-flex">
                                        <img src="img/sidebar-img/3.jpg" alt="">
                                        <div class="post-content">
                                            <a href="#">
                                                <h6>Zermatt Unplugged the best festival</h6>
                                            </a>
                                            <p>Tuesday, October 3, 2017</p>
                                        </div>
                                        <label class="checkboxRadio">
                                            <input name="3" type="radio"  />
                                            <span class="primary"></span>
                                        </label>
                                    </div>
                                    <!-- Single Popular Post -->
                                    <div class="single-populer-post d-flex">
                                        <img src="img/sidebar-img/4.jpg" alt="">
                                        <div class="post-content">
                                            <a href="#">
                                                <h6>Harrogate's Top 10 Independent Eats</h6>
                                            </a>
                                            <p>Tuesday, October 3, 2017</p>
                                        </div>
                                        <label class="checkboxRadio">
                                            <input name="2" type="radio"  />
                                            <span class="primary"></span>
                                        </label>
                                    </div>
                                    <!-- Single Popular Post -->
                                    <div class="single-populer-post d-flex">
                                        <img src="img/sidebar-img/5.jpg" alt="">
                                        <div class="post-content">
                                            <a href="#">
                                                <h6>Eating Out On A Budget In Oxford</h6>
                                            </a>
                                            <p>Tuesday, October 3, 2017</p>
                                        </div>
                                        <label class="checkboxRadio" style="margin-left: 10px">
                                            <input name="1" type="radio"  />
                                            <span class="primary"></span>
                                        </label>
                                    </div>



                                    <!--  <label class="form-label" id="valueFromMyButton" for="name">Recipe name</label>
                                      <input class="input" type="text" id="name" maxlength="36">
                                      <label class="form-label" id="valueFromMyButton" for="count">Time</label>
                                      <input class="input" type="number" id="count" min="0" max="1000000" maxlength="7">
                                      <input type="button" value="Cancel" class="button" id="cancel-button">
                                      <input type="button" value="OK" class="button button-white" id="ok-button">
                                    -->

                                </div>

                            </form>
                            <form class="form" id="form" style="margin:auto; display: table; padding-top: 30px "  >
                                <div class="single-widget-area popular-post-widget" >
                                    <input type="button" value="Cancel" class="button" id="cancel-button">
                                    <input type="button" value="OK" class="button button-white" id="ok-button">
                                </div>
                            </form>
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

        <!-- Jquery-2.2.4 js -->
        <script src="calendar/js/jquery.min.js"></script>
        <script src="js/jquery/jquery-2.2.4.min.js"></script>

        <!-- Popper js -->
        <script src="js/bootstrap/popper.min.js"></script>
        <script src="calendar/js/popper.js"></script>
        <!-- Bootstrap-4 js -->
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="calendar/js/bootstrap.min.js"></script>
        <!-- All Plugins JS -->
        <script src="js/others/plugins.js"></script>
        <script src="calendar/js/main.js"></script>
        <!-- Active JS -->
        <script src="js/active.js"></script>



    </body>
</html>
<style>
    .pagination .page-item .page-link:hover {
        background-color: #eee;
        border-radius: .125rem;
        -webkit-transition: all .3s linear;
        transition: all .3s linear;
    }
    div.dataTables_wrapper div.dataTables_paginate ul.pagination {
        -webkit-box-pack: end;
        -webkit-justify-content: flex-end;
        -ms-flex-pack: end;
        justify-content: flex-end;
    }
    .pagination .page-item.active .page-link {
        color: #fff;
        background-color: #4285f4;
        border-radius: .125rem;
        -webkit-box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
        box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
        -webkit-transition: all .2s linear;
        transition: all .2s linear;
    }
    .pagination .page-item.not-select .page-link {
        color: #fff;
        background-color: #F4511E;
        border-radius: .125rem;
        -webkit-box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
        box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
        -webkit-transition: all .2s linear;
        transition: all .2s linear;
    }
    .pagination .page-item .page-link {
        font-size: .9rem;
        color: #212529;
        background-color: #776e6e2b;
        border: 0;
        margin-left: 4px;
        outline: 0;
        -webkit-transition: all .3s linear;
        transition: all .3s linear;
        margin-bottom: 15px;

    }
    .page-item.active .page-link {
        z-index: 3;
        color: #fff;
        background-color: #007bff;
        border-color: #007bff;
    }
    .page-link {
        position: relative;
        display: block;
        padding: .5rem .75rem;
        line-height: 1.25;
    }
    .footer {

        left: 0;
        bottom: 0;
        width: 100%;
        color: white;
        text-align: center;
    }
    .logo-area {

        background-repeat: no-repeat;
    }
    .logo-area {
        width: 260px;
        display: block;
        min-height: 60px;
        float: right;
    }

    .navbar {
        padding: .3rem 0.3rem !important;
    }




    /*radio button css*/

    @keyframes check {0% {height: 0;width: 0;}
                      25% {height: 0;width: 10px;}
                      50% {height: 20px;width: 10px;}
    }
    .checkboxRadio{
        background-color:#fff;
        display:inline-block;
        height:28px;
        margin:0 .25em;
        width:28px;
        border-radius:4px;
        border:1px solid #307196;
        float:left
    }
    .checkboxRadio span{
        display:block;
        height:28px;
        position:relative;
        width:28px;
        padding:0
    }
    .checkboxRadio span:after{
        -moz-transform:scaleX(-1) rotate(135deg);
        -ms-transform:scaleX(-1) rotate(135deg);
        -webkit-transform:scaleX(-1) rotate(135deg);
        transform:scaleX(-1) rotate(135deg);
        -moz-transform-origin:left top;
        -ms-transform-origin:left top;
        -webkit-transform-origin:left top;
        transform-origin:left top;
        border-right:4px solid #fff;
        border-top:4px solid #fff;
        content:'';
        display:block;
        height:20px;
        left:3px;
        position:absolute;
        top:15px;
        width:10px
    }
    .checkboxRadio span:hover:after{
        border-color:#999
    }
    .checkboxRadio input{
        display:none
    }
    .checkboxRadio input:checked + span:after{
        -webkit-animation:check .8s;
        -moz-animation:check .8s;
        -o-animation:check .8s;
        animation:check .8s;
        border-color:#555
    }
    .checkboxRadio input:checked + .default:after{
        border-color:#444
    }
    .checkboxRadio input:checked + .primary:after{
        border-color:#2874a1;
    }
    .timercss{
        font-size: 25px;
        font-family: cursive;
        color: #FFEB3B !important;
    }
    .list-group-item {
        padding: .45rem 1rem;
    }
    .list-group-flush label {
        margin-bottom: .0rem !important;
    }
    .pagination {
        display: -ms-flexbox;
        flex-wrap: wrap;
        display: flex;
        padding-left: 0;
        list-style: none;
        border-radius: 0.25rem;
    }
    .btn-circle {
        width: 30px;
        height: 30px;
        text-align: center;
        padding: 6px 0;
        font-size: 12px;
        line-height: 1.428571429;
        border-radius: 15px;
    }
    .btn-circle.btn-lg {
        width: 50px;
        height: 50px;
        padding: 10px 16px;
        font-size: 18px;
        line-height: 1.33;
        border-radius: 25px;
    }
    .btn-success1 {
        color: #525252;
        background-color: #e4e4e4;
        border-color: #9a9a9a;
    }
    .username {
        font-weight: 500;
    }
    .profile-block{
        margin:5px auto;
        position:relative;
        overflow:hidden;
    }
    .profile-block .nav > li > a {
        background: #e7e7e7;
        border-radius: 0;
        color: #000;
        display: block;
        font-size: 14px;
        padding: 6px 18px;
        position: relative;
        text-align: left;
        text-decoration: none;


    }
    .profile-block ul > li > a > i {
        color: #000;
        font-size: 16px;
        padding-right: 10px;
    }
    .profile-block ul > li > a:hover, 
    .profile-block ul > li > a:focus, 
    .profile-block ul li.active a {
        background: #fff !important;
        border-radius: 0;
        color: #000 !important;
    }
    li.paginate_button.page-item {
        z-index: 0;
    }
    
.widget-title>h6 {
    background: #5ea4cc;
    height: 55px;
    width: 100%;
    font-size: 16px;
    line-height: 52px;
    border-radius: 2px;
    margin-bottom: 0px;
    text-transform: uppercase;
} 


</style>


