package interfaz;

import java.util.List;

public interface  INodo<T> {
	
	
	
	public T getValor();

	
	public void agregarVecino(INodo vecino,T peso);


	
	public List<INodo> getVecinos();

	
	public  List<T> getPeso();
	

}
