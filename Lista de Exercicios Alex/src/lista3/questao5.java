package lista3;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        
        while (true) { 
            System.out.println("Digite um numero inteiro e positivo: ");
            numero = scan.nextInt();

            if (numero > 0){
                break;
            }
            else{
                System.out.println(numero + "   Invalido, tente novamente! ");
                continue;
            }
        }
        System.out.println("Número digitado foi " + numero);
        System.out.println("Numeros pares entre 1 - " + numero);
        for (int i = 2; i < numero; i+= 2) {
            System.out.print(i + ", ");
        }





    }
}
