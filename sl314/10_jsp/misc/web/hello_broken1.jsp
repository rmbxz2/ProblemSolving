<%! private static final String DEFAULT_NAME = "World"; %>

<%@ %>

<html>

<head>
<title>Hello JSP Broken at Translation</title>
</head>

<%-- Determine the specified name (or use default) --%>
<%
    String name = request.getParameter("name");
    if ( (name == null) || (name.length() == 0) ) {
      name = DEFAULT_NAME;
    }
%>

<body bgcolor='white'>

<b>Hello, <%= name %></b>

</body>

</html>
