<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 08/11/2023
  Time: 8:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="calculator" method="post">
    <h1 class="text-4xl text-center">Simple Calculator</h1>
    <label class="w-5">First operand: </label>
    <input type="text" name="first-operand" class="border rounded-md">  <br>
    <label class="w-5">Operation: </label>
    <select name="operation" id="operation" class="border rounded-md">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">x</option>
        <option value="/">/</option>
    </select>
    <br>
    <label class="w-5">Second operand: </label>
    <input type="text" name="second-operand" class="border rounded-md"> <br>
    <input type="submit" value="Cal" class="py-2 px-5 bg-state-200 border ra">
</form>
<script src="https://cdn.tailwindcss.com"></script>
</body>
</html>
