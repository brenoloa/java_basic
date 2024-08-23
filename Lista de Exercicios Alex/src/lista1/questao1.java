package lista1;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        float quadrado1, quadrado2, d;
        float x1, x2, y1, y2;
        
        while (true) { 
            
            //recebendo os valores.
            System.out.print("insira x1: ");
            x1 = scan.nextFloat();
            System.out.print("insira x2: ");
            x2 = scan.nextFloat();
            System.out.print("insira y1: ");
            y1 = scan.nextFloat();
            System.out.print("insira y2: ");
            y2 = scan.nextFloat();
        
            //formula
            //calculando os quadrados
            quadrado1 = (x2 - x1) * (x2 - x1);
            quadrado2 = (y2 - y1) * (y2 - y1);
            d = (x2 - x1) * quadrado1 + (y2 - y1) * quadrado2;
            System.out.println("A distancia é " + d);
        
            scan.nextLine();
            System.out.println("desjea continuar? s / n");
            escolha = scan.nextLine().charAt(0);
            
            if (escolha == 's'){
                continue;
            }
            else{
                break;
            }
        
        }



    }
    

}
