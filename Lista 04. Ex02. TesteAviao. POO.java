package Atividades;

public class Ex02Lista04TesteAviao {

	public static void main(String[] args) {
		Aviao av1 = new Aviao ();
		
		av1.modelo = "Boeing 777-200ER";
		av1.QuantidadeLugares =  440; 
		av1.velocidade = 905; //km/h
		System.out.println("Qual o modelo do avião? " + av1.modelo);
		System.out.println("Número de Assentos: " + av1.QuantidadeLugares +" lugares.");
		System.out.println("Qual a velocidade média? " + av1.velocidade + " km/h.");
		av1.acelerar();
	}
}
