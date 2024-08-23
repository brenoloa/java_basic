package lista1;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        Double d;
        Double x1, x2, y1, y2;
        
        while (true) { 
            
            //recebendo os valores.
            System.out.print("insira x1: ");
            x1 = scan.nextDouble();
            System.out.print("insira x2: ");
            x2 = scan.nextDouble();
            System.out.print("insira y1: ");
            y1 = scan.nextDouble();
            System.out.print("insira y2: ");
            y2 = scan.nextDouble();
        
            //formula
            //calculando os quadrados
            d = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);


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
