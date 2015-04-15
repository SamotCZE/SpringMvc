<?xml version="1.0" encoding="UTF-8"?>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%--
  Created by IntelliJ IDEA.
  User: hudectom
  Date: 4.4.2015
  Time: 7:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

    <c:forEach items="${spittleList}" var="spittle">
        <li id="spittle_<c:out value="spittle.id"/>">
            <div class="splittleMessage">
                <c:out value="${spittle.message}" />
            </div>
            <div>
                <span class="spittleTime"><c:out value="${spittle.time}"/></span>
                <span class="spittleLocation">
                    <c:out value="${spittle.latitude}"/>
                    <c:out value="${spittle.longitude}"/>
                </span>
            </div>
        </li>
    </c:forEach>

</body>
</html>
