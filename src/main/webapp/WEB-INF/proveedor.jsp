<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Proveedores</title>
</head>
<body>
	<form action="/" method="POST">
		<label for="nombre">Nombre:</label>
		<input type="text" name="nombre" id="nombre"> <br>
		<label for="apellido">Apellido: </label>
		<input type="text" name="apellido" id="apellido"> <br>
		<label for="email">Email: </label>
		<input type="email" name="email" id="email"> <br>
		<label for="edad">edad: </label>
		<input type="text" name="edad" id="edad"> <br>
		<input type="submit" value="Enviar">	

	</form>
</body>
</html>