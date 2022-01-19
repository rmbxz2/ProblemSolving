<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<h1>Struts 2 Hello World Example</h1>


<form action="Welcome" method="post">
    Username3:    <input type="text"     name="username" /> <br/>
    PassWord3:    <input type="password" name="password" /> <br/>
    <input type="submit" value="Submit"> 
</form>

<!-- 
     <s:form action="Welcome" >
     <s:textfield name="username" label="Username"/>
     <s:password name="password" label="Password"/>
     <s:submit/>
     </s:form>
-->

</body>
</html>
