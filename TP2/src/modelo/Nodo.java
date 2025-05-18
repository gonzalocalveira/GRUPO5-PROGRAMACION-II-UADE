package modelo;

import interfaz.INodo;

public class Nodo<T> implements INodo<T>{
	
	private T dato;
	private INodo<T> derecha;
	private INodo<T> izquierda;
	
	
	public Nodo(T dato) {
		this.dato=dato;
		this.derecha=null;
		this.izquierda=null;
	}
	
	

	@Override
	public T getDato() {
		// TODO Auto-generated method stub
		return dato;
	}

	@Override
	public INodo getIzquierda() {
		// TODO Auto-generated method stub
		return izquierda;
	}

	@Override
	public INodo getDerecha() {
		// TODO Auto-generated method stub
		return derecha;
	}


	@Override
	public void setDato(T dato) {
		this.dato = dato;
	}


	@Override
	public void setDerecha(INodo<T> derecha) {
		this.derecha = derecha;
	}


	@Override
	public void setIzquierda(INodo<T> izquierda) {
		this.izquierda = izquierda;
	}
	
	
	

}
