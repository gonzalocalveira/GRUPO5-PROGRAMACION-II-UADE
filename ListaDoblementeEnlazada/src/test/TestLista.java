package test;

import modelo.Lista;
import modelo.Persona;
import modelo.Vehiculo;
import interfaz.ILista;
import interfaz.IPersona;
import interfaz.IVehiculo;
public class TestLista {

	public static void main(String[] args) {
		IPersona p1= new Persona("Gonzalo",46291838);
		
		Vehiculo v1 = new Vehiculo("ABC123", "Toyota Corolla");
		Vehiculo v2 = new Vehiculo("DEF456", "Ford Focus");
		Vehiculo v3 = new Vehiculo("GHI789", "Volkswagen Golf");
		Vehiculo v4 = new Vehiculo("JKL012", "Honda Civic");

		p1.getListaVehiculos().agregarPrimero(v1);
		p1.getListaVehiculos().agregarPrimero(v2);
		
		///[DEF456] ---> [ABC123]
		///p1.getListaVehiculos().eliminarPrimero(); ///  debe quedar [ABC123]
		
		///p1.getListaVehiculos().eliminarUltimo(); /// debe quedar [DEF456]
		
		p1.getListaVehiculos().agregarGenerico(1, v4);
		
		System.out.println(p1.toString());
		
		System.out.println("Cantidad de elementos: "+p1.getListaVehiculos().cantidadElementos());
		
		System.out.println(p1.getListaVehiculos().obtenerPrimero());
		System.out.println(p1.getListaVehiculos().obtenerUltimo());
		
		// TODO Auto-generated method stub

	}

}
