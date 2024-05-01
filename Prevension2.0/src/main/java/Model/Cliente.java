package Model;

public class Cliente extends Usuario {

	// Atributos

	private int rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	// Constructor con parametros

	public Cliente(String nombre, String fechaNacimiento, int run, int rut, String nombres, String apellidos,
			String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, rut , getclave());
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	// // Constructor sin parámetros
	public Cliente() {

	}

	//// Métodos accesores
	

	public void setrut(int rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String string) {
		this.telefono = string;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Metodos obligatorios

	public String obtenerNombre() {
		return nombres + " " + apellidos;
	}

	public String obtenerSistemaSalud() {
		return (sistemaSalud == 1) ? "Fonasa" : "Isapre";
	}

	
	//Metodos Complementario para mostrar los datos del cliente 
	//haciendo uso de los metodos: obtenerNombre y obtenerSistemaSalud
	
    public void mostrarCliente() {
        System.out.println("Nombre: " + obtenerNombre());
        System.out.println("RUT: " + rut);
        System.out.println("AFP: " + afp);
        System.out.println("Sistema de Salud: " + obtenerSistemaSalud());
    }
    
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Dirección: " + direccion);
		System.out.println("Comuna: " + comuna);
		
	}
}
	