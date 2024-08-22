package lista1;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        char escolha;

        while (true) {
            Scanner scan = new Scanner(System.in);
            float dias, idade;
            
            // variaveis + criação do scanner

            System.out.print("Digite sua idade: >>: ");
            idade = scan.nextFloat();
            
            // lendo a idade digitada

            dias = idade * 365;
            //calculos
            
        
            System.out.println("Você tem " + dias + " dias de vida.");
            //display
            
            scan.nextLine();
            System.out.println("Deseja continuar? (s ou n)");
            escolha = scan.nextLine().charAt(0);
            // verificação pra interromper o looping
            if (escolha == 's'){
                continue;
            }
            else{
                break;
            }

        }
    }
}
