<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2019/11/27
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/upload" enctype="multipart/form-data" method="post">

    <input type="file" name="img"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
