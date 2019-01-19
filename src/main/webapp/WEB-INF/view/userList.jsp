
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>客户列表</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="/js/jquery.min.js" ></script>
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap-datetimepicker.min.css">
    <script type="text/javascript" src="/bootstrap/js/bootstrap-datetimepicker.min.js"></script>
    <script type="text/javascript" src="/bootstrap/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
    <script type="text/javascript">
        function search(currentPage) {

            if(currentPage == null){
                var currentPage = $("#currentPage").val();
            }else{
                var currentPage = currentPage;
            }
            var url = "/aa.do?currentPage="+currentPage;
            window.location.href = url;
        };

    </script>
</head>
<body>
<div class="modal-body">
    <input type="hidden" name="currentPage" id="currentPage" value="${currentPage}">
    <h1>欢迎您：</h1>
    <table class="table table-hover table-bordered">
        <thead style="background-color: #c4e3f3">
        <tr>
            <th>编号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>邮件</th>
            <th>联系电话</th>
            <th>职位</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach begin="0" items="${userList}" var="user" end="${userList.size()}" step="1">
            <tr>
                <td><strong>${user.USERID}</strong></td>
                <td><strong>${user.USERNAME}</strong></td>
                <td><strong>${user.PASSWORD}</strong></td>
                <td><strong>${user.EMAIL}</strong></td>
                <td><strong>${user.PHONE}</strong></td>
                <td><strong>${user.ROLENAME}</strong></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%--<span>第1/4总记录数：每页显示2</span> &nbsp; 1 [2] [3] [4] [下一页] [尾页]--%>
<!--分页具体实现-->

    <%--<nav aria-label="Page navigation">--%>
        <%--&lt;%&ndash;<ul class="pagination">&ndash;%&gt;--%>
            <%--<span>第${currentPage}/<span>${pm.getTotalPageNum()}</span>总记录数：每页显示2</span> &nbsp;--%>
            <%--<span onclick="search(${pm.startPage})"><a href="#"><apan>[首页]</apan></a></span>&nbsp;&nbsp;--%>
            <%--<span  onclick="search(${pm.prePageNum})">--%>
                <%--<a href="#"  aria-label="Previous">--%>
                    <%--<span aria-hidden="true">[上一页]</span>--%>
                <%--</a>--%>
            <%--</span>&nbsp;&nbsp;--%>
            <%--<c:forEach step="1" var="i" begin="1" end="${pm.totalPageNum}">--%>
                <%--<span onclick="search(${i})"><a href="#"><span <c:if test="${i==pm.currentPageNum}"> style = 'color:red;' </c:if>> ${i}</span></a></span>&nbsp;&nbsp;--%>
            <%--</c:forEach>--%>

            <%--<span onclick="search(${pm.nextPageNum})">--%>
                <%--<a href="#" class="page"  aria-label="Next">--%>
                    <%--<span aria-hidden="true">[下一页]</span>--%>
                <%--</a>--%>
            <%--</span>&nbsp;&nbsp;--%>
            <%--<span onclick="search(${pm.endPage})"><a href="#"><span>[尾页]</span></a></span>--%>
        <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
    <%--</nav>--%>
<center>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li  onclick="search(${pm.startPage})"><a href="#"><apan>首页</apan></a></li>
            <li  onclick="search(${pm.prePageNum})">
                <a href="#"  aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <c:forEach step="1" var="i" begin="1" end="${pm.totalPageNum}">
                <li onclick="search(${i})"><a href="#"><span <c:if test="${i==pm.currentPageNum}"> style = 'color:red;' </c:if>> ${i}</span></a></li>
            </c:forEach>
            <li onclick="search(${pm.nextPageNum})">
                <a href="#" class="page"  aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
            <li onclick="search(${pm.endPage})"><a href="#"><span>尾页</span></a></li>
        </ul>
    </nav>
</center>


</body>
</html>
