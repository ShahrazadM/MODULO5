package prevencion.servlet;
import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
@WebServlet("/mensajeconfirmacioncontacto")
public class mensajeconfirmacioncontacto extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Leer las cookies del servlet Inicio
        Cookie[] cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                // Verificar si la cookie es la de nombre de usuario
                if (cookie.getName().equals("nombreUsuario")) {
                    String nombreUsuario = cookie.getValue();
                    // Imprimir la cookie de nombre de usuario
                    out.println("Nombre de usuario: " + nombreUsuario);
                    // Puedes asignar el nombre de usuario como atributo de solicitud para usarlo en la página JSP
                    request.setAttribute("nombreUsuario", nombreUsuario);
                }
            }
        }
        
        // Procesar los datos del formulario de contacto enviado por POST
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        // Establecer cookie de nombre de usuario
        Cookie cookieNombre = new Cookie("nombreUsuario", nombre);
        cookieNombre.setMaxAge(24 * 60 * 60); // Duración de 1 día
        response.addCookie(cookieNombre);
        Cookie cookieEmail = new Cookie("email", email);
        cookieEmail.setMaxAge(24 * 60 * 60); // Duración de 1 día
        response.addCookie(cookieEmail);

        // Establecer sesión de usuario
        HttpSession session = request.getSession();
        session.setAttribute("emailUsuario", email);

        // Imprimir mensaje de confirmación
        out.print("Correo recibido: " + email + ". ¡Gracias!");
        out.close();
    }}
