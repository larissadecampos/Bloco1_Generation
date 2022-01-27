package Atividades;
import java.util.Scanner;
import java.lang.Math;

public class Ex02Lista01Extra {
 //Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, P=0, I=0;
	
	System.out.println("Digite um número: ");
	num1 = leia.nextInt();
	
	 if(num1 % 2 == 0){ //se o resto da divsão do número por 2 for = 0 é par.
		P = P+1;
	 }
		else {
			I = I+1;
		}
			
	 System.out.println("Digite um número: ");
		num2 = leia.nextInt();
	 
		if(num2 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um número: ");
		num3 = leia.nextInt();
	 
		if(num3 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um número: ");
		num4 = leia.nextInt();
	 
		if(num4 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um número: ");
		num5 = leia.nextInt();
	 
		if(num5 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}	
		System.out.println("Digite um número: ");
		num6 = leia.nextInt();
	 
		if(num6 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um número: ");
		num7 = leia.nextInt();
	 
		if(num7 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}	
		System.out.println("Digite um número: ");
		num8 = leia.nextInt();
	 
		if(num8 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um número: ");
		num9 = leia.nextInt();
	 
		if(num9 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um número: ");
		num10 = leia.nextInt();
	 
		if(num10 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
	System.out.println("A quantidade de números pares é: " + P + ". A quantidade de números ímpares é: " + I +".");	
	}
	
	}
