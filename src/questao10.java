import java.util.Scanner;

public class questao10 {

    public static void main(String[] args) {

        Scanner turno_de_estudo = new Scanner(System.in);

        System.out.print("Qual turno você estuda? ");
        String turno = turno_de_estudo.next().toUpperCase();

        if (turno.equals("M")){
            System.out.println("Bom dia!");
        } else if (turno.equals("T")) {
            System.out.println("Boa tarde!");
        } else if (turno.equals("N")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor Inválido!");
        }

    }
}
