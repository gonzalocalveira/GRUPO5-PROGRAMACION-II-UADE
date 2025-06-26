package test;

import java.util.List;

import interfaz.*;
import modelo.*;

public class TesteoAStar {
	
	public static void main(String[] args) {
		IGrafo grafo= new Grafo();
		
		ICalle calle1= new Calle("Rincon");
		
		ICalle calle2= new Calle("Avenida San Juan");
		
		ICalle calle3= new Calle("Constitucion");
		
		ICalle calle4=new Calle("Pasco");
		
		ICalle calle5= new Calle("Avenida Entre Rios");
		
		ICalle calle6= new Calle("Sarandi");
		
		ICalle calle7= new Calle("Avenida Hipolito Hirigoyen");
		
		ICalle calle8= new Calle("Combate de los Pozos");
		
		
		
		grafo.agregarNodo(calle1);
		grafo.agregarNodo(calle2);
		grafo.agregarNodo(calle3);
		grafo.agregarNodo(calle4);
		grafo.agregarNodo(calle5);
		grafo.agregarNodo(calle6);
		grafo.agregarNodo(calle7);
		grafo.agregarNodo(calle8);
		
		grafo.agregarArista(calle1, calle3, 1); // Rincon → Constitución
        grafo.agregarArista(calle3, calle4, 1); // Constitución → Pasco
        grafo.agregarArista(calle4, calle2, 1); // Pasco → Av. San Juan
        grafo.agregarArista(calle2, calle8, 10);// Av. San Juan → Combate De los Pozos
        grafo.agregarArista(calle2, calle6, 1); // AV. San Juan → Sarandi
        grafo.agregarArista(calle6, calle7, 1); //Sarandi->AV.H.Hirigoyen
        grafo.agregarArista(calle7, calle5, 1);// Av. H. Hirigoyen → Av. Entre Ríos
        grafo.agregarArista(calle8, calle5, 10);// Combate de los Pozos-> Av.Entre rios
        
        IAStar aStar= new AStar();
        List<ICalle> camino = aStar.encontrarCamino(grafo, calle1, calle5, new Heuristica<>());
		
		
		System.out.println(camino);
		
		
	}
}
