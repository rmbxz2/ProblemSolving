  <%-- use a directive to import a Java class --%>
<%@ page import="java.util.Date" %>

<HTML>

  <%-- use a declarative to declare a variable --%>
<%! private Date d; %>

<HEAD><TITLE>Today's Date</TITLE></HEAD>

<BODY>

  <%-- use a scriptlet to execute request-time code --%>
<% d = new Date(); %>

  <%-- use an expression to insert dynamic text --%>
Today is <%= d.toString() %>

</BODY>

</HTML>
