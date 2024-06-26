package modelo;

public class Trabajador {
	    int id;
	    String dni;
	    String nombre;
	    String apellido;
	    int idPuesto;
	    String fechaNacimiento;
	    String genero;
	    String direccion;
	    String telefono;
	    String email;
	    Double salario;
	    String contrasenia;
	    public Trabajador(int id, String dni, String apellido, String nombre, String contrasenia, Double salario, String email, String direccion, String genero, String fechaNacimiento, int idPuesto, String telefono) {
	        this.id = id;
	        this.dni = dni;
	        this.apellido = apellido;
	        this.nombre = nombre;
	        this.contrasenia = contrasenia;
	        this.salario = salario;
	        this.email = email;
	        this.direccion = direccion;
	        this.genero = genero;
	        this.fechaNacimiento = fechaNacimiento;
	        this.idPuesto = idPuesto;
	        this.telefono = telefono;
	    }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getIdPuesto() {
			return idPuesto;
		}
		public void setIdPuesto(int idPuesto) {
			this.idPuesto = idPuesto;
		}
		public String getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(String fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Double getSalario() {
			return salario;
		}
		public void setSalario(Double salario) {
			this.salario = salario;
		}
		public String getContrasenia() {
			return contrasenia;
		}
		public void setContrasenia(String contrasenia) {
			this.contrasenia = contrasenia;
		}
	    
	    
	    
}
