import java.util.Scanner;

public class cadastropessoas {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int QUANTIDADE_PESSOAS;
        System.out.print("Quantas pessoas deseja cadastrar?: ");
        QUANTIDADE_PESSOAS = scanf.nextInt();
        
        scanf.nextLine();
        
        String[] NOMES = new String[QUANTIDADE_PESSOAS];
        String[] CODIGO = new String[QUANTIDADE_PESSOAS];
        int cont = 0;

        while (cont < QUANTIDADE_PESSOAS){
            System.out.print("Nome: ");
            NOMES[cont] = scanf.nextLine();
            System.out.println("Codigo: ");
            CODIGO[cont] = scanf.nextLine();
            cont ++;   
        }

        for (int i = 0; i < cont; i++){
            System.out.println(NOMES[i] + " " + CODIGO[i]);
        }

    }
}
