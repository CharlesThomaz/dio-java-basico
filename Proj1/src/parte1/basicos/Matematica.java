package basicos;
public class Matematica {

    public static void main(String[] args) {
        // Testa os métodos da classe Matematica
        System.out.println("Soma: " + Somar(3, 1));
        System.out.println("Subtração: " + Subtrair(5, 2));
        System.out.println("Divisão: " + Dividir(10, 2));
        System.out.println("Multiplicação: " + Multiplicar(4, 3));
    }

    // Método estático para somar dois números
    public static int Somar(int x, int y) {
        return x + y;
    }

    // Método estático para subtrair dois números
    public static int Subtrair(int x, int y) {
        return x - y;
    }

    // Método estático para dividir dois números
    public static int Dividir(int x, int y) {
        // Verifica se o divisor é zero para evitar exceção de divisão por zero
        if (y == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return x / y;
    }

    // Método estático para multiplicar dois números
    public static int Multiplicar(int x, int y) {
        return x * y;
    }
}
