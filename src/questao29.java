import java.util.Scanner;

public class questao29 {

    public static void validar_cpf(String cpf){

        int[] digitos = new int[cpf.length()];
        for (int i =0; i < cpf.length(); i++){
            digitos[i] = cpf.charAt(i) -  '0';
        }

        int multiplicador = 2;
        int total = 0;
        int resto = 0;
        for (int i = digitos.length-3; i >= 0; i--){
            total += digitos[i] * multiplicador;
            multiplicador += 1;
            resto = total % 11;
        }

        int primeiro_digito = 0;
        if (resto < 2){
            primeiro_digito = 0;
        } else {
            primeiro_digito = 11 - resto;
        }

        int segundo_digito = 0;
        multiplicador = 2;
        total = 0;
        resto = 0;
        for (int i = digitos.length-2; i >= 0; i--){
            total += digitos[i] * multiplicador;
            multiplicador += 1;
            resto = total % 11;
        }

        if (resto < 2){
            segundo_digito = 0;
        } else {
            segundo_digito = 11 - resto;
        }

        if (primeiro_digito == digitos[9] && segundo_digito == digitos[10]){
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }



    }

    public static void main(String[] args) {

        Scanner num_cpf = new Scanner(System.in);
        System.out.print("Digite o seu CPF: ");
        String cpf = num_cpf.nextLine();

        validar_cpf(cpf);
    }
}
