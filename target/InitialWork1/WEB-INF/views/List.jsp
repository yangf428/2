<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2017/11/29
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户个数</title>
</head>
<body>
<%
    public void listAllUsers()throws Exception {
    List<User> list = userService.listAllUsers();
    if (list == null || list.size() <= 0){
    return;
    }


    for (User user : list){
    System.out.println(user.getUserName());
    }

    for (User user:list){
    System.out.println(user.getId());
    }
%>

<form>

</form>
</body>
</html>
