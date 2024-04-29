package basedatitos;


	import java.util.HashMap;
	import java.util.Map;

	public class BaseDatosUsuarios {
	    private Map<String, String> usuarios;

	    public BaseDatosUsuarios() {
	        usuarios = new HashMap<>();
	        // Aquí agregas usuarios a la base de datos
	        usuarios.put("rut1", "123");
	        usuarios.put("rut2", "234");
	        
	    }

	    // Método para verificar las credenciales del usuario
	    public boolean verificarCredenciales(String rut, String clave) {
	        // Obtener la clave asociada al rut
	        String claveGuardada = usuarios.get(rut);
	        // Verificar si la clave coincide con la guardada en la base de datos
	        return claveGuardada != null && claveGuardada.equals(clave);
	    }
	}