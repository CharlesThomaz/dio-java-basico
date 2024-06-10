package parte1.basico;
import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {
        // Chamando o método imprimir para solicitar o texto ao usuário e, em seguida, imprimir
        try {
            imprimir();
        } catch (Exception e) {
            // Capturando e exibindo a exceção, caso ocorra
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public static void imprimir() throws Exception {
        System.out.println("Digite o texto a ser impresso:");
        Scanner leitor = new Scanner(System.in);
        String texto = leitor.nextLine();

        // Verifica se o texto é nulo ou vazio
        if (texto == null || texto.trim().isEmpty()) {
            // Lança uma exceção se o texto for nulo ou vazio
            throw new Exception("O texto não pode ser nulo ou vazio.");
        } else {
            // Imprime o texto se não for nulo ou vazio
            System.out.println("Texto digitado: " + texto);
        }
    }

    public void gravar(String Cliente){

    }
}
