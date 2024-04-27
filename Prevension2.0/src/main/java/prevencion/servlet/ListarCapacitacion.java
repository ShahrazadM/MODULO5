package prevencion.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ListarCapacitaciones
 */

@WebServlet("/ListarCapacitacion")
public class ListarCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private List<String> capacitaciones = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Establecer atributo en la solicitud para que la página JSP pueda acceder a las capacitaciones
    	request.setAttribute("capacitaciones", capacitaciones);

        // Reenviar la solicitud a la página JSP para que la procese y la muestre
    	getServletContext().getRequestDispatcher("/listarcapacitacion.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesar los datos del formulario de crear capacitación enviado por POST
        String titulo = request.getParameter("titulo");
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");

        // Construir la información de la capacitación
        String capacitacion = "Título: " + titulo + ", Descripción: " + descripcion + ", Fecha: " + fecha;

        // Agregar la capacitación a la lista
        capacitaciones.add(capacitacion);

        // Redirigir al usuario a la página de listado de capacitaciones
        response.sendRedirect(request.getContextPath() + "/ListarCapacitaciones");
    }
}
