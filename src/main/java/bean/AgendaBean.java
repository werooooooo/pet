package bean;

import java.sql.Date;

public class AgendaBean {
	
	private int id;
	private int idMascota;
	private String rutDueno;
	private String nombreMascota;
	private Date hora;
	private Date fecha;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getRutDueno() {
		return rutDueno;
	}
	public void setRutDueno(String rutDueno) {
		this.rutDueno = rutDueno;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}