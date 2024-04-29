package basedatitos;

public class Profesional extends Usuario {
	private String titulo;
	private String fechaIngreso;

	// Constructor con parámetros

	public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, getrut(), getClave());
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;

	}

	// Constructor sin parámetros
	public Profesional() {
	}

////Métodos accesores de Profesional
	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getfechaIngreso() {
		return fechaIngreso;
	}

	public void setfechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: " + titulo);
		System.out.println("Fecha de ingreso: " + fechaIngreso);
	}

}
