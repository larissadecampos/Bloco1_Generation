package Atividades;
import java.util.Scanner;

public class Ex01Lista3 {

	public static void main(String[] args) {
		
		// Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	
			Scanner entrada = new Scanner(System.in);
			
			float [] notas = new float[5]; //float --> tem uma capacidade de armazenamento menor e são nºs quebrados.
			float maior = 0;
			 
			System.out.println("Digite a pontuação: ");
			 for(int i = 0; i < notas.length; i++) {  //length aqui tá buscar o tamanho do vetor. 
				 
				 System.out.println((i+1)+ "º Pontuação: ");///em cada posição é atribuído o valor que eu tô digitando.
				 notas[i] = entrada.nextFloat();
				 {
				 if(notas[i]> maior)
				  maior = notas[i];
			 }
			 }
 					System.out.println("A maior pontuação foi: " + maior);
 					entrada.close(); /// LEMBRE DE FAZER ISSO
 }
}
	