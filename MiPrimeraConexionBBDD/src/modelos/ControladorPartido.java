package modelos;

import java.sql.SQLException;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;

public class ControladorPartido extends AbstractConexion{

	/**
	 * ver todo los datos de todos los partidos
	 */
	public void visualizarDatos() {
		conn= Conexion.getConnection();
		
		try {
			st = conn.createStatement();
			
			String query = "select * from partidos;";
		
			rs = st.executeQuery(query);
		
			System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "ID", "Equipo Local", "Equipo Visitante", "Puntos Local", "Puntos Visitante", "Temporada");
			System.out.println("--------------------------------------------------------------------------------------");
			while(rs.next()) {
				int id , puntosLocal, puntosVisitante;
				String equipoLocal, equipoVisitante, temporada;
				equipoLocal  = rs.getString("equipo_local");
				equipoVisitante  = rs.getString("equipo_visitante");
				temporada  = rs.getString("temporada");

				id = rs.getInt("codigo");
				puntosLocal = rs.getInt("puntos_local");
				puntosVisitante = rs.getInt("puntos_visitante");



				
			    System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", id, equipoLocal, equipoVisitante, puntosLocal,puntosVisitante,temporada);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param equipo
	 * @return media de puntos
	 */
	public double mediaPuntos(Equipos equipo) {
		conn = Conexion.getConnection();
		double media = 0;
		try {
			st = conn.createStatement();
			String nombre = equipo.getNombre(); 
			String query = "select avg(puntos_local) as Media from partidos where equipo_local = '"+nombre+"';";

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
	 * @param equipo
	 * @return media de asistencias
	 */
	public double mediaAsistencias(Equipos equipo) {
		conn = Conexion.getConnection();
		double media = 0;
		try {
			st = conn.createStatement();
			String nombre = equipo.getNombre(); 
			String query = "select avg(Asistencias_por_partido) as Media from partidos inner join estadisticas on estadisticas.temporada = partidos.temporada where equipo_local = '"+nombre+"';\r\n"
					+ "";

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
	 * @param equipo
	 * @return media de tapones
	 */
	public double mediaTapones(Equipos equipo) {
		conn = Conexion.getConnection();
		double media = 0;
		try {
			st = conn.createStatement();
			String nombre = equipo.getNombre(); 
			String query = "select avg(Tapones_por_partido) as Media from partidos inner join estadisticas on estadisticas.temporada = partidos.temporada where equipo_local = '"+nombre+"';\r\n"
					+ "";

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
	 * @param equipo
	 * @return media de rebotes
	 */
	public double mediaRebotes(Equipos equipo) {
		conn = Conexion.getConnection();
		double media = 0;
		try {
			st = conn.createStatement();
			String nombre = equipo.getNombre(); 
			String query = "select avg(Rebotes_por_partido) as Media from partidos inner join estadisticas on estadisticas.temporada = partidos.temporada where equipo_local = '"+nombre+"';\r\n"
					+ "";

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
	 * @param equipo
	 * @return media de puntos locales
	 */
	public double mediaPuntosLocal(Equipos equipo) {
		conn = Conexion.getConnection();
		double media = 0;
		try {
			st = conn.createStatement();
			String nombre = equipo.getNombre(); 
			String query = "select avg(puntos_local) as Media from partidos inner join estadisticas on estadisticas.temporada = partidos.temporada where equipo_local = '"+nombre+"';\r\n"
					+ "";

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
	 * @param equipo
	 * @return media de puntos visitantes
	 */
	public double mediaPuntosVisitante(Equipos equipo) {
		conn = Conexion.getConnection();
		double media = 0;
		try {
			st = conn.createStatement();
			String nombre = equipo.getNombre(); 
			String query = "select avg(puntos_visitante) as Media from partidos inner join estadisticas on estadisticas.temporada = partidos.temporada where equipo_local = '"+nombre+"';\r\n"
					+ "";

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
	 * @param partido
	 * @return media de visctorias
	 */
	public double porcentajeVictorias(Partido partido) {
		conn = Conexion.getConnection();
		double Suma = 0;
		double Total = 0;
		double porcentaje = 0;
		try {
			st = conn.createStatement();
			String nombre = partido.getEquipoLocal();
			String query = "select sum(puntos_local)as Suma, count(puntos_local) as Total  from partidos inner join estadisticas on estadisticas.temporada = partidos.temporada where equipo_local = '"+nombre+"' and puntos_local > puntos_visitante group by codigo;\r\n"
					+ "";

			rs = st.executeQuery(query);

			while (rs.next()) {
				Suma = rs.getDouble("Suma");
				Total = rs.getDouble("Total");
			}
			porcentaje = Suma / Total;
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return porcentaje;
	}
}
