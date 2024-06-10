package parte1.estruturasrepeticao;


public class BreakExamplo {
    public static void main(String[] args) {
        ExemploBreak();
        ExemploContinue();


    }

    public static void ExemploBreak() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Saindo do loop quando i for igual a 5
            }
            System.out.println(i);
        }
        System.out.println("Fim do loop - ExemploBreak");

    }

    public static void ExemploContinue() {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue; // Pula a iteração se i for par
            }
            System.out.println(i);
        }
        System.out.println("Fim do loop - ExemploContinue");
    }
}
