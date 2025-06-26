package modelo;

import java.util.Comparator;

import interfaz.ICalle;

public class ComparatorCalleAlfabeticamente <T extends ICalle> implements Comparator<T> {

	


	@Override
	public int compare(T calle1, T calle2) {
		// TODO Auto-generated method stub
		return calle1.getNombre().compareTo(calle2.getNombre());
	}

}
