package lista1;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float seg, hr, min;
        //variaveis 


        System.out.println("Insira o numero em segundos: ");
        seg = scan.nextFloat();
        //recebendo segundos

        min = seg / 60;
        hr = min / 60;

        System.out.println("O tempo restante é de: "+ hr + " horas.");
        System.out.println("O tempo restante é de: "+ min + " minutos.");
        System.out.println("O tempo restante é de: "+ seg + " segundos.");

    }
}
