package Atividades;


public class Lista05Ex01Heranca {
	/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
	*/
	public static void main(String[] args) {
	
		Cachorro dog = new Cachorro();
		
		dog.setEspecie("Cachorro.");
		dog.setNome("Doguito.");
		dog.setEmitirSom("Au au.");
		dog.setIdade(3);
		dog.setCorrer(5);
		
		System.out.println("Animal: " + dog.getEspecie());
		System.out.println("Nome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade() + " anos.");
		System.out.println("Emite o som " + dog.getEmitirSom());
		System.out.println("Corre a " + dog.getCorrer()+ "km/h.");
		System.out.println("\n");
	
		Cavalo c1 = new Cavalo();
		
		c1.setEspecie("Cavalo.");
		c1.setNome("Cavalito.");
		c1.setEmitirSom("HiiiiHii.");
		c1.setIdade(7);
		c1.setCorrer(15);
		
		System.out.println("Animal: " + c1.getEspecie());
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade() + " anos.");
		System.out.println("Emite o som " + c1.getEmitirSom());
		System.out.println("Corre a " + c1.getCorrer()+ "km/h.");
		System.out.println("\n");
	
		Preguica p1 = new Preguica();
		
		p1.setEspecie("Preguiça.");
		p1.setNome("Preguicita.");
		p1.setEmitirSom("sons de alta-frequência.");
		p1.setIdade(7);
		p1.setSubirArvore(" em árvores.");
	
		System.out.println("Animal: " + p1.getEspecie());
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade() + " anos.");
		System.out.println("Emite " + p1.getEmitirSom());
		System.out.println("Sobe" + p1.getSubirArvore());
		
	}

}
