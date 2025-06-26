package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import interfaz.IGrafo;
import interfaz.INodo;

public class Grafo<T> implements IGrafo<T> {

	
	private Map<T, INodo> nodos= new HashMap<>();
	
	
	
	
	@Override
	public void agregarNodo(T nodo) {
		if(!nodos.containsKey(nodo)) {
			nodos.put(nodo, new Nodo<>(nodo));
			
		}
		// TODO Auto-generated method stub
	
	}

	@Override
	public void agregarArista(T origen, T destino, T peso) {
		// TODO Auto-generated method stub
		if(nodos.containsKey(origen) && nodos.containsKey(destino)) {
			INodo nodoOrigen= nodos.get(origen);
			INodo nodoDestino= nodos.get(destino);
			
			nodoOrigen.agregarVecino(nodoDestino,peso);
			
		}
	}

	@Override
	public void mostarListaAdyacencia() {		
			 System.out.println("Matriz de Adyacencia:");
		     List<T> claves = new ArrayList<>(nodos.keySet());
		     
		     Collections.sort(claves, new ComparatorCalleAlfabeticamente());

		     
		     System.out.print("   ");
		     for (T i : claves) System.out.print(i + " ");
		     System.out.println();

		     
		     for (T fila : claves) { 
		         System.out.print(fila + ": ");
		         for (T columna: claves) {  /// 1 , 2, 3 --- Filas
		             INodo nodoFila = nodos.get(fila);
		             INodo nodoColumna = nodos.get(columna);
		             System.out.print(nodoFila.getVecinos().contains(nodoColumna) ? "1 " : "0 ");
		         }
		         System.out.println();
		     }
		 }

		
	

	@Override
	public INodo getNodo(T valor) {
		// TODO Auto-generated method stub
		return nodos.get(valor);
	}

	@Override
	public Map<T, INodo>  getNodos() {
		// TODO Auto-generated method stub
		return nodos;
	}
	
	

}
