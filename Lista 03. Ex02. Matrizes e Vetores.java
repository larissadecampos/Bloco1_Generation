package Atividades;
import java.util.Random;
public class Ex02Lista03 {

	public static void main(String[] args) {
		//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		//imprima a média aritmética dos lançamentos, contabilize e apresente também
		//quantas foram as ocorrências da maior pontuação.

		Random lance = new Random();
		
		int cont,soma=0, ocorr=0, maior=0;
		int[]dado = new int[10];

		for(cont = 0; cont <10; cont++) {
			dado[cont] = lance.nextInt(6)+1;
		 	
		 	if(dado[cont]> maior) {
		 		maior = dado[cont];
		 			ocorr=1;
		 	}
		 	else if(dado[cont]==maior) {
		 			ocorr++;
		 	}
		 	soma += dado[cont];
				 }
			for (cont = 0; cont <10; cont++) {
			System.out.println("|" +dado[cont]+ "|");
		 }
			System.out.println("A média de valor dos lances é: " + soma/10);
			System.out.println("A ocorrência da pontuação é: " + ocorr);
	}
}