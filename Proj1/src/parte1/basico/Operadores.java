package parte1.basico;
import java.util.Date;


public class Operadores {

    public static void main(String[] args) {
        Logicos();
       
    }

 
    public static void atribuicao() {
        

    //Operadores de atribuicao
    String nome = "Charles";
    int idade = 37;
    double peso = 98.5;
    char sexo = 'm';
    boolean doadorOrgao  = false;
    Date dataAtual = new Date();
    System.out.println(dataAtual);
    


    //Operadores Aritmeticos
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20*7;
    int divisao = 15/3;
    int modulo = 18%3;
    double resultado = (10*7) + (20/4);
    //O operador de adição quando utilizado em variáveis do tipo texto ele faz a concatenação e nao a operação matematica.
    String concatenacao = "?";

    concatenacao = 1+1+1+"1";

    System.out.println(concatenacao);

    concatenacao = 1+1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = (1+1+1)+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1+"1"+1+1+1+"1";

    System.out.println(concatenacao);
    System.out.println("1"+(1+1+1));

    }

    public static void Relacionais() {
        int a = 10;
        int b = 20;

        // Igual a
        String resultado = a == b ? "a é igual a b"  : "a não é igual a b";
        

        // Diferente de
        if (a != b) {
            System.out.println("a é diferente de b");
        }

        // Maior que
        if (a > b) {
            System.out.println("a é maior que b");
        } else {
            System.out.println("a não é maior que b");
        }

        // Menor que
        if (a < b) {
            System.out.println("a é menor que b");
        }

        // Maior ou igual a

        resultado = a>=b ? "a é maior ou igual a b" : "a não é maior ou igual a b" ;
      

        // Menor ou igual a
        if (a <= b) {
            System.out.println("a é menor ou igual a b");
        }
    String Objeto1 = new String();
    Objeto1 = "CHARLES";
    
    String Objeto2 = "THOMAZ";
    
    String Objeto3 = "santos";

    System.out.println(Objeto1==Objeto2 ? "Iguais" : "Diferentes");
    System.out.println(Objeto1.equals(Objeto2));
    System.out.println(Objeto2==Objeto3);
    System.out.println(Objeto2.equals(Objeto3));



    
    }

    public static void Unarios() {
        // Incremento e Decremento
        int a = 5;
        System.out.println(++a);  // Pré-incremento: imprime 6
        System.out.println(a++);  // Pós-incremento: imprime 6, depois a se torna 7
        System.out.println(a);    // Imprime 7

        int b = 5;
        System.out.println(--b);  // Pré-decremento: imprime 4
        System.out.println(b--);  // Pós-decremento: imprime 4, depois b se torna 3
        System.out.println(b);    // Imprime 3

        // Negação
        int c = 10;
        System.out.println(-c);   // Imprime -10

        // Complemento Bit a Bit
        int d = 0b00001111;       // 15 em decimal
        System.out.println(~d);   // Imprime -16 (todos os bits invertidos)

        // Negação Lógica
        boolean e = true;
        System.out.println(e);   // Imprime false
         e = !e;
         System.out.println(e);



        // Conversão de Tipo
        double f = 9.78;
        int g = (int) f;          // Converte f para inteiro
        System.out.println(g);    // Imprime 9
    }

    public static void Ternario() {
       
       
        int x = 5;
        int y = 6;

        String resultado = x==y ? "verdadeiro" : "falso";
        
        
        int soma =  x + ++y;
        System.out.println(soma);
        System.out.println(resultado);
   



    }
    
    public static void Logicos() {
        int a = 10;
        int b = 20;
        boolean c = false;

        // E lógico
        if (a > 5 && b > 15) {
            System.out.println("a é maior que 5 e b é maior que 15");
        }

        // OU lógico
        if (a > 15 || b > 15) {
            System.out.println("a é maior que 15 ou b é maior que 15");
        }

        // NÃO lógico
        if (!c) {
            System.out.println("c é falso");
        }

        // Combinação de operadores
        if ((a > 5 && b > 15) || !c) {
            System.out.println("Combinação: a é maior que 5 e b é maior que 15, ou c é falso");
        }
    }


}




    





