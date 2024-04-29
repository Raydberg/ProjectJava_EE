<%@page import="modelo.ProductoDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<%

List<ProductoDTO> productos = (List<ProductoDTO>) request.getAttribute("productos");
%>
<section>
	<form action="./ProductoCrear" method="post">
    <fieldset>
<legend>Crear</legend>
    <!-- <div class="form-floating ">
		<input class="form-control  " type="text" name="id" id="id">
        <label for="id">ID</label>
	</div> -->
	<div class="form-floating ">
		<input class="form-control " type="text" name="nombre" id="nombre">
		<label for="nombre">Nombre</label>
	</div>
	<div class="form-floating ">
    <input class="form-control " type="text" name="marca" id="marca">
	<label for="marca">Marca</label>
	</div>
	<div class="form-floating ">
    <input class="form-control " type="text" name="proveedor" id="proveedor">
	<label for="proveedor">Proveedor</label>
	</div>
	<div class="form-floating">
		<input class="form-control " type="text" name="color" id="color">
	 <label for="color">Color</label>
	</div>
	<div class="form-floating ">
    <input class="form-control " type="text" name="unidades" id="unidades">
	<label for="unidades">Unidades</label>
	<div>
		<button class="btn btn-outline-info ">Agregar</button>
	</div>
	</div>
	</fieldset>
	</form>
</section>


<table border="1">
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
<%
   for(ProductoDTO producto: productos){
		out.println("<tr>");
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

</body>
</html>