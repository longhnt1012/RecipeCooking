<!DOCTYPE html>
<html lang="en">

    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Flavorful Creations - Food Blog Template</title>

        <!-- Favicon -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link href="style.css" rel="stylesheet">

        <!-- Responsive CSS -->
        <link href="css/responsive/responsive.css" rel="stylesheet">
        
        <!--
                <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
                <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
                <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        -->

        <style>
            body{margin-top:20px;}
            .schedule-table table thead tr {
                background: #86d4f5;
            }
            .schedule-table table thead th {
                padding: 25px 50px;
                color: #fff;
                text-align: center;
                font-size: 20px;
                font-weight: 800;
                position: relative;
                border: 0;
            }
            .schedule-table table thead th:before {
                content: "";
                width: 3px;
                height: 35px;
                background: rgba(255, 255, 255, 0.2);
                position: absolute;
                right: -1px;
                top: 50%;
                transform: translateY(-50%);
            }
            .schedule-table table thead th.last:before {
                content: none;
            }
            .schedule-table table tbody td {
                vertical-align: middle;
                border: 1px solid #e2edf8;
                font-weight: 500;
                padding: 30px;
                text-align: center;
            }
            .schedule-table table tbody td.day {
                font-size: 22px;
                font-weight: 600;
                background: #f0f1f3;
                border: 1px solid #e4e4e4;
                position: relative;
                transition: all 0.3s linear 0s;
                min-width: 165px;
            }
            .schedule-table table tbody td.active {
                position: relative;
                z-index: 10;
                transition: all 0.3s linear 0s;
                min-width: 165px;
            }
            .schedule-table table tbody td.active h4 {
                font-weight: 700;
                color: #000;
                font-size: 20px;
                margin-bottom: 5px;
            }
            .schedule-table table tbody td.active p {
                font-size: 16px;
                line-height: normal;
                margin-bottom: 0;
            }
            .schedule-table table tbody td .hover h4 {
                font-weight: 700;
                font-size: 20px;
                color: #ffffff;
                margin-bottom: 5px;
            }
            .schedule-table table tbody td .hover p {
                font-size: 16px;
                margin-bottom: 5px;
                color: #ffffff;
                line-height: normal;
            }
            .schedule-table table tbody td .hover span {
                color: #ffffff;
                font-weight: 600;
                font-size: 18px;
            }
            .schedule-table table tbody td.active::before {
                position: absolute;
                content: "";
                min-width: 100%;
                min-height: 100%;
                transform: scale(0);
                top: 0;
                left: 0;
                z-index: -1;
                border-radius: 0.25rem;
                transition: all 0.3s linear 0s;
            }
            .schedule-table table tbody td .hover {
                position: absolute;
                left: 50%;
                top: 50%;
                width: 120%;
                height: 120%;
                transform: translate(-50%, -50%) scale(0.8);
                z-index: 99;
                background: #86d4f5;
                border-radius: 0.25rem;
                padding: 25px 0;
                visibility: hidden;
                opacity: 0;
                transition: all 0.3s linear 0s;
            }
            .schedule-table table tbody td.active:hover .hover {
                transform: translate(-50%, -50%) scale(1);
                visibility: visible;
                opacity: 1;
            }
            .schedule-table table tbody td.day:hover {
                background: #86d4f5;
                color: #fff;
                border: 1px solid #86d4f5;
            }
            @media screen and (max-width: 1199px) {
                .schedule-table {
                    display: block;
                    width: 100%;
                    overflow-x: auto;
                }
                .schedule-table table thead th {
                    padding: 25px 40px;
                }
                .schedule-table table tbody td {
                    padding: 20px;
                }
                .schedule-table table tbody td.active h4 {
                    font-size: 18px;
                }
                .schedule-table table tbody td.active p {
                    font-size: 15px;
                }
                .schedule-table table tbody td.day {
                    font-size: 20px;
                }
                .schedule-table table tbody td .hover {
                    padding: 15px 0;
                }
                .schedule-table table tbody td .hover span {
                    font-size: 17px;
                }
            }
            @media screen and (max-width: 991px) {
                .schedule-table table thead th {
                    font-size: 18px;
                    padding: 20px;
                }
                .schedule-table table tbody td.day {
                    font-size: 18px;
                }
                .schedule-table table tbody td.active h4 {
                    font-size: 17px;
                }
            }
            @media screen and (max-width: 767px) {
                .schedule-table table thead th {
                    padding: 15px;
                }
                .schedule-table table tbody td {
                    padding: 15px;
                }
                .schedule-table table tbody td.active h4 {
                    font-size: 16px;
                }
                .schedule-table table tbody td.active p {
                    font-size: 14px;
                }
                .schedule-table table tbody td .hover {
                    padding: 10px 0;
                }
                .schedule-table table tbody td.day {
                    font-size: 18px;
                }
                .schedule-table table tbody td .hover span {
                    font-size: 15px;
                }
            }
            @media screen and (max-width: 575px) {
                .schedule-table table tbody td.day {
                    min-width: 135px;
                }
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
            .checkbox-label {
                text-decoration: none;
                color: black;
            }

            .checkbox-label.checked {
                text-decoration: line-through;
            }
            .btn-myRecipes {
                align-items: center;
                background-color: #fff;
                display: flex;
                line-height: 19.2px;
                padding: 5px 15px 5px 15px;
                text-align: left;
                margin: 20px 40px;
                min-width: 60%;
                border-radius: 10px;
                cursor: pointer;
            }

            .btn-myRecipes:hover{
                background-color: #ebf7fc;
            }

            .nav-link {
                color: #232d37;
                text-transform: uppercase;
                font-size: 14px;
            }

            .search-link {
                background-color:
                    #ffffff;
                font-size:
                    12px;
                letter-spacing:
                    0.72px;
                line-height:
                    14.4px;
                padding:
                    10px 20px;
                text-transform:
                    uppercase;
                border: solid 2px;
                color: #232d37;
            }

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
        <div class="container">
            <div class="w-95 w-md-75 w-lg-60 w-xl-55 mx-auto mb-6 text-center">
               
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="schedule-table">
                        <table class="table bg-white">
                            <thead>
                                <tr>
                                    <th>Routine</th>
                                    <th>Sunday</th>
                                    <th>Monday</th>
                                    <th>Tuesday</th>
                                    <th>Wednesday</th>
                                    <th>Thursday</th>
                                    <th>Friday</th>
                                    <th>Saturday</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td class="day">Morning</td>
                                    <td></td>
                                    <td></td>
                                    <td class="">

                                    </td>
                                    <td class="">

                                    </td>
                                    <td>
                                        <div>
                                        <label class="checkboxRadio">
                                            <input name="d" type="checkbox" id="my-checkbox" />
                                            <span class="primary"></span>
                                        </label>
                                        <h4 class="checkbox-label" for="my-checkbox">Chicken Pho</h4>
                                        <div>
                                            <button class="js-buy-tickets">...</button>
                                        </div>
                                        </div>
                                        <div>
                                        <label class="checkboxRadio">
                                            <input name="d" type="checkbox" id="my-checkbox" />
                                            <span class="primary"></span>
                                        </label>
                                        <h4 class="checkbox-label" for="my-checkbox">Beef Pho</h4>
                                        <div>
                                            <a href="" style="font-size: 10px"><h2>...</h2></a>
                                        </div>
                                        </div>
                                    </td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td class="day">Lunch</td>
                                    <td></td>
                                    <td></td>
                                    <td class="">
                                        <label class="checkboxRadio">
                                            <input name="d" type="checkbox"  />
                                            <span class="primary"></span>
                                        </label>
                                        <h4>Salad with chicken</h4>
                                    </td>
                                    <td class="">

                                    </td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td class="day">Afternoon</td>
                                    <td></td>
                                    <td></td>
                                    <td class="">

                                    </td>
                                    <td class="">
                                        <label class="checkboxRadio">
                                            <input name="d" type="checkbox"  />
                                            <span class="primary"></span>
                                        </label>
                                        <h4>Chicken with rice</h4>

                                    </td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td class="day">Evening</td>
                                    <td></td>
                                    <td></td>
                                    <td>
                                        <label class="checkboxRadio">
                                            <input name="d" type="checkbox"  />
                                            <span class="primary"></span>
                                        </label>
                                        <h4>rice and soup</h4>
                                    </td>
                                    <td class="">

                                    </td>
                                    <td></td>
                                    <td></td>
                                    <td>
                                        <label class="checkboxRadio">
                                            <input name="d" type="checkbox"  />
                                            <span class="primary"></span>
                                        </label>
                                        <h4>Beef Pho</h4></td>
                                </tr>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        
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
  const checkbox = document.getElementById('my-checkbox');
  const checkboxLabel = document.querySelector('.checkbox-label');

  checkbox.addEventListener('change', function() {
    if (this.checked) {
      checkboxLabel.classList.add('checked');
    } else {
      checkboxLabel.classList.remove('checked');
    }
  });
  
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
<!-- Jquery-2.2.4 js -->
  
    </body>
</html>


