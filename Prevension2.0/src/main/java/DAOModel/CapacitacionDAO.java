package DAOModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexion.ConexionBD;
import Model.Capacitacion;

public class CapacitacionDAO {
    
    // Método para listar todas las capacitaciones registradas en la base de datos
    public List<Capacitacion> listarCapacitaciones() {
        List<Capacitacion> capacitaciones = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        
        try {
            conexion = ConexionBD.obtenerConexion();
            String sql = "SELECT * FROM capacitaciones";
            consulta = conexion.prepareStatement(sql);
            resultado = consulta.executeQuery();
            
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                // Aquí puedes obtener el resto de los campos necesarios de la tabla capacitaciones
                // y construir objetos Capacitacion para agregar a la lista
                Capacitacion capacitacion = new Capacitacion(id, id, nombre, nombre, nombre, nombre, id);
                capacitaciones.add(capacitacion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultado != null) resultado.close();
                if (consulta != null) consulta.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return capacitaciones;
    }
    
    // Método para registrar una nueva capacitación en la base de datos
    public void registrarCapacitacion(Capacitacion capacitacion) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        
        try {
            conexion = ConexionBD.obtenerConexion();
            String sql = "INSERT INTO capacitaciones (nombre) VALUES (?)";
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, capacitacion.getNombre());
            // Si hay más campos en la tabla capacitaciones, necesitarás establecerlos aquí
            consulta.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (consulta != null) consulta.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}