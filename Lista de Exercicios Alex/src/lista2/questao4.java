package lista2;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        int contador = 0, pessoas = 0;
        float peso, med = 0;

        while (true) { 
           while (contador < 7){
            System.out.println("Digite seu peso: ");
            peso = scan.nextFloat();
            med += peso;
            if (peso > 90){
                pessoas++;
            }
            
            contador++;

        } 
        
        med = med / 7;

        System.out.println("Média de pesos: " + med +"KG") ;
        System.out.println(pessoas + " Pessoas ficaram acima de 90KG.");
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
