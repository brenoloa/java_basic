package lista2;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        
        while (true) {
            int i;
            double a, b, c;
            double maior, menor, meio;

            System.out.print("Digite o valor de i [ 1 2 3] >>:" );
            i = scan.nextInt();
            ///
            System.out.print("Digite o valor de a: >>: ");
            a = scan.nextDouble();
            System.out.print("Digite o valor de a: >>: ");
            b = scan.nextDouble();
            System.out.print("Digite o valor de a: >>: ");
            c = scan.nextDouble();
            ////
        
            if (a >= b && a >= c){
                maior = a;
                if (b >= c){
                    meio = b;
                    menor = c;                   
                }
            else{
                meio = c;
                menor = b;
            }
            }
            else if (b >= a && b >= c){
                maior = b;
                if (a >= c){
                    meio = a;
                    menor = c;

                }
                else{
                    meio = c;
                    menor = a;
                }
            }
            else{
                maior = c;
                if (a >= b){
                    meio = a;
                    menor = b;
                }
                else{
                    meio = b;
                    menor = a;
                }
            }

            if (i == 1){
                
                System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
            } 
            else if (i == 2) {
                
                System.out.println("Valores em ordem decrescente: " + maior + ", " + meio + ", " + menor);
            } 
            else if (i == 3) {
               
                System.out.println("Valores com o maior no meio: " + menor + ", " + maior + ", " + meio);
            } 
            else {
                System.out.println("Valor de i inválido. Por favor, insira 1, 2 ou 3.");
            }   
        
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
