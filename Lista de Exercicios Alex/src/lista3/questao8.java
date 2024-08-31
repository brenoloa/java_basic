package lista3;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numeros_digitados;
        String seis_primeiros;
        int yyy, soma = 0;
        String xxx;
        int digito_verificador;
        int primeirosegundo_digito;
        int primeiro_digito;
        while (true) { 
            System.out.println("Digite os 16 numeros: ");
            numeros_digitados = scan.nextLine();
            
            //puxando os 6 primeiros "digitos" da string          
            seis_primeiros = numeros_digitados.substring(0, 6);
            
            
            //verificando se a string tem 16 digitos
            if (numeros_digitados.length() != 16){
                System.out.println("erro! digite novamente. ");
                continue;
            }
            else {
                //transformando o primeiro digito da string em um numero inteiro
                primeiro_digito = Integer.parseInt(seis_primeiros.substring(0, 1));
                if (primeiro_digito >= 3 && primeiro_digito <= 6){
                    
                    
                    // puxando 2 "caracteres" pra verificar bandeira
                    primeirosegundo_digito = Integer.parseInt(seis_primeiros.substring(0, 2));
                    
                    //
                    //VERIFICANDO BANDEIRA!
                    if (primeiro_digito == 4){
                        System.out.println("VISA");
                    }
                    else if (primeirosegundo_digito >= 51 && primeirosegundo_digito <= 55){
                        System.out.println("MASTERCARD");
                    }
                    else if (primeirosegundo_digito == 34 || primeirosegundo_digito == 37){
                        System.out.println("AMERICAN EXPRESS");
                    }
                    else if (primeirosegundo_digito == 50 || primeirosegundo_digito >= 56 && primeirosegundo_digito <= 69){
                        System.out.println("MAESTRO.");
                    }
                    else {
                        System.out.println("BANDEIRA DESCONHECIDA.");
                    }
                    for (int i = 0; i < 16; i+= 2) {
                        //vou converter um a um pra inteiro e se for maior q 10 (2) digitos eu somo os 2 digitos
                        
                        //transformando xxx em 1 caractere e logo depois convertendo pra inteiro com yyy
                        xxx = numeros_digitados.substring(i, i + 1);
                        yyy = Integer.parseInt(xxx) * 2;
                    
                        if (yyy > 9){                  
                            yyy = yyy / 10 + yyy % 10;
                        }
                    
                        soma += yyy;
                    }
                    
                    for (int i = 1; i < 16; i+= 2) {
                        xxx = numeros_digitados.substring(i, i + 1);
                        yyy = Integer.parseInt(xxx);
                        soma += yyy;
                    }
                    
                    digito_verificador = 10 - (soma % 10);
                        if (digito_verificador == 10){
                            digito_verificador = 0;
                        }
                    System.out.println("CARTÃO VALIDO!!\n DIGITO VERIFICADOR: " + digito_verificador);
                                     
                    break;
                }
                else {
                    System.out.println("cartao invalido! tente novamente");
                    continue;
                }
            }
        }



    }
}
