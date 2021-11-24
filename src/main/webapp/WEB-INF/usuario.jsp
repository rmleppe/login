<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>

<div class="container">

	<form:form method="post" action="/usuario/login" modelAttribute="usuario">
			<form:label path="nombre">Nombre</form:label>
			<form:input type="text" path="nombre"/>
			<br>
			<form:label path="apellido">apellido</form:label>
			<form:input type="text" path="apellido"/>
			<br>
			<form:label path="limite">limite</form:label>
			<form:input type="text" path="limite"/>
			<br>
			<form:label path="codigoPostal">codigoPostal</form:label>
			<form:input type="text" path="codigoPostal"/>
			<input type="button" class="btn btn-secondary" value="Limpiar">
			<input type="submit" class="btn btn-primary" value="Submit">
	
	</form:form> 
			<table class="table">
				  <thead>
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">Nombre</th>
				      <th scope="col">Apellido</th>
				      <th scope="col">Limite</th>
				      <th scope="col">Codigo postal</th>
				      <th scope="col">Acciones</th>
				    </tr>
				  </thead>
				  <tbody>
				  		<c:forEach items="${listaUsuarios}" var="usuario">
				  		<tr>
				  			<th scope="row">${usuario.getId()}</th>
				  			<td>${usuario.getNombre()}</td>
				  			<td>${usuario.getApellido()}</td>
				  			<td>${usuario.getLimite()}</td>
				  			<td>${usuario.getCodigoPostal()}</td>
				  			<td> <form action="/usuario/eliminar">
				  			<input type="hidden" name="id" value="${usuario.getId() }">
				  			<input type="submit" value="Eliminar" class="btn btn-danger">
				  			</form>		</td>
				  			<td> <form action="/usuario/editar">
				  			<input type="hidden" name="id" value="${usuario.getId() }">
				  			<input type="submit" value="Editar" class="btn btn-warning">
				  			</form>		</td>
				  			
				  		</tr>			  		
				  		</c:forEach>  
				  </tbody>			
				</table>
				
	
				
	
	<!-- 	<form method="post" action="/usuario/login">
			<label for="nombre">Nombre:</label>
			<input type="text" id="nombre" name="nombre">
			<br>
			<label for="apellido">Apellido:</label>
			<input type="text" id="apellido" name="apellido">
			<br>
			<label for="limite">Limite:</label>
			<input type="text" id="limite" name="limite">
			<br>
			<label for="codigoPostal">Código Postal:</label>
			<input type="text" id="codigoPostal" name="codigoPostal">
			<br>
			<input type="button" value="Limpiar">
			<input type="submit" value="Submit">			
		</form>  -->
	</div>
</body>
</html>