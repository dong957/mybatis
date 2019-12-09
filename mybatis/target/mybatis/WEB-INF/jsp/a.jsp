<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2019/11/20
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s"  uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <img src="<%=request.getContextPath()%>/static/images/u=4094079363,1295839208&fm=26&gp=0.jpg"/>
</p>
<ul>


    <s:hasRole name="管理员">
        <a href="<%=request.getContextPath()%>/i18n/change"><t:message code="language" /></a>
    </s:hasRole>
    <li><a href="<%=request.getContextPath()%>/student/add"><t:message code="stu.add"/> </a> </li>

    <s:hasPermission name="bookmanager:book:add">
        <li><a href="#">书本查询</a></li>
    </s:hasPermission>
    <s:hasPermission name="bookmanager:book:add">
        <li><a href="#">书本新增</a></li>
    </s:hasPermission>
    <s:hasPermission name="bookmanager:book:edit">
        <li><a href="#">书本修改</a></li>
    </s:hasPermission>
    <s:hasPermission name="bookmanager:book:del">
        <li><a href="#">书本删除</a></li>
    </s:hasPermission>



    <h1>用于演示权限注解</h1>
    <li><a href="<%=request.getContextPath()%>/bookmanager/book/query"/> 查询书本</a> </li>
    <li><a href="<%=request.getContextPath()%>/bookmanager/book/add">新增书本 </a> </li>
    <li><a href="<%=request.getContextPath()%>/bookmanager/book/edit">修改书本 </a> </li>
    <li><a href="<%=request.getContextPath()%>/bookmanager/book/del"/> 删除书本</a> </li>


</ul>
<%--
<ul>
 &lt;%&ndash;   <li><a href="<%=request.getContextPath()%>/student/add">新增学员</a> </li>&ndash;%&gt;
     <li><a href="<%=request.getContextPath()%>/student/add"><t:message code="stu.add"/> </a> </li>
</ul>--%>
<li><a href="<%=request.getContextPath()%>/i18n/change"><t:message code="language"/> </a> </li>

<a href="<%=request.getContextPath()%>/uploadFile">文件上传</a>

<%--<p>
    <img src="<%=request.getContextPath()%>/static/images/-7a9677269938fc90.jpg"/>
</p>--%>



<table border="1px" style="text-align: center">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${requestScope.students}" var="students">
        <tr>
            <td>${students.sid}</td>
            <td>${students.name}</td>
            <td>${students.age}</td>
            <td>   <a href="<%=request.getContextPath()%>/student/update?sid=${students.sid}">修改学生</a>  </td>

        </tr>
    </c:forEach>


</table>


<%-- <c:forEach items="${requestScope.grades}" var="grade">
     <option value="${grade}">${grade}</option>
 </c:forEach>--%>





</body>
</html>
