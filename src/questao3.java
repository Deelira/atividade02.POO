import java.util.Scanner;


public class questao3 {

    public static void main(String[] args) {
        String polaridade ;
        String divisivel ;

        Scanner numero = new Scanner(System.in);

        System.out.print("Digite o número desejado: ");
        int num = numero.nextInt();

        if (num > 0){
            polaridade = "Positivo";
        } else {
            polaridade = "Negativo";
        }

        if (num % 2 == 0 ){
            divisivel = "Par";
        } else {
            divisivel = "Ímpar";
        }

        System.out.printf("O número %d é %s e %s", num, polaridade, divisivel);

    }
}
