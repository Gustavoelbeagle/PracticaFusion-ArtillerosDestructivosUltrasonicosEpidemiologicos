package fusionar;

public class Gato extends Mascota {

	private String tipo;

	public Gato(String nombre, String medio, String tipo) {
		super(nombre, medio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y hago miau miau");
	}
}
