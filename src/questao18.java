import java.util.Scanner;

public class questao18 {

    public static void Calcular_IMC(double peso, double altura){

        System.out.println("Calculando IMC...");
        double imc = peso / ( altura * altura);

        if (imc < 18.5){
            System.out.printf("O seu IMC é %.2f = Abaixo do peso", imc);
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.printf("O seu IMC é %.2f = Peso normal!", imc);
        } else if (imc > 24.9 && imc < 30) {
            System.out.printf("O seu IMC é %.2f = Sobrepeso", imc);
        } else if (imc >= 30){
            System.out.printf("O seu IMC é %.2f = Obesidade", imc);
        }

    }

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        double peso = 0.0 ;
        double altura = 0;

        for (int i = 0; i < 2; i++){

            if (i == 0){
                System.out.print("Digite o seu peso (kg): ");
                peso = dados.nextDouble();
            } else if (i == 1){
                System.out.print("Digite a sua altura: ");
                altura = dados.nextDouble();
            }

        }

        Calcular_IMC(peso,altura);

    }

}
