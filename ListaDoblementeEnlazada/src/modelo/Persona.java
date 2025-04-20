
package modelo;

import interfaz.IPersona;

public class Persona implements IPersona {
	


	private String nombre;
	private int dni;
	private Lista listaVehiculos;
	

	
	
	public Persona(String nombre, int dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.listaVehiculos=new Lista();
		
	}
	
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public void setNombre(String nuevoNombre) {
		// TODO Auto-generated method stub
		this.nombre=nuevoNombre;
	}

	@Override
	public int getDNI() {
		// TODO Auto-generated method stub
		return dni;
	}

	@Override
	public void setDNI(int nuevoDni) {
		// TODO Auto-generated method stub
		this.dni=nuevoDni;
		
	}


	@Override
	public Lista getListaVehiculos() {
		// TODO Auto-generated method stub
		return listaVehiculos;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", listaVehiculos=" + listaVehiculos + "]";
	}

}
