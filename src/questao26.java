import java.util.Scanner;

public class questao26 {

    public static void verificar_data(int dia, int mes, int ano){

        boolean data_valida = false;
        if (dia > 0 && dia <= 31){
            if (mes > 0 && mes <= 12){
                if (ano > 0 && ano <= 2025){
                    data_valida = true;

                }
            }
        }

        if (data_valida){
            System.out.println("Data válida!");
        } else {
            System.out.println("Data inválida!");
        }

    }

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int dia = 0;
        int mes = 0;
        int ano = 0;

        for (int i = 0; i < 3; i++){
            if (i == 0){
                System.out.print("Digite o dia para verificar: ");
                dia = data.nextInt();
            } else if (i == 1) {
                System.out.print("Digite o mês para verificar: ");
                mes = data.nextInt();
            } else if (i == 2) {
                System.out.print("Digite o ano para verificar: ");
                ano = data.nextInt();
            }
        }

        if (dia != 0 && mes != 0 && ano != 0){
            verificar_data(dia, mes, ano);
        } else {
            System.out.println("Preencha as informações necessárias!");
        }

    }

}
