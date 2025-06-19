package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import interfaz.IGrafo;
import interfaz.INodo;

public class Grafo <T>implements IGrafo<T>{
	
	
	private Map<T,INodo> nodos= new HashMap<>();
	
	private boolean esDirigido;

	
	
	
	
	public Grafo(boolean esDirigido){
		this.esDirigido=esDirigido;
	}
	@Override
	public void agregarNodo(T dato) {
		// TODO Auto-generated method stub
		if(!nodos.containsKey(dato)) {
			nodos.put(dato, new Nodo<>(dato));
			
		}
	}

	@Override
	public void agregarArista(T inicio, T fin) {
		
		                     //A         B
		
		                    //A                            B
		if(nodos.containsKey(inicio) && nodos.containsKey(fin)) {
			INodo nodoInicio=nodos.get(inicio); //A
			INodo nodoFin=nodos.get(fin);//B
			
			
			nodoInicio.agregarVecino(nodoFin);//A->B
			
			if(!esDirigido) {
			nodoFin.agregarVecino(nodoInicio);//A<-B
			}                //A<->B		
		
		}
	}

	@Override
	public void recorridoDFS(T inicio) {
		
		if(!nodos.containsKey(inicio)) return;
			
			Set<T> visitados= new HashSet<>();
			
			recorridoDFSRecu(nodos.get(inicio), visitados);
			
			System.out.println();
		
	}

	private void recorridoDFSRecu(INodo actual, Set<T> visitados) {
		visitados.add((T) actual.getValor());
		System.out.println(actual.getValor());
		
		List<INodo<T>> vecinos= actual.getVecinos();
		
		for(int v=vecinos.size()-1 ;v>=0; v--) {
			INodo vecino= vecinos.get(v);
			if(!visitados.contains(vecino.getValor())) {
				recorridoDFSRecu( vecino, visitados);
			}
		}
		
	}
	@Override
	public void recorridoBFS(T inicio) {
		// TODO Auto-generated method stub
		if(!nodos.containsKey(inicio)) return;
		
		Set<T> visitados= new HashSet<T>();
		
		Queue<INodo<T>> colaNodos= new LinkedList<INodo<T>>();
		
		INodo<T> nodoI= nodos.get(inicio);
		
		colaNodos.add(nodoI);
		visitados.add(inicio);
		
		while(!colaNodos.isEmpty()) {
			INodo<T> actual= colaNodos.poll();
			
			System.out.println(actual.getValor() );
			
			for (INodo<T> vecino: actual.getVecinos()) {
				if(!visitados.contains(vecino.getValor())) {
					visitados.add(vecino.getValor());
					colaNodos.add(vecino);
					
				}
			}
		}
	}

	@Override
	public void matrizAdyacencia() {
		
		 System.out.println("Matriz de Adyacencia:");
	     List<T> claves = new ArrayList<>(nodos.keySet());
	     
	     Collections.sort(claves, new ComparatorPersonaDNI()); 

	     
	     System.out.print("   ");
	     for (T i : claves) System.out.print(i + " ");
	     System.out.println();

	     
	     for (T columna : claves) { 
	         System.out.print(i + ": ");
	         for (T fila : claves) { 
	             INodo nodoColumna = nodos.get(columna);
	             INodo nodoFila = nodos.get(fila);
	             System.out.print(nodoColumna.getVecinos().contains(nodoFila) ? "1 " : "0 ");
	         }
	         System.out.println();
	     }
	 }

	
	
	

}
