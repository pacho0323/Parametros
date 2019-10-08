package imprimir;


import org.junit.Test; 

public class Mostrar {
	
@Test
	public void Mostrar() {	
	String greeting = System.getenv("dato");
		if(greeting.equals("hola2")) {
			System.out.println("hola");
		}
	}

}
