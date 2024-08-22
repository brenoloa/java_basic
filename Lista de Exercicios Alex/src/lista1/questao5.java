package lista1;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float n1, n2, n3, med;
        //variaveis
        
        System.out.print("Digite n1: >>: ");
        n1 = scan.nextFloat();
        System.out.print("Digite n2: >>: ");
        n2 = scan.nextFloat();
        System.out.print("Digite n3: >>: ");
        n3 = scan.nextFloat();
        // recebimento das notas.
        
        n1 = n1 * 2;
        n2 = n2 * 3;
        n3 = n3 * 5;

        med = (n1 + n2 + n3) / 10;

        System.out.println("A média é: " + med);
    
    }
}

