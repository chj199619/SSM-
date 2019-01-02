<%--
  Created by IntelliJ IDEA.
  User: huwei
  Date: 2018-12-29
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>empNo</th>
            <th>ename</th>
            <th>job</th>
            <th>sal</th>
            <th>common</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach begin="0" items="${empList}" var="emp">
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.sal}</td>
            <td>${emp.common}</td>
            <td>${emp.common}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
