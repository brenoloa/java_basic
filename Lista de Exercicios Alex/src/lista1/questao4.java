package lista1;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float meses, dias, idade;
         
        // variaveis + criação do scanner

        System.out.print("Digite sua idade: >>: ");
        idade = scan.nextFloat();
        
        // lendo a idade digitada

        meses = idade * 12;
        dias = idade * 365;
        //calculos
        
        System.out.println(idade + " anos.");
        System.out.println(meses + " meses.");
        System.out.println(dias + " dias.");
        //display
    }
}
