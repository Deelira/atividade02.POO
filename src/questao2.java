import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = notas.nextDouble();

        System.out.print("Digite sua primeira nota: ");
        double nota2 = notas.nextDouble();

        System.out.print("Digite sua primeira nota: ");
        double nota3 = notas.nextDouble();

        System.out.print("Digite sua primeira nota: ");
        double nota4 = notas.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7){
            System.out.printf("Sua média foi %.2f e você está Aprovado", media);
        } else if (media >= 5 && media < 7) {
            System.out.printf("Sua média foi %.2f e você está em Recuperação", media);
        } else if (media < 5) {
            System.out.printf("Sua média foi %.2f e você está Reprovado", media);
        }


    }
}
