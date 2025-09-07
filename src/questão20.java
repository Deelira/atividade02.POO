import java.util.Scanner;

public class questão20 {

    public static void Desconto(double valor_compra){
        if (valor_compra <= 100.00){
            System.out.println("Você não tem direito à desconto!");
            System.out.printf("O valor da sua compra é R$ %.2f", valor_compra);
        } else if (valor_compra > 100.00 && valor_compra <= 500.00) {
            double valor_desconto = valor_compra * 0.10;
            double total = valor_compra - valor_desconto;
            System.out.printf("O valor da sua compra é R$ %.2f\n", valor_compra);
            System.out.printf("Você recebeu um desconto de R$ %.2f\n", valor_desconto);
            System.out.printf("O valor da sua compra com desconto é R$ %.2f\n", total);
        } else if (valor_compra > 500.00) {
            double valor_desconto = valor_compra * 0.20;
            double total = valor_compra - valor_desconto;
            System.out.printf("O valor da sua compra é R$ %.2f\n", valor_compra);
            System.out.printf("Você recebeu um desconto de R$ %.2f\n", valor_desconto);
            System.out.printf("O valor da sua compra com desconto é R$ %.2f", total);
        }
    }

    public static void main(String[] args) {
        Scanner compra = new Scanner(System.in);
        System.out.printf("Digite o valor da compra: R$ ");
        double valor_compra = compra.nextDouble();

        Desconto(valor_compra);
    }

}
