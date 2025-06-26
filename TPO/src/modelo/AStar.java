package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import interfaz.IAStar;
import interfaz.IGrafo;
import interfaz.IHeuristica;

import interfaz.INodo;
public class AStar<T> implements IAStar<T> {
	
	private Map<T, INodo<T>> nodos;
	
	private int IHeuristica;
	
	private Map<T,Integer>gCostoInicio;
	
	private Map<T,Integer>fCostoFinal;
	
	private Map<T,T> padres;
	
	private Set<T> abiertos;
	
	private Set<T> cerrados;
	
	private PriorityQueue<NodoCosto<T>> colaPrioridadFCosto;
	
		
	
	
	public AStar() {
		this.nodos = new HashMap<>();;
	
	    this.IHeuristica = IHeuristica;
	    
	    this.gCostoInicio = new HashMap<>();
	    
	    this.fCostoFinal = new HashMap<>();
	    
	    this.padres = new HashMap<>();
	    
	    this.abiertos = new HashSet<>();
	    
	    this.cerrados = new HashSet<>();
	    
	    this.colaPrioridadFCosto = new PriorityQueue<>();

	}
	
	@Override
	public  List<T> encontrarCamino(IGrafo grafo, T inicio, T fin, IHeuristica<T> h) {
		
		Map<T,INodo> nodos=grafo.getNodos();
		
		
		
		for(T id: nodos.keySet()) {
			gCostoInicio.put(id, Integer.MAX_VALUE);
			fCostoFinal.put(id, Integer.MAX_VALUE);
			
		}
		
		gCostoInicio.put(inicio, 0);
		fCostoFinal.put(inicio, h.calcularHeuristica(inicio, fin));
		
		
		colaPrioridadFCosto.add(new NodoCosto<>(inicio, fCostoFinal.get(inicio)));
		
		abiertos.add(inicio);
		
		while(!colaPrioridadFCosto.isEmpty()) {
			NodoCosto<T> actual= colaPrioridadFCosto.poll();
			T idActual=actual.getKey();
			
			if(idActual==fin) {
				return reconstruccionCamino(padres, inicio, fin);
				
			}
			
			abiertos.remove(idActual);
			cerrados.add(idActual);
			
			INodo nodoActual= nodos.get(idActual);
			List<INodo> vecinos= nodoActual.getVecinos();
			List<Integer> costos= nodoActual.getPeso();
			
			
			for(int v=0; v<vecinos.size(); v++) {
				T vecinoId= (T) vecinos.get(v).getValor();
				
				if(cerrados.contains(vecinoId)) continue;
				
				int tentativeG= gCostoInicio.get(idActual)+costos.get(v);
				
				if(tentativeG<gCostoInicio.getOrDefault(vecinoId, Integer.MAX_VALUE)) {
					 padres.put(vecinoId, idActual);
		                gCostoInicio.put(vecinoId, tentativeG);
		                int nuevoFCosto = tentativeG + h.calcularHeuristica(vecinoId, fin);
		                fCostoFinal.put(vecinoId, nuevoFCosto);

		                if (!abiertos.contains(vecinoId)) {
		                    colaPrioridadFCosto.add(new NodoCosto<>(vecinoId, nuevoFCosto));
		                    abiertos.add(vecinoId);
		                }
		            }
				}
	}
	return null;
	
  }
	@Override
	public List<T> reconstruccionCamino(Map<T,T> padres, T inicio, T fin){
		List<T> camino= new ArrayList<T>();
		
		T actual= fin;
		
		while(!actual.equals(inicio)){
			camino.add(actual);
			
			if(!padres.containsKey(actual)) {
				return null;
			}
			actual=padres.get(actual);
		}
		
		camino.add(inicio);
		Collections.reverse(camino);
		
		return camino;
	}
	

}
