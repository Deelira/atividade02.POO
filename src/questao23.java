import java.util.Scanner;

public class questao23 {

    public static void Tarifa_estacionamento(int horas, int minutos){
        int total_minutos = horas * 60 + minutos;

        if (total_minutos <= 60){
            double total = horas * 5;
            System.out.printf("Você permaneceu durante %d hora e deve pagar o valor de R$ %.2f", horas, total);
        } else {
            double total = 5;
            int minutos_restantes = total_minutos - 60;

            int horas_extra = minutos_restantes / 60;
            total += horas_extra * 3;

            int minutos_extra = minutos_restantes % 60;
            if (minutos_extra > 0){
                total += 1.5;
            }

            System.out.printf("Você permaneceu durante %d hora e %d minutos e deve pagar o valor de R$ %.2f", horas, minutos, total);
        }


    }

    public static void main(String[] args) {

        Scanner tempo_permanencia = new Scanner(System.in);
        System.out.print("Quantas horas você ficou no estabelecimento? ");
        int horas = tempo_permanencia.nextInt();
        System.out.print("Quantos minutos você ficou no estabelecimento? ");
        int minutos = tempo_permanencia.nextInt();

        Tarifa_estacionamento(horas, minutos);

    }

}
