<%--
  Subject : 
  User: lke
  Date: 12. 4. 3
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="post" action="/save" commandName="emp" name="saveForm">
    <table>
        <tr>
            <td>empno</td>
            <td><form:input path="empno"></form:input>
                <c:if test="${emp.empno ne '0'}"><a href="/delete/${emp.empno}">delete</a></c:if>
            </td>
        </tr>
        <tr>
            <td>ename</td>
            <td><form:input path="ename"></form:input></td>
        </tr>
        <tr>
            <td>mgr</td>
            <td><form:input path="mgr"></form:input></td>
        </tr>
    </table>
</form:form>
<c:if test="${emp.empno eq '0' or emp.empno eq null}"><a href="Javascript:save();">save</a></c:if>
<c:if test="${emp.empno ne '0'}"><a href="Javascript:modify();">modify</a></c:if>


