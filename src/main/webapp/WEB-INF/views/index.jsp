<%--
  Created by IntelliJ IDEA.
  User: tam
  Date: 15/08/2021
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>

<a href="/create">create</a>
<table th:each="c,loop : ${list}">
  <tr th:object="${c}">
    <td th:utext="${loop.index + 1}"></td>
    <td th:utext="*{id}"></td>
    <td th:utext="*{name}"></td>
    <td th:utext="*{email}"></td>
    <td><a th:href="@{/edit(index=${loop.index})}">edit</a></td>
    <td><a th:href="@{/delete(index=${loop.index})}">delete</a></td>
    <td><a th:href="@{/customer(id=${c.id},name = ${c.name})}">abc</a></td>

  </tr>
</table>


</body>
</html>
