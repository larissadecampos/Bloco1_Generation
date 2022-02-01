package Atividades;

public class Cachorro extends Animal {
 
	public static void main(String[] args) {
		
	Animal dog = new Animal (); 
    
	dog.setNome("Doguito.");
	dog.setIdade(3);
	dog.setEmitirSom("Latir.");
	dog.setCorrer(5);
	
	System.out.println("Nome do cachorro: " + dog.getNome());
	System.out.println("Idade: " + dog.getIdade () + " anos.");
	System.out.println("Esse animal sabe " + dog.getEmitirSom());
	System.out.println("A velocidade que ele por chegar é: " + dog.getCorrer() + "km/h.");
	
	}

}
