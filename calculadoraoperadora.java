import java.util.Scanner;

public class calculadoraoperadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

            System.out.print("Digite o comando (+, -, *, /, ^): ");
        char comando = scanner.next().charAt(0);

        double resultado;

        switch (comando) {

            case '+':
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;

            case '^':
                resultado = Math.pow(n1, n2);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Símbolo da operação inválido.");
                break;
        }

        scanner.close();
    }
}
