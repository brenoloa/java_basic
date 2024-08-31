package lista3;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double y, xi, ximais1, raizcerta;
        
        while (true) {
            System.out.println("Digite um número positivo: ");
            y = scan.nextDouble();

            if (y > 0){
                break;
            }
            else {
                System.out.println("Invalido, tente novamente.");
                continue;
            }
        }
        xi = y / 2;
        
        while (true) {
            ximais1 = xi - ((xi * xi - y) / (2 * xi));
            
            if (Math.abs(ximais1 - xi) < 0.1) {
                break;
                
            }
            
            xi = ximais1;
        }

        System.out.println("Raiz aprox de " + y + " é: " + ximais1 );
        
        raizcerta = Math.sqrt(y);
        System.out.println("Raiz EXATA de " + y + " é: " + raizcerta);
    
        System.out.println("diferença: " + Math.abs(ximais1 - raizcerta));
    }
}
