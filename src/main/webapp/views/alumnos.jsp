<%@ include file="../config/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de alumnos</title>
<script src="../scripts/script.js"></script>

</head>
<body>
	<div class="container shadow">
		<h1>Listado de alumnos</h1>
		<div class="my-3">
			<a href="<c:url value='findAlumnoByPortatil'/>"
				class="btn btn-primary mr-2">Buscar alumno por portátil</a> <a
				href="<c:url value='navFormAlumno'/>" class="btn btn-primary">Añadir
				nuevo alumno</a>
		</div>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Nombre completo</th>
					<th>Código de alumno</th>
					<th>Número de teléfono</th>
					<th>Portátil asignado</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listAlumno}" var="alumno">
					<tr>
						<td>${alumno.nombreCompleto}</td>
						<td>${alumno.codigoAlumno}</td>
						<td>${alumno.numeroTelefono}</td>
						<td><c:if test="${alumno.portatil != null}">
                                ${alumno.portatil.marca} ${alumno.portatil.modelo} (${alumno.portatil.codigo})
                            </c:if></td>
						<td>
							<form method="post" action="eliminarAlumno" id="eliminarAlumno">
								<input type="hidden" name="alumno" value="${alumno}" />
								<button type="submit" class="btn btn-danger"
									onclick="confirmarEliminacion()">Eliminar</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>