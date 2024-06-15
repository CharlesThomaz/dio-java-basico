package Colecoes.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Lista de livros (campo de instância)
    List<NovoLivro> ListaDeLivros = new ArrayList<>();

    public static void main(String[] args) {
        // Criando uma instância de Main
        Main programa = new Main();

        // Instanciando novos livros
        NovoLivro livro1 = new NovoLivro(2020, "GABRIELA PRIOLI", "IDEOLOGIAS POLITICAS");
        NovoLivro livro2 = new NovoLivro(2015, "George Orwell", "1984");
        NovoLivro livro3 = new NovoLivro(1997, "J.K. Rowling", "Harry Potter e a Pedra Filosofal");
        NovoLivro livro4 = new NovoLivro(1949, "George Orwell", "A Revolução dos Bichos");
        NovoLivro livro5 = new NovoLivro(1995, "Noam Chomsky", "O Lucro ou as Pessoas");

        // Adicionando os livros à lista de livros
        programa.ListaDeLivros.add(livro1);
        programa.ListaDeLivros.add(livro2);
        programa.ListaDeLivros.add(livro3);
        programa.ListaDeLivros.add(livro4);
        programa.ListaDeLivros.add(livro5);

        // Exemplo de como acessar e usar a lista de livros
        programa.exibirLivros();
    }

    // Método para exibir os livros na lista (apenas para exemplo)
    public void exibirLivros() {
        for (NovoLivro livro : ListaDeLivros) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano: " + livro.getAnoPublicacao());
        }
    }
}
