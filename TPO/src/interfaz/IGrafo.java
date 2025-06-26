package interfaz;

import java.util.Map;

public interface IGrafo<T> {
	public void agregarNodo(T nodo);
	
	public void agregarArista(T origen, T destino, T peso);
	
	public 	void mostarListaAdyacencia();
	
	
	public INodo getNodo(T valor);
	
	public Map<T, INodo>  getNodos();
	

}
