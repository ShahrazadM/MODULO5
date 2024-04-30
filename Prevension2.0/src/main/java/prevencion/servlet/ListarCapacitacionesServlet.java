

package prevencion.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Capacitacion;
import Model.Contenedor;

@WebServlet("/ListarCapacitacionesServlet")
public class ListarCapacitacionesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	getServletContext().getRequestDispatcher("/views/listarcapacitacion.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        listarCapacitaciones(request, response);
    }

    private void listarCapacitaciones(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener el contenedor de capacitaciones desde la sesión
        Contenedor contenedor = (Contenedor) request.getSession().getAttribute("contenedor");

        // Si el contenedor no existe en la sesión, redirigir a una página de error
        if (contenedor == null) {
            response.sendRedirect("error.jsp");
            return;
        }

        // Obtener la lista de capacitaciones del contenedor
        List<Capacitacion> capacitaciones = contenedor.listarCapacitaciones();

        // Establecer la lista de capacitaciones como un atributo en la solicitud
        request.setAttribute("capacitaciones", capacitaciones);
     // 
     // Redirigir a la página de confirmacion
        getServletContext().getRequestDispatcher("/views/mensajeconfirmacion.jsp").forward(request, response);

    }
}
