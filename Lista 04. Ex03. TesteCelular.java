package Atividades;

public class Ex03Lista04TesteCelular {

	public static void main(String[] args) {
	
		Celular c1 = new Celular();
		
		c1.Modelo = "Galaxy S10+";
		c1.Marca = "Samsung";
		c1.tamanhoTela = 6.1;
		c1.ram = 8;
	
		System.out.println("Modelo: " + c1.Modelo);
		System.out.println("Marca: " + c1.Marca);
		System.out.println("Tamanhdo da tela: " + c1.tamanhoTela + " polegadas.");
		System.out.println("Memória ram de " + c1.ram + " GB.");		
		c1.ligar();
	}

}
