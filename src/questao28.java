import java.util.Scanner;

public class questao28 {

    public static void verificar_multiplo(int num){

        int resto = num % 3;
        boolean resto_de_3 = false;
        if (resto == 0){
            resto_de_3 = true;
            resto = 1;
        }

        resto = num % 5;
        boolean resto_de_5 = false;
        if (resto == 0){
            resto_de_5 = true;
        }

        if (resto_de_3 && resto_de_5){
            System.out.println("Múltiplo de 3 e 5 simultaneamente!");
        } else if (resto_de_3) {
            System.out.println("Múltiplo apenas de 3!");
        } else if (resto_de_5) {
            System.out.println("Múltiplo apenas de 5!");
        } else {
            System.out.println("Não é múltiplo de 3 nem de 5!");
        }

    }

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = numero.nextInt();

        verificar_multiplo(num);

    }

}
