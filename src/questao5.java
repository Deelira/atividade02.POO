import java.util.Scanner;

public class questao5 {

    public static void main(String[] args) {

        Scanner dia_da_semana = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = dia_da_semana.nextInt();


        if ( numero >= 1 && numero <= 7){

            switch (numero){
                case 1:
                    System.out.printf("Domingo é o dia!");
                    break;
                case 2:
                    System.out.printf("Segunda é o dia!");
                    break;
                case 3:
                    System.out.printf("Terça é o dia!");
                    break;
                case 4:
                    System.out.printf("Quarta é o dia!");
                    break;
                case 5:
                    System.out.printf("Quinta é o dia!");
                    break;
                case 6:
                    System.out.printf("Sexta é o dia!");
                    break;
                case 7:
                    System.out.printf("Sábado é o dia!");
                    break;
            }
        } else {
            System.out.printf("Dia inválido!");
        }

    }
}
