package interfaz;

import java.util.List;

public interface IPersona extends Comparable<IPersona>{
	
	
	public String getNombre();
	public String getDNI();
	public String toString();
	public int compareTo(IPersona otraPersona);
	public void ordenarLista(List<IPersona> p);
}
