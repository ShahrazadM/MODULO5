package prevencion.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import basedatitos.BaseDatosUsuarios;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros de la solicitud (rut y clave)
        String rut = request.getParameter("rut");
        String clave = request.getParameter("clave");

        // Verificar las credenciales del usuario utilizando la base de datos simulada
        BaseDatosUsuarios baseDatos = new BaseDatosUsuarios();
        boolean credencialesCorrectas = baseDatos.verificarCredenciales(rut, clave);

        if (credencialesCorrectas) {
            // Si las credenciales son correctas, redirigir a la página home.jsp
            response.sendRedirect("/views/home.jsp");
        } else {
            // Si las credenciales son incorrectas, redirigir a la página de login con un mensaje de error
            response.sendRedirect("/views/login.jsp?error=1");
        }
    }
}