
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        int numero, resultado;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero para saber a tabuada> ");
        numero = scan.nextInt();

        for (int i = 0; i <= 10; i++){
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
