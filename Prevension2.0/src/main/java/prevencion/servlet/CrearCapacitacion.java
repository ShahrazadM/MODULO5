package prevencion.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	getServletContext().getRequestDispatcher("/Views/crearcapacitacion").forward(request, response);
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Formulario de Crear Capacitación</title></head><body>");
        out.println("<h1>Formulario de Crear Capacitación</h1>");
        out.println("<form method='post' action='CrearCapacitacionServlet'>");
        out.println("Título: <input type='text' name='titulo'><br>");
        out.println("Descripción: <textarea name='descripcion'></textarea><br>");
        out.println("Fecha: <input type='date' name='fecha'><br>");
        out.println("<input type='submit' value='Crear'>");
        out.println("</form>");
        out.println("</body></html>");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesar los datos del formulario de crear capacitación enviado por POST
        String titulo = request.getParameter("titulo");
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");

        // Aquí puedes implementar la lógica para guardar los datos de la capacitación en una base de datos

        // Envía una respuesta al cliente
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Capacitación Creada</title></head><body>");
        out.println("<h1>Capacitación Creada Exitosamente</h1>");
        out.println("<p>Título: " + titulo + "</p>");
        out.println("<p>Descripción: " + descripcion + "</p>");
        out.println("<p>Fecha: " + fecha + "</p>");
        out.println("</body></html>");
        out.close();
    }
}