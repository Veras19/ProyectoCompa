package StreetF;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase main del proyecto, donde se desarrollan la mayoria de metodos
 * 
 * @author nacho
 *
 */
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Personaje[] personajes = seleccionarPersonaje();
		System.out.println("Elige dos personajes para combatir:");
		for (int i = 0; i < personajes.length; i++) {
			System.out.println((i + 1) + ". " + personajes[i].getNombre());
		}

		System.out.print("Jugador 1: ");
		int opcion1 = sn.nextInt() - 1;
		System.out.print("Jugador 2: ");
		int opcion2 = sn.nextInt() - 1;

		Combate(personajes[opcion1], personajes[opcion2]);
	}

	/**
	 * Metodo que inicializa los personajes 
	 * 
	 * @return devuelve un array de 8 Personajes
	 */
	public static Personaje[] seleccionarPersonaje() {
		Personaje[] personajes = new Personaje[8];

		personajes[0] = new Personaje("Ryu", "Japón", "Un karateka que trata de perfeccionar todas sus habilidades", 1.75, 75, "Negro", "Japón", 8);
		personajes[1] = new Personaje("E. Honda", "Japón", "Un luchador de sumo de Japón", 2.0, 150, "Negro", "Japón", 6);
		personajes[2] = new Personaje("Blanka", "Brasil", "Un mutante con forma de bestia que creció en la jungla de Brasil", 1.8, 80, "Verde", "Brasil", 9);
		personajes[3] = new Personaje("Guile", "EE. UU.", "Un antiguo miembro militar de EE. UU.", 1.9, 90, "Rubio", "EE. UU.", 7);
		personajes[4] = new Personaje("Ken", "EE. UU.", "El rival de Ryu de los Estados Unidos", 1.8, 85, "Rojo", "EE. UU.", 9);
		personajes[5] = new Personaje("Chun-Li", "China", "Una artista marcial china que trabaja para la Interpol", 1.65, 60, "Negro", "China", 10);
		personajes[6] = new Personaje("Zangief", "Unión Soviética", "Un luchador profesional de la Unión Soviética", 2.2, 150, "Rojo", "Unión Soviética", 5);
		personajes[7] = new Personaje("Dhalsim", "India", "Un maestro de yoga", 1.75, 70, "Calvo", "India", 8);

		return personajes;
	}

	/**
	 * metodo que simula un combate seleccionando los personajes y sus datos
	 * 
	 * @param personaje1
	 * @param personaje2
	 */
	public static void Combate(Personaje personaje1, Personaje personaje2) {
		System.out.println("Combate entre " + personaje1.getNombre() + " y " + personaje2.getNombre());
		System.out.println("Lugar: " + personaje1.getPaisProcedencia() + " - " + personaje1.getEscenario());

		Random random = new Random();
		Personaje atacante;
		Personaje defensor; 
		boolean empiezaAtacar = random.nextBoolean();
		if (personaje1.getVelocidad() > personaje2.getVelocidad()) {
			empiezaAtacar = true;
		} else {
			empiezaAtacar = false;
		}
		
		
		int ronda = 1;
		
		while(personaje1.getPuntosVida() > 0 && personaje2.getPuntosVida() > 0){
			System.out.println("Ronda " + ronda + ", Fight!");
			if(empiezaAtacar) {
				atacante = personaje1;
				defensor = personaje2;
			} else {
				atacante = personaje2;
				defensor = personaje1;
			}
			
			
			//movimiento que hara cada personaje
			
			int movimientoAtacante= random.nextInt(3);
			int movimientoDefensor= random.nextInt(3);
			double dañoP1=0;
			double dañoP2=0;
			
			//Movimiento p1
			switch(movimientoAtacante) {
			case 0:
				System.out.println(atacante.getNombre() + " ataca.");
				 dañoP1 = puntosDaño(personaje1);
				
				break;
			case 1:
				System.out.println(atacante.getNombre() + " Defiende.");
				dañoP1=0;
				
				break;
			case 2:
				System.out.println(atacante.getNombre() + " Esquiva.");
				dañoP1=0;
				break;
			}
			//Movimiento p2
			switch(movimientoDefensor) {
			case 0:
				System.out.println(defensor.getNombre() + " ataca.");
				 dañoP2 = puntosDaño(personaje2);
				
				break;
			case 1:
				System.out.println(defensor.getNombre() + " Defiende.");
				dañoP2=0;
				
				break;
			case 2:
				System.out.println(defensor.getNombre() + " Esquiva.");
				dañoP2=0;				
				break;
			}
			//accion total
			if(movimientoAtacante==0 && movimientoDefensor==0) {
				System.out.println(atacante.getNombre() + " ataca |" + defensor.getNombre() + " ataca");
				atacante.setPuntosVida(atacante.getPuntosVida()- dañoP2);
				defensor.setPuntosVida(defensor.getPuntosVida()- dañoP1);
				System.out.print("Vida " + atacante.getNombre() + ": " + atacante.getPuntosVida() + " | " + defensor.getPuntosVida() + " :" + defensor.getNombre() + " Vida");
			}
			if(movimientoAtacante==0 && movimientoDefensor==1) {
				System.out.println(atacante.getNombre() + " ataca |" + defensor.getNombre() + " defiende");
				defensor.setPuntosVida(defensor.getPuntosVida()- dañoP1);
				System.out.print("Vida " + atacante.getNombre() + ": " + atacante.getPuntosVida() + " | " + defensor.getPuntosVida() + " :" + defensor.getNombre() + " Vida");
			}
			if(movimientoAtacante==1 && movimientoDefensor==0) {
				System.out.println(atacante.getNombre() + " defiende |" + defensor.getNombre() + " ataca");
				atacante.setPuntosVida(atacante.getPuntosVida()- dañoP2);
				System.out.print("Vida " + atacante.getNombre() + ": " + atacante.getPuntosVida() + " | " + defensor.getPuntosVida() + " :" + defensor.getNombre() + " Vida");
			}
			if(movimientoAtacante!=0 && movimientoDefensor!=0) {
				System.out.println(atacante.getNombre() + " se esquivan |" + defensor.getNombre() + " se esquivan");
				atacante.setPuntosVida(atacante.getPuntosVida()- 0);
				defensor.setPuntosVida(defensor.getPuntosVida()- 0);
				System.out.print("Vida " + atacante.getNombre() + ": " + atacante.getPuntosVida() + " | " + defensor.getPuntosVida() + " :" + defensor.getNombre() + " Vida");
			}
			ronda++;
		}
		
		
		
		if (personaje1.getPuntosVida() <= 0 && personaje2.getPuntosVida() <= 0) {
			System.out.println("Empate.");
		} else if (personaje1.getPuntosVida() <= 0) {
			System.out.println(personaje2.getNombre() + " gana.");
			if (personaje2.getPuntosVida() == 100) {
				System.out.println("PERFECT");
			}
		} else {
			System.out.println(personaje1.getNombre() + " gana.");
			if (personaje1.getPuntosVida() == 100) {
				System.out.println("PERFECT");
			}
		}
	}
	
	
	
	
	
	/*
	 * 
	 * 	private double patadaLenta = 0.3;
	private double patadaRapida = 0.7;
	private double punietazoLento = 0.5;
	private double punietazoRapido = 1;
	private double agarreRapido = 3;
	private double agarreLento = 5;
	private double atqEsp1 = 1.5;
	private double atqEsp2 = 2;
	private double atqEsp3 = 3;
	 */
	
	
	
	
	
	public static double puntosDaño(Personaje atacante) {
		double daño=0;
		int ataque = (int) (Math.random()*9+1);
		switch(ataque) {
		//patadaLenta
		case 1:
			daño= atacante.getFuerza() + atacante.getPatadaLenta();
			break;
			//patadaRapida
		case 2:
			daño= atacante.getFuerza() + atacante.getPatadaRapida();
			break;
			//punietazoLento
		case 3:
			daño= atacante.getFuerza() + atacante.getPunietazoLento();
			break;
			//punietazoRapido
		case 4:
			daño= atacante.getFuerza() + atacante.getPunietazoRapido();
			break;
			//agarreRapido
		case 5:
			daño= atacante.getFuerza() + atacante.getAgarreRapido();
			break;
			//agarreLento
		case 6:
			daño= atacante.getFuerza() + atacante.getAgarreLento();
			break;
			//atqEsp1
		case 7:
			daño= atacante.getFuerza() + atacante.getAtqEsp1();
			break;
			//atqEsp2
		case 8:
			daño= atacante.getFuerza() + atacante.getAtqEsp2();
			break;
			//atqEsp3
		case 9:
			daño= atacante.getFuerza() + atacante.getAtqEsp3();
			break;
		
		}
		return daño;
	}
	
	/*public void defensaRandom() {
		double ataque = Math.random()*9+1;
		
	}*/
}
