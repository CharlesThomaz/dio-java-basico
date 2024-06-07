import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PerguntasParaCrianca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        falar("Qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Quantos anos você tem?");
        falar("Quantos anos você tem?");
        String idade = scanner.nextLine();

        System.out.println("Qual é a sua brincadeira favorita?");
        falar("Qual é a sua brincadeira favorita?");
        String brincadeira = scanner.nextLine();

        System.out.println("Qual é o seu animal favorito?");
        falar("Qual é o seu animal favorito?");
        String animal = scanner.nextLine();

        System.out.println("Qual é a sua cor favorita?");
        falar("Qual é a sua cor favorita?");
        String cor = scanner.nextLine();

        System.out.println("Qual é a sua comida favorita?");
        falar("Qual é a sua comida favorita?");
        String comida = scanner.nextLine();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos, gosta de brincar de " + brincadeira +
                           ", seu animal favorito é " + animal + ", sua cor favorita é " + cor + 
                           ", e você adora comer " + comida + ".");
        falar("Olá " + nome + ", você tem " + idade + " anos, gosta de brincar de " + brincadeira +
              ", seu animal favorito é " + animal + ", sua cor favorita é " + cor + 
              ", e você adora comer " + comida + ".");

        scanner.close();
    }

    public static void falar(String texto) {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "fala.py", texto);
            pb.redirectErrorStream(true);
            Process process = pb.start();
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
