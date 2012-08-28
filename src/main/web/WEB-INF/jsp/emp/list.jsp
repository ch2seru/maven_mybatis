<%--
  Subject : 
  User: lke
  Date: 12. 3. 26
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table>
<c:forEach varStatus="num" var="emp" items="${empList}">
<tr>
    <td>${emp.empno}<a href="/info/${emp.empno}">view</a> | </td>
    <td>${emp.ename}</td>
    <td>${emp.mgr}</td>
</tr>
</c:forEach>
</table>

