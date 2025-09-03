import java.util.Scanner;

public class questao12 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = numero.nextInt();
        int contagem = 0;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if ( num % i == 0) {
                    contagem += 1;
                }
            }

            if (contagem == 2){
                System.out.printf("O número %d é Primo!", num);
            } else {
                System.out.printf("O número %d não é Primo!", num);
            }

        } else {
            System.out.println("Digite um número válido!");
        }


    }
}
