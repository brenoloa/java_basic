package lista2;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        int a, b, resto;
        
        while (true) {
            System.out.print("Digite o valor de A:) >>: ");
            a = scan.nextInt();
            System.out.print("Digite o valor de B:) >>: ");
            b = scan.nextInt();

            if (a <= b){
                System.out.println("A precisa ser Maior que B. programa finalizado");
                break;
            }

            System.out.println("==========");

            while (b != 0){
                resto = a % b;
                System.out.println(a + " / " + b + "resto: " + resto);
                a = b;
                b = resto;
            }
            System.out.println("MDC: = " + a );

            scan.nextLine();
            System.out.println("deseja continuar? S / N");
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
