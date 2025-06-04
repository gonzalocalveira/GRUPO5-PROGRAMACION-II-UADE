package testeo;

import interfaz.IArbol;
import modelo.Arbol;
public class TesteoArbolInsertarElementos {
	public static void main(String[] args) {
		
		IArbol arbol= new Arbol();
		
		
		arbol.insertar(10000000);
		arbol.insertar(598098);
		arbol.insertar(4528790);
		
		
	}

}
