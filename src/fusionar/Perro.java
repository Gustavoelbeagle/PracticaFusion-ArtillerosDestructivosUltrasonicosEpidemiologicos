package fusionar;

public class Perro extends Mascota {

	private String tipo;

	public Perro(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y hago guau guau");
	}
}