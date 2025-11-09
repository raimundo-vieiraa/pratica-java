package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV15 - Fatorial de um número *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();
        long fatorial = 1;

        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        scanner.close();
    }
}