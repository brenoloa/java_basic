package lista1;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        Double a, b, c, d, r, s;
        while (true) { 
            //recebendo ops numeros
            System.out.print("Insira o valor de A:  ");
            a = scan.nextDouble();
            System.out.print("Insira o valor de B:  ");
            b = scan.nextDouble();
            System.out.print("Insira o valor de C:  ");
            c = scan.nextDouble();

            //calculando
           

            r = Math.pow((a + b), 2);
            
            s = Math.pow((b +c ), 2);
           

            d = (r + s) / 2;

            System.out.println("VALOR D: " + d);
            System.out.println("VALOR S: " + s);
            System.out.println("VALOR R: " + r);

            scan.nextLine();
            System.out.println("deseja continuar? s / n");
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
