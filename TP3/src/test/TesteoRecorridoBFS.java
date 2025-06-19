package test;

import interfaz.IGrafo;
import interfaz.IPersona;
import modelo.Grafo;
import modelo.Persona;

public class TesteoRecorridoBFS {
	public static void main(String[] args) {
		IPersona p1= new Persona("Ana ","45675251");
		IPersona p2= new Persona("Bruno ", "26789987");
		IPersona p3= new Persona("Carla", "50780923");
		IPersona p4= new Persona("Dario", "86489098");
		IPersona p5= new Persona("Elena ", "12345978");
		
		
		
		IGrafo grafo= new Grafo(true);
		
		grafo.agregarNodo(p1);
		grafo.agregarNodo(p2);
		grafo.agregarNodo(p3);
		grafo.agregarNodo(p4);
		grafo.agregarNodo(p5);
		
		grafo.agregarArista(p1, p2);
		grafo.agregarArista(p1, p3);
		grafo.agregarArista(p2, p4);
		grafo.agregarArista(p3, p5);
		
		
		
		grafo.recorridoBFS(p2);
	}
}

