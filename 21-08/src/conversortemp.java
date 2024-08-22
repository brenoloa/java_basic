
import java.util.Scanner;

public class conversortemp {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        char ch;
        System.out.println("Digite um numero: ");
        ch = scanf.nextLine().charAt(0); //1 letra digitada
        


        switch (ch) {
            case 'a':
                System.out.println("digitou A");
                break;
            case 'b':
                System.out.println("digitou B");
                break;
            default:
                System.out.println("erro.");
                break;
        }
    }
}
