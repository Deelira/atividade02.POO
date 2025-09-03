import java.util.Scanner;

public class questao9 {

    public static void main(String[] args) {

        Scanner lados = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int lado1 = lados.nextInt();

        System.out.print("Digite o segundo lado: ");
        int lado2 = lados.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int lado3 = lados.nextInt();

        if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado3 + lado1 <= lado2) {
            System.out.println("Não forma um triângulo");
        } else {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno ");
            }

        }
    }
}