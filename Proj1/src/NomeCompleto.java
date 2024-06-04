
import java.util.Scanner;

public class NomeCompleto {
    

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String primeiroNome = dados.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String segundoNome = dados.nextLine();

        System.out.println(nomeCompleto(primeiroNome, segundoNome));

        dados.close();
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "O nome completo é: ".concat(primeiroNome).concat(" ").concat(segundoNome);
    }
}
