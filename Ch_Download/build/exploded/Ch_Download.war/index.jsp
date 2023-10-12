<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <a href="https://dysn-deploy.onrender.com/DySnWeb/">
        <button class="Btn">
            <div class="sign"><svg viewBox="0 0 512 512"><path d="M377.9 105.9L500.7 228.7c7.2 7.2 11.3 17.1 11.3 27.3s-4.1 20.1-11.3 27.3L377.9 406.1c-6.4 6.4-15 9.9-24 9.9c-18.7 0-33.9-15.2-33.9-33.9l0-62.1-128 0c-17.7 0-32-14.3-32-32l0-64c0-17.7 14.3-32 32-32l128 0 0-62.1c0-18.7 15.2-33.9 33.9-33.9c9 0 17.6 3.6 24 9.9zM160 96L96 96c-17.7 0-32 14.3-32 32l0 256c0 17.7 14.3 32 32 32l64 0c17.7 0 32 14.3 32 32s-14.3 32-32 32l-64 0c-53 0-96-43-96-96L0 128C0 75 43 32 96 32l64 0c17.7 0 32 14.3 32 32s-14.3 32-32 32z"></path></svg></div>
            <div class="text">Home</div>
        </button>
    </a>
    <h1>List of albums</h1>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:if test="${cookie.firstNameCookie.value != null}">
        <p>Welcome back, <c:out value='${cookie.firstNameCookie.value}'/></p>
    </c:if>
    <p>
        <a href="download?action=checkUser&amp;productCode=8601">
            Khoi My
        </a><br>

        <a href="download?action=checkUser&amp;productCode=pf01">
            Paddlefoot - The First CD
        </a><br>

        <a href="download?action=checkUser&amp;productCode=pf02">
            Paddlefoot - The Second CD
        </a><br>

        <a href="download?action=checkUser&amp;productCode=jr01">
            Joe Rut - Genuine Wood Grained Finish
        </a>
    </p>

</body>
</html>
