package lista1;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        int a, b, c, d, e, f, x, y;

        while (true) { 
            System.out.print("Insira o valor de A:  ");
            a = scan.nextInt();
            System.out.print("Insira o valor de B:  ");
            b = scan.nextInt();
            System.out.print("Insira o valor de C:  ");
            c = scan.nextInt();
            System.out.print("Insira o valor de D:  ");
            d = scan.nextInt();
            System.out.print("Insira o valor de E:  ");
            e = scan.nextInt();
            System.out.print("Insira o valor de F:  ");
            f = scan.nextInt();
            // recebendo os coeficientes

            //calculando
            x = ((c * e) - (b * f)) / ((a * e) - (b * d));
            y = ((a * f) - (c *d)) / ((a * e) - (b * d));

            System.out.println("X == " + x);
            System.out.println("Y == " + y);

            scan.nextLine();
            //////////////////////////

            System.out.println("DESEJA CONTINUAR?  S / N");
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
