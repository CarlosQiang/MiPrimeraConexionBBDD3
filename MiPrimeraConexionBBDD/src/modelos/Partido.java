package modelos;

import java.sql.SQLException;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;

public class Partido   {
	private int id , puntosLocal, puntosVisitante;
	private String equipoLocal, equipoVisitante, temporada;
	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return puntos local
	 */
	public int getPuntosLocal() {
		return puntosLocal;
	}
	/**
	 * 
	 * @param puntosLocal
	 */
	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}
	/**
	 * 
	 * @return puntos visitante
	 */
	public int getPuntosVisitante() {
		return puntosVisitante;
	}
	/**
	 * 
	 * @param puntosVisitante
	 */
	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}
	/**
	 * 
	 * @return equipo local
	 */
	
	public String getEquipoLocal() {
		return equipoLocal;
	}
	/**
	 * 
	 * @param equipoLocal
	 */
	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	/**
	 * 
	 * @return equipo visitante
	 */
	public String getEquipoVisitante() {
		return equipoVisitante;
	}
	/**
	 * 
	 * @param equipoVisitante
	 */
	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	/**
	 * 
	 * @return temporada
	 */
	public String getTemporada() {
		return temporada;
	}
	/**
	 * 
	 * @param temporada
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	@Override
	public String toString() {
		return "ClasePartido [id=" + id + ", puntosLocal=" + puntosLocal + ", puntosVisitante=" + puntosVisitante
				+ ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", temporada=" + temporada
				+ "]";
	}
	
}	

/*PartidoDAO
▪ void visualizarDatos(Partido partido);
▪ double mediaPuntos(Equipo equipo);
▪ double mediaAsistencias(Equipo equipo);
▪ double mediaTapones(Equipo equipo);
▪ double mediaRebotes(Equipo equipo);
▪ double mediaPuntosLocal(Partido partido);
▪ double mediaPuntosVisitante(Partido partido);
▪ double porcentajeVictorias(Partido partido);*/