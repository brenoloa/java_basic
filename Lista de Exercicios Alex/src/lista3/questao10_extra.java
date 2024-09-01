package lista3;

import java.util.Scanner;

public class questao10_extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qnt_alunos;
        System.out.println("Quantos alunos deseja cadastrar? : ");
        qnt_alunos = scan.nextInt();
        scan.nextLine();

        String[] nomes = new String[qnt_alunos];
        float[][] dados = new float[qnt_alunos][3];
        float[] medias = new float[qnt_alunos];
        System.out.println("PROGRAMA INICIANDO . . . !");
        System.out.println("#################################");
        
        char escolha;
        for (int linha = 0; linha < qnt_alunos; linha++) {
            System.out.println("Digite o nome do Aluno: ");
            nomes[linha] = scan.nextLine();
            
            System.out.println("Digite a MATRICUKA: ");
            dados[linha][0] = scan.nextFloat();
            
            System.out.println("Digite a N1: ");
            dados[linha][1] = scan.nextFloat();
            
            System.out.println("Digite a N1: ");
            dados[linha][2] = scan.nextFloat();
            
            medias[linha] = (dados[linha][1] + dados[linha][2]) / 2;
            scan.nextLine();
        }
        System.out.println("### DADOS ARMAZENADOS COM SUCESSO! ###");
        System.out.println("#################################");
        while (true) { 
            System.out.println();
            System.out.println("##########   MENU   ###########");
            System.out.println("[1] - IMPRIMIR DADOS.");
            System.out.println("[2] - EDITAR DADOS.");
            System.out.println("[3] - LIMPAR DADOS.");
            System.out.println("[4] - FINALIZAR!.");
            System.out.print("########   >>: ");
            escolha = scan.nextLine().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("############ IMPRIMINDO #################");
                    System.out.printf("NOME\tMATR\tN1\tN2\tMED\t\n");
                    for (int i = 0; i < qnt_alunos; i++) {
                        System.out.printf("%s\t%.0f\t%.1f\t%.1f\t%.1f\t\n", nomes[i], dados[i][0], dados[i][1], dados[i][2], medias[i]);
                        
                    }
                    continue;
                case '2':
                    System.out.println("############## EDIÇÃO ################");    
                    int posicao = 0;
                    System.out.println("Digite a posição que deseja editar: ");
                    posicao = scan.nextInt();
                    scan.nextLine();
                    System.out.println("##### OK, AGORA PREENCHA NOVAMENTE PARA EDITAR! ##########");
                    System.out.println("Digite o nome do Aluno: ");
                    nomes[posicao] = scan.nextLine();
                    
                    System.out.println("Digite a MATRICUKA: ");
                    dados[posicao][0] = scan.nextFloat();
                    
                    System.out.println("Digite a N1: ");
                    dados[posicao][1] = scan.nextFloat();
                    
                    System.out.println("Digite a N1: ");
                    dados[posicao][2] = scan.nextFloat();
                    
                    medias[posicao] = (dados[posicao][1] + dados[posicao][2]) / 2;
                    scan.nextLine();
                    continue;
                    
                case '3':
                    System.out.println("####### DADOS DELETADOS, INSIRA NOVAMENTE! ######## ");
                    for (int linha = 0; linha < qnt_alunos; linha++) {
                        System.out.println("Digite o nome do Aluno: ");
                        nomes[linha] = scan.nextLine();
                        
                        System.out.println("Digite a MATRICUKA: ");
                        dados[linha][0] = scan.nextFloat();
                        
                        System.out.println("Digite a N1: ");
                        dados[linha][1] = scan.nextFloat();
                        
                        System.out.println("Digite a N1: ");
                        dados[linha][2] = scan.nextFloat();
                        
                        medias[linha] = (dados[linha][1] + dados[linha][2]) / 2;
                        scan.nextLine();
                    }
                    continue;
                
                
                default:
                    break;
                    
            }
            if (escolha == '4'){
                break;
            }
        }
    }
}
