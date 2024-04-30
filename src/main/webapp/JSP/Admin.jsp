<%@page import="modelo.TrabajadorDTO" %>
	<%@page import="java.util.List" %>
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
			<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
			<html>

			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
					integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
					crossorigin="anonymous">
				<link rel="stylesheet" href="./CSS/Admin.css">
				<title>Insert title here</title>
			</head>

			<body>

				<% List<TrabajadorDTO> trabajadores = (List<TrabajadorDTO>) request.getAttribute("trabajadores");
						%>


						<section class="">
							<article class="">
								<form action=""  name="frm-admin">
									<fieldset>
										<legend>Trabajadores</legend>
										<section class="d-flex ">
											<div class="form-floating ">
												<input type="text" name="nombre" id="nombre" placeholder="nombre"
													class="form-control">
												<label for="nombre">Nombre</label>
											</div>
											<div class="form-floating ">
												<input type="text" name="apellido" id="apellido" placeholder="apellido"
													class="form-control">
												<label for="apellido">Apellido</label>
											</div>
											<div class="form-floating ">
												<input type="text" name="puesto" id="puesto" placeholder="puesto"
													class="form-control">
												<label for="puesto">Cargo</label>
											</div>
											<div class="form-floating ">
												<input type="date" name="fechaNac" id="fechaNac" class="form-control">
												<label for="fechaNac">Fecha Nac</label>
											</div>
											<div class="form-floating ">
												<input type="" name="genero" id="genero" class="form-control">
												<label for="genero">Genero</label>
											</div>
											<div class="form-floating ">
												<input type="text" name="direccion" id="direccion" class="form-control">
												<label for="direccion">Direccion</label>
											</div>
											<div class="form-floating ">
												<input type="number" name="telefono" id="telefono" class="form-control">
												<label for="telefono">Telefono</label>
											</div>
											<div class="form-floating ">
												<input type="email" name="email" id="email" class="form-control">
												<label for="email">Email</label>
											</div>
											<div class="form-floating ">
												<input type="number" name="salario" id="salario" class="form-control">
												<label for="">Salario</label>
											</div>
											<div class="form-floating ">
												<input type="password" name="contrasenia" id="contrasenia"
													class="form-control">
												<label for="contrasenia">Contrase�a</label>
											</div>
											<div>
												<button class="btn btn-outline-secondary ">Agregar</button>
											</div>
										</section>
									</fieldset>
								</form>
							</article>



							<section id="tableContainer">
								<table border="1" id="productsTable" class="table table-success table-striped table-hover">
									<thead>
										<tr>
											<th>Id</th>
											<th>DNI</th>
											<th>NOMBRE</th>
											<th>APELLIDO</th>
											<th>PUESTO</th>
											<th>FECHA_NAC</th>
											<th>GENERO</th>
											<th>DIRECCION</th>
											<th>TELEFONO</th>
											<th>EMAIL</th>
											<th>SALARIO</th>
											<th>CONTRASE�A</th>
											<th></th>
										</tr>
									</thead>
									<tbody class="table-group-divider">
										<% for (TrabajadorDTO trabajador : trabajadores) { out.println("<tr>");
											out.println("<td>"+trabajador.getId()+"</td>");
											out.println("<td>"+trabajador.getDni() +"</td>");
											out.println("<td>"+trabajador.getNombre() +"</td>");
											out.println("<td>"+trabajador.getApellido() +"</td>");
											out.println("<td>"+trabajador.getIdPuesto() +"</td>");
											out.println("<td>"+trabajador.getFechaNacimiento() +"</td>");
											out.println("<td>"+trabajador.getGenero() +"</td>");
											out.println("<td>"+trabajador.getDireccion() +"</td>");
											out.println("<td>"+trabajador.getTelefono() +"</td>");
											out.println("<td>"+trabajador.getEmail() +"</td>");
											out.println("<td>"+trabajador.getSalario() +"</td>");
											out.println("<td>"+trabajador.getContrasenia() +"</td>");
											out.println("</tr>");
											}

											%>
									</tbody>
								</table>
							</section>

						</section>
						<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
						<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"></script>
	<script src="./JS/ValidacionAdmin.js"></script>					
			</body>
			</html>