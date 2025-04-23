package interfaz;

import modelo.Lista;

public interface IPersona {
	/// Precondición: ninguna.
	/// Postcondición: Devuelve el nombre del propietario.
	public String getNombre();

	/// Precondición: nuevoNombre no debe ser null.
	/// Postcondición: El nombre del propietario se actualiza.
	public void setNombre(String nuevoNombre);

	/// Precondición: ninguna.
	/// Postcondición: Devuelve el DNI del propietario.
	public int getDNI();

	/// Precondición: nuevoDni debe ser un valor positivo.
	/// Postcondición: El DNI del propietario se actualiza.
	public void setDNI(int nuevoDni);

	/// Precondición: ninguna.
	/// Postcondición: Devuelve la lista de vehículos del propietario.
	public ILista getListaVehiculos();

	/// Precondición: ninguna.
	/// Postcondición: Devuelve una representación textual de la persona.
	public String toString();
	
	
	
	
	
}
