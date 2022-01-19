<jsp:useBean id="cust" scope="request"
     class="sl314.beans.CustomerBean">
  <%
    cust.setName(request.getParameter("name"));
    cust.setEmail(request.getParameter("email"));
    cust.setPhone(request.getParameter("phone"));
  %>
</jsp:useBean>

<HTML>
<HEAD>
<TITLE>Customer Display Page</TITLE>
</HEAD>
<BODY>
<H2>Customer Information:</H2>
Name: <jsp:getProperty name="cust" property="name" /><BR>
Email: <jsp:getProperty name="cust" property="email" /><BR>
Phone: <jsp:getProperty name="cust" property="phone" /><BR>
</BODY>
