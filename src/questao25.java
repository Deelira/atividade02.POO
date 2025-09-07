import java.util.Locale;
import java.util.Scanner;

public class questao25 {

    public static void programa_fidelidade(double valor_compra, String dia_da_semana){


        char[] sabado = {'s', 'a', 'b', 'a', 'd', 'o'};
        char[] domingo = {'d', 'o', 'm', 'i', 'n', 'g', 'o'};
        char[] dia = new char[dia_da_semana.length()];

        for (int i = 0; i < dia_da_semana.length(); i++){
            dia[i] = dia_da_semana.charAt(i);
        }

        int contagem_sabado = 0;
        int contagem_domingo = 0;

        for (int i = 0; i < sabado.length; i++){
            if (dia[i] == sabado[i]){
                contagem_sabado += 1;
            }
        }

        for (int i = 0; i < domingo.length; i++){
            if (dia[i] == domingo[i]){
                contagem_domingo += 1;
            }
        }

        int pontos = 0;
        for (int i = 0; i < valor_compra; i += 10){
            pontos += 1;
        }

        if (pontos >= 200 && pontos < 500 ){
                pontos += 20;
        } else if (pontos >= 500) {
            pontos += 50;
        }

        int pontos_bonus = 0;

        if (contagem_domingo == dia_da_semana.length()){
            pontos_bonus = pontos * 2;
        }
        if (contagem_sabado == dia_da_semana.length()) {
            pontos_bonus = pontos * 2;
        }

        System.out.printf("O valor da sua compra é R$ %.2f\n", valor_compra);
        if (pontos_bonus != 0){
            System.out.printf("Você tem direito ao dobro de pontos, totalizando %d pontos.", pontos_bonus);
        } else {
            System.out.printf("Você obteve o total de %d\n", pontos);
        }


    }


    public static void main(String[] args) {
        Scanner compra = new Scanner(System.in);
        System.out.print("Digite o valor da sua compra: R$ ");
        double valor_compra = compra.nextDouble();

        Scanner dia_semana = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        String dia_da_semana = dia_semana.nextLine().toLowerCase();

        programa_fidelidade(valor_compra, dia_da_semana);
    }

}
