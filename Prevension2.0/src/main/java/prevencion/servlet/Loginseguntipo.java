package prevencion.servlet;

//import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.BaseDatosUsuarios;
//Loginseguntipo por cambio de requisitos del trabajo exigidose dejo su uso(renombrado de LoginServlet en el grupal2) se
@WebServlet("/Loginseguntipo")
public class Loginseguntipo extends HttpServlet {
    private static final long serialVersionUID = 1L;

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirigir a la página de inicio de sesión (login.jsp)
//    	getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
    	 
//    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros de la solicitud (rut y clave)
     //   String tipousu = request.getParameter("tipo");
       // String clave = request.getParameter("clave");

        // Verificar las credenciales del usuario utilizando la base de datos simulada
     //   BaseDatosUsuarios baseDatos = new BaseDatosUsuarios();
//        String tipoUsuario = baseDatos.verificarCredenciale(tipousu, clave);

        // Redirigir según el tipo de usuario
        //if (tipoUsuario != null) {
        //    switch (tipoUsuario) {
        //        case "cliente":
        //            response.sendRedirect("/views/home.jsp");
        //            break;
       //         case "administrador":
       //             response.sendRedirect("/views/home.jsp");
       //             break;
       //         case "profesional":
      //              response.sendRedirect("/views/home.jsp");
     //               break;
            }
     //   } else {
            // Si las credenciales son incorrectas, redirigir a la página de login con un mensaje de error
    //        response.sendRedirect("/Views/login.jsp?error=1");
  //      }
  //  }
//}