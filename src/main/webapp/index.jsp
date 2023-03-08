<%@ include file="./config/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h1 class="text-center">Bienvenido a la aplicacion de gestion de material escolar</h1>
  <p>Por favor seleccione una opción:</p>
  <a href="<c:url value="/listAlumnos"/>">Navegar a alumnos</a>
  <br>
  <a href="<c:url value="/portatiles"/>">Navegar a portatiles</a>
</div>
</html>