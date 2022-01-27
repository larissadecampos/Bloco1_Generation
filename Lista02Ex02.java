package Atividades;

import java.util.Scanner;

public class Ex02Lista02 {
// Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			int num1, num2, num3, maior=0, meio=0, menor=0;
		
			System.out.println("Digite um número: ");
			num1 = entrada.nextInt();
			 
			if (num1 >= maior) {
				maior = num1;
			}
			
			System.out.println("Digite um número: ");
			num2 = entrada.nextInt();
			
			if (num2 >= maior) {
				meio = maior;
				maior = num2;
			}
			else {
				meio = num2;
			}

			System.out.println("Digite um número: ");
			num3 = entrada.nextInt();
			
			if(num3 >= maior) {
				menor = meio;
				meio = maior;
				maior = num3;
			}
			else if(num3 >= meio) {
				menor = meio;
				meio = num3;
			}
			
			System.out.println("Os números digitados em ordem crescente são: " +menor+ ", " +meio+ " e " +maior+ "." );

	}

}
