import java.util.Scanner;

public class questao11 {

    public static void main(String[] args) {

        Scanner bonus = new Scanner(System.in);

        System.out.print("Qual o seu salário? ");
        double salario_atual = bonus.nextDouble();

        System.out.print("Quantos anos de trabalho? ");
        double anos = bonus.nextDouble();

        double valor_bonus ;
        if (anos > 5){
            valor_bonus = salario_atual * 0.20;
            salario_atual = salario_atual + valor_bonus;
            System.out.printf("Você recebeu R$ %.2f e receberá R$ %.2f", valor_bonus, salario_atual);
        } else if (anos >= 3 && anos <=5) {
            valor_bonus = salario_atual * 0.15;
            salario_atual = salario_atual + valor_bonus;
            System.out.printf("Você recebeu R$ %.2f e receberá R$ %.2f", valor_bonus, salario_atual);
        } else if (anos < 3) {
            valor_bonus = salario_atual * 0.10;
            salario_atual = salario_atual + valor_bonus;
            System.out.printf("Você recebeu R$ %.2f e receberá R$ %.2f", valor_bonus, salario_atual);
        }


    }
}
