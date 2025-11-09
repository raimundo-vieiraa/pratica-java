package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV29 - Contar dígitos de um número *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numeroOriginal = scanner.nextInt();
        int numero = numeroOriginal;
        int contadorDigitos = 0;

        if (numero == 0) {
            contadorDigitos = 1;
        } else {
            
            if (numero < 0) {
                numero = -numero;
            }
            
            while (numero > 0) {
                numero /= 10;
                contadorDigitos++;
            }
        }

        System.out.println("O número " + numeroOriginal + " tem " + contadorDigitos + " dígitos.");
        scanner.close();
    }
}