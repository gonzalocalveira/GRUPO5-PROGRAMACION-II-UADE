package testeo;

import interfaz.IPersona;
import modelo.Persona;
import modelo.Arbol;
import interfaz.IArbol;
public class TestArbolRecorridoInOrder {
	public static void main(String[] args) {
		
		IPersona p1= new Persona("Gonzalo","45675291");
		IPersona p2= new Persona("Carlos", "26789786");
		IPersona p3= new Persona("Ana", "98780923");
		IPersona p4= new Persona("Zoe", "56789098");
		
		
		IArbol arbol= new Arbol();
		
		
		arbol.insertar(p1);
		arbol.insertar(p2);
		arbol.insertar(p3);
		arbol.insertar(p4);
		
		arbol.recorridoInorden();
		
	}

}
