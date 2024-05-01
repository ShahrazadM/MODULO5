package prevencion.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IngresoLoginServlet
 */
@WebServlet("/Autorizacioningreso")
public class Autorizacioningreso extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autorizacioningreso() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario de login
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        
        // Verificar si el usuario y la contraseña son correctos
        if ("admin".equals(usuario) && "1234".equals(contrasena)) {
            // Crear una sesión para el usuario
            request.getSession().setAttribute("usuario", usuario);
            // Redireccionar al servlet de Contacto
            response.sendRedirect(request.getContextPath() + "/views/contacto.jsp");
        } else {
            // Si las credenciales son incorrectas, redirigir al formulario de login
        	getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // No es necesario implementar el doPost en este caso
        // Se puede mantener vacío o redirigir a doGet
        doGet(request, response);
    }

}