<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 08/11/2023
  Time: 7:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 class="text-4xl my-5 text-center ">Danh sách khách hàng</h1>
<div class="flex  justify-center  ">
    <table class="border-collapse justify-center w-1/2 text-center">
        <thead>
        <tr class="border border-state-300 bg-slate-200">
            <th class="border border-state-300">Tên</th>
            <th class="border border-state-300">Ngày Sinh</th>
            <th class="border border-state-300">Địa chỉ</th>
            <th class="border border-state-300">Ảnh</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${customers}">
        <tr class="border border-state-300">
            <td class="border border-state-300">${item.fullName}</td>
            <td class="border border-state-300">${item.birthDay}</td>
            <td class="border border-state-300">${item.address}</td>
            <td class="border border-state-300 w-20 h-20">
                <img class="object-cover w-full h-full" src="${item.image}" alt="">
            </td>
        </tr>
        </c:forEach>
    </table>
</div>
</tbody>
<script src="https://cdn.tailwindcss.com"></script>
</body>
</html>
