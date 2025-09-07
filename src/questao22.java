import java.util.Scanner;

public class questao22 {

    public static void classificar_triangulo(int[] lados){

        int contagem_maior_90 = 0;
        int contagem_menor_90 = 0;
        int contagem_igual_90 = 0;
        int soma = 0;

        for (int i = 0; i < lados.length; i++){
            soma += lados[i];
            if (lados[i] > 90){
                contagem_maior_90 += 1;
            } else if (lados[i] < 90) {
                contagem_menor_90 += 1;
            } else {
                contagem_igual_90 += 1;
            }
        }

        if (soma == 180){
            System.out.println("É um triângulo válido!");

            if (contagem_menor_90 == 3){
                System.out.println("É um Triângulo Actuângulo");
            } else if (contagem_maior_90 == 1) {
                System.out.println("É um Triângulo Obtusângulo");
            } else if (contagem_igual_90 == 1) {
                System.out.println("É um Triângulo Retângulo");
            }

        } else {
            System.out.println("Não é um triângulo válido!");
        }

    }

    public static void main(String[] args) {

        int[] lados = new int[3];

        Scanner lados_triangulo = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.printf("Digite o %dº ângulo do triângulo: ", i+1);
            lados[i] = lados_triangulo.nextInt();
        }

        classificar_triangulo(lados);

    }

}
