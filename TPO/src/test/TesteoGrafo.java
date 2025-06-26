package test;

import interfaz.*;
import modelo.*;

public class TesteoGrafo {
	public static void main(String[] args) {
		IGrafo grafo= new Grafo();
		
		ICalle calle1= new Calle("San Juan");
		
		ICalle calle2= new Calle("Rincon");
		
		ICalle calle3= new Calle("Belgrano");
		
		ICalle calle4=new Calle("Carlos Calvo");
		
		ICalle calle5= new Calle("Independencia");
		
		grafo.agregarNodo(calle1);
		grafo.agregarNodo(calle2);
		grafo.agregarNodo(calle3);
		grafo.agregarNodo(calle4);
		grafo.agregarNodo(calle5);
		
		grafo.agregarArista(calle1, calle2, 1);
        grafo.agregarArista(calle2, calle3, 2);
        grafo.agregarArista(calle3, calle5, 10);
        grafo.agregarArista(calle5, calle4, 5);
        grafo.agregarArista(calle4, calle1, 1);
        
        grafo.mostarListaAdyacencia();
	}
}
