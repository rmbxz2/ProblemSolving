<html>

<head>
<title>Hello JSP Broken at Compilation</title>
</head>

<body bgcolor='white'>

<%
    String name = request.getParameter("name");
    if ( (name == null) || (name.length() == 0) ) {
%>
<b>Hello, World</b>
<%
    } else {
%>
<b>Hello, <%= name %></b>

</body>

</html>
