import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsultaMedica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à consulta médica virtual!");
        falar2("Bem-vindo à consulta médica virtual!");

        System.out.println("Por favor, responda às seguintes perguntas:");
        falar2("Por favor, responda às seguintes perguntas:");

        // Perguntas
        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        falar2("Qual é o seu nome? " + nome);

        System.out.print("Qual é a sua idade? ");
        String idade = scanner.nextLine();
        falar2("Qual é a sua idade? " + idade);

        System.out.print("Você está sentindo dor? (sim/não) ");
        String dor = scanner.nextLine().toLowerCase();
        falar2("Você está sentindo dor?");

        System.out.print("Se sim, onde está sentindo dor? ");
        String localDor = scanner.nextLine().toLowerCase();
        falar2("Se sim, onde está sentindo dor?");

        System.out.print("Você tem febre? (sim/não) ");
        String febre = scanner.nextLine().toLowerCase();
        falar2("Você tem febre?");

        System.out.print("Você tem tosse? (sim/não) ");
        String tosse = scanner.nextLine().toLowerCase();
        falar2("Você tem tosse?");

        System.out.print("Você está sentindo cansaço? (sim/não) ");
        String cansaco = scanner.nextLine().toLowerCase();
        falar2("Você está sentindo cansaço?");

        // Processar respostas e determinar possíveis enfermidades
        Map<String, String> possiveisEnfermidades = determinarEnfermidades(dor, localDor, febre, tosse, cansaco);

        // Sugerir tratamentos
        sugerirTratamentos(possiveisEnfermidades);

        scanner.close();
    }

    public static void falar2(String texto) {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "fala2.py", texto);
            pb.directory(new File(System.getProperty("user.dir"))); // Define o diretório de trabalho como o diretório atual
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

    public static Map<String, String> determinarEnfermidades(String dor, String localDor, String febre, String tosse, String cansaco) {
        Map<String, String> enfermidades = new HashMap<>();

        if (dor.equals("sim") && localDor.contains("garganta") && febre.equals("sim")) {
            enfermidades.put("Amigdalite", "A amigdalite é uma inflamação das amígdalas, geralmente causada por infecção viral ou bacteriana.");
        }
        if (tosse.equals("sim") && febre.equals("sim") && cansaco.equals("sim")) {
            enfermidades.put("Gripe", "A gripe é uma infecção viral que afeta o sistema respiratório.");
        }
        if (dor.equals("sim") && localDor.contains("peito") && febre.equals("não")) {
            enfermidades.put("Angina", "A angina é uma dor no peito causada por diminuição do fluxo sanguíneo para o coração.");
        }

        if (enfermidades.isEmpty()) {
            enfermidades.put("Desconhecida", "Os sintomas fornecidos não são suficientes para determinar uma possível enfermidade.");
        }

        return enfermidades;
    }

    public static void sugerirTratamentos(Map<String, String> enfermidades) {
        System.out.println("\nPossíveis enfermidades e tratamentos sugeridos:");

        for (Map.Entry<String, String> entry : enfermidades.entrySet()) {
            String enfermidade = entry.getKey();
            String descricao = entry.getValue();
            String tratamento = "Consulte um médico para um diagnóstico e tratamento adequados.";

            if (enfermidade.equals("Amigdalite")) {
                tratamento = "Tratamento para amigdalite pode incluir repouso, ingestão de líquidos, analgésicos e, se for bacteriana, antibióticos.";
            } else if (enfermidade.equals("Gripe")) {
                tratamento = "Tratamento para gripe inclui repouso, hidratação, medicamentos para alívio dos sintomas e, em alguns casos, antivirais.";
            } else if (enfermidade.equals("Angina")) {
                tratamento = "Tratamento para angina pode incluir medicamentos para controlar a dor e melhorar o fluxo sanguíneo, e mudanças no estilo de vida.";
            }

            System.out.println(enfermidade + ": " + descricao);
            System.out.println("Tratamento sugerido: " + tratamento);
            System.out.println();

            // Falar as informações
            falar2(enfermidade + ". " + descricao + ". " + "Tratamento sugerido: " + tratamento);
        }
    }
}
