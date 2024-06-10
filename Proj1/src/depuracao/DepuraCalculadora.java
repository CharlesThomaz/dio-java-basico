package depuracao;
import java.util.Scanner;

public class DepuraCalculadora {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Escolha a operação: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
       int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                int soma = somar(num1, num2);
                System.out.println("Resultado da soma: " + soma);
                break;
            case 2:
                int subtracao = subtrair(num1, num2);
                System.out.println("Resultado da subtração: " + subtracao);
                break;
            case 3:
                int multiplicacao = multiplicar(num1, num2);
                System.out.println("Resultado da multiplicação: " + multiplicacao);
                break;
            case 4:
                if (num2 != 0) {
                    double divisao = dividir(num1, num2);
                    System.out.println("Resultado da divisão: " + divisao);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        return (double) a / b;
    }
}
