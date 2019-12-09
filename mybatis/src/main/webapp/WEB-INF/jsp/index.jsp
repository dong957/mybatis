<%@ page contentType="text/html; UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="s" uri="http://shiro.apache.org/tags" %>
<html>
<body>
<h2>Hello World!</h2>
<%--<h1>登录页面</h1>
${message}
<form id="loginForm" action="<%=request.getContextPath()%>/login" method="post">
    <input type="text" id="username" name="username"/> <br/>
    <input type="text" id="password" name="password"/>  <br/>
    <input type="submit" value="登录"/>
</form>--%>
<ul>
    <li><img src="<%=request.getContextPath()%>/static/images/-7a9677269938fc90.jpg"> </li>

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
</body>
</html>
