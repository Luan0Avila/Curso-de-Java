package secao12;

import java.util.Arrays;
import java.util.Random;

public class Bilhete {
    
    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos) {
        this.numerosEscolhidos = numerosEscolhidos;
    }

    // Método qe realiza o sorteio
    public void realizarSorteio() {

        Random random = new Random();
        
        resultadoSorteio = new int[6];

        for(int i = 0; i < resultadoSorteio.length; i++) {

            resultadoSorteio[i] = random.nextInt(60) + 1;
        }

        Arrays.sort(resultadoSorteio);
    }

    // Método que conta quantos numeros foram acertados
    public int contarAcertos() {
        int acertos = 0;

        for (int numerosEscolhidos : numerosEscolhidos) {
            for (int numeroSorteio : resultadoSorteio) {
                if (numerosEscolhidos == numeroSorteio) {
                    acertos++;
                }
            }
        }

        return acertos;
    }


    // Exibi os resultados
    public void exibirResultado() {
        System.out.println("Números escolhidos:" + Arrays.toString(numerosEscolhidos));
        System.out.println("Números sorteados:" + Arrays.toString(resultadoSorteio));

        int acertos = contarAcertos();

        System.out.println("Você acertou " + acertos + " acertos");
        
        if (acertos == 6) {
            System.out.println("Parabéns você acertou todos");
        }

        System.out.println();
    }

}
