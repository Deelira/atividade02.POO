import java.util.Scanner;

public class questao14 {

    public static void main(String[] args) {

        Scanner atleta = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = atleta.nextInt();

        if (idade > 5){
            if (idade <= 12){
                System.out.println("Infantil");
            } else if (idade > 12 && idade <= 17) {
                System.out.println("Juvenil");
            } else if (idade > 17 && idade <= 40) {
                System.out.println("Adulto");
            } else if (idade > 40) {
                System.out.println("Master");
            }
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
