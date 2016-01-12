
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
<%@page import="javax.servlet.http.HttpSession"%>

 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>home</title>
<!--CSS-->

<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="popup.css">
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="popup.js"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
		<script src="js/ChunkFive_400.font.js" type="text/javascript"></script>
<!--Google Webfont -->
<link href='http://fonts.googleapis.com/css?family=Istok+Web' rel='stylesheet' type='text/css'>
<!--Javascript-->
<script type="text/javascript" src="js/jquery-1.7.2.min.js" ></script>
<script type="text/javascript" src="js/jquery.flexslider.js" ></script>
<script type="text/javascript" src="js/jquery.easing.js"></script>
<script type="text/javascript" src="js/jquery.jcarousel.js"></script>
<script type="text/javascript" src="js/form_elements.js" ></script>
<script type="text/javascript" src="js/custom.js"></script>
<!--[if lt IE 9]>
    <script src="js/html5.js"></script>
<![endif]-->
<!-- mobile setting -->


<script type="text/javascript">
function envoie(formulaire) {
if ( (document.getElementById('nom').value.length>0)
&&(document.getElementById('prenom').value.length>0)
&&(document.getElementById('login').value.length>0)
&&(document.getElementById('password').value.length>0)
&&(document.getElementById('NumC').value.length>0)

 ){
formulaire.submit();
} else
alert('IMPOSSIBLE D\' ENVOER LE FORMULAIRE, VOUS AVEZ OUBLIEZ DE REMPLIRE DES CHAMPS OBLIGATOIRS');
}

</script>
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
			
			Cufon.replace('h3',{ textShadow: '1px 1px #000'});
			//Cufon.replace('.back');
		</script>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
</head>
<body>















<div class="wrapper">
    <div class="header_container">
        <!--Header Starts-->
        <header>
            <div class="top_bar clear">
                <!--Language Switcher Starts-->
                <div class="language_switch"> <a class="active" href="#" title="ENGLISH">EN</a> <a href="#" title="FRENCH">FR</a> </div>
                <!--Language Switcher Ends-->
                <!--Top Links Starts-->
                <ul class="top_links">
       
                   
                   <li class="highlight"> <a  href="#" rel="login" >Bienveune </a></li>
                   <li class="highlight"> <a  href="logout.jsp" >Deconnexion</a></li>
                 <li><a  href="#?w=500" rel="login" class="poplight">connexion</a>
                   </li>
                   
                
                   
                   
                   
                   
                   
                   
<li><a  href="#?w=500" rel="register" class="poplight">inscription</a>
                    			</li>
                    
                  
                </ul>
                <!--Top Links Ends-->
            </div>
            <!--Logo Starts-->
            <h1 class="logo"> <a href="index.jsp"><img src="images/logo.png" width="200" height="110" /></a> </h1>
            <!--Logo Ends-->
           
            <!--Search Starts-->
            <form class="header_search">
                <div class="form-search">
                    <input id="search" type="text" name="q" value="" class="input-text" autocomplete="off" placeholder="Search">
                    <button type="submit" title="Search"></button>
                </div>
            </form>
            <!--Search Ends-->
        </header>
        <!--Header Ends-->
    </div>
    <div class="navigation_container">
        <!--Navigation Starts-->
        <nav>
            <ul class="primary_nav">
                <li class="active"><a href="index.jsp">Home</a>
                
                </li>
                <li><a href="#">Produit</a>
                       <!--SUbmenu Starts-->
                    <ul class="sub_menu">
                        <li> <a href="homme.jsp">Homme</a>
                        
                        </li>
                        <li> <a href="femme.jsp">Femme</a>
                          
                        </li>
                    </ul>
                    <!--SUbmenu Ends-->
                </li>
                <li><a href="promotion.jsp">Promotion</a></li>
                <li><a href="Contact.jsp">Contact</a></li>
               
            </ul>
            <div class="minicart"> <a href="#" class="minicart_link" > <span class="item"><b>1</b> Element /</span> <span class="price"><b>120 TND</b></span> </a>
                <div class="cart_drop"> <span class="darw"></span>
                    <ul>
                   
                        <li><img src="images/mini_c_item1.png"><a href="#">Clogs Beach/Garden Clog</a> <span class="price"></span></li>
                    
                    </ul>
                </div>
            </div>
        </nav>
        <!--Navigation Ends-->
    </div>
    <div class="section_container">
        <!--Mid Section Starts-->
        <section>
            <!--Banner Starts-->
            <div id="banner_section">
                <div class="flexslider">
                    <ul class="slides">
                        <li> <img src="images/lm_banner_1.jpg" />
                            <!--<div class="flex-caption">
                     <h3>Explore the summer collection!</h3>
              </div>-->
                        </li>
                        <li> <img src="images/lm_banner_2.jpg" />
                            <!--<div class="flex-caption">
                      <h3>Shop now!</h3>
               </div> -->
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
            <!--Banner Ends-->
            <!--Product List Starts-->
            
            
            
            
            
            
            
            <div id="login" class="popup_block">
        


	<h2>Identifiez-vous</h2>
				<div id="form_wrapper" class="form_wrapper">
	
<form class="login active" method="GET" action="Connexion">


    <label> Login :</label><input type="text" name="login" required/><br>
    <label> Password :</label><input type="password" name="pwd" required/><br>
    <input type="submit" value="Connexion" >
</form>


</div>
	
	

</div>
        

   <!-- debut inscrip -->
 <div id="register" class="popup_block">
 <div id="form_wrapper" class="form_wrapper">
 <form  class="login active"  method="post" action="AjoutClient" >



<center> <br/><h2><font size=4 color='green'></font></h2></center>



	<font size=4 color=#0099cc>Informations Generales:</font> 


	<label>Login *:</label>
	<input type="text" size=30 name="login" id="login"/>

	<label>Mot de passe *:</label>		        
	<input type="password" size=30 name="password" id="password"/>
	

	<p><font size="4" color="#0099cc">Informations Complementaires:</font></p>

	<label>Nom*:</label>
	<input type="text" size=30 name="nom" id="nom" />

	<label>Prenom*:</label>
	<input type="text" size=30 name="prenom" id="prenom"/>

	<label>Numero de la carte*:</label>
	<input type="text" size=30 name="NumC" id="NumC"/>
<br/>



<center>

<div class="bottom">
							
						 <input type="reset" name="res" value="effacer" /><input type="submit" name="valider" value="valider"  onClick="envoie(this.form)"/>
		
			</div>
								
				
							
						


</center>
</form>
</div>
</div>
   <!-- fin inscrip -->     
            
            

  
            
            <div class="products_list products_slider">
                <h2 class="sub_title"><font size="4" color="#0099cc">Nouveaux Produits</font></h2>
                <ul id="first-carousel" class="first-and-second-carousel jcarousel-skin-tango">
           


                    <li> <a class="product_image"><img src="images/"/></a>
                        <div class="product_info">
                            <h2><font  color="#000000"></font></h2>
                            <small><font  color="#0099cc"></font></small> </div>
                        <a href="achete.jsp?id="><div class="price_info"> <button class="price_add" title="" type="button"><span class="pr_price">TND</span><span class="pr_add">Acheter</span></button>
                        </div></a>
                    </li>
                  
                
                </ul>
            </div>
            <!--Product List Ends-->
            <!--Product List Starts-->
            <div class="products_list products_slider">
                <h2 class="sub_title"><font size="4" color="#0099cc">Top achetes</font></h2>
                <ul id="first-carousel" class="first-and-second-carousel jcarousel-skin-tango">
                 
                  
                    <li> <a class="product_image"><img src="images/3.jpg"/></a>
                        <div class="product_info">
                            <h2><a href="leisure_detail.html">CN Clogs Beach/Garden Clog</a></h2>
                            <small>Comfortable and fun to wear these clogs are the latest trend in fash</small> </div>
                        <div class="price_info"> <a href="#">+ Add to wishlist</a>
                            <button class="price_add" title="" type="button"><span class="pr_price">$76.00</span><span class="pr_add">Acheter</span></button>
                        </div>
                    </li>
                    <li> <a class="product_image"><img src="images/5.jpg"/></a>
                        <div class="product_info">
                            <h2><a href="leisure_detail.html">CN Clogs Beach/Garden Clog</a></h2>
                            <small>Comfortable and fun to wear these clogs are the latest trend in fash</small> </div>
                        <div class="price_info"> <a href="#">+ Add to wishlist</a>
                            <button class="price_add" title="" type="button"><span class="pr_price">$76.00</span><span class="pr_add">Acheter</span></button>
                        </div>
                    </li>
               
                  
                </ul>
            </div>
            <!--Product List Ends-->
            <!--Newsletter_subscribe Starts-->
            <div class="subscribe_block">
                <div class="find_us">
                    <h3> <font color="white">Find us on</font></h3>
                    <a class="twitter" href="#"></a> <a class="facebook" href="#"></a> <a class="rss" href="#"></a> </div>
                <div class="subscribe_nl">
                    <h3><font color="white">Subscribe to our Newsletter</font></h3>
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
            <ul class="footer_links">
                <li> <span>Marques</span>
                    <ul>
                     
                        <li><a href="#">Acne</a></li>
                        <li><a href="#">Bassike</a></li>
                        <li><a href="#">Camilla and Marc</a></li>
                    </ul>
                </li>
                <li  class="seperator"> <span>Brands we sell</span>
                    <ul>
                        <li><a href="#">Elle</a></li>
                        <li><a href="#">Reallxe</a></li>
                 
                    </ul>
                </li>
                <li> <span>Customer Service</span>
                    <ul>
                        <li><a href="#">Help</a></li>
                        <li><a href="#">Shipping</a></li>
                        <li><a href="#">Returns & Exchanges</a></li>
                        <li><a href="#">Payment Options</a></li>
                     
                    </ul>
                </li>
              
            </ul>
            <div class="footer_customblock">
                <div class="shipping_info"> <span>introducing </span><br>
                    <big>FREE SHIPPING</big><br>
                    <small>for purchases above $200</small> </div>
                
            </div>
            <address>
            Copyright ©  All Rights Reserved. <img src="images/payment_info.jpg"/>
            </address>
        </footer>
        <!--Footer Ends-->
    </div>
</div>
<!--CUSTOMIZE-->


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

<div class="store_selector">

<div>
<img src="../assets/shops.jpg" border="0" usemap="#Map"/>
<map name="Map"><area shape="rect" coords="3,171,159,222" href="../Lingerie_shop/leisure_index.html"><area shape="rect" coords="1,115,157,166" href="leisure_index.html"><area shape="rect" coords="0,59,156,110" href="../Gadget_shop/leisure_index.html">
  <area shape="rect" coords="2,3,158,54" href="../Fashion_shop/leisure_index.html">
</map>
</div>
</div>


<!--CUSTOMIZE-->




</body>
</html>