import java.util.Scanner;

public class questao24 {

    public static void verificar_numero(int numero){

        int[] divisores = new int[numero];
        for (int i = 1; i < numero; i++){

            int resto = numero % i;
            if (resto == 0){
                divisores[i] = i;

            }
        }

        int soma = 0;
        for (int i = 0; i < divisores.length; i++){
            soma += divisores[i];
        }

        if (soma == numero){
            System.out.printf("O número %d é perfeito",numero);
        } else {
            System.out.printf("O número %d não é perfeito",numero);
        }

    }

    public static void main(String[] args) {

        Scanner numero_perfeito = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = numero_perfeito.nextInt();

        verificar_numero(numero);
    }

}
