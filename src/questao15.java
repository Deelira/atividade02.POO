import java.util.Scanner;

public class questao15 {

    public static void main(String[] args) {

        Scanner anos = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = anos.nextInt();

        int divisao_4 = ano % 4;
        int divisao_100 = ano % 100;
        int divisao_400 = ano % 400;

        if (divisao_4 == 0 && divisao_100 != 0){
            System.out.printf("O ano %d é um ano bissexto", ano);
        } else if (divisao_400 == 0){
            System.out.printf("O ano %d é um ano bissexto", ano);
        } else {
            System.out.printf("O ano %d não é um ano bissexto", ano);
        }


    }
}
