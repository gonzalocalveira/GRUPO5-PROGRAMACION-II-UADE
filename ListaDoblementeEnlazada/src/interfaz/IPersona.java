package interfaz;

import modelo.Lista;

public interface IPersona {
	
	public String getNombre();
	
	public void setNombre(String nuevoNombre);
	
	public int getDNI();
	
	public void setDNI(int nuevoDni);
	
	public Lista getListaVehiculos();
	
	public String toString();
	
	
	
	
	
}
