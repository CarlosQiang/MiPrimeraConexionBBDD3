package modelos;

import java.sql.SQLException;
import java.util.ArrayList;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;

public class Jugador  {
	private int id , peso;
	private String nombre , procedencia, altura, posicion , nombreEquipo;
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
	 * @return peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * 
	 * @param peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	/**
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return procedencia
	 */
	public String getProcedencia() {
		return procedencia;
	}
	/**
	 * 
	 * @param procedencia
	 */
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	/**
	 * 
	 * @return altura
	 */
	public String getAltura() {
		return altura;
	}
	/**
	 * 
	 * @param altura
	 */
	public void setAltura(String altura) {
		this.altura = altura;
	}
	/**
	 * 
	 * @return posicion
	 */
	public String getPosicion() {
		return posicion;
	}
	/**
	 * 
	 * @param posicion
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	/**
	 * 
	 * @return nombre equipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	/**
	 * 
	 * @param nombreEquipo
	 */
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	@Override
	public String toString() {
		return "ClaseJugador [id=" + id + ", peso=" + peso + ", nombre=" + nombre + ", procedencia=" + procedencia
				+ ", altura=" + altura + ", posicion=" + posicion + ", nombreEquipo=" + nombreEquipo + "]";
	}
	
	
}


/*
 * JugadorDAO
▪ Jugador findById(string nombre)--;
▪ List<Jugador> findAll();--
▪ boolean crearJugador(Jugador jugador);--
▪ boolean ficharJugador(Jugador jugador);
▪ boolean pruebasFisicasJugador(Jugador jugador);
▪ int retirarJugador(int codigo);*/
 