
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Reservations</title>
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
	<link rel="stylesheet" type="text/css" href="js/example.css"/>
	<meta name="author" content="Joost de Valk, http://www.joostdevalk.nl/" />
	<link href="http://www.joostdevalk.nl/" rev="made" />
	<script type="text/javascript" src="js/sortable.js"></script>
<script language="javascript">
     function confirmation() { 
 var conf = confirm ("Voulez vous supprimer?");
    if (conf==false){
document.location.href ="./hotel.php"; 
 }     else
alerte("Suppression terminer");
    }
	  </script>
<!--[if lt IE 9]>
    <script src="js/html5.js"></script>
<![endif]-->
<!-- mobile setting -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
</head>


<body>
<div class="wrapper">
    <div class="header_container">
        <!--Header Starts-->
        <header>
<!-- ici include header.php -->
<%@ include file="Header.jsp"%>
        </header>
        <!--Header Ends-->
    </div>
    <div class="navigation_container">
        <!--Navigation Starts-->
  <%@ include file="NavMenu.jsp"%>
        <!--Navigation Ends-->
    </div>
    <div class="section_container">
        <!--Mid Section Starts-->
        <section>
            <!--SIDE NAV STARTS-->
            <div id="side_nav">
                <div class="sideNavCategories">
                    <h1>Gerer les reservations</h1>
                  
                    
                  
                </div>
            </div>
            <!--SIDE NAV ENDS-->
            <!--MAIN CONTENT STARTS-->
            <div id="main_content">
                <div class="category_banner"> <img src="images/promo_cat_banner.jpg"/> </div>
                <ul class="breadcrumb">
                    <li><a href="#">Reservation</a></li>
                    <li><a href="Reservation.jsp">Reservation</a></li>
                  
                </ul>
                <!--Toolbar-->
                <div class="toolbar">
                    <div class="sortby">
                        <div class="cart_table">
			          <table class="data-table cart-table" id="shopping-cart-table" width="100%" cellpadding="5" cellspacing="5">
         
			<tr>
              
              <th class="align_center" width="10%" >Id</th>
              <th class="align_center" >Debut Reservation</th>
              <th class="align_center" >Fin Reservation</th>
              <th class="align_center" >Nbre chambre</th>
              <th class="align_center" >Client</th>
		      <th class="align_center" >Hotel</th>
		      <th class="align_center"> Modifier </th>
		     <th class="align_center"> Supprimer </th>
		      
            </tr>
            
       
<c:forEach var="r" items="${l}">
<tr>
<td width="10%"><c:out value="${r.idreser}"/></td>

<td width="10%"><c:out value="${r.debutreserv}"/></td>

<td width="10%"><c:out value="${r.finreserv}"/></td>
<td width="10%"><c:out value="${r.nbCh}"/></td>
<td width="10%"><a href="ClientDetailServlet?id=${r.client.id}"><c:out value="${r.client.nom}"/></a></td>

<td width="10%"><a href="detailHotelServlet?id=${r.hotel.idHotel}"><c:out value="${r.hotel.nomHotel}"/></a></td>
<td><a href="ModifReservationServlet?id=${r.idreser}">Modifier</a></td>

<td><a href="DeleteReservation?id=${r.idreser}">supprimer</a></td>

</tr>
</c:forEach>
            
            


          </table>
					
					
	                   
					
				
                </div>
                
                
                
            
        
                <!--hotels List Ends-->
                <!--Toolbar-->
                <div class="toolbar">
                    <div class="sortby">
                       
                    </div>
                </div>
                <!--Toolbar-->
            </div>
            <!--MAIN CONTENT ENDS-->
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
            Copyright © 2015 . All Rights Reserved. <img src="images/payment_info.jpg"/>
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

<div class="store_selector">
<div>
<img src="../assets/shops.jpg" border="0" usemap="#Map"/>
<map name="Map"><area shape="rect" coords="3,171,159,222" href="../Lingerie_shop/leisure_index.html"><area shape="rect" coords="1,115,157,166" href="../Watch_shop/leisure_index.html"><area shape="rect" coords="0,59,156,110" href="leisure_index.html">
  <area shape="rect" coords="2,3,158,54" href="../Fashion_shop/leisure_index.html">
</map>
</div>
</div>

<div class="page_selector">
<a href="#" class="page_open">PAGES</a>
<ul>
	<li> <a href="hotel.php">Hotel</a></li>
    <li> <a href="client.php">Client</a></li>
    <li> <a href="reservation.php">Reservation</a></li>
   
</ul>
</div>

</body>
</html>
