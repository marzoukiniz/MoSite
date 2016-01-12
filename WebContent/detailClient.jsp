<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
              <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detail</title>
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
</head>
<body>
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

<pre>

Nom: ${cl.nom}
Prenom: ${cl.prenom} 
Email:${cl.email}
CIN:${cl.cin}
Login:${cl.login}
Password:${cl.password}
</pre>




</body>
</html>