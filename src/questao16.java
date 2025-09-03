import java.util.Scanner;

public class questao16 {

    public static void main(String[] args) {

        Scanner cosumo_eletrico = new Scanner(System.in);

        System.out.print("Digite o consumo em kWh: ");
        int consumo = cosumo_eletrico.nextInt();

        System.out.print("Qual o tipo de instalação: (R) (C) (I)");
        String instalacao = cosumo_eletrico.next().toUpperCase();

        switch (instalacao){
            case "R":
                if (consumo <= 500){
                    double total = consumo * 0.70;
                    System.out.printf("O valor total a pagar é R$ %.2f", total);
                } else {
                    double total = consumo * 0.85;
                    System.out.printf("O valor total a pagar é R$ %.2f", total);
                }
                break;
            case "C":
                if (consumo <= 1000){
                    double total = consumo * 1;
                    System.out.printf("O valor total a pagar é R$ %.2f", total);
                } else {
                    double total = consumo * 1.2;
                    System.out.printf("O valor total a pagar é R$ %.2f", total);
                }
                break;
            case "I":
                if (consumo <= 5000){
                    double total = consumo * 1.5;
                    System.out.printf("O valor total a pagar é R$ %.2f", total);
                } else {
                    double total = consumo * 2;
                    System.out.printf("O valor total a pagar é R$ %.2f", total);
                }
                break;
        }

    }
}
