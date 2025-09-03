import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) {
        double resultado ;

        Scanner calculo = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = calculo.nextDouble();

        System.out.print("Digite a operação que deseja efetuar: ");
        String op = calculo.next();

        System.out.print("Digite o segundo número: ");
        double num2 = calculo.nextDouble();

        switch (op){
            case "+":
                resultado = num1 + num2;
                System.out.printf("O resultado da operação é %.1f", resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.printf("O resultado da operação é %.1f", resultado);
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("Erro: divisão por zero");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("O resultado da operação é %.1f", resultado);
                }
                break;
            case "*":
                resultado = num1 * num2;
                System.out.printf("O resultado da operação é %.1f", resultado);
                break;
        }
    }
}
