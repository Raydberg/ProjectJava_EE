<%@page import="modelo.ProductoDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

List<ProductoDTO> productos = (List<ProductoDTO>) request.getAttribute("productos");
%>
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