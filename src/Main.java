import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Jogo de Adivinhação de Números!");

        System.out.print("Digite o valor mínimo do intervalo: ");
        int minimo = scanner.nextInt();

        System.out.print("Digite o valor máximo do intervalo: ");
        int maximo = scanner.nextInt();

        JogoAdivinhacao jogo = new JogoAdivinhacao(minimo, maximo);
        jogo.jogar();

        System.out.println("Jogo encerrado. Você realizou " + jogo.getTentativas() + " tentativas.");
    }
}