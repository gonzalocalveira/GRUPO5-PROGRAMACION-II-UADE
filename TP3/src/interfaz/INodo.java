package interfaz;

import java.util.List;

public interface INodo<T> {
	/**
     * Devuelve el valor del nodo.
     *
     * Precondición: Ninguna.
     * Postcondición: Se retorna el valor almacenado en el nodo.
     */
	public T getValor();
	
 /**
     * Asigna un nuevo valor al nodo.
     *
     * Precondición: `nuevoValor` no debe ser null y debe ser del tipo compatible con T.
     * Postcondición: El valor del nodo se actualiza con el nuevo valor.
     */
	public void setValor(T nuevoValor);
	
/**
     * Agrega un nodo vecino a este nodo si no está ya presente.
     *
     * Precondición: `nuevoVecino` no debe ser null.
     * Postcondición: Si el vecino no estaba previamente en la lista, se agrega.
     */
	public void agregarVecino( INodo<T> nuevoVecino);
	
/**
     * Devuelve la lista de nodos vecinos.
     *
     * Precondición: Ninguna.
     * Postcondición: Se retorna una lista (posiblemente vacía) de los vecinos del nodo.
     */
	public List<INodo<T>> getVecinos();
	
	

}
