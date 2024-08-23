package lista3;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        
        while (true) { 
            int[] x = new int[10];
            int posmaior = 0, posmenor = 0;
            int maior, menor;
            
            
            
            System.out.println("Digite os 10 numeros.");
            System.out.print(">>: ");
            x[0] = scan.nextInt();
            maior = menor = x[0]; // setando maior e menor
            
            
            for (int i = 1; i < 10; i++) {
                System.out.print(">>: ");
                x[i] = scan.nextInt();

                
                if (x[i] > maior){
                    maior = x[i];
                    posmaior = i;                   
                }
                if (x[i] < menor){
                    menor = x[i];
                    posmenor = i;
                }
            
            }
            
            System.out.println("maior :" + maior + "pos" + posmaior);
            System.out.println("menor :" + menor + "pos" + posmenor);
            
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
