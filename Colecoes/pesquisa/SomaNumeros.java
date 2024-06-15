package Colecoes.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaDeNumeros;

    // Construtor da classe
    public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    // Método para adicionar um número à lista
    public void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
    }

    // Método para calcular a soma de todos os números na lista
    public int calcularSoma() {
        int soma = 0;
        for (int numero : listaDeNumeros) {
            soma += numero;
        }
        return soma;
    }

    // Método para encontrar o maior número na lista
    public int encontrarMaiorNumero() {
        if (listaDeNumeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia. Não é possível encontrar o maior número.");
        }

        int maior = listaDeNumeros.get(0);
        for (int numero : listaDeNumeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    // Método para encontrar o menor número na lista
    public int encontrarMenorNumero() {
        if (listaDeNumeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia. Não é possível encontrar o menor número.");
        }

        int menor = listaDeNumeros.get(0);
        for (int numero : listaDeNumeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    // Método para exibir todos os números presentes na lista
    public List<Integer> exibirNumeros() {
        return new ArrayList<>(listaDeNumeros); // Retorna uma cópia da lista original
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(15);

        // Exibindo todos os números
        List<Integer> numeros = somaNumeros.exibirNumeros();
        System.out.println("Números na lista: " + numeros);

        // Calculando a soma
        int soma = somaNumeros.calcularSoma();
        System.out.println("Soma dos números: " + soma);

        // Encontrando o maior número
        int maior = somaNumeros.encontrarMaiorNumero();
        System.out.println("Maior número na lista: " + maior);

        // Encontrando o menor número
        int menor = somaNumeros.encontrarMenorNumero();
        System.out.println("Menor número na lista: " + menor);
    }
}
