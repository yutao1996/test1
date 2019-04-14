<%--
  Created by IntelliJ IDEA.
  User: sun
  Date: 2018/11/26
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${cust.cName}
    
    <form action="/ssm_zh/cus/register" method="get">
    用户名<input type="text" name="custId" value="">
    密码<input type="text" name="cName" value="">
    <input type="submit" value="提交">
    </form>
</body>
</html>
