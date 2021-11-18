package JunitTest;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import conexion.Conexion;

public class UsuarioTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws SQLException {
		System.out.println("Inicio Test Conexion DB");
		
		ResultSet resultSet = null;
		
		PreparedStatement statement;
		String sql = null;
		Connection connection = obtenerConexion();
				
		try {
			sql = "SELECT * FROM usuario WHERE username = 'rodrigo'";
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery(sql);
					
			if (resultSet.next()) {
				System.out.println("Test Conexion DB Correcta");
			} else {
				System.out.println("Test Conexion DB Correcta");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// conexion pool
	private static Connection obtenerConexion() throws SQLException {
		return Conexion.getConnection();
	}


}
