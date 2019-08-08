<%--
  Created by IntelliJ IDEA.
  User: Mechrevo
  Date: 2019/8/5
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>show</title>
</head>
<body>
<s:debug></s:debug>
show
${userList}
${msg}
11111
<hr>
<s:property value="#session.userList" ></s:property>
<s:property value="#session.msg" ></s:property>
<hr>
<div>
<s:iterator var="#session.userList" value="user">
    <s:property value="username" />----<s:property value="user.password"/>
</s:iterator>
</div>
</body>
</html>
