package testeo;

import modelo.Persona;

import java.util.ArrayList;
import java.util.List;

import interfaz.IPersona;
public class TestDeCompararPersonaPorNombre {
	public static void main(String[] args) {
		
		IPersona p1= new Persona("Gonzalo","25456478");
		IPersona p2 = new Persona("Lucas", "40000000");
		IPersona p3 = new Persona("Ana", "48777777");
		
		List<IPersona> personas= new ArrayList<IPersona>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		
		p1.ordenPorNombre(personas);
	}

}
