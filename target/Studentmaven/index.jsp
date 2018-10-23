<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录</title>
</head>

<body>
    <form action="${pageContext.request.contextPath}/login.action" method="post" id="user">
        <input type="text" id="username" name="username"/>
        <input type="password" id="password" name="password"/>
        <input type="submit" value="提交" id="login" />
    </form>
</body>

</html>
