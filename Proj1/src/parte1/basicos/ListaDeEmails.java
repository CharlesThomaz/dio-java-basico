package basicos;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeEmails {

    private String email1;
    private String email2;
    
    public static void main(String[] args) {
        ListaDeEmails list = new ListaDeEmails();
        list.receberListaEmails2("email3", "email4");
        receberListaEmails();
        
    }

    public static void receberListaEmails(){
        try {
            Scanner lerEmail = new Scanner(System.in);
            List<String> lista = new ArrayList<>(); // Lista para armazenar os emails
            
            int i = 0;
            while (i < 5){ // Condição corrigida para evitar loop infinito
                System.out.println("Digite um email:");
                String email = lerEmail.nextLine();
                lista.add(email); // Adiciona o email à lista
                i++; // Incrementa i para controlar o número de iterações
            }
            
            int i2 = 0;
            for (String email : lista) {
                System.out.println("O email no índice " + i2 + " é " + email);
                i2++;
            } 
        } catch (Exception e) {
            System.out.println("Erro de Índice: " + e.getMessage());
        }
    }

    public  void receberListaEmails2(String email1, String email2){
        this.email1 =  email1;
        this.email2 =  email2;

        System.out.println(email1.concat(" ") + email2);

    }

}
