package fusionar;

public class Mascota {

	private String nombre;
	
	private String medio;
	
	public Mascota(String nombre, String medio) {
		this.nombre = nombre;
		this.medio = medio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no");
	}

}
