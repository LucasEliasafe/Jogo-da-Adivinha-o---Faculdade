import. java.util.Scanner;

public class JogoAdivinhacao {
    private NumeroAleatorio numeroAleatorio;
    private int tentativas;
    private boolean jogoAtivo;

    public JogoAdivinhacao(int minimo, int maximo) {
        this.numeroAleatorio = new NumeroAleatorio(minimo, maximo);
        this.tentativas = 0;
        this.jogoAtivo = true;
    }
}
