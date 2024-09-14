package lista1;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        char escolha;
        while (true) {
            Scanner scan = new Scanner(System.in);
            double carro_bruto = 40000, carro_final;
    
            carro_final = (carro_bruto * 1.45) + (carro_bruto + 0.28);
    
            System.out.println("Valor do carro final: R$" + carro_final);
            
            //display
            
            System.out.println("Deseja continuar? (s ou n)");
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
