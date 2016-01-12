<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index</title>
<!--CSS-->
<link rel="stylesheet" href="css/styles.css">
<!--Google Webfont -->
<link href='http://fonts.googleapis.com/css?family=Istok+Web'
	rel='stylesheet' type='text/css'>
<!--Javascript-->
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/jquery.flexslider.js"></script>
<script type="text/javascript" src="js/jquery.easing.js"></script>
<script type="text/javascript" src="js/jquery.jcarousel.js"></script>
<script type="text/javascript" src="js/form_elements.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<link rel="stylesheet" type="text/css" href="css/popup.css">
<script type="text/javascript" src="css/popup.js"></script>
<!--[if lt IE 9]>
    <script src="js/html5.js"></script>
<![endif]-->
<!-- mobile setting -->
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Statistiques</title>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
		<style type="text/css">
${demo.css}
		</style>
		<script type="text/javascript">
		cpt=${cpt}
		cptt=${cptt}
		nonclientreser=${nonclientreser}
		nbre=${nbre}
		
$(function () {
    $('#container').highcharts({
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
        title: {
            text: 'Bienvenue dans à la page des statistiques '
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: true,
                    format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                    style: {
                        color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                    }
                }
            }
        },
        series: [{
            name: "Brands",
            colorByPoint: true,
            data: [{
                name: "Nombre  des incrits par les clients ",
                y: cpt
            }, {
                name: "Nombre de reservations par les clients ",
                y: cptt,
                sliced: true,
                selected: true
            }, {
                name: "Nombre des clients en attente de reservation",
                y: cpt-cptt
            }, {
                name: " Nombre total  des chambre reserveés",
                y: nbre
            }]
        }]
    });
});
		</script>
	</head>
	<body>
<script src="Highcharts-4.1.9/js/highcharts.js"></script>
<script src="Highcharts-4.1.9/js/modules/exporting.js"></script>
<div class="wrapper">
		<div class="header_container">
			<!--Header Starts-->
			<header> 
			<!--  ----------"<include file="Header.jsp"%>"-->
			 
			
			<div class="top_bar clear">
                <!--Language Switcher Starts-->
                <div class="language_switch"> <a class="inactive" href="#" title="ENGLISH">EN</a> <a href="#" title="FRENCH">FR</a> </div>
                <!--Language Switcher Ends-->
                <!--Top Links Starts-->
           
                <!--Top Links Ends-->
            </div>
            <!--Logo Starts-->
            <h1 class="logo"> <a href="index.jsp"><img src="images/logo.png" width="200" height="110" /></a> </h1>
            
		<div class="navigation_container">

			
<%@ include file="NavMenu.jsp"%>
<!--Navigation Ends-->
</div>
<div class="section_container">
<!--Mid Section Starts-->
<section> <!--Banner Starts-->
			<div id="banner_section">
			<div id="container" style="min-width: 310px; height: 600px; max-width: 900px; margin: 0 auto"></div>
</div></section></div></header>
            
            
            
            


	</body>
</html>
