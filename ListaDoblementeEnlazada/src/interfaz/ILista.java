package interfaz;

import modelo.Nodo;
import modelo.Vehiculo;

public interface ILista {
	
	
	
	public void agregarPrimero(IVehiculo dato);
	
	public void agregarUltimo(Vehiculo dato);
	
	public void agregarGenerico(int pos, Vehiculo dato);
	
	public void eliminarPrimero();
	
	public void eliminarUltimo();
	
	public void eliminarGenerico(int pos);
	
	
	
	public boolean estaVacia();
	
	
	public int cantidadElementos();
	
	public void mostrarLista();

	public IVehiculo obtenerPrimero();

	public IVehiculo obtenerUltimo();
	
	

}
