<%--
  Subject : 
  User: lke
  Date: 12. 3. 26
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- <검색> -->
<form:form method="post" action="/index" commandName="search" name="searchForm">
    <form:hidden path="page_num" id="page_num" value="${param.page_num}"/>
    <div>
        <form:select path="search_column">
            <form:option value="title">제목</form:option>
            <form:option value="writer">작성자</form:option>
        </form:select>
        <form:input path="search_keyword" value="${param.search_keyword}" onchange="changeKeyword()"/><a href="Javascript:search()"><span class="label label-info"><i class="icon-search icon-white"></i>검색</span></a>
    </div>
</form:form>
<!-- </검색> -->
<table class="table table-bordered">
<c:forEach varStatus="num" var="emp" items="${empList}">
<tr>
    <td>${emp.empno}<a href="/info/${emp.empno}">view</a> | </td>
    <td>${emp.ename}</td>
    <td>${emp.mgr}</td>
</tr>
</c:forEach>
</table>
<!-- </리스트> -->
<!-- <페이징> -->
<!-- totalCount:총 데이터 개수 -->
<!-- currentPage:현재 페이지-->
<!-- pageSize:한화면에 보일 데이터 개수 -->
<c:import url="/WEB-INF/jsp/include/paging.jsp">
    <c:param name="totalCount" value="${totalCount}"/>
    <c:param name="currentPage" value="${param.page_num}"/>
</c:import>
<!-- </페이징> -->
<!-- <링크> -->
<form name="linkForm"  action="/emp/info" method="post">
    <input type="hidden" name="empno"/>
</form>
<!-- </링크> -->
