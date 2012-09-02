<%--
  Subject : 
  User: lke
  Date: 12. 4. 3
--%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <title><tiles:insertAttribute name="title" /></title>
    <link rel="stylesheet" type="text/css" href="/common/head/style.css" />
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/common/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="/common/bootstrap/css/bootstrap.min.css" />
    <script type="text/javascript" src="/common/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="/common/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/common/bootstrap/js/bootstrap-dropdown.js"></script>
    <tiles:insertAttribute name="head" />
</head>
<body>
<div id="wapper">
    <!--헤더-->
    <header>
        <tiles:insertAttribute name="header" />
    </header>
    <!--헤더-->
    <!--네비게이션-->
    <nav>
        <tiles:insertAttribute name="menu" />
    </nav>
    <!--네비게이션-->
    <!--사이드바-->
    <aside>
        <tiles:insertAttribute name="aside" />
    </aside>
    <!--사이드바-->
    <!--콘텐츠-->
    <section>
        <tiles:insertAttribute name="body" />
    </section>
    <!--콘텐츠-->
    <!--풋터-->
    <footer>
        <tiles:insertAttribute name="footer" />
    </footer>
    <!--풋터-->
</div>
</body>
</html>