<html>

<head>
<title>Hello JSP Broken at Runtime</title>
</head>

<body bgcolor='white'>

<%
    String customerName = request.getParameter("customerName");
    if ( customerName.length() == 0 ) {
%>
<b>Hello, World</b>
<%
    } else {
%>
<b>Hello, <%= customerName %></b>
<%
    }
%>

</body>

</html>
