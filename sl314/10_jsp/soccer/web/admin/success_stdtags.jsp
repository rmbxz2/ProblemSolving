<%@ page session="false" %>

<%
    // Set page title
    String pageTitle = "Duke's Soccer League: Add League Success";
%>

<%-- Retrieve the 'league' from the request-scope --%>
<jsp:useBean id="league" scope="request" type="sl314.model.League" />

<%-- Generate the HTML response --%>
<html>
<head>
  <title><%= pageTitle %></title>
</head>
<body bgcolor='white'>

<%-- Generate page heading --%>
<!-- Page Heading -->
<table border='1' cellpadding='5' cellspacing='0' width='400'>
<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
  <td><h3><%= pageTitle %></h3></td>
</tr>
</table>

<%-- Generate main body --%>
<p>
Your request to add the <i><jsp:getProperty name="league" property="title" /></i>
league was successful.
</p>

</body>
</html>
