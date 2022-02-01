package Atividades;

public class Ex05Lista04TestePatinete {

	public static void main(String[] args) {
		Patinete p1 = new Patinete ();
		
		p1.modelo = "Patinete Elétrico Motorizado Scooter";
		p1.marca = "CIE";
		p1.cor = "Preto";
		p1.peso = 10;
		p1.valor = 1.449;
		
		System.out.println("Modelo: " + p1.modelo);
		System.out.println("Marca: " + p1.marca);
		System.out.println("Cor: " + p1.cor);
		System.out.println("Peso: " + p1.peso + "kg");
		System.out.println("Preço R$: " + p1.valor);
			p1.andar();
	}

}
