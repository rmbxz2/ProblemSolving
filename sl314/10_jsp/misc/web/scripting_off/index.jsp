<HTML>
<HEAD>
<TITLE>index</TITLE>
</HEAD>
<BODY>
<H1>This page has scripting turned off in the web.xml deployment descriptor</H1>

<%
  for(int i=1;i<=10;i++) {
%>
  <%= i %> <%= Math.pow(i,2) %><BR>
<%
  }
%>

</BODY>
