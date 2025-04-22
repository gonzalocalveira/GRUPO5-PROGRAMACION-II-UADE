package interfaz;

public interface IVehiculo {
	/// Precondición: ninguna.
	/// Postcondición: Devuelve la patente del vehículo.
	public String getPatente();

	/// Precondición: patenteNueva no debe ser null.
	/// Postcondición: La patente del vehículo se actualiza.
	public void setPatente(String patenteNueva);

	/// Precondición: ninguna.
	/// Postcondición: Devuelve la marca del vehículo.
	public String getMarca();
	
	/// Precondición: marcaNueva no debe ser null.
	/// Postcondición: La marca del vehículo se actualiza.
	public void setMarca(String marcaNueva);

	/// Precondición: ninguna.
	/// Postcondición: Devuelve una representación textual del vehículo.
	public String toString(); 
	
	
	
	
	

}
