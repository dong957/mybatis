<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2019/11/24
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>修改学员信息</title>
</head>
<body>

<p>
    <f:form action="${ctx}/student/saveupdate" modelAttribute="students" method="post">
        学号：<f:input path="sid"></f:input><f:errors path="sid"/></br>
        姓名：<f:input path="name"></f:input><f:errors path="name"/></br>
        年龄：<f:input path="age"></f:input><f:errors path="age"/></br>
        <input type="submit" value="提交">
    </f:form>

</p>

</body>
</html>
