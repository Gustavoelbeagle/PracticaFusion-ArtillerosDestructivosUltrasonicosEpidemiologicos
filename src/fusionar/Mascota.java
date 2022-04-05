package fusionar;

public class Mascota {

	private String nombre;

	private String sexo;
	
	public Mascota(String nombre, String sexo) {
		this.nombre = nombre;
		this.sexo=sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no y mi sexo es " + "y mi sexo es" + this.getSexo());
	}

}
