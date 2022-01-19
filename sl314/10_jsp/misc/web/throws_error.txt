<%@ page session="false" errorPage="error/ExceptionPage.jsp" %>
<%-- This page will cause an "divide by zero" exeception --%>

<HTML>

<HEAD>
<TITLE>Demonstrate Error Pages</TITLE>
</HEAD>

<BODY BGCOLOR='white'>

<OL>
<%
   for ( int i=10; i > -10; i-- ) {
%>
  <LI><%= 100/i %>
<%
   }
%>
</OL>

</BODY>

</HTML>
