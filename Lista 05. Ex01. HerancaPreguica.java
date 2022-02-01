package Atividades;

public class Preguica extends Animal {

	public static void main(String[] args) {

		Animal p = new Animal (); 
	    
		p.setNome("Preguicita.");
		p.setIdade (23);
		p.setEmitirSom(" pode emitir sons de alta-frequência pelas narinas.");
		p.setSubir("Ela sobe em árvores.");
		
		System.out.println("Nome da preguiça: " + p.getNome());
		System.out.println("Idade: " + p.getIdade() + " anos.");
		System.out.println("Esse animal" + p.getEmitirSom());
		System.out.println( p.getSubir() );

	}

}
