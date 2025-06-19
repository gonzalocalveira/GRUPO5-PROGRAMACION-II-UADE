package interfaz;

public interface IGrafo<T> {
	
	public void agregarNodo(T dato);
	
	public void agregarArista(T inicio, T fin);
 
 	public void recorridoBFS(T inicio);

 	public void recorridoDFS(T inicio);

	 public void matrizAdyacencia();
	

}
