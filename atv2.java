package atividades5collections;

import java.util.ArrayList;
import java.util.Scanner;

public class atv2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		System.out.println("Digite 10 números inteiros. ");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro: ");
			while (!scanner.hasNextInt()) {
    	        System.out.println("Por favor, digite apenas números: ");
    	        scanner.next();
    	    }
			numeros.add(scanner.nextInt());
        }
		System.out.println("Digite o número que deseja encontrar: ");
		while (!scanner.hasNextInt()) {
	        System.out.println("Por favor, digite apenas números: ");
	        scanner.next();
	    }
		int numeroDigitado = scanner.nextInt();
		int posicao = numeros.indexOf(numeroDigitado);
		
		 if (posicao >= 0) {
			 System.out.println("O número " + numeroDigitado + " foi encontrado na posição " + posicao);
		 } else {
			 System.out.println("O número " + numeroDigitado + " não foi encontrado!");		 
		 }
		 
		 scanner.close();
	}	
}
