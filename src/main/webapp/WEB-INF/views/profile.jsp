<?xml version="1.0" encoding="UTF-8"?>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/style.css" />" >
</head>
<body>
    <h1><s:message code="spittr.profile"></h1>
    <c:out value="${spitter.username}" /><br/>
    <c:out value="${spitter.firstName}" />
    <c:out value="${spitter.lastName}" /><br/>
</body>
</html>
