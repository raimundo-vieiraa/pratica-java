package Ejvs01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV07 - Triângulo válido *");
        System.out.println("************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento do lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o comprimento do lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o comprimento do lado C: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os lados formam um triângulo.");
            if (a == b && b == c) {
                System.out.println("Tipo: Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles.");
            } else {
                System.out.println("Tipo: Escaleno.");
            }
        } else {
            System.out.println("Os lados NÃO formam um triângulo.");
        }
        scanner.close();
    }
}