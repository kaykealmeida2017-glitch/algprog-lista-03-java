import java.util.Scanner;
import java.util.Random;

public class parouimpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

            System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        int numeroSorteado = rand.nextInt((maior - menor) + 1) + menor;

        if (numeroSorteado % 2 == 0) {
            System.out.println("Número sorteado: " + numeroSorteado);
            System.out.println("Ele é PAR.");
        }
        else {
            System.out.println("Número sorteado: " + numeroSorteado);
            System.out.println("Ele é ÍMPAR.");
        }

        scanner.close();
    }
}