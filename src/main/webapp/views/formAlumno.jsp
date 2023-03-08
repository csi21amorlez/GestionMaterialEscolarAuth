<%@ include file="../config/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<h1>Formulario de Alumno</h1>
		<form method="post" action="guardarAlumno">
			<div class="form-group">
				<label for="nombreCompleto">Nombre Completo</label> <input
					type="text" class="form-control" id="nombreCompleto"
					path="nombreCompleto"
					name="nombreCompleto" placeholder="Nombre completo" required>
			</div>

			<div class="form-group">
				<label for="numeroTelefono">N�mero de tel�fono</label> <input
					path="numeroTelefono" type="text" class="form-control"
					id="numeroTelefono" name="numeroTelefono"
					placeholder="N�mero de tel�fono" required>
			</div>

			<div class="form-group">
				<label for="codigoAlumno">C�digo de Alumno</label> <input
				path="codAlumno"
					type="text" class="form-control" id="codigoAlumno"
					name="codigoAlumno" placeholder="C�digo Alumno" required>
			</div>

			<div class="form-group">
				<label for="portatilId">Port�til asignado</label> <select
					class="form-control" id="portatilId" name="portatilId" path="portatilId">
					<c:forEach items="${model.listPortatil}" var="portatil">
						<option value="${portatil.id}">${portatil.marca}
							${portatil.modelo} (${portatil.codigo})</option>
					</c:forEach>
				</select>
			</div>

			<button type="submit" class="btn btn-primary">Guardar</button>
		</form>
	</div>

</body>
</html>
