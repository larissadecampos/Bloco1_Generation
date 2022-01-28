package Atividades;
import java.util.Scanner;

public class Ex04Lista02 {
//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int num;
		double raiz, potencia;
		
		System.out.println("Digite um número inteiro: ");
		num =  leia.nextInt();
		
		if(num % 2 == 0) { //se o resto da divsão do número por 2 for = 0 é par.
			System.out.println("Par...");
			raiz = Math.sqrt(num); // biblioteca de mat que mostra a extação de raiz quadrada do nº
			System.out.printf("Raiz quadrada: %.2f" , raiz);
		}
			else {
			System.out.println("Impar...");
			potencia =Math.pow(num, 2);
			System.out.println("Potencia: " + potencia);
		}
	}

}
