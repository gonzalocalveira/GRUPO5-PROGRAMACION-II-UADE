package testeo;


import modelo.Persona;
import interfaz.IPersona;
public class TestoPersona {
	public static void main(String[] args) {
		IPersona p1= new Persona("Gonzalo","45291838");
		
		System.out.println(p1);
		
		
	}

}
