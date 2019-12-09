<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2019/11/24
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>新增学员</title>
</head>
<body>
<h1>新增学员</h1>

<p>
    年级：
    <select>
<c:forEach items="${requestScope.grades}" var="grade">
    <option value="${grade}">${grade}</option>
</c:forEach>
    </select>
</p>


<p>*******************************************</p>
<p>
<f:form action="${ctx}/student/saveadd" modelAttribute="students" method="post">
    姓名：<f:input path="name"></f:input><f:errors path="name"/> </br>
    年龄：<f:input path="age"></f:input><f:errors path="age"/> </br>
    <input type="submit" value="提交">
</f:form>

</p>






</body>
</html>
