import java.util.Scanner;

public class questao6 {

    public static void main(String[] args) {

        Scanner idade = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int anos = idade.nextInt();

        if (anos >= 0 && anos <= 12){
            System.out.printf("Criança");
        } else if (anos > 13 && anos <= 17 ) {
            System.out.printf("Adolescente");
        } else if (anos > 17 && anos <= 59) {
            System.out.printf("Adulto");
        } else if (anos > 59) {
            System.out.printf("Idoso");
        }

    }
}
