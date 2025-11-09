package Ejvs01;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV18 - Múltiplos de 3 entre 1 e 30 *");
        System.out.println("************************************************");
        System.out.println("Múltiplos de 3 entre 1 e 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}