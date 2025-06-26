package interfaz;

import java.util.List;
import java.util.Map;

public interface IAStar<T> {
	
	
	
	public  List<T> encontrarCamino (IGrafo grafo, T incio, T fin, IHeuristica<T> h);
	
	public List<T> reconstruccionCamino(Map<T,T> padres, T inicio, T fin);
	
	
	

}
