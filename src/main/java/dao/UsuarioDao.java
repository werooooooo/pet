package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.UsuarioBean;
import conexion.Conexion;
import model.UsuarioModel;

public class UsuarioDao {
	
public static UsuarioBean UsuarioLogin(UsuarioBean beanU) throws SQLException {
		
		ResultSet resultSet = null;
		UsuarioModel u = new UsuarioModel();
		
		PreparedStatement statement;
		String sql = null;
		Connection connection = obtenerConexion();
				
		try {
			sql = "SELECT id, nombreUsuario, password FROM usuario WHERE nombreUsuario = '" + beanU.getNombreUsuario() + "' AND password = '" + beanU.getPassword() + "'";
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery(sql);
					
			if (resultSet.next()) {
				
				u.setNombreUsuario(resultSet.getString(2));
				u.setPassword(resultSet.getString(3));
				
				
				beanU.setValid(true);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return beanU;
	}
	
	// conexion pool
		private static Connection obtenerConexion() throws SQLException {
			return Conexion.getConnection();
		}

}
