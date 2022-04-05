package fusionar;

public class Ajolote extends Mascota{

	private String color;

	public Ajolote(String nombre, String medio, String color) {
		super(nombre, medio);
		this.color = color;
	}
	
	public void MandarMensaje() {
		System.out.println("Glu glu" + this.getNombre() + " y nado");
	}
}
