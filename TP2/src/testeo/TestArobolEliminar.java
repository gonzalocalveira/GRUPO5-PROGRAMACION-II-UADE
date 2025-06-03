package testeo;


import modelo.Arbol;
import modelo.Persona;
import interfaz.IArbol;
import interfaz.IPersona;
public class TestArobolEliminar {
	public static void main(String[] args) {
		
		IPersona p1= new Persona("Gonzalo","25456478");
		IPersona p2 = new Persona("Lucas", "40000000");
		IPersona p3 = new Persona("Ana", "48777777");
		
		IArbol a= new Arbol();
		
		
		a.insertar(p1);
		a.insertar(p2);
		a.insertar(p3);
		
		
		a.eliminar(p2);
		a.recorridoInorden();
		
	}
}
