package prevencion.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Capacitacion;
import Model.Contenedor;

@WebServlet("/CrearCapacitacionServlet")
public class CrearCapacitacionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirigir al formulario de creación de capacitación
        request.getRequestDispatcher("/views/crearcapacitacion.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los parámetros del formulario de capacitación
        int identificador = Integer.parseInt(request.getParameter("identificador"));
        String rutCliente = request.getParameter("rutCliente"); // Cambiado a String
        String dia = request.getParameter("dia");
        String hora = request.getParameter("hora");
        String lugar = request.getParameter("lugar");
        String duracion = request.getParameter("duracion");
        int cantidadAsistentes = Integer.parseInt(request.getParameter("cantidadAsistentes"));

        // Crear un objeto Capacitacion con los datos del formulario
        Capacitacion nuevaCapacitacion = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion,
                cantidadAsistentes);

        // Obtener el contenedor de capacitaciones desde la sesión
        Contenedor contenedor = (Contenedor) request.getSession().getAttribute("contenedor");

        // Si el contenedor no existe en la sesión, crear uno nuevo y guardarlo en la sesión
        if (contenedor == null) {
            contenedor = new Contenedor();
            request.getSession().setAttribute("contenedor", contenedor);
        }

        // Guardar la nueva capacitación en el contenedor
        contenedor.agregarCapacitacion(nuevaCapacitacion);

        // Redirigir a la página de mensaje de confirmación
        request.getRequestDispatcher("/views/mensajeconfirmacion.jsp").forward(request, response);
    }
}