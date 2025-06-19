package interfaz;

public interface IGrafo<T> {
	 /**
     * Agrega un nodo al grafo si no existe previamente.
     * 
     * Precondición: `dato` no debe ser null.
     * Postcondición: Si el nodo no estaba en el grafo, se agrega. 
     *                Si ya existía, no se realiza ninguna acción.
     */
	public void agregarNodo(T dato);
	
  /**
     * Agrega una arista entre los nodos `inicio` y `fin`.
     * 
     * Precondición: Ambos nodos deben existir en el grafo.
     * Postcondición: 
     *   - Si el grafo es dirigido, se agrega una arista desde `inicio` hacia `fin`.
     *   - Si el grafo no es dirigido, también se agrega una arista de `fin` hacia `inicio`.
     */
	public void agregarArista(T inicio, T fin);
 


    /**
     * Realiza un recorrido en profundidad (DFS) desde el nodo dado.
     * 
     * Precondición: `inicio` debe existir en el grafo.
     * Postcondición: Se imprime por consola el orden de recorrido DFS desde el nodo `inicio`.
     */
 	public void recorridoBFS(T inicio);

 /**
     * Realiza un recorrido en anchura (BFS) desde el nodo dado.
     * 
     * Precondición: `inicio` debe existir en el grafo.
     * Postcondición: Se imprime por consola el orden de recorrido BFS desde el nodo `inicio`.
     */
 	public void recorridoDFS(T inicio);
 /**
     * Imprime la matriz de adyacencia del grafo, ordenada por DNI.
     * 
     * Precondición: Los nodos deben implementar un criterio de orden (ComparatorPersonaDNI).
     * Postcondición: Se imprime por consola la matriz de adyacencia del grafo.
     */
	 public void matrizAdyacencia();
	

}
