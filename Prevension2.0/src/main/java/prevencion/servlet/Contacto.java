package prevencion.servlet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contacto
 */
@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Formulario de Contacto</title></head><body>");
        out.println("<h1>Formulario de Contacto</h1>");
        out.println("<form method='post' action='ContactoServlet'>");
        out.println("Nombre: <input type='text' name='nombre'><br>");
        out.println("Email: <input type='email' name='email'><br>");
        out.println("Mensaje: <textarea name='mensaje'></textarea><br>");
        out.println("<input type='submit' value='Enviar'>");
        out.println("</form>");
        out.println("</body></html>");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesar los datos del formulario de contacto enviado por POST
        String nombre = request.getParameter("nombre");

        // Aquí puedes implementar la lógica para enviar el mensaje o guardar los datos en una base de datos

        // Envía una respuesta al cliente
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Gracias por tu mensaje</title></head><body>");
        out.println("<h1>Gracias por tu mensaje, " + nombre + "!</h1>");
        out.println("<p>Nos pondremos en contacto contigo pronto.</p>");
        out.println("</body></html>");
        out.close();
    }
}