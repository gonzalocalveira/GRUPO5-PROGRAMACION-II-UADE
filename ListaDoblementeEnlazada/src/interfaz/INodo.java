package interfaz;

import modelo.Nodo;
import modelo.Vehiculo;

public interface INodo {
	
	
	public IVehiculo getDato();
	
	public void setDato(IVehiculo nuevoDato);
	
	public Nodo getSiguiente();
	
	public void setSiguiente(Nodo nuevoNodo);
	public String toString();
	
	public Nodo getAnterior();
	
	public void setAnterior(INodo actual);
	
	
	

}
