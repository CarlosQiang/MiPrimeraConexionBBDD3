package modelos;
/**
 * @author Carlos
 * 
 */
import java.sql.SQLException;
import java.util.ArrayList;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;

public class Equipos {
	private String nombre, ciudad, conferencia, division;

	/**
	 * 
	 * @param nombre2 el nombre de el equipo
	 * @param ciudad2 el nombre de la ciudad del equipo
	 * @param conferecia el nombre de la conferencia de el equipo
	 * @param division2 el nombre de la division de el quipo
	 */
	public Equipos(String nombre2, String ciudad2, String conferecia, String division2) {
		// TODO Auto-generated constructor stub
	}
	
	public Equipos() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return devolveria el nombre de el Equipo
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre establecemos el nombre de el equipo 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return el nombre de la ciudad del equipo
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * 
	 * @param ciudad seter de ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * 
	 * @return conferencia del Equipo
	 */
	public String getConferencia() {
		return conferencia;
	}
	/**
	 * 
	 * @param conferencia setter de conferencia
	 */
	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}
	/**
	 * 
	 * @return division del equipo
	 * 	 
	 */
	public String getDivision() {
		return division;
	}
	/**
	 * 
	 * @param division setter division
	 */

	public void setDivision(String division) {
		this.division = division;
	}
	/**
	 * Mostramos la informacion de un Equipo
	 */
	@Override
	public String toString() {
		return "ClaseEquipos [nombre=" + nombre + ", ciudad=" + ciudad + ", conferencia=" + conferencia + ", division="
				+ division + "]";
	}
	

}
/*
 * EquipoDAO ▪ Equipo findById(String nombre)--; ▪ List<Equipo> findAll();-- ▪
 * int eliminarEquipo(String nombe); ▪ boolean crearEquipo(Equipo equipo); ▪
 * boolean cambioDivision(Equipo equipo);
 */