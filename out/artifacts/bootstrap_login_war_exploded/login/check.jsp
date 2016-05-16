<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/5/16
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String mid = request.getParameter("mid");
  String password = request.getParameter("password");
%>
</body>

<h1><%=mid%></h1>
<h1><%=password%></h1>
</html>
