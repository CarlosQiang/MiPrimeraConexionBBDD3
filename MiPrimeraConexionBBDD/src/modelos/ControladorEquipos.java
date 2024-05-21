package modelos;

import java.sql.SQLException;
import java.util.ArrayList;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;

public class ControladorEquipos extends AbstractConexion{

	/**
	 * 
	 * @return devuelve una lista de todos los equipos y los muestra por pantalla
	 */
	public ArrayList<Equipos> findAll() {
		conn = Conexion.getConnection();
		ArrayList<Equipos> listaEquipos = new ArrayList<Equipos>();
		Equipos equipo = new Equipos();
		try {
			st = conn.createStatement();

			String query = "select * from equipos;";

			rs = st.executeQuery(query);

			System.out.println(String.format("%-20s %-20s %-20s %-20s", "Nombre", "Ciudad", "Conferencia", "División"));
			System.out
					.println("--------------------------------------------------------------------------------------");
			while (rs.next()) {
				String nombre, ciudad, conferecia, division;
				nombre = rs.getString("Nombre");
				ciudad = rs.getString("Ciudad");
				conferecia = rs.getString("conferencia");
				division = rs.getString("Division");
				equipo.setNombre(nombre);
				equipo.setCiudad(ciudad);
				equipo.setConferencia(conferecia);
				equipo.setDivision(division);
				listaEquipos.add(equipo);
				System.out.printf("%-20s %-20s %-20s %-20s\n", nombre, ciudad, conferecia, division);

			}



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaEquipos;

	}
	/**
	 * 
	 * @param nombreAux para buscar el equipo
	 * @return un objeto de clase Equipo
	 */
	public Equipos findById(String nombreAux) {
		conn = Conexion.getConnection();
		Equipos equipo = new Equipos();
		try {
			st = conn.createStatement();

			String query = "select * from equipos where nombre = '" + nombreAux + "';";

			rs = st.executeQuery(query);

			while (rs.next()) {
				String nombre, ciudad, conferecia, division;
				nombre = rs.getString("Nombre");
				ciudad = rs.getString("Ciudad");
				conferecia = rs.getString("conferencia");
				division = rs.getString("Division");
				equipo.setNombre(nombre);
				equipo.setCiudad(ciudad);
				equipo.setConferencia(conferecia);
				equipo.setDivision(division);
				System.out.println(equipo);

			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equipo;
	}
	/**
	 * 
	 * @param nombreAux nombre del equipo a eliminar
	 */
	public void eliminarEquipo(String nombreAux) {
		conn = Conexion.getConnection();

		try {
			st = conn.createStatement();

			String query = "DELETE FROM usuarios WHERE nombre = '" + nombreAux + "';";

			rs = st.executeQuery(query);

			System.out.println(String.format("%-20s %-20s %-20s %-20s", "Nombre", "Ciudad", "Conferencia", "División"));
			System.out
					.println("--------------------------------------------------------------------------------------");
			while (rs.next()) {
				String nombre, ciudad, conferecia, division;
				nombre = rs.getString("Nombre");
				ciudad = rs.getString("Ciudad");
				conferecia = rs.getString("conferencia");
				division = rs.getString("Division");

				System.out.printf("%-20s %-20s %-20s %-20s\n", nombre, ciudad, conferecia, division);

			}



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param equipo equipo para dar de alta
	 */
	public void crearEquipo(Equipos equipo) {
		conn = Conexion.getConnection();

		try {
			st = conn.createStatement();
			String nombre, ciudad, conferecia, division;
			nombre = equipo.getNombre();
			ciudad = equipo.getCiudad();
			conferecia = equipo.getConferencia();
			division = equipo.getDivision();
			String query = "INSERT INTO equipos (nombre, ciudad, conferencia, division) \r\n" + "VALUES ('" + nombre
					+ "','" + ciudad + "','" + conferecia + "','" + division + "');";

			rs = st.executeQuery(query);

			System.out.println(String.format("%-20s %-20s %-20s %-20s", "Nombre", "Ciudad", "Conferencia", "División"));
			System.out.println("Ha sido añadido correctamente!");



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param equipo equipo para cambiar division
	 * @param divisionNueva division a cambiar
	 */
	public void cambioDivision(Equipos equipo, String divisionNueva) {
		conn = Conexion.getConnection();

		try {
			st = conn.createStatement();

			String nombreAux = equipo.getNombre();
			String query = "UPDATE equipos\r\n" + "SET division = '" + divisionNueva + "'\r\n" + "WHERE nombre = '"
					+ nombreAux + "';";

			rs = st.executeQuery(query);



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
