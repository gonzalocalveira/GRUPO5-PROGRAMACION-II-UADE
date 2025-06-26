package modelo;

import interfaz.ICalle;

public class Calle implements ICalle{
	private String nombreCalle;
	
	
	public Calle(String nombreCalle) {
		this.nombreCalle=nombreCalle;
		
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombreCalle;
	}

	@Override
	public String toString() {
		return "Calle [nombreCalle=" + nombreCalle + "]";
	}

}
