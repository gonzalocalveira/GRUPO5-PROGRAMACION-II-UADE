package interfaz;

import modelo.Nodo;
import modelo.Vehiculo;

public interface INodo {
	
	/// Precondición: ninguna.
	/// Postcondición: Devuelve el dato almacenado en el nodo.
	public IVehiculo getDato();

	/// Precondición: nuevoDato no debe ser null.
	/// Postcondición: El dato del nodo se actualiza con el nuevo valor.
	public void setDato(IVehiculo nuevoDato);

	/// Precondición: ninguna.
	/// Postcondición: Devuelve el nodo siguiente.
	public Nodo getSiguiente();

	/// Precondición: nuevoNodo puede ser null (si es el final de la lista).
	/// Postcondición: Se actualiza el puntero siguiente del nodo actual.
	public void setSiguiente(Nodo nuevoNodo);

	/// Precondición: ninguna.
	/// Postcondición: Devuelve una representación textual del nodo.
	public String toString();
	
	/// Precondición: ninguna.
	/// Postcondición: Devuelve el nodo anterior.
	public Nodo getAnterior();
	
	/// Precondición: actual puede ser null si el nodo pasa a ser el primero.
	/// Postcondición: Se actualiza el puntero anterior del nodo actual.
	public void setAnterior(INodo actual);
	
	
	

}
