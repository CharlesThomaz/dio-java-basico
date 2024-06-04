public class OperadoresUnarios {
    public static void main(String[] args) {
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
        System.out.println(!e);   // Imprime false

        // Conversão de Tipo
        double f = 9.78;
        int g = (int) f;          // Converte f para inteiro
        System.out.println(g);    // Imprime 9
    }
}
