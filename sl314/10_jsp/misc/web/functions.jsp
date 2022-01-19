<%@ taglib uri="/WEB-INF/taglib.tld" prefix="text" %>

<HTML>
<HEAD><TITLE>Functions in EL</TITLE></HEAD>
<BODY>
<H1>Functions in EL</H1>
\${text:uppercase(text:randomize(param.name))} -&gt;
${text:uppercase(text:randomize(param.name))}
<P>
<FORM METHOD='GET' ACTION='functions.jsp'>
Enter name: <INPUT TYPE='text' NAME='name'><INPUT TYPE='submit' VALUE='submit'>
</FORM>
</BODY>
</HTML>
