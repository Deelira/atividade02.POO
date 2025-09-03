import java.util.Scanner;

public class questao13 {

    public static void main(String[] args) {

        Scanner frete = new Scanner(System.in);

        System.out.print("Digite o peso do produto: ");
        double peso = frete.nextDouble();

        System.out.print("Digite a distância em km: ");
        double distancia = frete.nextDouble();

        double custo ;
        if (peso <= 1){
            custo = 10 + (distancia * 0.50);
            System.out.printf("O valor do frete é R$ %.2f", custo);
        } else if (peso > 1 && peso <= 5) {
            custo = 15 + (distancia * 0.80);
            System.out.printf("O valor do frete é R$ %.2f", custo);
        } else if (peso > 5) {
            custo = 20 + distancia;
            System.out.printf("O valor do frete é R$ %.2f", custo);
        }

    }

}
