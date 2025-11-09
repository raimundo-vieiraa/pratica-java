package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV30 - Menu até escolher sair *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Opção A");
            System.out.println("2. Opção B");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção A.");
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção B.");
                    break;
                case 3:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
