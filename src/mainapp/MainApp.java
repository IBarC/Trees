package mainapp;

import models.Arbol;
import models.Nodo;

public class MainApp {
	public static void main(String[] args) {

		// HOJAS
		Nodo uno = new Nodo("uno");
		Nodo tres = new Nodo("tres");
		Nodo cuatro = new Nodo("cuatro");
		Nodo seis = new Nodo("seis");
		
		Nodo cinco = new Nodo("cinco");
		cinco.nodos.add(seis);
		
		Nodo dos = new Nodo("dos");
		dos.nodos.add(cinco);
		
		Nodo pollo = new Nodo("pollo");
		pollo.nodos.add(uno);
		pollo.nodos.add(dos);
		Nodo cerdo = new Nodo("cerdo");
		cerdo.nodos.add(tres);
		Nodo ternera = new Nodo("ternera");
		ternera.nodos.add(cuatro);

		Nodo coso = new Nodo("~");
		coso.nodos.add(pollo);
		coso.nodos.add(cerdo);
		coso.nodos.add(ternera);

		Arbol arbol = new Arbol(coso);
		
		arbol.preOrden();
		System.out.println();
		arbol.postOrden();
		System.out.println();
		System.out.println(arbol.buscarNodo("hola"));
		System.out.println(arbol.buscarNodo("ternera"));
		System.out.println(arbol.insertarNodo(cuatro, "patata"));
		arbol.preOrden();
//		System.out.println(arbol.profundidad("I"));
	}
}
