package Atividades;
import java.util.Scanner;
import java.lang.Math;

public class Ex03Lista01Extra {
//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. 
	
	public static void main(String[] args) throws InterruptedException  {
	Scanner leia = new Scanner(System.in);
	int idade=0, contador1=0, contador2=0, contador=0;		
	
	System.out.println("Digite sua idade: ");
	leia.nextInt();
			
		while(contador1 <2){
		{	if(idade <21)
				contador1++;
			 else if(idade > 50)
				contador2++;
		}System.out.printf("\nPessoas com menos de 21 anos: " +contador1+ ". " + "\nPessoas com mais de 50 anos: " +contador2);
		
}
		Thread.sleep(5);
}
	
}