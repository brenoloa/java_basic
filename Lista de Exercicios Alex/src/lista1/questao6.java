package lista1;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalSegundos;

        System.out.println("Digite os Segundos: ");
        totalSegundos = scan.nextInt();


        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println(horas + "h" + minutos + "m" + segundos + "s");


    }
}
