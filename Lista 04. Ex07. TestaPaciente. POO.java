package Atividades;

public class Ex07Lista04TestaPaciente {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		
		p1.setNome("Larissa.");
		p1.setIdade(12);
		p1.setQuadro("Asma alérgica.");
		
		System.out.println("Nome da paciente: " + p1.getNome());
		System.out.println("Idade da paciente: " + p1.getIdade() + " anos.");
		System.out.println("Quadro: " + p1.getQuadro());
	}

}
