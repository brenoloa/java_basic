package lista1;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float dias, idade;
         
        // variaveis + criação do scanner

        System.out.print("Digite sua idade: >>: ");
        idade = scan.nextFloat();
        
        // lendo a idade digitada

        dias = idade * 365;
        //calculos
        
       
        System.out.println("Você tem " + dias + " dias de vida.");
        //display
    }
}
