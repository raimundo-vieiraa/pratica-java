package Ejvs01;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV13 - Soma dos 100 primeiros números naturais *");
        System.out.println("************************************************");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma dos 100 primeiros números naturais é: " + soma);
    }
}