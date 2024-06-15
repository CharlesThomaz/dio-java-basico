package Colecoes.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<NovaPessoa> listaPessoas = new ArrayList<>();

    public static void main(String[] args) {
        OrdenacaoPessoas programa = new OrdenacaoPessoas();

        programa.adicionarPessoa("Charles", 37, 1.87);
        programa.adicionarPessoa("Ana", 25, 1.65);
        programa.adicionarPessoa("Pedro", 42, 1.80);

        programa.ordenarPorAltura();
        programa.ordenarPorIdade();

        // Exibindo lista de pessoas depois de ordenar por idade
        System.out.println("\nLista de pessoas ordenadas por idade:");
        programa.exibirPessoas();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        NovaPessoa pessoa = new NovaPessoa(nome, idade, altura);
        listaPessoas.add(pessoa);

        System.out.println("Pessoa Adicionada: Nome: " + nome + " - Idade: " + idade + " - Altura: " + altura);
    }

    public void ordenarPorIdade() {
        Collections.sort(listaPessoas, (p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
    }

    public void ordenarPorAltura() {
        Collections.sort(listaPessoas, (p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
    }

    public void exibirPessoas() {
        for (NovaPessoa pessoa : listaPessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Altura: " + pessoa.getAltura());
        }
    }
}
