package basedatitos;

public class Administrativo extends Usuario implements Asesoria {

	// Atributos

	private String area;
	private String experienciaPrevia;

	// Constructor con parámetros
	public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, getRut(), getClave());
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	// Constructor sin parámetros
	public Administrativo() {

	}

	//
	// Métodos accesores para area
	public String getarea() {
		return area;
	}

	public void setarea(String area) {
		this.area = area;
	}

	// Métodos accesores para experienciaPrevia

	public String experienciaPrevia() {
		return experienciaPrevia;
	}

	public void setexperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: " + area);
		System.out.println("Experiencia previa: " + experienciaPrevia);
	}
}
