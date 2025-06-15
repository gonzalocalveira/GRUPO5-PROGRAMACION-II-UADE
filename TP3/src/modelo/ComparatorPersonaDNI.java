package modelo;

import java.util.Comparator;

import interfaz.IPersona;

public class ComparatorPersonaDNI <T extends IPersona> implements Comparator<T>{

	@Override
	public int compare(T p1, T p2) {
		// TODO Auto-generated method stub
		return p1.getDNI().compareTo(p2.getDNI());
	}
	

}
