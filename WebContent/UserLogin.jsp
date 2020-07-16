<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.footer-main-div{
width: 100%;
	height: auto;	
	color: black;
	padding: 20px 0px;
    bottom: 0;    
}
.footer-menu-one{
	
	width: 100%;
	height: auto;
	margin:auto;
	margin-top: 20px;
}
.form-container{
     
	
	margin-top: 1cm;
    margin-left: -0px;
	width:100%;
	background-color: #fff;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0px 0px 10px 0px #000;
}








</style>
<meta charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
<title>LOL BANK</title>
<link rel="stylesheet" href="Style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" ></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

<section id="nav-bar">

<nav class="navbar navbar-expand-lg navbar-light">
  <a class="navbar-brand" href="#"><img src="https://www.freepnglogos.com/uploads/abc-png-logo/play-abc-logo-png-22.png"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <i class="fa fa-bars" aria-hidden="true"></i>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link" href="Home.jsp">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Adminlogin.jsp">Admin Login</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Registration.jsp">Create Account</a>
      </li>
     
    </ul>
  </div>
</nav>

</section>
<!-- ------------banner section------- ------------->

<section id="banner">

<div class="container">

<div class="row">

<div class="col-md-6">

<p class="promo-title">ABC BANK-THE CUSTOMER'S CHOICE</p>

<p>ABC Bank has been voted as the best bank across INDIA in the financial year of 2019-2020 through public opinion </p>
</div>

<div class="col-md-6 text-center">
<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQSRCcJQx1rshFDPgXHXTCv9iLQOx_DEmXv3g&usqp=CAU" class="img-fluid">

</div>
</div>

</div>
</section>
<!-- --------services -->


<h1 align="center"> USER LOGIN</h1>
<section class="container-fluid">
<section class="row justify-content-center">

<section=class="col-12 col-sm-6 col-md-3">

<form class="form-container" action="UserLoginValidation" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Account No</label>
    <input type="text" class="form-control" id="exampleInputAccno1" aria-describedby="AccHelp" name="id">
    <small id="AccHelp" class="form-text text-muted">Your Account Number will be private.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
  </div>
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Keep me logged in</label>
    <a href="Forget.jsp">forget password</a>
  </div>
  <button type="submit" class="btn btn-success btn-block">Submit</button>
</form>

</section>

</section>
</section>







<!-- --footer -->

<div class="footer-main-div">

<div class="footer-social-icons">
 <ul>
 
 <li><a href="#"><i class="fa fa-facebook"></i></a></li>
 <li><a href="#"><i class="fa fa-twitter"></i></a></li>
 <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
 <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
 
 
 
 
 </ul>



</div>

<div class="footer-menu-one">
<ul>

<li><a href="#">Home</a></li>
<li><a href="#">About us</a></li>
<li><a href="#">Services</a></li>
<li><a href="#">Contact us: 9191919191</a></li>



</ul>



</div>

</div>

<!-- //footer -->
</body>
</html>