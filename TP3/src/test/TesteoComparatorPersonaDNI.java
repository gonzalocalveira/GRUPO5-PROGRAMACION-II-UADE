package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaz.IPersona;
import modelo.Persona;
import modelo.ComparatorPersonaDNI;
public class TesteoComparatorPersonaDNI {
	
	public static void main(String[] args) {
        
        List<IPersona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", "45675251"));
        personas.add(new Persona("Bruno", "26789987"));
        personas.add(new Persona("Carla", "50780923"));
        personas.add(new Persona("Dario", "86489098"));
        personas.add(new Persona("Elena", "12345978"));

        
        System.out.println("Antes de ordenar por DNI:");
        
        for (IPersona p : personas) {
            System.out.println(p);
        }
        
        Collections.sort(personas, new ComparatorPersonaDNI<>()); 
        
        System.out.println("\nDespués de ordenar por DNI:");
        
        for (IPersona p : personas) {
            System.out.println(p);
        }
 }

}
