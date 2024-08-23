package lista1;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        float a, b, c, d, r, s, quadrado1, quadrado2;

        while (true) { 
            //recebendo ops numeros
            System.out.print("Insira o valor de A:  ");
            a = scan.nextFloat();
            System.out.print("Insira o valor de B:  ");
            b = scan.nextFloat();
            System.out.print("Insira o valor de C:  ");
            c = scan.nextFloat();

            //calculando
            quadrado1 = (a + b) * (a + b);
            quadrado2 = (b + c) * (b + c);

            r = (a + b) * quadrado1;

            s = (b + c) * quadrado2;

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
