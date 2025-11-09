package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV40 - Ler números e mostrar o maior (até digitar negativo) *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE;
        System.out.println("Digite números positivos. O loop encerra quando um número negativo for digitado.");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero > maior) {
                    maior = numero;
                }
            }
        } while (numero >= 0);

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número positivo foi digitado.");
        } else {
            System.out.println("O maior número positivo digitado foi: " + maior);
        }
        scanner.close();
    }
}
