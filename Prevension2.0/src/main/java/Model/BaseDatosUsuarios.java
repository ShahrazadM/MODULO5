package Model;

import java.util.HashMap;
import java.util.Map;

public class BaseDatosUsuarios {
    private Map<String, String> usuarios;

    public BaseDatosUsuarios() {
        usuarios = new HashMap<>();
        // Agregamos usuarios de ejemplo a la base de datos
        usuarios.put("rut1", "123,cliente");
        usuarios.put("rut2", "234,administrador");
        usuarios.put("rut3", "345,profesional");
    }

    // Método para verificar las credenciales del usuario y devolver su tipo
    public String verificarCredenciales(String rut, String clave) {
        // Obtener la información del usuario asociada al rut
        String infoUsuario = usuarios.get(rut);
        if (infoUsuario != null) {
            // Separar la clave y el tipo de usuario
            String[] partes = infoUsuario.split(",");
            String claveGuardada = partes[0];
            String tipoUsuario = partes[1];
            // Verificar si la clave coincide
            if (claveGuardada.equals(clave)) {
                return tipoUsuario;
            }
        }
        // Si las credenciales son incorrectas o el usuario no existe, devolver null
        return null;
    }
}