package lista3;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;

        while (true) { 
            int[][] matriz = new int[3][3]; //criando uma matriz 3x3
            int somadiagonal = 0;

            System.out.println("Preencha a matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int ii = 0; ii < 3; ii++) {
                    System.out.print("["+ i + "][" + ii + "]");
                    matriz[i][ii] = scan.nextInt();
                   
                }
            }
        
            System.out.println("---- preenchida ----");
            for (int i = 0; i < 3; i++) {
                for (int ii = 0; ii < 3; ii++) {
                    System.out.print(matriz[i][ii]+ " ");
                    if (i == ii){
                        somadiagonal += matriz[i][ii];
                    }
                }
                System.out.println(); // quebrando linha pra ficar 3x3 no print
            }
            
            System.out.println("soma diagonal: "+ somadiagonal);
            break;
        }


    }
}
