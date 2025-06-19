package modelo;

import java.util.ArrayList;
import java.util.List;

import interfaz.INodo;

public class Nodo<T> implements INodo{
	
	private T valor;
	private List<INodo<T>> vecinos;
	
	
	public Nodo(T dato){
		this.valor=dato;
		this.vecinos=new ArrayList<INodo<T>>();
		}
	

	@Override
	public Object getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public void setValor(Object nuevoValor) {
		// TODO Auto-generated method stub
		this.valor=(T) nuevoValor;
		
		
	}

	@Override
	public void agregarVecino(INodo nuevoVecino) {
		// TODO Auto-generated method stub
		if(!vecinos.contains(nuevoVecino)) {
			vecinos.add(nuevoVecino);
		}
	}

	@Override
	public List<INodo<T>> getVecinos() {
		// TODO Auto-generated method stub
		return vecinos;
	}

}
