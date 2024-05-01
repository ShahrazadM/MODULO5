package prevencion.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Capacitacion;
import Model.Contenedor;

@WebServlet("/ListarCapacitacionesServlet")
public class ListarCapacitacionesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
        // Crear las tres capacitaciones
        Capacitacion capacitacion1 = new Capacitacion(1, 123456, "Lunes", "10:00", "Salón A", "2 horas", 20);
        Capacitacion capacitacion2 = new Capacitacion(2, 789012, "Martes", "14:00", "Salón B", "3 horas", 15);
        Capacitacion capacitacion3 = new Capacitacion(3, 345678, "Miércoles", "09:30", "Salón C", "1.5 horas", 25);

        // Obtener el contenedor de capacitaciones desde la sesión
        Contenedor contenedor = (Contenedor) getServletContext().getAttribute("contenedor");

        // Si el contenedor no existe en el contexto de la aplicación, crear uno nuevo y guardarlo en el contexto
        if (contenedor == null) {
            contenedor = new Contenedor();
            getServletContext().setAttribute("contenedor", contenedor);
        }

        // Almacenar las capacitaciones en el contenedor
        contenedor.almacenarCapacitacion(capacitacion1);
        contenedor.almacenarCapacitacion(capacitacion2);
        contenedor.almacenarCapacitacion(capacitacion3);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        listarCapacitaciones(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        listarCapacitaciones(request, response);
    }

    private void listarCapacitaciones(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener el contenedor de capacitaciones desde el contexto de la aplicación
        Contenedor contenedor = (Contenedor) getServletContext().getAttribute("contenedor");

        // Si el contenedor no existe en el contexto de la aplicación, redirigir a una página de error
        if (contenedor == null) {
            response.sendRedirect("error.jsp");
            return;
        }

        // Obtener la lista de capacitaciones del contenedor
        List<Capacitacion> capacitaciones = contenedor.listarCapacitaciones();
        
        // Depuración: Imprimir las capacitaciones obtenidas
        System.out.println("Lista de capacitaciones obtenidas:");
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println("ID: " + capacitacion.getIdentificador() + ", Cliente: " + capacitacion.getRutCliente() + ", Día: " + capacitacion.getDia() + ", Hora: " + capacitacion.getHora() + ", Lugar: " + capacitacion.getLugar() + ", Duración: " + capacitacion.getDuracion() + ", Asistentes: " + capacitacion.getCantidadAsistentes());
        }

        // Establecer la lista de capacitaciones como un atributo en la solicitud
        request.setAttribute("capacitaciones", capacitaciones);

        // Redirigir a la página de listado de capacitaciones
        getServletContext().getRequestDispatcher("/views/listarcapacitacion.jsp").forward(request, response);
    }
}