package fusionar;

public class Mascota {

	private String nombre;

	public Mascota(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {

		System.out.println("Hola equipo! " + "Soy " + this.nombre + " te voy a contar algo o no");

		System.out.println("Hola equipo precioso! " + "Soy " + this.nombre + " y te voy a contar algo o no");

	}

}
