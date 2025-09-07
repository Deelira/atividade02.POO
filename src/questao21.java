import java.util.Scanner;

public class questao21 {


    public static void Validar_senha(String senha){

        System.out.println("Validando Senha...");
        boolean qtn_caracteres = false;
        int controle = 0;

        for (int i = 0; i < senha.length(); i++){
            controle += 1;
        }

        if (controle >= 8){
            qtn_caracteres = true;
        } else {
            System.out.println("Sua senha precisa conter pelo menos 8 caracteres!");
        }

        boolean letra_maiuscula = false;

        for (int i = 0; i < senha.length(); i++){
            if (senha.charAt(i) >= 'A' && senha.charAt(i) <= 'Z' && senha.charAt(i) != 'a' && senha.charAt(i) != 'z'){
                letra_maiuscula = true;
            }
        }

        if (!letra_maiuscula){
            System.out.println("Sua senha precisa conter pelo menos uma letra maiúscula!");
        }


        boolean numero = false;

        for (int i = 0; i < senha.length(); i++){
            if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9'){
                numero = true;
            }
        }

        if (!numero){
            System.out.println("Sua senha precisa conter pelo menos um número!");
        }

        boolean caracter_especial = false;

        for (int i = 0; i < senha.length(); i++){
            if (senha.charAt(i) == '@' || senha.charAt(i) == '#' || senha.charAt(i) == '$' || senha.charAt(i) == '%'){
                caracter_especial = true;
            }
        }

        if (!caracter_especial){
            System.out.println("Sua senha precisa conter pelo menos um caractere especial!");
        }


        if (caracter_especial && letra_maiuscula && numero && qtn_caracteres){
            System.out.println("Senha validada com Sucesso!");
        }   else {
            System.out.println("Revise sua senha e tente novamente!");
        }
    }

    public static void main(String[] args) {


        Scanner senha_usuario = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = senha_usuario.nextLine();

        Validar_senha(senha);

    }

}
