package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaz.IPersona;

public class Persona implements IPersona, Comparable <IPersona> {
	
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


	

	@Override
	public int compareTo(IPersona otraPersona) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(otraPersona.getNombre());
	}
	@Override
	public void ordenarLista(List<IPersona> p) {
		
		Collections.sort(p);
		
		for (IPersona p1: p) {
			System.out.print(p1.getNombre()+"--> ");
		}
	}

}
