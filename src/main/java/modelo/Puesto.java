package modelo;

public class Puesto {
 int idPuesto;
 String descripcion;
public Puesto(int idPuesto, String descripcion) {
	super();
	this.idPuesto = idPuesto;
	this.descripcion = descripcion;
}
public int getIdPuesto() {
	return idPuesto;
}
public void setIdPuesto(int idPuesto) {
	this.idPuesto = idPuesto;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

 
}
