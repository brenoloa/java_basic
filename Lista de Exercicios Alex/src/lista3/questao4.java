

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matriz = new double[3][6];
        //double somapares;
        double media24 = 0;

        //
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("LINHA: " + i + " COL: " + j);
                matriz[i][j] = scan.nextDouble();

            }
        }
        //
        System.out.println("MATRIZ DIGITADA: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }  

        
        
        
        System.out.println("Colunas impares valores: ");
        for (int i = 0; i < 3; i++) {

            for (int j = 1; j < 6; j+= 2) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // impar

        for (int i = 0; i < 3; i++) {

            media24 += matriz[i][1];
            media24 += matriz[i][3];

        }
        media24 = media24 / 6;

        System.out.println("MEDIA DOS ELEMENTOS 2 E 4 COLUNA " + media24);
        // media

        for (int i = 0; i < 3; i++) {
            matriz[i][5] = matriz[i][0] + matriz[i][1];
        }
        System.out.println("Coluna 6 atualizada: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][5] + " ");
        }
    
    
    }
}
