package Ejvs01;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV01 - Número positivo ou negativo *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        scanner.close();
    }
}