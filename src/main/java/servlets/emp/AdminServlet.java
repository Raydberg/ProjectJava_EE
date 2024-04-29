package servlets.emp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Puesto;
import modelo.Trabajador;
import modelo.TrabajadorDTO;
import repositorio.SqlTrabajadoresRepositorio;
import repositorio.TrabajadoresRepositorio;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminServlet() { super(); }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	TrabajadoresRepositorio tr = new SqlTrabajadoresRepositorio();
	
	List<Trabajador> trabajadores = tr.obtenerTodos();
	List<Puesto> puestos = new ArrayList<Puesto>();
	puestos.add(new Puesto(1,"Trabajador"));
	puestos.add(new Puesto(2,"Administrador"));
	List<TrabajadorDTO> listaTrabajadores = new ArrayList<TrabajadorDTO>();
	
	for (Trabajador trabajador : trabajadores) {
		
		TrabajadorDTO trabajadorDTO = new TrabajadorDTO();
		trabajadorDTO.setId(trabajador.getId());
		trabajadorDTO.setDni(trabajador.getDni());
		trabajadorDTO.setNombre(trabajador.getNombre());
		trabajadorDTO.setApellido(trabajador.getApellido());
		String puesto=puestos.get(trabajador.getIdPuesto()-1).getDescripcion();
		trabajadorDTO.setFechaNacimiento(trabajador.getFechaNacimiento());
		trabajadorDTO.setGenero(trabajador.getGenero());
		trabajadorDTO.setDireccion(trabajador.getDireccion());
		trabajadorDTO.setTelefono(trabajador.getTelefono());
		trabajadorDTO.setEmail(trabajador.getEmail());
		trabajadorDTO.setSalario(trabajador.getSalario());
		trabajadorDTO.setContrasenia(trabajador.getContrasenia());
		listaTrabajadores.add(trabajadorDTO);
		
	}
	request.setAttribute("trabajadores", listaTrabajadores);
	request.getRequestDispatcher("/JSP/Admin.jsp").forward(request, response);
	
	
	
	
	}
}
