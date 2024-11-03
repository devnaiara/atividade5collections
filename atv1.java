package atividades5collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atv1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>();
		
		System.out.println("Digite 5 cores: ");

		for (int i = 0; i < 5; i++) {
			System.out.println("Cor: "+ (i + 1));
			cores.add(scanner.nextLine());
		}
		
		System.out.println("Cores digitadas: ");
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}
		
		Collections.sort(cores);
        System.out.println("\nCores em ordem crescente:");
        for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
        }
        
        scanner.close();
	}	
}
