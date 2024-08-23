package lista3;

import java.util.Arrays;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;

        while (true) { 
            int[] x = new int[12];
            int cont = 0;
            while(cont < 12){
                System.out.print("Digite um numero: >>");
                x[cont] = scan.nextInt();
                cont++;
            }

            
            for (int i = 11; i >= 0; i--){
                System.out.print(x[i] + " ");
            }
            System.out.println("======");
            Arrays.sort(x); //colocando todos vetores em ordem crescente 
            System.out.println("Ordem crescente: ");
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + " ");
            }
            break;
        }
    }
}
