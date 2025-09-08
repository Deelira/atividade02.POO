import java.util.Scanner;

public class questao30 {

    public static void aumento_salarial(double salario, int cargo){
        double salario_final = 0;
        if (cargo == 1){
            salario_final = salario + (salario * 0.15);
        } else if ( cargo == 2) {
            salario_final = salario + (salario * 0.12);
        } else if (cargo == 3) {
            salario_final = salario + (salario * 0.08);
        } else if (cargo == 4) {
            salario_final = salario + (salario * 0.05);
        } else if (cargo == 5) {
            salario_final = salario + (salario * 0.03);
        }

        System.out.printf("O seu salário após ajuste é R$ %.2f", salario_final);
    }

    public static void main(String[] args) {

        Scanner dados_trabalhador = new Scanner(System.in);

        double salario = 0;
        int cargo = 0;

        for (int i = 0; i < 2; i++){
            if (i == 0){
                System.out.print("Digite o seu salário: R$ ");
                salario = dados_trabalhador.nextDouble();
            } else if (i == 1) {
                System.out.println("Qual o seu cargo atual: ");
                System.out.println("1 - Gerente");
                System.out.println("2 - Supervisor");
                System.out.println("3 - Analista");
                System.out.println("4 - Assistente");
                System.out.println("5 - Outro");
                cargo = dados_trabalhador.nextInt();
            }
        }

        aumento_salarial(salario, cargo);




    }

}
