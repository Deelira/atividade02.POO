import java.util.Scanner;

public class questao8 {

    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = numeros.nextInt();

        System.out.print("Digite o início do intervalo: ");
        double inicio = numeros.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        double fim = numeros.nextInt();

        if (inicio <= num && fim >= num){
            System.out.printf("O número %d está dentro do intervalo!", num);
        } else {
            System.out.printf("O número %d está fora do intervalo!", num);
        }

    }
}
