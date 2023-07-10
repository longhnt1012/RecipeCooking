<%-- 
    Document   : loginPage
    Created on : Jul 8, 2023, 10:16:40 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <link rel="stylesheet" href="login/fonts/icomoon/style.css">

        <link rel="stylesheet" href="login/css/owl.carousel.min.css">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="login/css/bootstrap.min.css">

        <!-- Style -->
        <link rel="stylesheet" href="login/css/style.css">

        <title>Login #2</title>
    </head>
    <body>


        <div class="d-lg-flex half">
            <div class="bg order-1 order-md-2" style="background-image: url('login/img/bg_1.jpg');"></div>
            <div class="contents order-2 order-md-1">
                <div class="container">
                    <div class="row align-items-center justify-content-center">
                        <div class="col-md-7">
                            <h3>Login to <strong>Flavorful Creations</strong></h3>
                            <p class="mb-4">Enter your Email and Password </p>
                            <form action="MainController" method="post">
                                <div class="form-group first">
                                    <label for="username">Email</label>
                                    <input type="text" class="form-control" placeholder="your-email@gmail.com" name="gmail">
                                </div>
                                <div class="form-group last mb-3">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" placeholder="Your Password" name="password">
                                </div>

                                <div class="d-flex mb-5 align-items-center">
                                    <label class="control control--checkbox mb-0"><span class="caption">Remember me</span>
                                        <input type="checkbox" checked="checked"/>
                                        <div class="control__indicator">
                                        </div>
                                    </label>
                                    <span class="ml-auto"><a href="forgotPassword.html" class="forgot-pass">Forgot Password</a></span> 
                                </div>
                                <div class="btn" style="display: inline-table; margin-left: 20px">
                                    <div class="g-recaptcha" data-sitekey="6LcsCv8kAAAAAFrbQiRvDDFPgq7OQCc-y9-QuFTL"></div>
                                    <div id="error"></div>
                                </div><!--
                                <input type="submit" value="Log In" class="btn btn-block btn-primary"> -->
                                <input type="submit" name="action" value="Login" class="btn btn-block btn-primary">
                                <input type="reset" value="Reset" class="btn btn-block btn-primary">
                            </form>
                            <script src="https://www.google.com/recaptcha/api.js" async defer></script>
                            <script>
                                window.onload = function () {
                                    let isValid = false;
                                    const form = document.getElementById("form");
                                    const error = document.getElementById("error");

                                    form.addEventListener("submit", function (event) {
                                        event.preventDefault();
                                        const response = grecaptcha.getResponse();
                                        if (response) {
                                            form.submit();
                                        } else {
                                            error.innerHTML = "Please check";
                                        }
                                    });
                                };
                                ${message}
                            </script>


                        </div>

                    </div>

                </div>
            </div>

        </div>




        <script src="login/js/jquery-3.3.1.min.js"></script>
        <script src="login/js/popper.min.js"></script>
        <script src="login/js/bootstrap.min.js"></script>
        <script src="login/js/main.js"></script>
    </body>
</html>

