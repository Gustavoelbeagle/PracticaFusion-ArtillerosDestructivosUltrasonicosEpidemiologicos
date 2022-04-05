package fusionar;

public class Ajolote extends Mascota{

	private String color;

	public Ajolote(String nombre, String color) {
		super(nombre);
		this.color = color;
	}
	
	public void MandarMensaje() {
		System.out.println("Glu glu" + this.getNombre() + " y nado");
	}
}
