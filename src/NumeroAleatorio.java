import java.util.Random;

public class NumeroAleatorio {
    private int numeroSecreto;
    private int minimo;
    private int maximo;

    public NumeroAleatorio(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
        gerarNumeroSecreto();
    }

    public void gerarNumeroSecreto() {
        Random gerador = new Random();
        this.numeroSecreto = random.nextInt((maximo - minimo) + 1) + minimo;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

}
