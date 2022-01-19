<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <title>Document</title>
    </head>
    <body>
	<c:forEach var="error"  items="${requestScope.errors}">
	    ${error} <br/>
	</c:forEach>
	<br/>

	<!-- <form action="Welcome" method="post"> -->
	<form action="addLeague" method="post">
	    year	    <input name="year" type="text" value="${param.year}"/> <br/>
	    title	    <input name="title" type="text" value="${param.title}"/> <br/>
	    season	    <select name="season" id="">
	    <c:choose>
		<c:when test="${param.season eq 'Winter'}">
		    <option value="Winter" selected>Winter</option>
		    <option value="Unknown">Unknown</option>
		    <option value="Spring">Spring</option>
		    <option value="Summer">Summer</option>
		    <option value="Fall">Fall</option>
		</c:when>
		<c:when test="${param.season eq 'Fall'}">
		    <option value="Fall" selected>Fall</option>
		    <option value="Winter">Winter</option>
		    <option value="Unknown">Unknown</option>
		    <option value="Spring">Spring</option>
		    <option value="Summer">Summer</option>
		</c:when>
		<c:when test="${param.season eq 'Summer'}">
		    <option value="Summer" selected>Summer</option>
		    <option value="Fall">Fall</option>
		    <option value="Winter">Winter</option>
		    <option value="Unknown">Unknown</option>
		    <option value="Spring">Spring</option>
		</c:when>
		<c:when test="${param.season eq 'Spring'}">
		    <option value="Spring" selected>Spring</option>
		    <option value="Summer">Summer</option>
		    <option value="Fall">Fall</option>
		    <option value="Winter">Winter</option>
		    <option value="Unknown">Unknown</option>
		</c:when>
		<c:when test="${(param.season eq 'Unknown') or (empty param.season)  }">
		    <option value="Unknown" selected>Unknown</option>
		    <option value="Spring">Spring</option>
		    <option value="Summer">Summer</option>
		    <option value="Fall">Fall</option>
		    <option value="Winter">Winter</option>
		</c:when>
	    </c:choose>
	    </select> <br/>
	    <input type="submit" value="Submit"> <br>
	</form>
    </body>
</html>
