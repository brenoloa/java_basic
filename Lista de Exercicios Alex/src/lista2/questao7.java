package lista2;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        int atual, anterior = -1, dobro;

        while (true) {
            System.out.print("Digite o valor atual: >> :");
            atual = scan.nextInt();

            if (atual <= 0){
                System.out.println("voce digitou um numero negativo, erro!");
                break;
            }
            
            if (anterior != -1 && atual > 2 * anterior) {
                System.out.println("Fim");
                break;
            }
        
        
            anterior = atual;
        
        
        
        
        }

    }
}
