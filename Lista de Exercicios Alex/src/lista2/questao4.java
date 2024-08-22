package lista2;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;

        while (true) { 
           int contador = 0;
           float peso, med = 0;
           while (contador < 7){
            System.out.println("Digite seu peso: ");
            peso = scan.nextFloat();
            med += peso;
            contador++;

        } 
        
        med = med / 7;

        System.out.println(med);
        
        scan.nextLine();
        System.out.println("Deseja continuar? s / n");
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
