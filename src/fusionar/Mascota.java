package fusionar;

public class Mascota {

	private String nombre;
	
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no");
	}

}
