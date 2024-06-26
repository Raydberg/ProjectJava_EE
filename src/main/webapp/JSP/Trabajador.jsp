<%@page import="modelo.ProductoDTO" %>
	<%@page import="java.util.List" %>
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
			<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
			<html>
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<title>Insert title here</title>
				<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
					integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
					crossorigin="anonymous">
				<link rel="stylesheet" href="./CSS/Trabajador.jsp.css">
			</head>
			<body>
				<% List<ProductoDTO> productos = (List<ProductoDTO>) request.getAttribute("productos");
						%>
						<section class="d-flex justify-content-center align-items-center">
							<section class="d-flex flex-column justify-content-center">
								<form action="./ProductoCrear" method="post" name="frm-trabajador">
									<fieldset>
										<legend>Crear</legend>
										<div class="form-floating ">
											<input class="form-control " type="text" name="nombre" id="nombre"
												placeholder="nombre">
											<label for="nombre">Nombre</label>
										</div>
										<div class="form-floating ">
											<input class="form-control " type="text" name="marca" id="marca"
												placeholder="marca">
											<label for="marca">Marca</label>
										</div>
										<div class="form-floating ">
											<input class="form-control " type="text" name="modelo" id="modelo"
												placeholder="modelo">
											<label for="modelo">Modelo</label>
										</div>
										<div class="form-floating ">
											<input class="form-control " type="text" name="proveedor" id="proveedor"
												placeholder="proveedor">
											<label for="proveedor">Proveedor</label>
										</div>
										<div class="form-floating">
											<input class="form-control " type="text" name="color" id="color"
												placeholder="color">
											<label for="color">Color</label>
										</div>
										<div class="form-floating ">
											<input class="form-control " type="number" name="unidades" id="unidades"
												placeholder="unidades">
											<label for="unidades">Unidades</label>
											<div>
												<button class="btn btn-outline-info ">Agregar</button>
											</div>
										</div>
									</fieldset>
								</form>
							</section>
							<article id="form-conteiner" style="height: 250px; overflow: auto;">
								<table id="productsTable" style="width: 100px; height: 250px;" border="1"
									class="table-sticky table table-dark table-striped table-hover text-white">
									<thead>
										<tr>
											<th>Id</th>
											<th>Nombre</th>
											<th>Marca</th>
											<th>Modelo</th>
											<th>Proveedor</th>
											<th>Colores</th>
											<th>Unidades</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										<% for(ProductoDTO producto: productos){ out.println("<tr>");
											out.println("<td>"+producto.getId() +"</td>");
											out.println("<td>"+producto.getNombre() +"</td>");
											out.println("<td>"+producto.getMarca() +"</td>");
											out.println("<td>"+producto.getModelo() +"</td>");
											out.println("<td>"+producto.getProveedor() +"</td>");
											out.println("<td>"+producto.getColor() +"</td>");
											out.println("<td>"+producto.getUnidades() +"</td>");
											out.println("</tr>");
											}
											%>
									</tbody>
								</table>
							</article>
						</section>
						<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"></script>
	<script src="./JS/ValidacionTrabajador.js"></script>
			</body>
			</html>