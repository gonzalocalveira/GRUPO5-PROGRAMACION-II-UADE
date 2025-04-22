package interfaz;

import modelo.Nodo;
import modelo.Vehiculo;

public interface ILista {
	
	
	/// Precondición: dato no debe ser null.
	/// Postcondición: Se inserta el nuevo nodo al inicio de la lista.
	public void agregarPrimero(IVehiculo dato);
	
	/// Precondición: dato no debe ser null.
	/// Postcondición: Se agrega el nodo al final de la lista.
	public void agregarUltimo(IVehiculo dato);

	/// Precondición: dato no debe ser null. pos >= 0 y pos <= cantidad de elementos.
	/// Postcondición: Se agrega el nodo en la posición indicada.
	public void agregarGenerico(int pos, IVehiculo dato);
	
	/// Precondición: La lista no debe estar vacía.
	/// Postcondición: Se elimina el primer nodo. El nuevo primero tiene anterior = null.
	public void eliminarPrimero();

	/// Precondición: La lista no debe estar vacía.
	/// Postcondición: Se elimina el último nodo de la lista.
	public void eliminarUltimo();
	
	/// Precondición: La lista no debe estar vacía. 0 <= pos < cantidad de elementos.
	/// Postcondición: Se elimina el nodo en la posición indicada.
	public void eliminarGenerico(int pos);
	
	/// Precondición: ninguna.
	/// Postcondición: Devuelve true si la lista está vacía, false en caso contrario.
	public boolean estaVacia();
	
	/// Precondición: ninguna.
	/// Postcondición: Devuelve la cantidad de elementos en la lista.
	public int cantidadElementos();

	/// Precondición: ninguna.
	/// Postcondición: Muestra los elementos de la lista por consola.
	public void mostrarLista();
	
	/// Precondición: La lista no debe estar vacía.
	/// Postcondición: Devuelve el dato del primer nodo.
	public IVehiculo obtenerPrimero();
	
	/// Precondición: La lista no debe estar vacía.
	/// Postcondición: Devuelve el dato del último nodo.
	public IVehiculo obtenerUltimo();
	
	/// Precondición: ninguna.
	/// Postcondición: Devuelve una representación textual de lista.
	public String toString();

}
