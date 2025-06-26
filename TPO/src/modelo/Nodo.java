package modelo;

import java.util.ArrayList;
import java.util.List;

import interfaz.INodo;

public class Nodo<T> implements INodo<T> {
	
	private T valor;
	private List<T> pesos;
	private List<INodo> vecinos;
	
	
	public Nodo(T valor) {
		this.valor=valor;
		this.pesos= new ArrayList<T>();
		this.vecinos=new ArrayList<INodo>();
		
	}

	
	
	
	@Override
	public T getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public void agregarVecino(INodo vecino,T peso) {
		if(!vecinos.contains(vecino)) {
			vecinos.add(vecino);
			pesos.add(peso);
		}
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<INodo> getVecinos() {
		// TODO Auto-generated method stub
		return vecinos;
	}

	@Override
	public  List<T> getPeso() {
		// TODO Auto-generated method stub
		return pesos;
	}




	
}
