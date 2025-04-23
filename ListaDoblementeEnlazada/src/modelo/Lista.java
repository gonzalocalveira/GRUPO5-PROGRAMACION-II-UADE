package modelo;

import interfaz.ILista;
import interfaz.INodo;
import interfaz.IVehiculo;

public class Lista implements ILista{
	private INodo primero;
	
	
	
	public Lista() {
		this.primero=null;
		
	}

	@Override
	public void agregarPrimero(IVehiculo dato) {
		INodo nuevoNodo= new Nodo(dato);///(44)
		
		if(!estaVacia()) { ///  (44)  [22]-->null
			
			nuevoNodo.setSiguiente(this.primero);  ///[44]-->[22], anterior=null siguiente=null
			this.primero.setAnterior(nuevoNodo);///[44]-->[22], anterior=[44] siguiente=null
			this.primero=nuevoNodo;
			nuevoNodo.setAnterior(null);///[44],anterior=null,sigueinte-->[22], anterior=[44] siguiente=null
			
			
			
			
		}
		else {
			this.primero=nuevoNodo;
			
		}
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public void agregarUltimo(IVehiculo dato) {
		
	
		

		if(estaVacia()) {
			agregarPrimero(dato);
			
			
		
		}
		else {
			INodo nuevoNodo=new Nodo(dato); ///(44)
			
			///[22], anterior=null siguiente=null
			INodo actual=this.primero; ///[22]
			
			while( actual.getSiguiente()!=null) {
				actual=actual.getSiguiente(); 
				
			}
			actual.setSiguiente(nuevoNodo);///[22], anterior=null siguiente=[44], anterior null, siguiente null
			nuevoNodo.setAnterior(actual);/// [22], anterior=null siguiente=[44], anterior [22], siguiente null
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarGenerico(int pos, IVehiculo dato) {
		

		
		if(estaVacia()) {
			agregarPrimero(dato);///(44)
			
		}
		else {
		///posicion=  0        1      2
			     /// [20]--> [11]--> [0]--> null
				 /// cant=3
		///quiero agregar en la posicion 1 
			INodo nuevoNodo=new Nodo(dato);
			INodo actual=this.primero;///[20]
			int contador=0;
			
			while (actual != null && contador < pos - 1) {
	            actual = actual.getSiguiente();
	            contador++;
			}
			if(actual.getSiguiente()!=null) {
				actual.getSiguiente().setAnterior(nuevoNodo);///[20]--> [44] anterior=[20], sigueinte-->[11], anteriror[44], siguiente--> [0]--> null
			}
				nuevoNodo.setSiguiente(actual.getSiguiente());///[20]--> [44] anterior=null, sigueinte-->[11]--> [0]--> null
				actual.setSiguiente(nuevoNodo);
				nuevoNodo.setAnterior(actual);///[20]--> [44] anterior=[20], sigueinte-->[11]--> [0]--> null
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPrimero() {
		
		if(!estaVacia()) {
			///[20]<-->[40]<-->[11]
			
			primero= primero.getSiguiente();/// [20]
			///null<--[40]<-->[11]
			primero.setAnterior(null);
		}
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUltimo() {
		
		///[20]-->[60]-->[11]-->[0]-->null
		// TODO Auto-generated method stub
		if(!estaVacia()) {
			
			 ///[20]-->[60] 
			if(primero.getSiguiente()==null) {
				primero=null;
			}
			INodo actual=primero; ///[20]-->[60] 
				///	[20]<-->[60]<-->[11]
			while(actual.getSiguiente().getSiguiente()!=null) {
				actual=actual.getSiguiente();
				
			}
			actual.setSiguiente(null);///[20]<-->[60]-->null
		}
	}

	@Override
	public void eliminarGenerico(int pos) {
		
		
		if(!estaVacia()) {
///posiciones    0       1      2       3
			///[22]--->[60]--->[11]--->[0]--->null
			INodo actual=primero;///[22]--->[60]
			int contador=0;
			
			///quiero eliminar pos=2. 2=[11]--->[0]
			while (actual.getSiguiente()!=null && contador<pos-1) {
				actual=actual.getSiguiente();
				contador++;
				
			}
			
				///obtengo el [11]--->[0]
				
			actual.setSiguiente(actual.getSiguiente().getSiguiente());
				
			
			
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		return primero==null;
	}

	@Override
	public int cantidadElementos() {
			int cantidad=0;
			INodo actual= this.primero;
			while (actual!=null) {
			
				actual=actual.getSiguiente();
				cantidad++;
			}
			return cantidad ;
		
		
	}
	
	@Override
	public String toString() {
		return "Lista [primero=" + primero + "]";
	}
	@Override
	public IVehiculo obtenerPrimero() {
		
		return primero.getDato();
	}
	@Override
	public IVehiculo obtenerUltimo() {
		INodo actual= primero;
		
		while(actual.getSiguiente()!=null) {
			actual=actual.getSiguiente();
			
		}
		return actual.getDato();
	}

	@Override
	 public void mostrarLista() {
        INodo actual = primero;
        while (actual != null) {
        	//getDato --- Del Nodo ---- Vehiculo!!!
            System.out.print(actual.getDato() +"\n");
            actual = actual.getSiguiente();
        }
        
    }

}
