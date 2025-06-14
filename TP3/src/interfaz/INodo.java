package interfaz;

import java.util.List;

public interface INodo<T> {
	
	public T getValor();
	
	public void setValor(T nuevoValor);
	
	public void agregarVecino( INodo<T> nuevoVecino);
	
	public List<INodo<T>> getVecinos();
	
	

}
