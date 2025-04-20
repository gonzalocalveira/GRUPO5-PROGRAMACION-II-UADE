package modelo;

import interfaz.IVehiculo;

public class Vehiculo implements IVehiculo{
	private String patente;
	private String marca;
	
	
	
	public Vehiculo(String patente,String marca) {
		this.patente=patente;
		this.marca=marca;
		
		
	}



	@Override
	public String getPatente() {
		// TODO Auto-generated method stub
		return patente;
	}



	@Override
	public void setPatente(String patenteNueva) {
		// TODO Auto-generated method stub
		this.patente=patenteNueva;
		
	}



	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return marca;
	}



	@Override
	public void setMarca(String marcaNueva) {
		// TODO Auto-generated method stub
		this.marca=marcaNueva;
	}



	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", marca=" + marca + "]";
	}
	

}
