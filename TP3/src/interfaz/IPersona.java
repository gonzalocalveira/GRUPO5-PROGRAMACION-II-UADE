package interfaz;

import java.util.List;

public interface IPersona extends Comparable<IPersona>{
	
	/**
     * Devuelve el nombre de la persona.
     *
     * Precondición: Ninguna.
     * Postcondición: Se retorna el valor del atributo `nombre`.
     */
	public String getNombre();

/**
     * Devuelve el DNI de la persona.
     *
     * Precondición: Ninguna.
     * Postcondición: Se retorna el valor del atributo `DNI`.
     */
	public String getDNI();

/**
     * Devuelve una representación en forma de cadena del objeto Persona.
     *
     * Precondición: Ninguna.
     * Postcondición: Se retorna un String con los valores de nombre y DNI.
     */
	public String toString();
	
}
