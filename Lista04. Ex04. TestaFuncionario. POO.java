package Atividades;

public class Ex04Lista04TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Thais";
		f1.idade = 31;
		f1.email = "thais.rodriges@microsoftbrasil.com.br";
		f1.cargo = "Analista de sistemas.";
		f1.empresa = "Microsoft";
	
		System.out.println("Nome: " + f1.nome);
		System.out.println("Idade: " + f1.idade + "anos.");
		System.out.println("Contato: " + f1.email);
		System.out.println("Cargo : " + f1.cargo);
		System.out.println("Empresa : " + f1.empresa);
			f1.trabalhar();
			f1.disponivel();
	}

}
