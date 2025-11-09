package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV38 - Confirmar saída com 's' *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        char resposta;

        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("Executando alguma funcionalidade...");
            System.out.print("Deseja sair? (s/n): ");
            
            
            String linha = scanner.nextLine().toLowerCase();
            if (linha.length() > 0) {
                resposta = linha.charAt(0);
            } else {
                resposta = 'n'; 
            }

        } while (resposta != 's');

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
