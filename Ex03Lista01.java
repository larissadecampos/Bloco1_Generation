package Atividadades;
import java.util.Scanner;

public class Ex03Lista01 {
	//Faça um sistema que leia o tempo de duração de um evento em uma 
	//fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	
	 public static void main(String[] args) {
	      Scanner leia = new Scanner(System.in);

	  int totalSegundos, segundos, minutos, horas, dias;
	
	    System.out.println("Duração em segundos: "); 
	    totalSegundos = leia.nextInt(); 
	    horas = (totalSegundos/3600);
	   	minutos = (totalSegundos % 3600)/60;
	  	segundos = (totalSegundos % 3600) % 60; 

	 System.out.println( " O tempo de duração em horas é "+ horas);
	 System.out.println(" O tempo de duração em minutos é " + minutos);
	 System.out.println(" O tempo de duração em segundos é " + segundos);

	   


}
}