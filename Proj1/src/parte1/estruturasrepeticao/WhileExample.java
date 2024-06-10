package parte1.estruturasrepeticao;


public class WhileExample {
   public static void main(String[] args) {


    ExemploWhile();
    DoWhileExample();
    
   }
   
    //while (condição) {
    // Bloco de código a ser executado
    //} O while executa a condição primeiro antes de executar o bloco código.
    public static void ExemploWhile() {
                int i = 0;
        while (i < 5) {
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Fim do loop while");
    }

    //do {
    // Bloco de código a ser executado
    //} while (condição);   O do while executa a condição depois de executar o bloco código.


    public static void DoWhileExample() {
        int i = 0;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 5);
        System.out.println("Fim do loop do-while");

        int num = 5, count = 1;
        
    }
    
    


}

