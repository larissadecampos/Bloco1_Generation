package Atividadades;

import java.util.Scanner;
public class Ex01Lista01 {

	public static void main(String[] args) {
	//Faça um sistema que leia a idade de uma pessoa expressa em anos,
	//meses e dias e mostre-a expressa apenas em dias.

	Scanner leia = new Scanner (System.in);
	int dia, mes, ano, soma;
	
	System.out.println("Digite sua idade em anos (dois dígitos): ");
	ano = leia.nextInt();
	System.out.println("Digite sua idade em meses (dois dígitos): ");
	mes = leia.nextInt();
	System.out.println("Digite sua idade em dias (dois dígitos): ");
	dia = leia.nextInt();
	
	System.out.println("Sua data de nasciemnto é: " + dia+ "/" + mes + "/" + ano);
	
	System.out.println(); 
	
	soma = (ano * 365) + (mes *30) + dia;
	System.out.println("Sua idade em dias é: " + soma);
	
	leia.close(); // saída
	
	
}
}