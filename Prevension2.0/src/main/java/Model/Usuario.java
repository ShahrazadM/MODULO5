package Model;

import java.time.LocalDate;
import java.time.Period;

public abstract class Usuario implements Asesoria {

	// Atributos

	private String nombre;
	private String fechaNacimiento;
	private static int rut;
	private static String clave;

	// Constructor con parametros de Usuario

	public Usuario(String nombre, String fechaNacimiento, int rut, String clave) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		Usuario.setClave(clave);
	}

	// Constructor sin parámetros de Usuario
	public Usuario() {
	}
	// Metodos accesadores get y set de Usuario

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getfechaNacimiento() {
		return fechaNacimiento;
	}

	public void setfechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public static int getrut() {
		return getRut();
	}

	
	public static String getclave() {
		return getClave();
	}

	public void setrut(String clave) {
		Usuario.setClave(clave);
	}
	

	

	
	
	
//Metodos Obligatorios para usuario...del proyecto
//1)Metodo Mostrar EdadCalcular la edad a partir de la fecha de nacimiento y mostrar un mensaje
	public void mostrarEdad() {
		// Obtener la fecha actual
		LocalDate ahora = LocalDate.now();

		// Parsear la fecha de nacimiento a LocalDate
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento);

		// Calcular la diferencia de años entre la fecha actual y la fecha de nacimiento
		Period periodo = Period.between(fechaNac, ahora);
		int edad = periodo.getYears();

		// Mostrar un mensaje con la edad del usuario
		System.out.println("El usuario tiene " + edad + " años.");
	}
// 2)Metodo Analizar Usuario..
	public void analizarUsuario() {
		System.out.println("Nombre: " + nombre);
		System.out.println("RUT: " + getrut());
	}
//Metodo complemtario para hacer uso del metodo Mostrar Edad junto al de analizar usuario
	// Método para mostrar los datos del usuario
    public void mostrarDatosUsuario() {
        System.out.println("Datos del Usuario:");
        analizarUsuario(); // Llama al método analizarUsuario() para mostrar nombre y RUN
        mostrarEdad(); // Llama al método mostrarEdad() para mostrar la edad del usuario
    }
	
	
	@Override
	public String toString() {
		return "Usuario{" + "nombre='" + nombre + '\'' + ", fechaNacimiento='" + fechaNacimiento + '\'' + ", rut=" + getrut()
				+ '}';
	}

	public int getRun() {
		return getrut();
	}

	public static String getClave() {
		return clave;
	}

	public static void setClave(String clave) {
		Usuario.clave = clave;
	}

	public static int getRut() {
		return rut;
	}

	public void setRut(int rut) {
	}

}
