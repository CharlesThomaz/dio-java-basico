package parte1.desafio;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (saque <= saldo + limiteChequeEspecial) {
            double valorDisponivel = saldo + limiteChequeEspecial;
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial. Saldo disponivel: " + valorDisponivel);
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        scanner.close();
    }
}
