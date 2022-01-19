<html>

<head>
<title>Example JSP Page</title>
</head>

<body bgcolor='white'>

<b>Table of numbers squared:</b>

<table border='1' cellspacing='0' cellpadding='5'>
<tr><th>number</th><th>squared</th></tr>
<% for ( int i=0; i<10; i++ ) { %>
<tr><td><%= i %></td><td><%= (i * i) %></td></tr>
<% } %>
</table>

</body>

</html>
