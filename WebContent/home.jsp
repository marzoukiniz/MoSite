<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index</title>
<!--CSS-->
<link rel="stylesheet" href="css/styles.css">
<!--Google Webfont -->
<link href='http://fonts.googleapis.com/css?family=Istok+Web' rel='stylesheet' type='text/css'>
<!--Javascript-->
<script type="text/javascript" src="js/jquery-1.7.2.min.js" ></script>
<script type="text/javascript" src="js/jquery.flexslider.js" ></script>
<script type="text/javascript" src="js/jquery.easing.js"></script>
<script type="text/javascript" src="js/jquery.jcarousel.js"></script>
<script type="text/javascript" src="js/form_elements.js" ></script>
<script type="text/javascript" src="js/custom.js"></script>
<link rel="stylesheet" type="text/css" href="css/popup.css">
<script type="text/javascript" src="css/popup.js"></script>
<!--[if lt IE 9]>
    <script src="js/html5.js"></script>
<![endif]-->
<!-- mobile setting -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">


</head>

<body>
<div class="wrapper">
    <div class="header_container">
       
        <header>
          
        </header>
        <!--Header Ends-->
    </div>
    <div class="navigation_container">
      
    </div>
    <div class="section_container">
        
  <section>
           
            <div id="banner_section">
                <div class="flexslider">
                    <ul class="slides">
                        <li> <img src="images/lm_banner_1.jpg" />
                        
                        </li>
                        <li> <img src="images/lm_banner_2.jpg" />
                         
                        </li>
                        <li> <img src="images/lm_banner_3.jpg" /> </li>
                    </ul>
                </div>
                <div class="promo_banner">
                    <div class="home_banner"><a href="#"><img src="images/promo_hb_1.jpg"></a></div>
                    <div class="home_banner"><a href="#"><img src="images/promo_hb_2.jpg"></a></div>
                    <div class="home_banner"><a href="#"><img src="images/promo_hb_3.jpg"></a></div>
                </div>
            </div>
            
			     
            <div id="login" class="popup_block">
        <h2>Identifiez-vous</h2>
				<div id="form_wrapper" class="form_wrapper">
	<form class="login active" method="post" action="">
<div>
							<label>Username:</label>
							<input type="text" name="loginc" />
							</div>
						<div>
							<label>Password: <a href="forgot_password.html" rel="forgot_password" class="forgot linkform">Mot de passe oublié?</a></label>
							<input type="password"  name="passwordc"/>
						</div>
						<br/>
						<div class="bottom">
							<input type="submit" value="Login" name="connecter"></input>
		</div></form></div></div>
			
			<!-- fin login-->
			
			  <!-- debut inscription -->
 <div id="register" class="popup_block">
 <div id="form_wrapper" class="form_wrapper">
 <form  class="login active"  method="post" action="#" >






	Login *:<input type="text" size=30 name="login" id="login"/>

	Mot de passe *:<input type="password" size=30 name="password" id="password" required />
	


	Nom*:<input type="text" size=30 name="nom" id="nom" required/>

   Prenom*:<input type="text" size=30 name="prenom" id="prenom" required/>

	CIN*:<input type="text" size=30 name="cin" id="cin" required/>
	
	E_mail*:<input type="text" size=30 name="email" id="email" required/>
	
	Adresse*:<input type="text" size=30 name="adresse" id="adresse"required />

<center>

<div class="bottom">
							
<input type="reset" name="res" value="effacer" /><input type="submit" name="valider" value="valider"  onClick="envoie(this.form),Test_adresse_email(this.form)"/>
		
</div>
								
				
							
						


</center>
</form>
</div>
</div>
   <!-- fin inscrip -->  
			
			
			
			
			
			
			
            <!--hotel List Starts-->
            <div class="products_list products_slider">
                <h2 class="sub_title">Nouveaux Hotels</h2>

                <ul id="first-carousel" class="first-and-second-carousel jcarousel-skin-tango">
                
     
             
  
                 <li></li>
                   
                </ul>
            </div>
            <!--hotel List Ends-->
            <!--hotels List Starts-->
            <div class="products_list products_slider">
                <h2 class="sub_title">derniers Offres </h2>
                <ul id="first-carousel" class="first-and-second-carousel jcarousel-skin-tango">
                
       
                 
                </ul>
            </div>
            <!--Product List Ends-->
            <!--Newsletter_subscribe Starts-->
            <div class="subscribe_block">
                <div class="find_us">
                    <h3>Find us on</h3>
                    <a class="twitter" href="#"></a> <a class="facebook" href="#"></a> <a class="rss" href="#"></a> </div>
                <div class="subscribe_nl">
                    <h3>Subscribe to our Newsletter</h3>
                    <small>Instant wardrobe updates, new arrivals, fashion news, don’t miss a beat – sign up to our newsletter now.</small>
                    <form id="newsletter" method="post" action="#">
                        <input type="text" class="input-text" value="Enter your email" title="Enter your email" id="newsletter" name="email">
                        <button class="button" title="" type="submit"></button>
                    </form>
                </div>
            </div>
            <!--Newsletter_subscribe Ends-->
        </section>
        <!--Mid Section Ends-->
    </div>
    <div class="footer_container">
        <!--Footer Starts-->

        <footer>
         	
            <address>
            Copyright © 2012 Leisure. All Rights Reserved. <img src="images/payment_info.jpg"/>
            </address>
        </footer>
        <!--Footer Ends-->
    </div>
</div>
<!--CUSTOMIZE-->
<style type="text/css">
.page_selector{ position:absolute; right:0px; top:28%;}
.page_selector a.page_open{ display:inline-block; width:60px; height:12px; background:#252525; color:#fff; text-align:center; font-size:14px; padding:20px 0px; font-weight:bold; text-decoration:none; float:left;}
.page_selector ul{ float:left; background:#f0f0f0; padding:10px 0px; border-top:solid 2px #000; border-bottom:solid 2px #000; display:none;}
.page_selector ul li{ padding:8px 10px; }
.page_selector ul li a{ font-weight:bold; text-decoration:none; color:#000; display:block; padding:2px 5px; text-transform:uppercase; font-size:11px;}

.store_selector{ position:absolute; left:0px; top:28%;}
.store_selector .store_open{display:inline-block; width:128px; height:55px;}
.store_selector div{ float:left; width:157px; height:226px; display:none;}
</style>

<script type="text/javascript">
$(document).ready(function(){
	//SLIDE TOGGLE
	jQuery(".page_open").toggle(function() {
		 $('.page_selector ul').slideDown(300);	
		 }, function(){
		 $('.page_selector ul').slideUp(300);		 
	});	
	//SLIDE TOGGLE
	jQuery(".store_open").toggle(function() {
		 $('.store_selector div').slideDown(300);	
		 }, function(){
		 $('.store_selector div').slideUp(300);		 
	});		
});

</script>


<div class="page_selector">
<a href="#" class="page_open">PAGES</a>
<ul>
	<li> <a href="index.php">Home</a></li>
    <li> <a href="HotelList.php">Hotels</a></li>
  
    <li> <a href="contact.php">Contact</a></li>
</ul>
</div>
<!--CUSTOMIZE-->
</body>
</html>
