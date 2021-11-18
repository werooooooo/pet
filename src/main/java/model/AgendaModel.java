package model;

import java.sql.Date;

public class AgendaModel {
	
	private int id;
	private int idMascota;
	private String rutDueno;
	private String nombreMascota;
	private Date hora;
	private Date fecha;
	
	public AgendaModel() {
		super();
	}
	
	public AgendaModel(int id, int idMascota, String rutDueno, String nombreMascota, Date hora, Date fecha) {
		super();
		this.id = id;
		this.idMascota = idMascota;
		this.rutDueno = rutDueno;
		this.nombreMascota = nombreMascota;
		this.hora = hora;
		this.fecha = fecha;
	}
	
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
	
	@Override
	public String toString() {
		return "AgendaModel [id=" + id + ", idMascota=" + idMascota + ", rutDueno=" + rutDueno + ", nombreMascota="
				+ nombreMascota + ", hora=" + hora + ", fecha=" + fecha + "]";
	}
	
	

}

