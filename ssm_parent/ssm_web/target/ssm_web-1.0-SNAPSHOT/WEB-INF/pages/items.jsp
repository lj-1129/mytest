<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>新增/查询</title>
</head>
<body>
<table>
    <form action="/items/save" method="post">
        <table>
            <tr>
                <td>名称</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>价格</td>
                <td><input type="text" name="price"/></td>
            </tr>
            <tr>
                <td>图片</td>
                <td><input type="text" name="pic"/></td>
            </tr>
            <tr>
                <td>创建日期</td>
                <td><input type="text" name="createtime"/></td>
            </tr>
            <tr>
                <td>详情</td>
                <td><input type="text" name="detail"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交"/>
                </td>
            </tr>
        </table>
    </form>
</table>
<hr>
<table border="1">
    <tr>
        <td>IDssss</td>
        <td>name</td>
        <td>price</td>
        <td>pic</td>
        <td>createTime</td>
        <td>detail</td>
        <td></td>
    </tr>
    <c:forEach items="${list}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.price}</td>
            <td>${list.pic}</td>
            <td>${list.createtime}</td>
            <td>${list.detail}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>