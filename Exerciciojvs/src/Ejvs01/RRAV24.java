package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV24 - Verificar se um número é positivo *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("--- Validação de Número Positivo ---");

        while (numero <= 0) {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("O número deve ser positivo. Tente novamente.");
            }
        }

        System.out.println("Número positivo digitado: " + numero);
        scanner.close();
    }
}
