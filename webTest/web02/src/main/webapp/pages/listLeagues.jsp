<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <title>Document</title>
    </head>
    <body>
	================ list leagues ================ <br/>
 	<c:forEach var="league"  items="${applicationScope.leagueList}">
	    ${league} <br/>
	</c:forEach>
    </body>
</html>
