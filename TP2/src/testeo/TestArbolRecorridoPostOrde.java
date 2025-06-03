package testeo;

import interfaz.IArbol;
import interfaz.IPersona;
import modelo.Arbol;
import modelo.Persona;

public class TestArbolRecorridoPostOrde {
	public static void main(String[] args) {
		IPersona p1= new Persona("Lucia","45675291");
		IPersona p2= new Persona("Carlos", "26789786");
		IPersona p3= new Persona("Ana", "98780923");
		IPersona p4= new Persona("Zoe", "56789098");
		IPersona p5= new Persona("Miguel", "12345678");
		
		
		IArbol arbol= new Arbol();
		
		
		arbol.insertar(p1);
		arbol.insertar(p2);
		arbol.insertar(p3);
		arbol.insertar(p4);
		arbol.insertar(p5);
		
		arbol.recorridoPostOrden();
		
	}
}
