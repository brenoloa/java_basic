package lista2;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double poluicao;
        char escolha;
        while (true) { 
            System.out.print("Digite o nível de poluição: >>:");
            poluicao = scan.nextDouble();
            // recebendo a poluicao

            if (poluicao < 0.3){
                System.out.println("Nivel de poluicao OK.");
            }
            else if (poluicao >= 0.3 && poluicao < 0.4){
                System.out.println("NOtificação: grupo 1 deve encerrar atividades.");
            }
            else if (poluicao >= 0.4 && poluicao < 0.5){
                System.out.println("NOtificação: grupo 1 e 2 deve encerrar atividades.");
        
            }
            else if (poluicao >= 0.5){
                System.out.println("NOtificação: Todos os grupos devem encerrar atividades.");
            }
        
        
            scan.nextLine();
            System.out.println("deseja continuar? S / n");
            escolha = scan.nextLine().charAt(0);
            
            if (escolha == 's'){
                continue;
            }
            else{
                break;
            }
        } 
    
    }
}
