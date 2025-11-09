package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV23 - Senha correta *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java123";
        String senhaDigitada = "";

        System.out.println("--- Sistema de Login ---");

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("Acesso liberado! Bem-vindo(a).");
        scanner.close();
    }
}
