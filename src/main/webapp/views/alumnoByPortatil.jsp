<%@ include file="../config/header.jsp" %>
<html>
<head>
    <title>Buscar alumno por port�til</title>
</head>
<body class="container">

    <div class="row">
        <div class="col-md-6 offset-md-3">
            <h1 class="my-5">Buscar alumno por port�til</h1>

            <form method="GET" action="findAlumnoByPortatil" class="my-4">
                <div class="form-group">
                    <label for="codPortatil">C�digo del port�til:</label>
                    <input type="text" name="codPortatil" id="codPortatil" class="form-control" />
                </div>
                <button type="submit" class="btn btn-primary">Buscar</button>
            </form>

            <hr />

            <c:if test="${not empty alumno}">
                <p>El alumno asignado al port�til es: ${alumno.nombreCompleto} (C�digo: ${alumno.codAlumno})</p>
            </c:if>

            <c:if test="${not empty mensaje}">
                <p>${mensaje}</p>
            </c:if>
        </div>
    </div>

</body>
</html>
