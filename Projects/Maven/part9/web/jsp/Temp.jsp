<%@ page import="jsp.Person" %><%--
  Created by IntelliJ IDEA.
  User: madmor
  Date: 18/10/18
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="person" class="jsp.Person" />
    <% Person person1 = new Person(); %>
    <jsp:setProperty name="person" property="name" value="Vova"/>
    <jsp:getProperty name="person" property="name"/>
</body>
</html>
