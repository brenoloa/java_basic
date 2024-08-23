package lista2;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num, maior, menor;
        int cont;
        char escolha;

        while (true) {
            cont = 0;

            
            System.out.print("Digite um número real positivo: >>: ");
            num = scan.nextDouble();

            
            while (num < 0) {
                System.out.println("Número inválido. Digite um número real positivo: >>: ");
                num = scan.nextDouble();
            }

            
            maior = num;
            menor = num;
            cont++;

            
            while (cont < 5) {
                System.out.print("Digite um número real positivo: >>: ");
                num = scan.nextDouble();

                if (num < 0) {
                    System.out.println("Número inválido.");
                    continue;
                }

               
                if (num > maior) {
                    maior = num;
                }

                if (num < menor) {
                    menor = num;
                }

                cont++;
            }

            System.out.println("Menor número: " + menor);
            System.out.println("Maior número: " + maior);

            scan.nextLine();
            System.out.print("Deseja continuar? s / n: ");
            escolha = scan.nextLine().charAt(0);
            if (escolha == 'n') {
                break;
            }
        }
    }
}
