package prevencion.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basedatitos.Contenedor;

@WebServlet("/ListarCapacitacionesServlet")
public class ListarCapacitacionesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener el contenedor de capacitaciones desde la sesión
        Contenedor contenedor = (Contenedor) request.getSession().getAttribute("contenedor");

        // Si el contenedor no existe en la sesión, redirigir a una página de error
        if (contenedor == null) {
            response.sendRedirect("error.jsp");
            return;
        }

        // Obtener la lista de capacitaciones del contenedor y establecerla como atributo de solicitud
        request.setAttribute("capacitaciones", contenedor.listarCapacitaciones());

        // Redirigir a la vista JSP para mostrar la lista de capacitaciones
        request.getRequestDispatcher("listarcapacitacion.jsp").forward(request, response);
    }
}