package fusionar;

public class Gato extends Mascota {

	private String tipo;

	public Gato(String nombre, String tipo, String sexo) {
		super(nombre, sexo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y hago miau miau y mi sexo es" + super.getSexo());
	}
}
