import java.util.Scanner;

public class maquinadevenda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor da compra: ");
        int valorCompra = scanner.nextInt();

            System.out.print("Digite o valor pago: ");
        int valorPago = scanner.nextInt();

        if (valorPago < valorCompra) {
            System.out.println("Ta faltando dindin, em");
        }
        
        else {

            int troco = valorPago - valorCompra;
            int restante = troco;

            int n50 = restante / 50;
            restante = restante % 50;

            int n20 = restante / 20;
            restante = restante % 20;

            int n10 = restante / 10;
            restante = restante % 10;

            int n5 = restante / 5;
            restante = restante % 5;

            int n2 = restante / 2;
            restante = restante % 2;

            int n1 = restante;

                System.out.println("\nTroco: R$ " + troco + ",00");
                System.out.println("Notas de R$ 50,00: " + n50);
                System.out.println("Notas de R$ 20,00: " + n20);
                System.out.println("Notas de R$ 10,00: " + n10);
                System.out.println("Notas de R$ 5,00: " + n5);
                System.out.println("Notas de R$ 2,00: " + n2);
                System.out.println("Notas de R$ 1,00: " + n1);
            }

        scanner.close();
    }
}
