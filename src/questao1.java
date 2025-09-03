import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {

        Scanner anos = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = anos.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade");
        }

    }
}
