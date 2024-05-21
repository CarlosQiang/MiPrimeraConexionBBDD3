package modelos;

import java.sql.SQLException;
import java.util.ArrayList;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;

public class ControladorJugador extends AbstractConexion{

	
	/**
	 * 
	 * @return array list de jugadores y mustra todos por consola
	 */
	public ArrayList<Jugador> findAll() {
		conn= Conexion.getConnection();
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>(); 
		Jugador jugador = new Jugador();

		try {
			st = conn.createStatement();
			
			String query = "select * from jugadores;";
		
			rs = st.executeQuery(query);
		
			System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "ID", "Nombre", "Procedencia", "Altura", "Peso", "Posición", "Nombre Equipo");
			System.out.println("--------------------------------------------------------------------------------------");
			while(rs.next()) {
				int id , peso;
				String nombre , procedencia, altura, posicion , nombreEquipo;
				nombre  = rs.getString("nombre");
				procedencia  = rs.getString("procedencia");
				altura  = rs.getString("altura");
				posicion = rs.getString("posicion");
				nombreEquipo  = rs.getString("Nombre_equipo");
				id = rs.getInt("codigo");
				peso = rs.getInt("peso");
				
				jugador.setNombre(nombre);
				jugador.setProcedencia(procedencia);
				jugador.setAltura(altura);
				jugador.setPosicion(posicion);
				jugador.setNombreEquipo(nombreEquipo);
				jugador.setId(id);
				jugador.setPeso(peso);
				listaJugadores.add(jugador);
			    System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", id, nombre, procedencia, altura,peso,posicion, nombreEquipo);
				
			}
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaJugadores;
	}
	/**
	 * 
	 * @param nombreAux  nombre jugador a busacar
	 * @return jugador
	 */
	public Jugador	 findById(String nombreAux) {
		conn= Conexion.getConnection();
		Jugador jugador = new Jugador();
		try {
			st = conn.createStatement();
			
			String query = "select * from jugadores where nombre = '"+nombreAux+"';";
		
			rs = st.executeQuery(query);
		
			while(rs.next()) {
				int id , peso;
				String nombre , procedencia, altura, posicion , nombreEquipo;
				nombre  = rs.getString("nombre");
				procedencia  = rs.getString("procedencia");
				altura  = rs.getString("altura");
				posicion = rs.getString("posicion");
				nombreEquipo  = rs.getString("Nombre_equipo");
				id = rs.getInt("codigo");
				peso = rs.getInt("peso");

				jugador.setNombre(nombre);
				jugador.setProcedencia(procedencia);
				jugador.setAltura(altura);
				jugador.setPosicion(posicion);
				jugador.setNombreEquipo(nombreEquipo);
				jugador.setId(id);
				jugador.setPeso(peso);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jugador;
}
	/**
	 * 
	 * @param jugador
	 * @return true si se creo false si fallo
	 */
	public boolean crearJugador(Jugador jugador) {
		conn = Conexion.getConnection();
		boolean estado = false;
		try {
			st = conn.createStatement();
			int id , peso;
			String nombre , procedencia, altura, posicion , nombreEquipo;			
			nombre  = jugador.getNombre();
			procedencia  = jugador.getProcedencia();
			altura  =jugador.getAltura();
			posicion = jugador.getPosicion();
			nombreEquipo  = jugador.getNombreEquipo();
			id = jugador.getId();
			peso = jugador.getPeso();
			
			String query = "INSERT INTO equipos (codigo, nombre, procedencia, altura, peso,posicion,Nombre_equipo ) \r\n" + "VALUES ('" + id+ "','" + nombre + "','" + procedencia + "','" + altura + "','"+peso+"','"+posicion+"','"+nombreEquipo+"');";

			rs = st.executeQuery(query);

			System.out.println("Ha sido añadido correctamente!");
			estado= true;
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			estado = false;
		}
		return estado;
	}
	/**
	 * 
	 * @param jugador judador
	 * @param equipo equipo
	 * @return true si fue bien y false si va mal
	 */
	public boolean ficharJugador(Jugador jugador, String equipo) {
		conn = Conexion.getConnection();

		try {
			st = conn.createStatement();
			int id , peso;
			String nombre , procedencia, altura, posicion , nombreEquipo;			
			nombre  = jugador.getNombre();
			procedencia  = jugador.getProcedencia();
			altura  =jugador.getAltura();
			posicion = jugador.getPosicion();
			jugador.setNombreEquipo(equipo);
			nombreEquipo = jugador.getNombreEquipo();
			id = jugador.getId();
			peso = jugador.getPeso();
			
			String query = "UPDATE equipos\r\n"
					+ "SET Nombre_equipo = '"+nombreEquipo+"'\r\n"
					+ "WHERE codigo = '"+id+"';";
			rs = st.executeQuery(query);

			System.out.println("Ha sido Ficahdo correctamente!");

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return true;
	}
	/**
	 * 
	 * @param codigo
	 * @return codigo
	 */
	public int retirarJugador(int codigo) {
		conn = Conexion.getConnection();

		try {
			st = conn.createStatement();

			String query = "DELETE FROM jugadores WHERE codigo = " + codigo + ";";

			rs = st.executeQuery(query);

			

			conn.close();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return codigo;
		
	}
}
