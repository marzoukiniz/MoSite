<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
              <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>
</head>
<body>


	

	<b> Prix total</b>:/<c:out value="${totalmontant}" /><br>
	

<% if( request.getAttribute("liste")!=null){%>
	

	
	<c:forEach var="listes" items="${liste}">
	
      <c:out value="${listes.idpanier}"/>
	 <c:out value="${listes.idHotel}" />
	
	 <c:out value="${listes.nomHotel}" />
	 <c:out  value="${listes.montant}"/>
	 <c:out value="${listes.nombreCh}"/>

	
	
	</c:forEach>
	
	
	<!--  out.print("plein");-->
<% }else {
		out.println("vide");
}


%>








<pre>
<table border="1">
<tr><td>ID Hotel</td><td>Nom Hotels</td><td>Grade</td><td>Prix</td><td>Nombre chambres</td><td>images</td>

<td>detail</td><td>ajouter panier</td>
</tr>
<c:forEach var="hotels" items="${l}">
<form methode="GET" action="panierServlet">
<tr>

<td><input type="text" value="${hotels.idHotel}" name="idhotel"/>
<td><input type="text" value="${hotels.nomHotel}" name="nomHotel"/>
<td><input type="text" value="${hotels.prixhotel}" name="prixhotel"/>
<td><input type="text" value="10" name="nbrChambres"/>
<!--<td><input type="text" value="${hotels.nbrChambres}" name="nbrChambres"/>-->


<td><c:out value="${hotels.nomHotel}"/></td>

<td><c:out value="${hotels.gradhotel}"/></td>
<td><c:out value="${hotels.prixhotel}"/></td>
<td><c:if test="${hotels.nbrChambres>0}">libre

</c:if>

<c:if test="${hotels.nbrChambres==0}">occupe</c:if>
</td>


<td><img src="hotels/${hotels.imaghot}"/></td>
<td><a href="detailHotelServlet?id=${hotels.idHotel}">detail</a></td>

<td><input type="submit" value="ajouter panier"/></td>


</tr>
</form>
</c:forEach>
</table>
</pre>

<a href="listepanier.jsp">Verifier</a>

</body>
</html>