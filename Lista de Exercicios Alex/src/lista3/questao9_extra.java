package lista3;

import java.util.Scanner;

public class questao9_extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String x, CPF;
        String xxx;
        int yyy;
        int soma = 0;
        int mult = 10;
        int mult2 = 11;
        int digitoverificador_1;
        int digitoverificador_2;
        int cpf_digito1;
        int cpf_digito2;
        while (true) { 
            System.out.println("Digite seu CPF no formato 000.000.000-00:  ");
            x = scan.nextLine();

            //removendo - . da string
            CPF = x.replaceAll("[-.]", "");
            
            // separando os 2 digitos pra comparar no final.
            cpf_digito1 = Integer.parseInt(CPF.substring(9, 10));
            cpf_digito2 = Integer.parseInt(CPF.substring(10, 11));
            
            //System.out.println(cpf_digito1);
            //System.out.println(cpf_digito2);
            if (CPF.length() != 11){
                System.out.println("CPF INVALIDO. tente novamente.");
                continue;
            }
            else {
                soma = 0;
                mult = 10;
                for (int i = 0; i < 9; i++) {
                    xxx = CPF.substring(i, i + 1);
                    yyy = Integer.parseInt(xxx);
                    yyy = yyy * mult;
                    mult--;
                    soma += yyy;

                }
               
            
                digitoverificador_1 = soma % 11;
                    if (digitoverificador_1 == 0 || digitoverificador_1 == 1){
                        digitoverificador_1 = 0;
                    }
                    else if (digitoverificador_1 != 0 || digitoverificador_1 != 1){
                        digitoverificador_1 = 11 - digitoverificador_1;
                    }

                //System.out.println("digito verificador 1: " + digitoverificador_1);
                soma = 0;
                mult2 = 11;
                for (int i = 0; i < 9; i++) {
                    xxx = CPF.substring(i, i + 1);
                    yyy = Integer.parseInt(xxx);
                    yyy = yyy * mult2;
                    mult2--;
                    soma += yyy;
                }
                
                soma += digitoverificador_1 * 2;

                digitoverificador_2 = soma % 11;
                if (digitoverificador_2 == 0 || digitoverificador_2 == 1){
                    digitoverificador_2 = 0;
                }
                else if (digitoverificador_2 != 0 || digitoverificador_2 != 1){
                    digitoverificador_2 = 11 - digitoverificador_2;
                }
                //System.out.println("digito verificador 2: " + digitoverificador_2);
                
                if (digitoverificador_1 == cpf_digito1 && digitoverificador_2 == cpf_digito2){
                    System.out.println("CPF VÁLIDO.");
                    break;
                }
                else {
                    System.out.println("CPF INVALIDO, TENTE NOVAMENTE!");
                    continue;
                }
            }
        }
    }
}
