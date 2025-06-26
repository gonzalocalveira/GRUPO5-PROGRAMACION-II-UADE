package test;

import modelo.Calle;
import interfaz.ICalle;
public class TesteoCalle {
	public static void main(String[] args) {
		
		ICalle c1= new Calle("San Juan");
		
		System.out.println( c1.toString());
		
	}

}
