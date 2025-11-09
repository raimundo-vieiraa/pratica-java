package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV26 - Número primo com while *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        boolean ehPrimo = true;
        int i = 2;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            while (i * i <= numero) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
                i++;
            }
        }

        if (ehPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
        scanner.close();
    }
}
