package modelo;
///comentarioooo
import interfaz.IArbol;
import interfaz.INodo;
import interfaz.IPersona;

public class Arbol<T extends Comparable<T>> implements IArbol<T> {
	
	private INodo raiz;
	private int peso;
	
	
	
	public Arbol() {
		this.raiz=null;
		this.peso=0;
	}
	@Override
    public void insertar(T dato) {
        raiz = insertarRecu(raiz, dato);
    }

	@Override
	public INodo insertarRecu(INodo<T> nodo, T dato) {
		
		
		if(nodo==null) {
			return new Nodo(dato);
		}
		
		int comparacion= dato.compareTo(nodo.getDato());
		/// comparacion<0 si es menor, 0 si son iguales, comparacion>1 si es mayor
		if(comparacion<0) {
			nodo.setIzquierda(insertarRecu(nodo.getIzquierda(),  dato));
			
		}else if (comparacion>0) {
			nodo.setDerecha(insertarRecu(nodo.getDerecha(), dato));
			
			
		}
		else {
			peso++;
			
		}
		return nodo;
		
	}

	@Override
	public T eliminar(T dato) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public void recorridoPre_Orden() {
		recorridoPreOrden(raiz);
	}
	@Override
	public void recorridoPreOrden(INodo nodo) {
		if(nodo!=null) {
			System.out.print(nodo.getDato()+"--> ");
			recorridoPreOrden(nodo.getIzquierda());
			recorridoPreOrden(nodo.getDerecha());
			
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void recorridoInorden() {
		inordenRec(raiz);
		}
	@Override
	public void inordenRec(INodo nodo) {
		if(nodo!=null ) {
			inordenRec(nodo.getIzquierda());
			System.out.print(nodo.getDato()+ " ");
			inordenRec(nodo.getDerecha());
			
			
		}
		
	}

	@Override
	public void recorridoPostOrden(INodo nodo) {
		// TODO Auto-generated method stub
		
	}

	

}
