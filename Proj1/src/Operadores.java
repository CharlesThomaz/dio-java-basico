
import java.util.Date;





public class Operadores {

 
    public static void main(String[] args) {
        

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


    //Operadores Unários
    





    }


 }




    





