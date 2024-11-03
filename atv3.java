package atividades5collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class atv3 {
	public static void main(String[] args) {
		
		 Set<Integer> numeros = new HashSet<>();
		 
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite 10 números inteiros, sem repetição:");

	        while (numeros.size() < 10) {
	            System.out.print("Digite um número inteiro: ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Por favor, digite apenas números inteiros.");
	                scanner.next();
	            }
	            int numero = scanner.nextInt();

	            if (numeros.contains(numero)) {
	                System.out.println("Número já inserido. Insira um número diferente.");
	            } else {
	                numeros.add(numero);
	            }
	        }

	        System.out.println("Números inseridos organizados em ordem crescente: ");
	        Iterator<Integer> iterator = numeros.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        scanner.close();
	   }
}

