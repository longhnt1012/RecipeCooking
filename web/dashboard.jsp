<%-- 
    Document   : manageUsers1
    Created on : Jun 7, 2023, 2:27:58 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Language" content="en">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no" />

        <meta name="msapplication-tap-highlight" content="no">
        <link href="css/AdminStyle.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
        <link rel="stylesheet"
              href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
        <link rel="stylesheet" href="css/DashboardStyle.css" />
    </head>
    <body>
        <div class="app-container app-theme-white body-tabs-shadow fixed-header fixed-sidebar">
            <div class="app-header header-shadow">
                <div class="app-header__logo">
                    <div class="logo-src"></div>
                    <div class="header__pane ml-auto">
                        <div>
                            <button type="button" class="hamburger close-sidebar-btn hamburger--elastic" data-class="closed-sidebar">
                                <span class="hamburger-box">
                                    <span class="hamburger-inner"></span>
                                </span>
                            </button>
                        </div>
                    </div>
                </div>
                <div class="app-header__mobile-menu">
                    <div>
                        <button type="button" class="hamburger hamburger--elastic mobile-toggle-nav">
                            <span class="hamburger-box">
                                <span class="hamburger-inner"></span>
                            </span>
                        </button>
                    </div>
                </div>
                <div class="app-header__menu">
                    <span>
                        <button type="button" class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
                            <span class="btn-icon-wrapper">
                                <i class="fa fa-ellipsis-v fa-w-6"></i>
                            </span>
                        </button>
                    </span>
                </div> 
                <div class="app-header__content">
                    <div class="app-header-right">
                        <div class="header-dots">
                            <div class="dropdown">
                                <button type="button" aria-haspopup="true" data-toggle="dropdown" aria-expanded="false" class="p-0 btn btn-link dd-chart-btn">
                                    <span class="icon-wrapper icon-wrapper-alt rounded-circle">
                                        <span class="icon-wrapper-bg bg-success"></span>
                                        <i class="fa-solid fa-user-secret"></i>
                                    </span>
                                </button>
                                <div tabindex="-1" role="menu" aria-hidden="true" class="dropdown-menu-xl rm-pointers dropdown-menu dropdown-menu-right">
                                    <div class="dropdown-menu-header">
                                        <div class="dropdown-menu-header-inner bg-premium-dark">
                                            <div class="menu-header-image" style="background-image: url('assets/images/dropdown-header/abstract4.jpg');"></div>
                                            <div class="menu-header-content text-white">
                                                <h5 class="menu-header-title">Admin</h5>
                                                <h6 class="menu-header-subtitle">Recent Account Activity Overview</h6>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="widget-chart">
                                        <div class="widget-chart-content">
                                            <div class="icon-wrapper rounded-circle">
                                                <div class="icon-wrapper-bg opacity-9 bg-focus"></div>
                                                <i class="fa-solid fa-user-secret" style="color: #3ac47d"></i>
                                            </div>
                                            <div class="widget-numbers">
                                                <span>${sessionScope.user.userName}</span>
                                            </div>

                                        </div>
                                        <div class="widget-chart-wrapper">
                                            <div id="dashboard-sparkline-carousel-3-pop"></div>
                                        </div>
                                    </div>
                                    <ul class="nav flex-column">
                                        <li class="nav-item-divider mt-0 nav-item"></li>
                                        <li class="nav-item-btn text-center nav-item">
                                            <button class="btn-shine btn-wide btn-pill btn btn-warning btn-sm">
                                                Log out
                                            </button>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div> 

            <div class="app-main">
                <div class="app-sidebar sidebar-shadow">
                    <div class="app-header__logo">
                        <div class="logo-src"></div>
                        <div class="header__pane ml-auto">
                            <div>
                                <button type="button" class="hamburger close-sidebar-btn hamburger--elastic" data-class="closed-sidebar">
                                    <span class="hamburger-box">
                                        <span class="hamburger-inner"></span>
                                    </span>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="app-header__mobile-menu">
                        <div>
                            <button type="button" class="hamburger hamburger--elastic mobile-toggle-nav">
                                <span class="hamburger-box">
                                    <span class="hamburger-inner"></span>
                                </span>
                            </button>
                        </div>
                    </div>
                    <div class="app-header__menu">
                        <span>
                            <button type="button" class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
                                <span class="btn-icon-wrapper">
                                    <i class="fa fa-ellipsis-v fa-w-6"></i>
                                </span>
                            </button>
                        </span>
                    </div> 
                    <div class="scrollbar-sidebar">
                        <div class="app-sidebar__inner">
                            <ul class="vertical-nav-menu">
                                <li class="app-sidebar__heading"><a href="newhtml.html">Homepage</a></li>
                                <li class="app-sidebar__heading"><a href="LoadDashboardController">Dashboard</a></li>
                                <li class="app-sidebar__heading">
                                    <a href="#">
                                        Features
                                        <i class="metismenu-state-icon fa-solid fa-angle-up caret-left"></i>
                                    </a>
                                    <ul>
                                        <li>
                                            <a href="LoadAccountsController"  class="mm-active" style="margin: 10px 0xp;">
                                                <i class="metismenu-icon"></i>Manage Accounts
                                            </a>
                                        </li>
                                        <li>
                                            <a href="LoadRecipesController" style="margin: 10px 0xp;">
                                                <i class="metismenu-icon"></i>Manage Recipes
                                            </a>
                                        </li>
                                        <li>
                                            <a href="LoadFeedbacksController" style="margin: 10px 0xp;">
                                                <i class="metismenu-icon">
                                                </i>Manage Feedbacks
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="app-main__outer">
                    <div class="app-main__inner">
                        <div class="tabs-animation">
                            <main>
                                <h1>DASHBOARD</h1>

                                <div class="insights">
                                    <div class="sales">
                                        <span class="material-symbols-outlined">analytics</span>
                                        <div class="middle">
                                            <div class="lef">
                                                <h3>Total Active Users</h3>
                                                <h1>${TOTAL_USER}</h1>
                                            </div>
                                            <div class="progress">
                                                <svg style="stroke-dasharray: 230;">
                                                <circle cx='41' cy='41' r='36'></circle>
                                                </svg>

                                                <div class="number">
                                                    <p style="margin-top: 1rem;">${TOTAL_USER}</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!----------------------- END SALES ----------------------->
                                    <div class="expenses">
                                        <span class="material-symbols-outlined">bar_chart</span>
                                        <div class="middle">
                                            <div class="lef">
                                                <h3>Total Active Recipes</h3>
                                                <h1>${TOTAL_RECIPE}</h1>
                                            </div>
                                            <div class="progress">
                                                <svg style="stroke-dasharray: 230;">
                                                <circle cx='41' cy='41' r='36'></circle>
                                                </svg>

                                                <div class="number">
                                                    <p style="margin-top: 1rem;">${TOTAL_RECIPE}</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!----------------------- END EXPENSES ----------------------->
                                    <div class="income">
                                        <span class="material-symbols-outlined">stacked_line_chart</span>
                                        <div class="middle">
                                            <div class="lef">
                                                <h3>Total Active FeedBack</h3>
                                                <h1>${TOTAL_FEEDBACK}</h1>
                                            </div>
                                            <div class="progress">
                                                <svg style="stroke-dasharray: 230;">
                                                <circle cx='41' cy='41' r='36'></circle>
                                                </svg>
                                                <div class="number">
                                                    <p style="margin-top: 1rem;">${TOTAL_FEEDBACK}</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!----------------------- END INCOME ----------------------->
                                </div>
                                <!----------------------- END INSIGHTS ----------------------->
                                
                                <div class="tabs-animation" style="margin-top: 30px; border-radius: 2rem; ">
                                    <!-- Recipes Table Start -->
                                    <div class="card mb-3">
                                        <div class="card-header-tab card-header">
                                            <div class="card-header-title font-size-lg text-capitalize font-weight-normal"><i class="fa-solid fa-utensils"></i> Recent-Recipes Table
                                            </div>

                                        </div>
                                        <!-- Recipes Table Content Start -->
                                        <div class="card-body">
                                            <table style="width: 100%;" id="example" class="table table-hover table-striped table-bordered">
                                                <thead>
                                                    <tr>
                                                        <th class="text-center">Recipe's Name</th>
                                                        <th class="text-center">Date Posted</th>
                                                        <th class="text-center">Cooking Time(minute)</th>
                                                        <th class="text-center">Status</th>
                                                        <th class="text-center">Details</th>
                                                    </tr>
                                                </thead>
                                                <tbody>

                                                    <c:forEach var="recipe" items="${LIST_RECENT_RECIPE}">
                                                        <c:if test="${recipe.status == true}">
                                                        <tr>
                                                            <td class="text-center">${recipe.recipeName}</td>
                                                            <td class="text-center">${recipe.datePost}</td>
                                                            <td class="text-center">${recipe.cookingTime}</td>
                                                            <c:if test="${recipe.status == 'true'}">
                                                                <td class="text-center">
                                                                    <div class="badge badge-success">Active</div>
                                                                </td>
                                                            </c:if>

                                                            <c:if test="${recipe.status == 'false'}">
                                                                <td class="text-center">
                                                                    <div class="badge badge-danger">Inactive</div>
                                                                </td>
                                                            </c:if>

                                                            <td class="text-center">
                                                                <form action="ManageRecipeController" method="POST">
                                                                    <input type="hidden" name="recipeID" value="${recipe.recipeID}"/>
                                                                    <button type="submit" name="action" value="Detail" id="PopoverCustomT-1" class="btn btn-primary btn-sm">Details</button>
                                                                </form>
                                                            </td>
                                                        </tr>
                                                        </c:if>
                                                    </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                        <!-- Recipes Table Content End -->
                                    </div>
                                    <!-- Recipes Table End -->
                                </div>
                            </main>
                            <!----------------------- END MAIN ----------------------->
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js/Admin.js"></script>
        <script type="text/javascript" src="chrome-extension://cdockenadnadldjbbgcallicgledbeoc/toolbar/bundle.min.js"></script>
        <script>${message}</script>
    </body>
</html>

