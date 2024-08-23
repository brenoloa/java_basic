package lista2;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = new int[10]; // criando x inteiro com vetor de 10 numeros
        int pares = 0;
        int maior, menor;
        char escolha;
        while (true) {
            System.out.println("Digite os 10 numeros inteiros.");
            //contar numeros pares
            for (int i = 0; i < 10; i++) {
                System.out.print(">>: ");
                x[i] = scan.nextInt();

                if (x[i] % 2 == 0){
                    pares++;
                }
            
            }
            
            maior = menor = x[0]; // resolvendo bug da variavel nao inicilizada
            //maior e menor
            for (int i = 1; i < 10; i++) {
                if (x[i] > maior){
                    maior = x[i];
                }
                if (x[i] < menor){
                    menor = x[i];
                }
            }

            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
           
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
