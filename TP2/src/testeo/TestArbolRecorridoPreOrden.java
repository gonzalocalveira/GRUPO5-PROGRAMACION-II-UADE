public class TestArbolRecorridoPreOrden {
	public static void main(String[] args) {
		IPersona p1= new Persona("Julian","45675291");
		IPersona p2= new Persona("Di Maria", "26789786");
		IPersona p3= new Persona("Roberto", "98780923");
		IPersona p4= new Persona("Hazard", "56789098");
		IPersona p5= new Persona("Miguel", "12345678");
		
		
		IArbol arbol= new Arbol();
		
		
		arbol.insertar(p1);
		arbol.insertar(p2);
		arbol.insertar(p3);
		arbol.insertar(p4);
		arbol.insertar(p5);
		
		arbol.recorridoPre_Orden();
		
	}
}
