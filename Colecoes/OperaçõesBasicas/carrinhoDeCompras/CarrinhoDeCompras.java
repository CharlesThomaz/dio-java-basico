package Colecoes.OperaçõesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Lista que armazena os itens
    private List<Item> carrinho;

    // Construtor
    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    // Método para adicionar um item ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        carrinho.add(item);
        System.out.println("Item " + item.getNome() + " adicionado com sucesso!");
    }

    // Método para remover um item do carrinho pelo nome
    public void removerItem(String nome) {
        carrinho.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    // Método para calcular o valor total do carrinho
    public double calcularValorTotal() {
        double total = 0;
        for (Item item : carrinho) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    // Método para exibir os itens do carrinho
    public void exibirItens() {
        for (Item item : carrinho) {
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
        }
    }

    // Método principal para teste
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens
        carrinho.adicionarItem("Notebook", 2500.00, 1);
        carrinho.adicionarItem("Mouse", 150.00, 2);
        carrinho.adicionarItem("Teclado", 200.00, 1);

        // Exibindo itens
        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        // Removendo um item
        carrinho.removerItem("Mouse");

        // Exibindo itens após a remoção
        System.out.println("\nItens no carrinho após remover Mouse:");
        carrinho.exibirItens();

        // Calculando o valor total
        double total = carrinho.calcularValorTotal();
        System.out.println("\nValor total do carrinho: R$ " + total);
    }
}
