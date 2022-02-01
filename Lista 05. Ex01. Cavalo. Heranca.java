package Atividades;

public class Cavalo extends Animal {
		
		public static void main(String[] args) {
			
			Animal c = new Animal (); 
		    
			c.setNome("Cavalito.");
			c.setIdade(3);
			c.setEmitirSom("relinchar.");
			c.setCorrer(15);
			
			System.out.println("Nome do cachorro: " + c.getNome());
			System.out.println("Idade: " + c.getIdade() + " anos.");
			System.out.println("Esse animal sabe " + c.getEmitirSom());
			System.out.println("A velocidade que ele por chegar é: " + c.getCorrer() + "km/h.");
			
	}

}
