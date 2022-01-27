package Atividadades;
import java.util.Scanner;

public class Ex02Lista02 {
	//Faça um sistema que leia a idade de uma pessoa expressa em dias e 
	//mostre-a expressa em anos, meses e dias. 

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int totalDias, totalMeses, totalAnos, diasRest;
		
		System.out.println("Digite sua idade em dias: ");
		totalDias = leia.nextInt();
		totalAnos = totalDias/365;
		totalMeses = (totalDias % 365)/30;
		diasRest = (totalDias % 365) % 30;
		
		System.out.println("\nAnos: " + totalAnos +"\nMeses: " + totalMeses +"\nDias: " + totalDias);
		leia.close(); // saída
		
		
	}
	

}
