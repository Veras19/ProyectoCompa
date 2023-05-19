package StreetF;


public class Personaje {

	// Datos de los personajes
	private String nombre;
	private String paisProcedencia;
	private String historiaPersonal;
	// caracteres fisicos
	private double altura;
	private double peso;
	private String colorPelo;
	private String escenario;
	// datos para la lucha
	private double puntosVida = 100;
	private int velocidad;
	private double fuerza = (int) (Math.random() * 10) + 1;
	private double patadaLenta = 0.3;
	private double patadaRapida = 0.7;
	private double punietazoLento = 0.5;
	private double punietazoRapido = 1;
	private double agarreRapido = 3;
	private double agarreLento = 5;
	private double atqEsp1 = 1.5;
	private double atqEsp2 = 2;
	private double atqEsp3 = 3;
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public String getEscenario() {
		return escenario;
	}

	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}

	public double getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(double puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}

	public double getPatadaLenta() {
		return patadaLenta;
	}

	public void setPatadaLenta(double patadaLenta) {
		this.patadaLenta = patadaLenta;
	}

	public double getPatadaRapida() {
		return patadaRapida;
	}

	public void setPatadaRapida(double patadaRapida) {
		this.patadaRapida = patadaRapida;
	}

	public double getPunietazoLento() {
		return punietazoLento;
	}

	public void setPunietazoLento(double punietazoLento) {
		this.punietazoLento = punietazoLento;
	}

	public double getPunietazoRapido() {
		return punietazoRapido;
	}

	public void setPunietazoRapido(double punietazoRapido) {
		this.punietazoRapido = punietazoRapido;
	}

	public double getAgarreRapido() {
		return agarreRapido;
	}

	public void setAgarreRapido(double agarreRapido) {
		this.agarreRapido = agarreRapido;
	}

	public double getAgarreLento() {
		return agarreLento;
	}

	public void setAgarreLento(double agarreLento) {
		this.agarreLento = agarreLento;
	}

	public double getAtqEsp1() {
		return atqEsp1;
	}

	public void setAtqEsp1(double atqEsp1) {
		this.atqEsp1 = atqEsp1;
	}

	public double getAtqEsp2() {
		return atqEsp2;
	}

	public void setAtqEsp2(double atqEsp2) {
		this.atqEsp2 = atqEsp2;
	}

	public double getAtqEsp3() {
		return atqEsp3;
	}

	public void setAtqEsp3(double atqEsp3) {
		this.atqEsp3 = atqEsp3;
	}

	/**
	 * Metodo que devuelve el danio inflingido por un ataque pasado.
	 * 
	 * @param tipoAtq, uno de los atributos de ataque del objeto personaje.
	 * @return el valor de danio del ataque pasado.
	 */
	public double ataque(double ataqueX) {
		return ataqueX * fuerza;
	}

	
	/**
	 * 
	 * constructor Personaje
	 * @param nombre
	 * @param paisProcedencia
	 * @param historiaPersonal
	 * @param altura
	 * @param peso
	 * @param colorPelo
	 * @param escenario
	 * @param velocidad
	 */
	public Personaje(String nombre, String paisProcedencia, String historiaPersonal, double altura, double peso,
			String colorPelo, String escenario, int velocidad) {
		super();
		this.nombre = nombre;
		this.paisProcedencia = paisProcedencia;
		this.historiaPersonal = historiaPersonal;
		this.altura = altura;
		this.peso = peso;
		this.colorPelo = colorPelo;
		this.escenario = escenario;
		this.velocidad = velocidad;
	}
	
	public Personaje() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisProcedencia() {
		return paisProcedencia;
	}

	public void setPaisProcedencia(String paisProcedencia) {
		this.paisProcedencia = paisProcedencia;
	}

	public String getHistoriaPersonal() {
		return historiaPersonal;
	}

	public void setHistoriaPersonal(String historiaPersonal) {
		this.historiaPersonal = historiaPersonal;
	}



}
