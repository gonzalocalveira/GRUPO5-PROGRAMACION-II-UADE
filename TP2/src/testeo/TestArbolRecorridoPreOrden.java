package testeo;

import interfaz.IArbol;
import interfaz.IPersona;
import modelo.Arbol;
import modelo.Persona;

public class TestArbolRecorridoPreOrden {
	public static void main(String[] args) {
		IPersona p1= new Persona("Julian","45675251");
		IPersona p2= new Persona("Di Maria", "26789987");
		IPersona p3= new Persona("Roberto", "50780923");
		IPersona p4= new Persona("Hazard", "86489098");
		IPersona p5= new Persona("Miguel", "12345978");
		
		
		IArbol arbol= new Arbol();
		
		
		arbol.insertar(p1);
		arbol.insertar(p2);
		arbol.insertar(p3);
		arbol.insertar(p4);
		arbol.insertar(p5);
		
		arbol.recorridoPre_Orden();
		
	}
}
