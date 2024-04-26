package prevencion.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario de inicio de sesión
        String rut = request.getParameter("rut");
        String clave = request.getParameter("clave");
        
        // Realizar la autenticación (aquí deberías tener tu propia lógica de autenticación)
        // Por ejemplo, podrías tener una base de datos de usuarios y comparar el rut y la clave con los registros de la base de datos
        
        // Supongamos que la autenticación es exitosa y se determina el tipo de usuario
        String tipoUsuario = determinarTipoUsuario(rut);
        
        // Dependiendo del tipo de usuario, redirigir a la página correspondiente
        if (tipoUsuario != null) {
            if (tipoUsuario.equals("Cliente")) {
                response.sendRedirect("cliente.jsp");
            } else if (tipoUsuario.equals("Administrativo")) {
                response.sendRedirect("administrativo.jsp");
            } else if (tipoUsuario.equals("Profesional")) {
                response.sendRedirect("profesional.jsp");
            }
        } else {
            // Si no se pudo determinar el tipo de usuario, redirigir a una página de error o mostrar un mensaje de error
            response.sendRedirect("error.jsp");
        }
    }
    
    // Método de ejemplo para determinar el tipo de usuario basado en el RUT
    private String determinarTipoUsuario(String rut) {
        // Aquí deberías tener tu propia lógica para determinar el tipo de usuario
        // Podrías consultar una base de datos o algún otro método de autenticación
        
        // En este ejemplo, simplemente retornamos un tipo de usuario basado en el primer dígito del RUT
        // (esto es solo para propósitos de demostración)
        char primerDigito = rut.charAt(0);
        if (primerDigito == '1') {
            return "Cliente";
        } else if (primerDigito == '2') {
            return "Administrativo";
        } else if (primerDigito == '3') {
            return "Profesional";
        } else {
            return null; // Tipo de usuario desconocido
        }
    }
}