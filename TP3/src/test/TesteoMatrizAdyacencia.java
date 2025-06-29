package test;

import interfaz.IGrafo;
import interfaz.IPersona;
import modelo.Grafo;
import modelo.Persona;

public class TesteoMatrizAdyacencia {
	public static void main(String[] args) {
		IPersona p1= new Persona("Ana ","45675251");
		IPersona p2= new Persona("Bruno ", "26789987");
		IPersona p3= new Persona("Carla", "50780923");
		IPersona p4= new Persona("Dario", "86489098");
		IPersona p5= new Persona("Elena ", "12345978");
		
		
		
		IGrafo grafo= new Grafo(false);
		
		grafo.agregarNodo(p1);
		grafo.agregarNodo(p2);
		grafo.agregarNodo(p3);
		grafo.agregarNodo(p4);
		grafo.agregarNodo(p5);
		
		grafo.agregarArista(p1, p2); //Ana-Bruno
		grafo.agregarArista(p1, p3);// Ana-Carla
		grafo.agregarArista(p2, p4);// Bruno-Dario
		grafo.agregarArista(p3, p5);// Carla-Elena
		
		
		
		grafo.matrizAdyacencia();
		
	
	}

}
