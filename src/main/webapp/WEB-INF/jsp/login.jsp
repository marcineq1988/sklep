<html>
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/webapp/css/main.css" />

    <link type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" />

</head>
<body>

<header style="border: #0000FF 1px solid">
    <ul style="list-style: none">
        <li style="display:inline; background-color: beige"> <a href="/">Strona glowna</a></li>
        <li style="display:inline; background-color: blanchedalmond"> Cos innego</li>
        <li style="display:inline; background-color: beige"> Cos jeszcze innego</li>
        <li style="display:inline; background-color: blanchedalmond"> Kontakt</li>
        <li style="display:inline; background-color: blanchedalmond"> <a href="toLoginPage">Logowanie/rejestracja</a></li>
    </ul>
</header>

<div class="container">

    <form:form id="loginForm" modelAttribute="user" action="loginUser" method="post">
        <table>
            <tr>
                <td><form:label path="login">Login:</form:label></td>
                <td><form:input path="login"/></td>
            </tr>
            <tr>
                <td><form:label path="password">Haslo:</form:label></td>
                <td><form:input path="password"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Zaloguj sie"/></td>
            </tr>
        </table>
    </form:form>

</div>

</body>

</html>