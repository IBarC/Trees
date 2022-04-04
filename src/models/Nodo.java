package models;

import java.util.ArrayList;

public class Nodo {

	private String valor;
	public ArrayList<Nodo> nodos;

	public Nodo(String valor) {
		super();
		this.valor = valor;
		this.nodos = new ArrayList<Nodo>();
	}

	public boolean esHoja() {
		return this.nodos.size() == 0;
	}

	public boolean tieneHijos(Nodo n) {
		return n.nodos.size() != 0;
	}

	//funciona
	public void preOrden(Nodo n, int puntoRecorrido) {
		System.out.print(n.valor + "/");

		for (int i = 0; i<n.nodos.size(); i++) {
			preOrden(n.nodos.get(i), i);
		}
	}

	//funciona
	public void postOrden(Nodo n, int puntoRecorrido) {

		for(int i = 0; i<n.nodos.size(); i++) {
			postOrden(n.nodos.get(i), i);
		}
		System.out.print(n.valor + "/");
	}

//	public Nodo buscar(String valor) {
//		if (this.valor.equals(valor)) {
//			return this;
//		}
//		if (tieneHijosIzq(this)) {
//			var n = this.izq.buscar(valor);
//			if (n != null)
//				return n;
//		}
//		if (tieneHijosDcha(this)) {
//			var n = this.dcha.buscar(valor);
//			if (n != null)
//				return n;
//		}
//		return null;
//	}
//
//	public int profundidad(String valor, int prof) {
//		//Buscar si yo soy ese nodo
//		if (this.valor.equals(valor)) {
//			return prof;
//		}
//		//Si tengo hijos por la izqda busco en prof por la izq
//		//incrementando la prof.
//		if (tieneHijosIzq(this)) {
//			var n = this.izq.profundidad(valor, ++prof);
//			if (n != -1) return n; //encontrado devuelvo prof actual
//			else --prof; //no lo he encontrado resto prof
//		}
//		if (tieneHijosDcha(this)) {
//			var n = this.dcha.profundidad(valor, ++prof);
//			if (n != -1) return n;
//			else --prof;
//		}
//		return -1;
//	}

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + "]";
	}

}
