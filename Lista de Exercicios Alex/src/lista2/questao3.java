package lista2;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;

        while (true) { 
            int n1;
            char ch;
            float res;
            System.out.print("Digite o numero: >>: ");
            n1 = scan.nextInt();

            scan.nextLine();
            //resetando o formato

            System.out.println("Escolha qual tabuada deseja mostrar:");
            System.out.println("[1] SOMA");
            System.out.println("[2] SUBTRACAO");
            System.out.println("[3] MULTIPLICAO");
            System.out.println("[4] DIVISAO");
            System.out.print(">>: ");

            ch = scan.nextLine().charAt(0);

            switch (ch) {
                case '1':
                    for (int i = 1; i <= 10; i++) {
                        res = n1 + i;
                        System.out.println(n1 + " + " + i + " = " + res);
                    }
                    break;
                case '2':
                    for (int i = 1; i <= 10; i++) {
                        res = n1 - i;
                        System.out.println(n1 + " - " + i + " = " + res);
                    }
                    break;
                case '3':
                    for (int i = 1; i <= 10; i++) {
                        res = n1 * i;
                        System.out.println(n1 + " * " + i + " = " + res);
                    }
                    break;
                case '4':
                    for (int i = 1; i <= 10; i++) {
                        res = n1 / i;
                        System.out.println(n1 + " / " + i + " = " + res);
                    }
                    break;
 
                default:
                    System.out.println("erro.");
                    break;
            }

        System.out.println("Deseja continuar? S / N");
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
