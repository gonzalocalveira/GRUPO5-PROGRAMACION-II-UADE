package modelo;

public class NodoCosto<T> implements Comparable<NodoCosto<T>> {

	
	private T key;
	
	private int fCost;
	
	
	public NodoCosto(T key, int fCost) {
		this.key=key;
		this.fCost=fCost;
		
	}
	
	
	@Override
	public int compareTo(NodoCosto<T> otroNodo) {
		// TODO Auto-generated method stub
		return Integer.compare(fCost, otroNodo.fCost);
		
	}


	public T getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	

}
