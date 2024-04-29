<%@page import="modelo.TrabajadorDTO"%>
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
  
  List<TrabajadorDTO> trabajadores = (List<TrabajadorDTO>) request.getAttribute("trabajadores");
  %>
  <table border="1">
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
				<th>CONTRASEÑA</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
<%
   for (TrabajadorDTO trabajador : trabajadores) {
	   out.println("<tr>");
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
  
</body>
</html>