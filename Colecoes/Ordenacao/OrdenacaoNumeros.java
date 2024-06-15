package Colecoes.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(listaNumeros);
    }

    public void ordenarDescendente() {
        Collections.sort(listaNumeros, Collections.reverseOrder());
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }
}

