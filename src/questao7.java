import java.util.Scanner;

public class questao7 {

    public static void main(String[] args) {

        Scanner venda = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double preco = venda.nextDouble();

        System.out.print("Digite o código do pagamento: (1 - à vista) (2 - à prazo)");
        int condicao = venda.nextInt();

        double desconto ;
        double valor_final;

        if (condicao == 1){
            desconto = 0.10;
            valor_final = preco - (preco * desconto);
            System.out.printf("O valor final do produto com desconto é %.2f", valor_final);
        } else if (condicao == 2) {
            desconto = 0.05;
            valor_final = preco + (preco * desconto);
            System.out.printf("O valor final do produto com acrescímo é %.2f", valor_final);
        } else {
            System.out.print("Código inválido!");
        }
    }
}
