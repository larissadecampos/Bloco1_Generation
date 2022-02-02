package Atividades;
import java.util.Random;
public class Ex03Lista03 {

	public static void main(String[] args) {
		/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.
		*/
		Random sorteio = new Random();
		
		int [][] N1 = new int[4][6];
		int [][] N2 = new int[4][6];
		int [][] M1 = new int[4][6];
		int [][] M2 = new int[4][6];
		
				for(int l=0; l<4; l++) {
					for (int c=0; c<6; c++) {
					N1[l][c] = sorteio.nextInt(10);
					N2[l][c] = sorteio.nextInt(10);
					M1[l][c] = N1[l][c] + N2[l][c];
					M2[l][c] = N1[l][c] - N2[l][c];
					}
				    }
		System.out.println("Matriz N1");
				for(int l=0; l<4; l++) {
					for (int c=0; c<6; c++) {
		System.out.print("{" + N1[l][c] +"}");
					}
					System.out.println();
				    }
		System.out.println("Matriz N2");
				for(int l=0; l<4; l++) {
					for (int c=0; c<6; c++) {
	    System.out.print("{" + N2[l][c] +"}");
					}
				 System.out.println();
				    }				
		System.out.println("Soma N1+N2: ");
				for(int l=0; l<4; l++) {
					for (int c=0; c<6; c++) {
		System.out.print("{" + M1[l][c] +"}");	
					}
					System.out.println();
				    }
		System.out.println("Diferença de N1+N2: ");
				for(int l=0; l<4; l++) {
					for (int c=0; c<6; c++) {
		System.out.print("{" + M2[l][c] +"}");
					}
					System.out.println();
				}
				}
		
		}