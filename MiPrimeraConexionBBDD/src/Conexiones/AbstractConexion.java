package Conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class AbstractConexion {
	protected  Connection conn;
	protected  Statement st;
	protected  ResultSet rs;
	protected  String query;
	
	protected AbstractConexion() {
		conn=Conexion.getConnection();
	}
}
