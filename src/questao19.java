import java.util.Scanner;

public class questao19 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número de três dígitos: ");
        String numero = num.nextLine();

        char[] numero_invertido = new char[3];
        char[] numero_quebrado = new char[3];

        int controle = 0;
        for (int i = numero.length()-1; i >=0; i--){
            numero_invertido[controle] = numero.charAt(i);
            controle += 1;
        }

        for (int i = 0; i <= numero.length()-1; i++){
            numero_quebrado[i] = numero.charAt(i);
        }


        int iguais = 0;
        for (int i = 0; i <= numero_quebrado.length-1; i++){
            if (numero_quebrado[i] == numero_invertido[i]){
                iguais += 1;
            }
        }

        if (iguais == 3){
            System.out.println("É Políndromo");
        } else {
            System.out.println("Não é Políndromo");
        }
    }

}
