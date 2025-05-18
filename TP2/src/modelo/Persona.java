package modelo;

import interfaz.IPersona;

public class Persona implements IPersona {
	
	private String nombre;
	private String DNI;
	
	
	public Persona(String nombre, String DNI) {
		this.nombre=nombre;
		this.DNI=DNI;
	}
	

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String getDNI() {
		// TODO Auto-generated method stub
		return DNI;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", DNI=" + DNI + "]";
	}
	
	

}
