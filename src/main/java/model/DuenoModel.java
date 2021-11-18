package model;

public class DuenoModel {
	
	private String rut;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String nombreMascota;
	
	public DuenoModel() {
		super();
	}

	public DuenoModel(String rut, String nombre, String apellido, String direccion, String telefono,
			String nombreMascota) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombreMascota = nombreMascota;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
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

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	@Override
	public String toString() {
		return "DuenoModel [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", nombreMascota=" + nombreMascota + "]";
	}
	
	

}