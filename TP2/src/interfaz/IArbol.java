package interfaz;

import interfaz.IPersona;

public interface IArbol<T> {
	
	public INodo insertarRecu( INodo<T> nodo,  T dato);
	
	public T eliminar(T dato);
	
	public void insertar(T dato);
	
	public void recorridoPreOrden(INodo nodo);
	public void recorridoPre_Orden();
	
	public void inordenRec(INodo nodo);
	public void recorridoInorden();
	
	public void recorridoPostOrden(INodo<T> nodo);
        public void postOrdenRecu(INodo<T> nodo);
	
	public int comparar(INodo<T> nodo, T dato);
	
	public INodo<T> buscar(T dato);
	
	
	
	
	

}
