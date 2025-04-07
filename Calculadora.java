import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar = "S"; // Variável para controlar o loop

        while (continuar.equalsIgnoreCase("S")) {  // Enquanto o usuário digitar "S" (ou "s")
            System.out.println("===========================");
            System.out.println("=== CALCULADORA SIMPLES ===");
            System.out.println("===========================");
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Opção: ");

            int opcao = input.nextInt();

            System.out.print("Digite o primeiro número: ");
            double num1 = input.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = input.nextDouble();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = somar(num1, num2);
                    break;
                case 2:
                    resultado = subtrair(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue; // Volta ao início do loop se a opção for inválida
            }

            System.out.println("Resultado: " + resultado);

            // Perguntar se o usuário quer continuar
            System.out.print("Deseja realizar outra operação? (S - Sim / N - Não): ");
            continuar = input.next();  // O usuário digita "S" ou "N"
        }

        System.out.println("Obrigado por usar a calculadora!");
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }
}
