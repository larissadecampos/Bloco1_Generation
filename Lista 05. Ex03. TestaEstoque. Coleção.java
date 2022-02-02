package Atividades;

import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {
 
		ArrayList<Estoque> estoque1 = new ArrayList<>(); //<> classe
		
		Estoque p1 = new Estoque("Morango", 1.99, 60);
		Estoque p2 = new Estoque("Jabuticaba", 5.99, 10);
		Estoque p3 = new Estoque("Banana", 2.99, 60);
		
		estoque1.add(p1);
		estoque1.add(p2);
		estoque1.add(p3);
		
		System.out.println(estoque1); 
		System.out.println();
		
		estoque1.remove(1);
		System.out.println(estoque1);
		System.out.println();
	}

}
