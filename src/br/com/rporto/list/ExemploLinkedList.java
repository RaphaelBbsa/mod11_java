package br.com.rporto.list;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * A LinkedList são mais lentas na busca e inclusão e inserção são rápidas.
 */


    public class ExemploLinkedList {
    public static void main(String args[]){
        exemploListaSimples();
        exemploListaOrdemAscendente();

    }

    private static void exemploListaOrdemAscendente() {
        System.out.println("****Lista de ordem ascendente****");
        List<String> listaOrdemAscendente = new LinkedList<>();
        listaOrdemAscendente.add("Barcelona");
        listaOrdemAscendente.add("Real Madrid");
        listaOrdemAscendente.add("Sevilla");
        listaOrdemAscendente.add("PSG");
        listaOrdemAscendente.add("Flamengo");
        Collections.sort(listaOrdemAscendente);


        for (String times: listaOrdemAscendente) //uso esse método para fazer interação de lista, pego tudo do tip o string por exemplo da listaOrdemAscendente
            System.out.println(times);
        System.out.println(listaOrdemAscendente.get(2)); //aqui eu pego o objeto específico que eu quero
    }

    private static void exemploListaSimples(){
        System.out.println("****ExemploListaSimples ****");
        List<String> lista = new LinkedList<>();
        lista.add("Jão");
        lista.add("Maria");
        lista.add("Jose");
        lista.add("Ana");
        System.out.println(lista);
        System.out.println(" ");

        lista.remove(0); //removendo o de posicao 0
        System.out.println(lista);
        boolean contem = lista.contains("Jão"); //verifico se algo contém na lista, nesse caso era o Jao
        System.out.println(contem);

    }
}


