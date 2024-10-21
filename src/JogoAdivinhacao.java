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

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int chute;
        while (jogoAtivo) {
            System.out.print("Adivinhe o número (ou digite 0 para sair): ");
            try {
                chute = scanner.nextInt();

                if (chute == 0) {
                    System.out.println("Você saiu do jogo.");
                    jogoAtivo = false;
                } else {
                    tentativas++;
                    verificarChute(chute);
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.next();  // Limpa o buffer
            }
        }
        scanner.close();
    }

    private void verificarChute(int chute) {
        int numeroSecreto = numeroAleatorio.getNumeroSecreto();

        if (chute > numeroSecreto) {
            System.out.println("O número secreto é menor.");
        } else if (chute < numeroSecreto) {
            System.out.println("O número secreto é maior.");
        } else {
            System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            jogoAtivo = false;
        }
    }

}
