package br.com.rporto.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * é como um array cujo tamanho pode aumentar
 * A busca de um elemento é rápida, mas inserção e exclusão não.
 *
 * @author rapha
 */

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAlfabetica();

    }

    private static void exemploListaSimples() {
        List<String> lista = new ArrayList<>();
        lista.add("Raphael");
        lista.add("Zé");
        System.out.println(lista);
    }

    private static void exemploListaSimplesOrdemAlfabetica() {
        List<String> lista = new ArrayList<>();
        lista.add("Raphael");
        lista.add("Brenda");
        Collections.sort(lista); //faz com que a lista seja ordenada em ordem alfabética
        System.out.println(lista);
    }
}
