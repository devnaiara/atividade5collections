package atividades5collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atv4 {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para verificar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, digite apenas números inteiros.");
            scanner.next(); 
        }
        int numeroDigitado = scanner.nextInt();

        if (numeros.contains(numeroDigitado)) {
            System.out.println("Número " + numeroDigitado + " Encontrado!");
        } else {
            System.out.println("O número " + numeroDigitado + " não foi encontrado!");
        }

        scanner.close();
    }
}
