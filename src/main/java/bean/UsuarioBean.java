package bean;

public class UsuarioBean {
	
	private boolean valid;
	private int id;
	private String nombreUsuario;
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isValid() {
        return valid;
	}

    public void setValid(boolean newValid) {
        valid = newValid;
	}
	
	

}