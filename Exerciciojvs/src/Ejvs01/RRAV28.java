package Ejvs01;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("* Aluno: Raimundo Ruan Alexandre Vieira - 0024340 *");
        System.out.println("* Classe RRAV28 - Soma dos pares entre 1 e 100 *");
        System.out.println("************************************************");
        int soma = 0;
        int i = 2; 

        while (i <= 100) {
            soma += i;
            i += 2; 
        }

        System.out.println("A soma dos números pares entre 1 e 100 é: " + soma);
    }
}
