package modelos;
/**
 * @author Carlos
 */
import java.sql.SQLException;
import java.util.ArrayList;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;

public class Estadisticas  {
	private String temporada;
	private int jugador;
	private double puntosPartido, asistenciaPartido, taponesPartido, rebotesPartido;
	
	/**
	 * 
	 * @return get temporada
	 */
	public String getTemporada() {
		return temporada;
	}
	/**
	 * 
	 * @param temporada setter temporada
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	/**
	 * 
	 * @return jugador
	 */

	public int getJugador() {
		return jugador;
	}
	/**
	 * 
	 * @param jugador setter jugador
	 */
	public void setJugador(int jugador) {
		this.jugador = jugador;
	}
	/**
	 * 
	 * @return puntos partido
	 */
	public double getPuntosPartido() {
		return puntosPartido;
	}
	/**
	 * 
	 * @param puntosPartido setter puntos partido
	 */
	public void setPuntosPartido(double puntosPartido) {
		this.puntosPartido = puntosPartido;
	}
	/**
	 * 
	 * @return asistencias 
	 */
	public double getAsistenciaPartido() {
		return asistenciaPartido;
	}
	/**
	 * 
	 * @param asistenciaPartido set asistencias
	 */
	public void setAsistenciaPartido(double asistenciaPartido) {
		this.asistenciaPartido = asistenciaPartido;
	}
	/**
	 * 
	 * @return tapones
	 */
	public double getTaponesPartido() {
		return taponesPartido;
	}
	/**
	 * 
	 * @param taponesPartido set tapones
	 */
	public void setTaponesPartido(double taponesPartido) {
		this.taponesPartido = taponesPartido;
	}
	/**
	 * 
	 * @return rebotes
	 */
	public double getRebotesPartido() {
		return rebotesPartido;
	}
	/**
	 * 
	 * @param rebotesPartido set rebotes
	 */
	public void setRebotesPartido(double rebotesPartido) {
		this.rebotesPartido = rebotesPartido;
	}
	
	@Override
	public String toString() {
		return "ClaseEstadisticas [temporada=" + temporada + ", jugador=" + jugador + ", puntosPartido=" + puntosPartido
				+ ", asistenciaPartido=" + asistenciaPartido + ", taponesPartido=" + taponesPartido
				+ ", rebotesPartido=" + rebotesPartido + "]";
	}

	

}

/*
 * EstadisticaDAO ▪ List<Estadistica> findById(int codigo);-- ▪List<Estadistica>
 * findByCountry(String country); -- ▪ List<Estadistica>findByEquipo(String
 * nombre); -- ▪ double mediaPuntosPartido(Jugador jugador); -- ▪ double
 * mediaAsistencias(Jugador jugador); -- ▪ double mediaTapones(Jugadorjugador);
 * -- ▪ double mediaRebotes(Jugador jugador);--
 */