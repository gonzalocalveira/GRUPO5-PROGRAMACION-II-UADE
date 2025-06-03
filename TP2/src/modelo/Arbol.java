package modelo;

import interfaz.IArbol;
import interfaz.INodo;
import interfaz.IPersona;

public class Arbol<T extends Comparable<T>> implements IArbol<T> {
	
	private INodo raiz;
	private int nodosDuplicados;
	
	
	
	public Arbol() {
		this.raiz=null;
		this.nodosDuplicados=0;
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
		
	
		/// comparacion<0 si es menor, 0 si son iguales, comparacion>1 si es mayor
		if(comparar(nodo, dato)<0) {
			nodo.setIzquierda(insertarRecu(nodo.getIzquierda(),  dato));
			
		}else if (comparar(nodo, dato)>0) {
			nodo.setDerecha(insertarRecu(nodo.getDerecha(), dato));
			
			
		}
		else {
			nodosDuplicados++;
			
		}
		return nodo;
		
	}

	@Override
	public T eliminar(T dato) {
		raiz=eliminarRec(raiz,dato);
		return null;
	}

	private INodo<T> eliminarRec(INodo<T> nodo, T dato) {
	    if (nodo == null) return null;

	    
	    if (comparar(nodo, dato) < 0) {
	        nodo.setIzquierda(eliminarRec(nodo.getIzquierda(), dato));
	    } else if (comparar(nodo, dato) > 0) {
	        nodo.setDerecha(eliminarRec(nodo.getDerecha(), dato));
	    } else {
	    	//Caso 1:Nodo sin hijos
	        if (nodo.getIzquierda() == null && nodo.getDerecha() == null) {
	            return null;
	        }
	        //Caso 2: Un solo hijo
	        if (nodo.getIzquierda() == null) {
	            return nodo.getDerecha();
	        }
	        if (nodo.getDerecha() == null) {
	            return nodo.getIzquierda();
	        }
	        //Caso 3; 2 hijos
	        INodo<T> sucesor = encontrarMinimo(nodo.getDerecha());
	        nodo.setDato(sucesor.getDato());
	        nodo.setDerecha(eliminarRec(nodo.getDerecha(), sucesor.getDato()));
	    }

	    return nodo;
	}

	private INodo<T> encontrarMinimo(INodo<T> nodo) {
	    while (nodo.getIzquierda() != null) {
	        nodo = nodo.getIzquierda();
	    }
	    return nodo;
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
	public void recorridoPostOrden() {
		// TODO Auto-generated method stub
		postOrdenRecu(raiz);
	}

	@Override
	public void postOrdenRecu(INodo<T> nodo) {
		if(nodo!=null) {
			postOrdenRecu(nodo.getIzquierda());
			postOrdenRecu(nodo.getDerecha());
			System.out.print(nodo.getDato()+" ");
			
		}
		
	}
	@Override
	public INodo<T> buscar(T dato){
		return buscarRecur(raiz,dato);
		
	}
	
	private INodo<T> buscarRecur(INodo<T> n, T dato){
		if(n== null || n.getDato()==dato) {
			return n;
		}
		if( comparar( n, dato) <0) {
			return buscarRecur(n.getIzquierda(),dato);
		}
		else {
			return buscarRecur(n.getDerecha(),dato);
		}
	}

        @Override
	public int comparar(INodo<T> nodo, T dato) {
		return dato.compareTo(nodo.getDato());
		/// comparar(nodo, dato)<0 si es menor, 0 si son iguales, comparacion>1 si es mayor
	}
	
	

}
