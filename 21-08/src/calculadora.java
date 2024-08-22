
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n1, n2, x;
        char y;
        //VARIAVEIS + NEW SCAN
        
        System.out.println("Digite a função desejada: ");
        System.out.println("[ 1 ] - SOMAR");
        System.out.println("[ 2 ] - SUBTRAIR");
        System.out.println("[ 3 ] - MULTIPLICAR");
        System.out.println("[ 4 ] - DIVIDIR");
        // MENU INICIAL
        
        System.out.print(">>>: ");
        y = scan.nextLine().charAt(0);
        // INPUT MENU INICIAL

        System.out.print("Digite N1 >>>: ");
        n1 = scan.nextFloat();
        System.out.print("Digite N2 >>>: ");
        n2 = scan.nextFloat();
        // INPUTS PARA N1/N2
    
        switch (y) {
            case '1':
                //somar    
                x = n1 + n2;
                System.out.println("Resultado: " + x);

                break;
            
            case '2':
                //subtrair    
                x = n1 - n2;
                System.out.println("Resultado: " + x);
                break;    
            
            case '3':
                //multiplicar  
                x = n1 * n2;
                System.out.println("Resultado: " + x);
                break;
            
            case '4':
                //dividir
                x = n1 / n2;
                System.out.println("Resultado: " + x);
                break;            

            
            default:
                System.out.println("erro.");
                break;
            }
    
    
    
    
    
    
    }
}
