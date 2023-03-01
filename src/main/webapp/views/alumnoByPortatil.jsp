<%@ include file="../config/header.jsp" %>
<html>
<head>
    <title>Buscar alumno por port�til</title>
</head>
<body>
    <h1>Buscar alumno por port�til</h1>

    <form method="GET" action="findAlumnoByPortatil">
        <label>C�digo del port�til:</label>
        <input type="text" name="codPortatil" />
        <button type="submit">Buscar</button>
    </form>

    <hr />

    <c:if test="${not empty alumno}">
        <p>El alumno asignado al port�til es: ${alumno.nombreCompleto} (C�digo: ${alumno.codAlumno})</p>
    </c:if>

    <c:if test="${not empty mensaje}">
        <p>${mensaje}</p>
    </c:if>
</body>
</html>