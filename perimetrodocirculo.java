import java.util.Scanner;

public class perimetrodocirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double PI = 3.141592;

        // Entrada
        System.out.print("Digite o código da operação (1, 2 ou 3): ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double r = scanner.nextDouble();

        switch (codigo) {

            case 1:
                double perimetro = 2 * PI * r;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;

            case 2:
                double area = PI * r * r;
                System.out.println("Área do círculo: " + area);
                break;

            case 3:
                double volume = (4.0 / 3.0) * PI * r * r * r;
                System.out.println("Volume da esfera: " + volume);
                break;

            default:
                System.out.println("Código da operação inválido.");
                break;
        }

        scanner.close();
    }
}
