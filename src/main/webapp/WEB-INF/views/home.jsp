<?xml version="1.0" encoding="UTF-8"?>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
            type="text/css"
            href="<c:url value="/resources/style.css" />">
</head>
    <h1><s:message code="spittr.welcome" /></h1>
    <a href="<c:url value="/spittles" />">Spittles</a> |
    <a href="<c:url value="/spitter/register" />"><s:message code="spittr.register" /></a>
</body>
</html>
