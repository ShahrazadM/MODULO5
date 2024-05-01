package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contenedor {

    private static final Asesoria[] listaUsuarios = null;
	private List<Cliente> listaClientes;
    private List<Profesional> listaProfesionales;
    private List<Administrativo> listaAdministrativos;
    private List<Capacitacion> listaCapacitaciones;

    // Constructor
    public Contenedor() {
        listaClientes = new ArrayList<>();
        listaProfesionales = new ArrayList<>();
        listaAdministrativos = new ArrayList<>();
        listaCapacitaciones = new ArrayList<>();
    }

    // Métodos para almacenar usuarios
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void agregarProfesional(Profesional profesional) {
        listaProfesionales.add(profesional);
    }

    public void agregarAdministrativo(Administrativo administrativo) {
        listaAdministrativos.add(administrativo);
    }

    // Método para almacenar una capacitación
    public void agregarCapacitacion(Capacitacion capacitacion) {
        listaCapacitaciones.add(capacitacion);
    }

    // Métodos para obtener listas de usuarios y capacitaciones
    public List<Cliente> obtenerClientes() {
        return listaClientes;
    }

    public List<Profesional> obtenerProfesionales() {
        return listaProfesionales;
    }

    public List<Administrativo> obtenerAdministrativos() {
        return listaAdministrativos;
    }

    public List<Capacitacion> obtenerCapacitaciones() {
        return listaCapacitaciones;
    }

    
   
 // Método para listar todas las capacitaciones y devolver la lista
    public List<Capacitacion> listarCapacitaciones() {
        return listaCapacitaciones;
    }
    // Método para ingresar un nuevo usuario
    public void ingresarNuevoUsuario(Scanner scanner) {
        System.out.println("Ingrese el tipo de usuario (cliente, profesional, administrativo): ");
        String tipoUsuario = scanner.next();
        scanner.nextLine(); // Limpiar el buffer de entrada

        switch (tipoUsuario.toLowerCase()) {
            case "cliente":
                Cliente cliente = new Cliente();
                // Aquí ingresa la lógica para solicitar y establecer los datos del cliente
                almacenarCliente(cliente);
                System.out.println("Cliente almacenado exitosamente.");
                break;
            case "profesional":
                Profesional profesional = new Profesional();
                // Aquí ingresa la lógica para solicitar y establecer los datos del profesional
                almacenarProfesional(profesional);
                System.out.println("Profesional almacenado exitosamente.");
                break;
            case "administrativo":
                Administrativo administrativo = new Administrativo();
                // Aquí ingresa la lógica para solicitar y establecer los datos del administrativo
                agregarAdministrativo(administrativo);
                System.out.println("Administrativo almacenado exitosamente.");
                break;
            default:
                System.out.println("Tipo de usuario no válido.");
        }
    }

	private void almacenarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	private void almacenarProfesional(Profesional profesional) {
		// TODO Auto-generated method stub
		
	}

	public void almacenarCapacitacion(Capacitacion capacitacion) {
	    listaCapacitaciones.add(capacitacion);
	}

	public static Asesoria[] getListausuarios() {
		return listaUsuarios;
	}
}
	




