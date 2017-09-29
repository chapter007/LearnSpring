
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>
</head>
<body>
<fieldset><legend>登录</legend>
    <form:form commandName="student" action="loginCheck" method="post">
        <ul>
            <li><form:label path="sname">用户名:</form:label><form:input
                    path="sname" /></li>
            <li><form:label path="sno">密码:</form:label><form:password
                    path="sno" /></li>
            <li>
                <button type="submit">登录</button>
                <button type="reset">重置</button>
            </li>
        </ul>
    </form:form>
</fieldset>

</body>
</html>
