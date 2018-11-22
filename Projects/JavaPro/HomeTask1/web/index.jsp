<%--
  Created by IntelliJ IDEA.
  User: madmor
  Date: 22/11/18
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="WEB-INF/css/cssIndex.css">
    <style><%@include file="WEB-INF/css/cssIndex.css"%></style>
  </head>
  <body>
    <h3>Login</h3>
    <form method="post" id="form" action="/posts">
      <input name="userLogin" id="login" type="text" placeholder="login">
      <br />
      <input name="userPass" id="password" type="password" placeholder="password">
      <br />
      <input id="buttom" type="submit" value="OK">
    </form>
  </body>
</html>
