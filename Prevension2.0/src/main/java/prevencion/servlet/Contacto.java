package prevencion.servlet;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basedatitos.ContactoRepository;

/**
 * Servlet implementation class Contacto
 */
@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/Views/contacto.jsp").forward(request, response);
       
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesa los datos del formulario de contacto enviado por POST
        String nombre = request.getParameter("nombre");
        String fechanacimiento = request.getParameter("fechanacimiento");
        String rut = request.getParameter("rut");
        String email = request.getParameter("email");
            // Guardar el contacto en el repositorio
        ContactoRepository repositorio = new ContactoRepository();
        repositorio.agregarContacto(null);;

        // Envía una respuesta al cliente
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Gracias por tu mensaje</title></head><body>");
        out.println("<h1>Gracias por tu mensaje, " + nombre + " " + fechanacimiento + rut + "!</h1>");
        out.println("<p>Nos pondremos en contacto contigo pronto" + email +"! </p>");
        out.println("</body></html>");
        out.close();
    }
}