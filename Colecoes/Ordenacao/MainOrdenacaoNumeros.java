package Colecoes.Ordenacao;

public class MainOrdenacaoNumeros {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(2);

        // Exibindo lista antes da ordenação
        System.out.println("Lista antes da ordenação: " + ordenacaoNumeros.getListaNumeros());

        // Ordenando ascendente
        ordenacaoNumeros.ordenarAscendente();
        System.out.println("Lista ordenada ascendente: " + ordenacaoNumeros.getListaNumeros());

        // Ordenando descendente
        ordenacaoNumeros.ordenarDescendente();
        System.out.println("Lista ordenada descendente: " + ordenacaoNumeros.getListaNumeros());
    }
}
