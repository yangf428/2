<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2017/11/26
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>register</title>
</head>
<body>
<form action="${website}doregister" method="post">
    <table border="1">
        <tr>
            <td>登录名：</td>
            <td><input name="userName"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input name="password" type="password"></td>
        </tr>
        <tr>
            <td>重复密码：</td>
            <td><input name="conPassword" type="password"></td>
        </tr>
        <tr align="center">
            <td colspan="2"><input type="submit" value="提交注册"></td>
        </tr>
    </table>
</form>

</body>
</html>
