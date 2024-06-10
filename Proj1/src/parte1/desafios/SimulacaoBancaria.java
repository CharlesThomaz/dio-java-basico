package parte1.desafios;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o 1 para Deposotiar, 2 para Sacar e 3 para ver Saldo: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor  a ser depositado: ");
                    double deposito = scanner.nextInt();
                    saldo +=deposito;
                    System.out.println("O saldo atual é: " + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor  a ser sacado: ");
                    double saque = scanner.nextInt();
                    if (saldo < saque){
                      System.out.println("Saldo insuficiente!");
                      System.out.println("O saldo atual é: " + saldo);
                      break;

                      
                    }else {  
                      saldo -=saque;
                      System.out.println("O saldo atual é: " + saldo);
                      break;
                      
                    }
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("O saldo atual é: " + saldo);

                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}


