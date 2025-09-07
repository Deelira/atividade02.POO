import java.util.Scanner;

public class questao27 {

    public static void calcular_gorjeta(double valor, int qualidade){
        double gorjeta = 0;
        if (qualidade == 2){
            gorjeta = valor * 0.05;
            valor += gorjeta;
        } else if (qualidade == 3) {
            gorjeta = valor * 0.1;
            valor += gorjeta;
        } else if (qualidade == 4) {
            gorjeta = valor * 0.15;
            valor += gorjeta;
        } else if (qualidade == 5) {
            gorjeta = valor * 0.20;
            valor += gorjeta;
        }

        if (gorjeta != 0){
            System.out.printf("Obrigado! Você pagará R$ %.2f de gorjeta e o valor final é R$ %.2f", gorjeta ,valor);
        } else {
            System.out.printf("Obrigado! O valor final é R$ %.2f", valor);
        }

    }

    public static void main(String[] args) {
        Scanner dados_compra = new Scanner(System.in);
        double valor = 0;
        int qualidade = 0;
        for (int i = 0; i < 2; i++){
            if (i ==0 ){
                System.out.print("Digite o valor da compra: ");
                valor = dados_compra.nextDouble();
            }
            if ( i == 1) {
                System.out.println("Avalie o nosso serviço: ");
                System.out.println("1 - Péssimo");
                System.out.println("2 - Ruim");
                System.out.println("3 - Regular");
                System.out.println("4 - Bom");
                System.out.println("5 - Excelente");
                qualidade = dados_compra.nextInt();
            }
        }

        calcular_gorjeta(valor, qualidade);

    }
}
