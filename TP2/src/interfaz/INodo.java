package interfaz;

public interface INodo<T> {
	
	
	public  T getDato();
	public void setDato(T dato);
	public INodo<T> getIzquierda();
	public void setIzquierda(INodo<T> izquierda);
	public void setDerecha(INodo<T> derecha); 
	public INodo<T> getDerecha();
	
	

}
