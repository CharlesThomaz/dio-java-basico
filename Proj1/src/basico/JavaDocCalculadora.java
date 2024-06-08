package basico;
/**
 * Esta classe representa um exemplo simples de uma calculadora.
 * 
 * @author ChatGPT
 * @version 1.0
 * @since 06/06/2024
 */
public class JavaDocCalculadora {

    /**
     * Este método realiza a soma de dois números inteiros.
     * 
     * @param a O primeiro número inteiro a ser somado.
     * @param b O segundo número inteiro a ser somado.
     * @return A soma dos dois números inteiros fornecidos como entrada.
     */
    public int soma(int a, int b) {
        return a + b;
    }

    /**
     * Este método realiza a subtração de dois números inteiros.
     * 
     * @param a O número inteiro do qual será subtraído o segundo número.
     * @param b O número inteiro a ser subtraído do primeiro número.
     * @return A diferença entre os dois números inteiros fornecidos como entrada.
     */
    public int subtracao(int a, int b) {
        return a - b;
    }

    /**
     * Este método realiza a multiplicação de dois números inteiros.
     * 
     * @param a O primeiro número inteiro a ser multiplicado.
     * @param b O segundo número inteiro a ser multiplicado.
     * @return O produto dos dois números inteiros fornecidos como entrada.
     */
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    /**
     * Este método realiza a divisão de dois números inteiros.
     * 
     * @param a O número inteiro que será dividido pelo segundo número.
     * @param b O número inteiro pelo qual o primeiro número será dividido.
     * @return O quociente da divisão dos dois números inteiros fornecidos como entrada.
     * @throws ArithmeticException Se a divisão por zero for detectada.
     */
    public int divisao(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    
    /**
     * Este método retorna o valor absoluto de um número inteiro.
     * 
     * @param num O número inteiro para o qual o valor absoluto será calculado.
     * @return O valor absoluto do número inteiro fornecido como entrada.
     */
    public int valorAbsoluto(int num) {
        return Math.abs(num);
    }

}
