package fusionar;



public class Principal {

	public static void main(String[] args) {

		Gato miGato=new Gato("Lulu","Verde");

		miGato.MandarMensaje();

Ajolote miAjolote=new Ajolote("Alfredo","Rosa");
		
		miAjolote.MandarMensaje();

		Perro miPerro=new Perro("Pepe",2,"Azul");
		
		miPerro.MandarMensaje();
		
	}

}
