package prevencion.servlet;

import java.io.IOException;


import Model.Contacto;
import Model.ContactoRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/ContactoServlet")
public class ContactoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesar los datos del formulario de contacto enviado por POST
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String mensaje = request.getParameter("mensaje");

        // Validar los datos del formulario (opcional)

        // Crear un nuevo objeto Contacto
        Contacto contacto = new Contacto(nombre, email, mensaje);

        // Guardar el contacto en el repositorio
        ContactoRepository repositorio = new ContactoRepository();
        repositorio.agregarContacto(contacto);

        // Establecer atributos para acceder en la vista JSP
        request.setAttribute("nombre", nombre);
        request.setAttribute("email", email);

        // Redirigir a la vista JSP para mostrar un mensaje de confirmación
        request.getRequestDispatcher("/views/mensajeconfirmacion.jsp").forward(request, response);
    }
}