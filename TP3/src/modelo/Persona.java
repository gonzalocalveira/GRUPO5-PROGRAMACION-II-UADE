package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import interfaz.IPersona;

public class Persona implements IPersona{
	
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
	public int hashCode() {
		return Objects.hash(DNI);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(DNI, other.DNI);
	}

	//Correcciones metodos faltantes
	@Override
	public int compareTo(IPersona otraPersona) {
	    return this.nombre.compareTo(otraPersona.getNombre());
	}
	
	@Override
	public void ordenarLista(List<IPersona> p) {
	    p.sort(new ComparatorPersonaDNI());
	}




}


