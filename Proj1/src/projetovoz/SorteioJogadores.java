package projetovoz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SorteioJogadores {
    public static void main(String[] args) {
        List<String> jogadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos jogadores participarão do sorteio?");
        falar("Quantos jogadores participarão do sorteio?");
        int numeroJogadores = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numeroJogadores; i++) {
            System.out.println("Qual é o nome do jogador " + i + "?");
            falar("Qual é o nome do jogador " + i + "?");
            String nome = scanner.nextLine();
            jogadores.add(nome);
        }

        Collections.shuffle(jogadores);

        System.out.println("Sorteio realizado! A ordem dos jogadores é:");
        falar("Sorteio realizado! A ordem dos jogadores é:");

        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println((i + 1) + "º: " + jogadores.get(i));
            falar((i + 1) + "º: " + jogadores.get(i));
        }

        scanner.close();
    }

    public static void falar(String texto) {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "fala2.py", texto);
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
