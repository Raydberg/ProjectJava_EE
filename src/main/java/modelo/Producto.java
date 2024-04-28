package modelo;

public class Producto {

	int id;
	String nombre;
	String marca;
	String modelo;
	String proveedor;
	String color;
	int unidades;
	public Producto(int id, String nombre, String marca, String modelo, String proveedor, String color, int unidades) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.proveedor = proveedor;
		this.color = color;
		this.unidades = unidades;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}	
	
}
