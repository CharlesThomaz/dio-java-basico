import java.util.Scanner;

public class NomeCompleto {
    
    public static void main(String[] args) {
        Scanner nomes = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String primeiroNome = nomes.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String segundoNome = nomes.nextLine();

        System.out.println(nomeCompleto(primeiroNome, segundoNome));

        nomes.close();
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "O nome completo é: ".concat(primeiroNome).concat(" ").concat(segundoNome);
    }
}
