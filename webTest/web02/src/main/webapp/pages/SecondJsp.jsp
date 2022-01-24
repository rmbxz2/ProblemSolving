<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--  http://localhost:8080/web8/html/addJsp.html --%>
<%--  http://localhost:8080/web8/html/SecondJsp.jsp --%>

<br/> ===========get property============= <br/>

<jsp:useBean id= "cust"
	     scope="session" 
	     class="test.CustomerBean"  />
<%--  

<% 
out.println("name "+cust.getName()+ " <br/>");
out.println("email "+cust.getEmail()+ " <br/>");
out.println("phone "+cust.getPhone()+ " <br/>");
%> 

name:  <jsp:getProperty name="cust" property="name" /> <br/>
email: <jsp:getProperty name="cust" property="email" /> <br/>
phone: <jsp:getProperty name="cust" property="phone" /> <br/>


error   <jsp:getProperty name="cust" property="*" />
--%>

${cust.name}   <br/>
${sessionScope.cust.email}  <br/>
${sessionScope.cust.phone}  <br/>


${name}   <br/> no 
${email}  <br/> no 
${phone}  <br/> no 

<br/> =======El 1================= <br/>

second page <br/>

name = ${pageScope.name} <br/> 
age = ${requestScope.age} <br/>
gender = ${sessionScope.gender} <br/>
address = ${applicationScope.address} <br/>
<br/> =======EL 2=============<br/>
name=  <c:out value= "${pageScope.name}"  /> <br/>
age=  <c:out value= "${requestScope.age}"  /> <br/>
gender=  <c:out value= "${sessionScope.gender}"  /> <br/>
address=  <c:out value= "${applicationScope.address}"  /> <br/>
<br/> ====================<br/>

<br/> ========EL 3================ <br/>

wow second page <br/>

name = ${name} <br/> 
age = ${age} <br/>
gender = ${gender} <br/>
address = ${address} <br/>



<br/> =========EL 4=============== <br/>

${myScope} <br/>
${myScope} <br/>
${myScope} <br/>
${myScope} <br/>
