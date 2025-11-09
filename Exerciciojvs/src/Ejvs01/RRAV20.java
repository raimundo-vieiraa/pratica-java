package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV20 - Números de Fibonacci (n termos) *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("A quantidade de termos deve ser positiva.");
        } else {
            long a = 0, b = 1;
            System.out.println("Os " + n + " primeiros termos de Fibonacci são:");

            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i < n ? ", " : ""));
                long proximo = a + b;
                a = b;
                b = proximo;
            }
            System.out.println(); 
        scanner.close();
    }
}}
