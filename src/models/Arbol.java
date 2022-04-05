package models;

public class Arbol {
	private Nodo raiz;

	public Arbol(Nodo raiz) {
		super();
		this.raiz = raiz;
	}
	
	public void preOrden() {
		this.raiz.preOrden(raiz, 0);
	}
	
	public void postOrden() {
		this.raiz.postOrden(raiz, 0);
	}
	
	public Nodo buscarNodo(String valor) {
		return this.raiz.buscarNodo(valor);
	}

	public Nodo insertarNodo(Nodo padre, String valor) {
		return this.raiz.insertarNodo(padre, valor);
	}
	
//	public int profundidad(String valor) {
//		return this.raiz.profundidad(valor, 0);
//	}
	
}
