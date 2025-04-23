package modelo;

import interfaz.INodo;
import interfaz.IVehiculo;

public class Nodo implements INodo{
	
	private INodo siguiente;
	private IVehiculo dato;
	private INodo anterior;
	
	
	
	public Nodo(IVehiculo dato) {
		super();
		this.siguiente=null;
		this.dato=dato;
		this.anterior=null;
		
		
	}
	@Override
	public IVehiculo getDato() {
		// TODO Auto-generated method stub
		return dato;
	}

	@Override
	public void setDato(IVehiculo nuevoDato) {
		this.dato=nuevoDato;
		// TODO Auto-generated method stub
		
	}

	@Override
	public INodo getSiguiente() {
		// TODO Auto-generated method stub
		return siguiente;
	}

	@Override
	public void setSiguiente(INodo nuevoNodo) {
		this.siguiente=nuevoNodo;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Nodo ["+"dato=" + dato+  " antirior= " +anterior+ " siguiente=" + siguiente + "]";
	}
	@Override
	public INodo getAnterior() {
		// TODO Auto-generated method stub
		return anterior;
	}
	@Override
	public void setAnterior(INodo actual) {
		
		this.anterior=actual;
		
		
		// TODO Auto-generated method stub
		
	}
	

}
