<HTML>
<HEAD><TITLE>Request</TITLE></HEAD>
<BODY>
<jsp:useBean id="color2"
             scope="request"
             class="sl314.beans.ColorBean">
  <H3>page2: bean created with default colors</H3>
</jsp:useBean>

<TABLE WIDTH="100%" BGCOLOR='#<jsp:getProperty name="color2" property="hexValue" />'>
<TR><TD>
<H2>Page 2 Content</H2>
red: <jsp:getProperty name="color2" property="red" />
green: <jsp:getProperty name="color2" property="green" />
blue: <jsp:getProperty name="color2" property="blue" />
</TD></TR>
</TABLE>

</BODY>
</HTML>
