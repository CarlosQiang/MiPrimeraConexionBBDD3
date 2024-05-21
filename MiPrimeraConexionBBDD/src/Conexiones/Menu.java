package Conexiones;

import java.util.Scanner;

import modelos.ControladorEquipos;
import modelos.ControladorEstadisticas;
import modelos.ControladorJugador;
import modelos.ControladorPartido;
import modelos.Equipos;
import modelos.Estadisticas;
import modelos.Jugador;
import modelos.Partido;

public class Menu {
	
	static Scanner sc = new Scanner(System.in);

	/**
	 * controlador de todas las clases y controladores
	 */
	public void inicializarMenu() {
		int opcion = 0;

		do {
			System.out.println("****Menu*****");
			System.out.println("1.Menu Equipo");
			System.out.println("2.Menu Estadisticas");
			System.out.println("3.Menu Jugadores");
			System.out.println("4.Menu Partidos");
			System.out.println("5.Salir");
			System.out.println("**************");
			System.out.println("Ingrese la opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1: 
				ControladorEquipos ce = new ControladorEquipos();
				Equipos eq = new Equipos();
				int opcion1 = 0 ;
				System.out.println("****Menu*****");
				System.out.println("1.Buscar Equipo");
				System.out.println("2.Mostar todo");
				System.out.println("3.Crear Equipo");
				System.out.println("4.Eliminar Equipo");
				System.out.println("5.Cambiar Division");
				System.out.println("6.Salir");
				System.out.println("**************");
				System.out.println("Ingrese la opcion: ");
				opcion1 = sc.nextInt();
				switch (opcion1) {
				case 1:
					System.out.println("Ingrese nombre del Equipo");
					sc = new Scanner(System.in);
					String nombre = sc.nextLine();
					ce.findById(nombre);
					break;
				case 2:
					ce.findAll();
					break;
				case 3:
					System.out.println("Vamos a crear un Nuevo Equipo");
					System.out.println("Nombre: ");
					sc = new Scanner(System.in);
					String nombre1 = sc.nextLine();
					eq.setNombre(nombre1);
					System.out.println("Ciudad: ");
					sc = new Scanner(System.in);
					String ciudad1 = sc.nextLine();
					eq.setCiudad(ciudad1);
					System.out.println("Conferencia: ");
					sc = new Scanner(System.in);
					String conferencia1 = sc.nextLine();
					eq.setConferencia(conferencia1);
					System.out.println("Division: ");
					sc = new Scanner(System.in);
					String division1 = sc.nextLine();
					eq.setDivision(division1);
					ce.crearEquipo(eq);
					
					break;
				case 4:
					System.out.println("Eliminar Equipo");
					System.out.println("Ingrese el nombre de lequipo a eliminar: ");
					sc = new Scanner(System.in);
					String nombre2 = sc.nextLine();
					ce.eliminarEquipo(nombre2);
					break;
				case 5:
					System.out.println("Cambio de Division");
					System.out.println("Nombre de la nueva divisision");
					sc = new Scanner(System.in);
					String division2 = sc.nextLine();
					ce.cambioDivision(eq, division2);
					break;
				case 6:
					
					break;

				default:
					break;
				}
				break;
			case 2:
				ControladorEstadisticas cstats = new ControladorEstadisticas();
				int opcion2 = 0 ;
				System.out.println("****Menu*****");
				System.out.println("1.Mostar Estadisticas");
				System.out.println("2.Buscar Estadisticas por pais");
				System.out.println("3.Buscar Estadisticas por Equipo");
				System.out.println("4.Media de Puntos por Partido");
				System.out.println("5.Media de Asistencias por Partido");
				System.out.println("6.Media de Tapones por Partido");
				System.out.println("7.Media de Rebotes por Partido");
				System.out.println("8.Salir");
				System.out.println("**************");
				System.out.println("Ingrese la opcion: ");
				sc = new Scanner(System.in);
				opcion2 = sc.nextInt();
				switch (opcion2) {
				case 1:
					cstats.mostrarEstadisticasClasesExistentes();
					break;
				case 2:
					System.out.println("Ingrese el nombre del pais: ");
					sc = new Scanner(System.in);
					String pais = sc.nextLine();
					cstats.findByCountry(pais);
					break;
				case 3:
					System.out.println("Ingrese el nombre del equipo: ");
					sc = new Scanner(System.in);
					String equipo = sc.nextLine();
					cstats.findByEquipo(equipo);
					break;
				case 4:
					ControladorJugador j = new ControladorJugador();
					Jugador jugador = new Jugador();
					System.out.println("Ingrese el nombre del jugador: ");
					sc = new Scanner(System.in);
					String nombre3 = sc.nextLine();
					jugador = j.findById(nombre3);
					cstats.mediaPuntosPartido(jugador);
					break;
				case 5:
					ControladorJugador j1 = new ControladorJugador();
					Jugador jugador1 = new Jugador();
					System.out.println("Ingrese el nombre del jugador: ");
					sc = new Scanner(System.in);
					String nombre4 = sc.nextLine();
					jugador1 = j1.findById(nombre4);
					cstats.mediaAsistencias(jugador1);
					break;
				case 6:
					ControladorJugador j2 = new ControladorJugador();
					Jugador jugador2 = new Jugador();
					System.out.println("Ingrese el nombre del jugador: ");
					sc = new Scanner(System.in);
					String nombre5 = sc.nextLine();
					jugador2 = j2.findById(nombre5);
					cstats.mediaTapones(jugador2);
					break;
				case 7:
					ControladorJugador j3 = new ControladorJugador();
					Jugador jugador3 = new Jugador();
					System.out.println("Ingrese el nombre del jugador: ");
					sc = new Scanner(System.in);
					String nombre6 = sc.nextLine();
					jugador3 = j3.findById(nombre6);
					cstats.mediaRebotes(jugador3);
					break;
				case 8:
					
					break;

				default:
					break;
				}
				break;
			case 3 :
				ControladorJugador cj = new ControladorJugador();
				Jugador j = new Jugador();
				int opcion3 = 0 ;
				System.out.println("****Menu*****");
				System.out.println("1.Buscar Jugador");
				System.out.println("2.Mostar Jugadores");
				System.out.println("3.Crear Jugador");
				System.out.println("4.Fichar jugador");
				System.out.println("5.Pruebas fisicas");
				System.out.println("6.Salir");
				System.out.println("**************");
				System.out.println("Ingrese la opcion: ");
				sc = new Scanner(System.in);
				opcion3 = sc.nextInt();
				switch (opcion3) {
				case 1:
					System.out.println("Ingrese el nombre del jugador: ");
					sc = new Scanner(System.in);
					String nombre1 = sc.nextLine();					
					cj.findById(nombre1);
					break;
				case 2:
					cj.findAll();
					break;
				case 3:
					System.out.println("Vamos a crear un Nuevo Jugador");
					
					System.out.println("Nombre: ");
					sc = new Scanner(System.in);
					String nombre2 = sc.nextLine();
					j.setNombre(nombre2);
					System.out.println("Codigo: ");
					sc = new Scanner(System.in);
					int id = sc.nextInt();
					j.setId(id);
					System.out.println("Altura: ");
					sc = new Scanner(System.in);
					String altura = sc.nextLine();
					j.setAltura(altura);
					System.out.println("Peso: ");
					sc = new Scanner(System.in);
					int peso = sc.nextInt();
					j.setPeso(peso);
					System.out.println("Posicion: ");
					sc = new Scanner(System.in);
					String posicion = sc.nextLine();
					j.setPosicion(posicion);
					System.out.println("Procedencia: ");
					sc = new Scanner(System.in);
					String procedencia = sc.nextLine();
					j.setProcedencia(procedencia);
					System.out.println("Nombre Equipo: ");
					sc = new Scanner(System.in);
					String nombreEquipo = sc.nextLine();
					j.setNombreEquipo(nombreEquipo);
					cj.crearJugador(j);
					break;
				case 4:
					System.out.println("Ingrese el nombre del jugador: ");
					sc = new Scanner(System.in);
					String nombre3 = sc.nextLine();			
					cj.ficharJugador(j, nombre3);
					break;
				case 5:
					//No se que son las Pruebas fisicas
					break;
				case 6:
					
					break;

				default:
					break;
				}
				break;
			case 4:
				ControladorPartido cp = new ControladorPartido();
				ControladorEquipos e = new ControladorEquipos();

				Partido p = new Partido();
				int opcion4 = 0 ;
				System.out.println("****Menu*****");
				System.out.println("1.Mostar Datos");
				System.out.println("2.Media de Puntos por Partido");	
				System.out.println("3.Media de Asistencias por Partido");
				System.out.println("4.Media de Tapones por Partido");
				System.out.println("5.Media de Rebotes por Partido");
				System.out.println("6.Media de Puntos Local por Partido");
				System.out.println("7.Media de Puntos Visitante por Partido");
				System.out.println("8.Media de Victorias por Partido");
				System.out.println("9.Salir");
				System.out.println("**************");
				System.out.println("Ingrese la opcion: ");
				sc = new Scanner(System.in);
				opcion4 = sc.nextInt();
				switch (opcion4) {
				case 1:
					cp.visualizarDatos();
					break;
				case 2:
					Equipos equipo = new Equipos();
					System.out.println("Ingrese el nombre del Equipo: ");
					sc = new Scanner(System.in);
					String nombre3 = sc.nextLine();
					equipo = e.findById(nombre3);
					cp.mediaPuntos(equipo);
					break;
				case 3:
					Equipos equipo1 = new Equipos();
					System.out.println("Ingrese el nombre del Equipo: ");
					sc = new Scanner(System.in);
					String nombre4 = sc.nextLine();
					equipo1 = e.findById(nombre4);
					cp.mediaAsistencias(equipo1);
					break;
				case 4:
					Equipos equipo2 = new Equipos();
					System.out.println("Ingrese el nombre del Equipo: ");
					sc = new Scanner(System.in);
					String nombre5 = sc.nextLine();
					equipo2 = e.findById(nombre5);
					cp.mediaTapones(equipo2);
					break;
				case 5:
					Equipos equipo3 = new Equipos();
					System.out.println("Ingrese el nombre del Equipo: ");
					sc = new Scanner(System.in);
					String nombre51 = sc.nextLine();
					equipo3 = e.findById(nombre51);
					cp.mediaRebotes(equipo3);
					break;
				case 6:
					Equipos equipo4 = new Equipos();
					System.out.println("Ingrese el nombre del Equipo: ");
					sc = new Scanner(System.in);
					String nombre6 = sc.nextLine();
					equipo4 = e.findById(nombre6);
					cp.mediaPuntosLocal(equipo4);
					break;
				case 7:
					Equipos equipo5 = new Equipos();
					System.out.println("Ingrese el nombre del Equipo: ");
					sc = new Scanner(System.in);
					String nombre7 = sc.nextLine();
					equipo5 = e.findById(nombre7);
					cp.mediaPuntosVisitante(equipo5);
					break;
				case 8:
					Equipos equipo6 = new Equipos();
					System.out.println("Ingrese el nombre del Equipo: ");
					sc = new Scanner(System.in);
					String nombre8 = sc.nextLine();
					equipo6 = e.findById(nombre8);
					cp.porcentajeVictorias(p);
					break;
				case 9:
					
					break;

				default:
					break;
				}
				break;
			case 5 :
				
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} while (opcion != 5);
		
	}
	
	
}


