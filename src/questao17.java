import java.util.Scanner;

public class questao17 {

    public static void main(String[] args) {

        Scanner ordem = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = ordem.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ordem.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = ordem.nextInt();

        int maior = 0;
        int medio = 0;
        int menor = 0;

        if (num1 > num2){
            if (num1 > num3){
                maior = num1;
                System.out.println("Maior");
            }  else {
                medio = num1;
                System.out.println("Medio");
            }
        } else {
            menor = num1;
            System.out.println("Menor");
        }

        if (num2 > num1){
            if (num2 > num3){
                maior = num2;
                System.out.println("Maior");
            }  else {
                medio = num2;
                System.out.println("Medio");
            }
        } else {
            menor = num2;
            System.out.println("Menor");
        }

        if (num3 > num1){
            if (num3 > num2){
                maior = num3;
                System.out.println("Maior");
            }  else {
                medio = num3;
                System.out.println("Medio");
            }
        } else {
            menor = num3;
            System.out.println("Menor");
        }

        System.out.printf("%d, %d, %d", maior, medio, menor);

    }
}
