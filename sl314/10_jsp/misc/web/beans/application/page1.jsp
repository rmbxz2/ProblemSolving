<HTML>
<HEAD><TITLE>Application</TITLE></HEAD>
<BODY>
<jsp:useBean id="color4"
             scope="application"
             class="sl314.beans.ColorBean">
  <H3>page1: bean created with request colors</H3>

  <jsp:setProperty name="color4" property="*" />

</jsp:useBean>

<TABLE WIDTH="100%" BGCOLOR='#<jsp:getProperty name="color4" property="hexValue" />'>
<TR><TD>
<H2>Page 1 Content</H2>
red: <jsp:getProperty name="color4" property="red" />
green: <jsp:getProperty name="color4" property="green" />
blue: <jsp:getProperty name="color4" property="blue" />
</TD></TR>
</TABLE>

<blockquote>
  <jsp:include page="page2.jsp" />
</blockquote>

<A HREF="page2.jsp">Request directly to page2</A>

</BODY>
</HTML>
