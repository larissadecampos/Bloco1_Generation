package Atividadades;
import java.util.Scanner;

public class Ex05Lista01 {
//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
// respectivamente.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int nota1, nota2, nota3, soma;
	
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextInt();
	
		soma = ((nota1*2) + (nota2*3) + (nota3*5));
		System.out.println("Sua média ponderada é: " + soma/5);
	}	 

	}
