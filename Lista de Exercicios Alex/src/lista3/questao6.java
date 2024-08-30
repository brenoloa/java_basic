package lista3;

public class questao6 {
    public static void main(String[] args) {
        double[] vet = {1.2, 2.5, 3.1, 4.7, 5.0, 6.3, 7.8, 8.2, 9.4, 10.0};

        double soma = 0;
        double media = 0;
        double somaquadrados = 0;
        double variancia = 0;
        
        for (int i = 0; i < 10; i++) {
            soma =+ vet[i];
        }
        media = soma / 10;
    
        for (int i = 0; i < 10; i++) {
            somaquadrados += Math.pow(vet[i] - media, 2);
        }
    
        variancia = somaquadrados / 9;

        double desvio = Math.sqrt(variancia);


        System.out.println("desvio: " + desvio);
    }
}

