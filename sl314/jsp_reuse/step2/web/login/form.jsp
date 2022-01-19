<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<tiles:insert page="/WEB-INF/view/layout/layoutPage.jsp">
  <tiles:put name="subTitle" value="Login"/>
  <tiles:put name="body" value="/WEB-INF/view/login/form.jsp"/>
</tiles:insert>
