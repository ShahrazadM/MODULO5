package Model;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Contenedor {

    private List<Asesoria> listaUsuarios;
    private List<Capacitacion> listaCapacitaciones;

    // Constructor
    public Contenedor() {
        listaUsuarios = new ArrayList<>();
        listaCapacitaciones = new ArrayList<>();
    }

    // Método para almacenar un cliente en la lista de usuarios
    public void almacenarCliente(Cliente cliente) {
        listaUsuarios.add(cliente);
    }

    // Método para almacenar un profesional en la lista de usuarios
    public void almacenarProfesional(Profesional profesional) {
        listaUsuarios.add(profesional);
    }

    // Método para almacenar un administrativo en la lista de usuarios
    public void almacenarAdministrativo(Administrativo administrativo) {
        listaUsuarios.add(administrativo);
    }

    // Método para almacenar una capacitación en la lista de capacitaciones
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        listaCapacitaciones.add(capacitacion);
    }

    // Método para eliminar un usuario de la lista de usuarios por su RUN
    public void eliminarUsuario(int runUsuario) {
        Iterator<Asesoria> iterator = listaUsuarios.iterator();
        while (iterator.hasNext()) {
            Asesoria usuario = iterator.next();
            if (usuario instanceof Usuario && ((Usuario) usuario).getRun() == runUsuario) {
                iterator.remove();
                System.out.println("Usuario eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Usuario con RUN " + runUsuario + " no encontrado.");
    }

    
    //Método para listar todos los usuarios
    public void listarUsuarios() {
        for (Asesoria asesoria : listaUsuarios) {
            System.out.println(asesoria);
        }
    }

    
    
    // Método para listar usuarios por tipo
    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria asesoria : listaUsuarios) {
            if (asesoria.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                System.out.println(asesoria);
            }
        }
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
                almacenarAdministrativo(administrativo);
                System.out.println("Administrativo almacenado exitosamente.");
                break;
            default:
                System.out.println("Tipo de usuario no válido.");
        }
    }
}
	




