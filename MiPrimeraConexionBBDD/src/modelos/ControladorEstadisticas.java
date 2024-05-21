package modelos;

import java.sql.SQLException;
import java.util.ArrayList;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;

public class ControladorEstadisticas extends AbstractConexion {
	/**
	 * mostrar las estadisticas del partido
	 */
	public void mostrarEstadisticasClasesExistentes() {
		conn = Conexion.getConnection();

		try {
			st = conn.createStatement();

			String query = "select * from estadisticas;";

			rs = st.executeQuery(query);

			System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Temporada", "Jugador", "Puntos/Partido",
					"Asistencia/Partido", "Tapones/Partido", "Rebotes/Partido");
			System.out
					.println("--------------------------------------------------------------------------------------");
			while (rs.next()) {
				String temporada;
				int jugador;
				double puntosPartido, asistenciaPartido, taponesPartido, rebotesPartido;
				temporada = rs.getString("temporada");
				jugador = rs.getInt("jugador");
				puntosPartido = rs.getDouble("Puntos_por_partido");
				asistenciaPartido = rs.getDouble("Asistencias_por_partido");
				taponesPartido = rs.getDouble("Tapones_por_partido");
				rebotesPartido = rs.getDouble("Rebotes_por_partido");

				System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", temporada, jugador, puntosPartido,
						asistenciaPartido, taponesPartido, rebotesPartido);

			}

		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/**
	 * 
	 * @param jugadorAux jugador a buscar estadisticas
	 * @return estadisticas 
	 */
	public ArrayList<Estadisticas> findById(int jugadorAux) {
		conn = Conexion.getConnection();
		Estadisticas estadisticas = new Estadisticas();
		ArrayList<Estadisticas> listaEstadisticas = new ArrayList<Estadisticas>();
		try {
			st = conn.createStatement();

			String query = "select * from estadisticas where jugador = " + jugadorAux + ";";

			rs = st.executeQuery(query);

			while (rs.next()) {
				String temporada;
				int jugador;
				double puntosPartido, asistenciaPartido, taponesPartido, rebotesPartido;
				temporada = rs.getString("temporada");
				jugador = rs.getInt("jugador");
				puntosPartido = rs.getDouble("Puntos_por_partido");
				asistenciaPartido = rs.getDouble("Asistencias_por_partido");
				taponesPartido = rs.getDouble("Tapones_por_partido");
				rebotesPartido = rs.getDouble("Rebotes_por_partido");
				estadisticas.setTemporada(temporada);
				estadisticas.setJugador(jugador);
				estadisticas.setPuntosPartido(puntosPartido);
				estadisticas.setAsistenciaPartido(asistenciaPartido);
				estadisticas.setTaponesPartido(taponesPartido);
				estadisticas.setRebotesPartido(rebotesPartido);
				listaEstadisticas.add(estadisticas);
			}

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(listaEstadisticas);
		return listaEstadisticas;
	}

	/**
	 * 
	 * @param ciudad ciudad a buscar 
	 * @return estadisticas
	 */
	public ArrayList<Estadisticas> findByCountry(String ciudad) {
		conn = Conexion.getConnection();
		Estadisticas estadisticas = new Estadisticas();
		ArrayList<Estadisticas> listaEstadisticas = new ArrayList<Estadisticas>();
		try {
			st = conn.createStatement();

			String query = "select * from estadisticas\r\n"
					+ "inner join jugadores on estadisticas.jugador = jugadores.codigo\r\n"
					+ "where jugadores.Procedencia = '" + ciudad + "';";

			rs = st.executeQuery(query);

			while (rs.next()) {
				String temporada;
				int jugador;
				double puntosPartido, asistenciaPartido, taponesPartido, rebotesPartido;
				temporada = rs.getString("temporada");
				jugador = rs.getInt("jugador");
				puntosPartido = rs.getDouble("Puntos_por_partido");
				asistenciaPartido = rs.getDouble("Asistencias_por_partido");
				taponesPartido = rs.getDouble("Tapones_por_partido");
				rebotesPartido = rs.getDouble("Rebotes_por_partido");
				estadisticas.setTemporada(temporada);
				estadisticas.setJugador(jugador);
				estadisticas.setPuntosPartido(puntosPartido);
				estadisticas.setAsistenciaPartido(asistenciaPartido);
				estadisticas.setTaponesPartido(taponesPartido);
				estadisticas.setRebotesPartido(rebotesPartido);
				listaEstadisticas.add(estadisticas);

			}

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(listaEstadisticas);
		return listaEstadisticas;
	}
	/**
	 * 
	 * @param nombreAux nombre a buscar por equipo
	 * @return estadisticas
	 */
	public ArrayList<Estadisticas> findByEquipo(String nombreAux) {
		conn = Conexion.getConnection();
		Estadisticas estadisticas = new Estadisticas();
		ArrayList<Estadisticas> listaEstadisticas = new ArrayList<Estadisticas>();
		try {
			st = conn.createStatement();

			String query = "select * from estadisticas\r\n"
					+ "inner join jugadores on estadisticas.jugador = jugadores.codigo\r\n"
					+ "where jugadores.Nombre_equipo = '" + nombreAux + "';\r\n";
			;

			rs = st.executeQuery(query);

			while (rs.next()) {
				String temporada;
				int jugador;
				double puntosPartido, asistenciaPartido, taponesPartido, rebotesPartido;
				temporada = rs.getString("temporada");
				jugador = rs.getInt("jugador");
				puntosPartido = rs.getDouble("Puntos_por_partido");
				asistenciaPartido = rs.getDouble("Asistencias_por_partido");
				taponesPartido = rs.getDouble("Tapones_por_partido");
				rebotesPartido = rs.getDouble("Rebotes_por_partido");
				estadisticas.setTemporada(temporada);
				estadisticas.setJugador(jugador);
				estadisticas.setPuntosPartido(puntosPartido);
				estadisticas.setAsistenciaPartido(asistenciaPartido);
				estadisticas.setTaponesPartido(taponesPartido);
				estadisticas.setRebotesPartido(rebotesPartido);
				listaEstadisticas.add(estadisticas);

			}

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(listaEstadisticas);
		return listaEstadisticas;
	}
	/**
	 * 
	 * @param jugadorAux jugador a buscar media
	 * @return media
	 */
	public double mediaPuntosPartido(Jugador jugadorAux) {
		conn = Conexion.getConnection();
		double media = 0;
		int id = jugadorAux.getId();
		try {
			st = conn.createStatement();

			String query = "select avg(Puntos_por_partido) as Media from estadisticas\r\n" + "where jugador = " + id
					+ ";";

			rs = st.executeQuery(query);

			while (rs.next()) {
				media = rs.getDouble("Media");

			}

		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return media;
	}

	/**
	 * 
	 * @param jugadorAux jugador a buscar media
	 * @return media
	 */
	public double mediaAsistencias(Jugador jugadorAux) {
		conn = Conexion.getConnection();
		double media = 0;
		int id = jugadorAux.getId();
		try {
			st = conn.createStatement();

			String query = "select avg(Asistencias_por_partido) as Media from estadisticas where jugador = " + id + ";";

			rs = st.executeQuery(query);

			while (rs.next()) {
				media = rs.getDouble("Media");

			}

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return media;
	}

	/**
	 * 
	 * @param jugadorAux jugador a buscar media
	 * @return media
	 */
	public double mediaTapones(Jugador jugadorAux) {
		conn = Conexion.getConnection();
		double media = 0;
		int id = jugadorAux.getId();
		try {
			st = conn.createStatement();

			String query = "select avg(Tapones_por_partido) as Media from estadisticas where jugador = " + id + ";";

			rs = st.executeQuery(query);

			while (rs.next()) {
				media = rs.getDouble("Media");

			}

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return media;
	}

	/**
	 * 
	 * @param jugadorAux jugador a buscar media
	 * @return media
	 */
	public double mediaRebotes(Jugador jugadorAux) {
		conn = Conexion.getConnection();
		double media = 0;
		int id = jugadorAux.getId();
		try {
			st = conn.createStatement();

			String query = "select avg(Rebotes_por_partido) as Media from estadisticas where jugador = " + id + ";";

			rs = st.executeQuery(query);

			while (rs.next()) {
				media = rs.getDouble("Media");

			}

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return media;
	}
}
