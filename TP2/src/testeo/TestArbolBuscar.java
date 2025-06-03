package testeo;

import modelo.*;
import interfaz.*;
public class TestArbolBuscar {
	public static void main(String[] args) {
		IPersona p1= new Persona("Gonzalo","25456478");
		IPersona p2 = new Persona("Lucas", "40000000");
		IPersona p3 = new Persona("Ana", "48777777");
		IPersona p4= new Persona("Zoe","56789345");
		IPersona p5= new Persona("Jose","24567890");
		IArbol a= new Arbol();
		
		a.insertar(p1);
		a.insertar(p2);
		a.insertar(p3);
		a.insertar(p4);
		
		INodo buscado= a.buscar(p4);
		System.out.println(buscado!=null ? buscado.getDato() : "No encontrado");
	}

}
