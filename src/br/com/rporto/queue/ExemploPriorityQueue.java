package br.com.rporto.queue;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Possui ordenação natural
 */

public class ExemploPriorityQueue {
    public static void main(String[] args){
        Queue<String> lista = new PriorityQueue<>();
        lista.add("Redbull");
        lista.add("Bragantino");
        lista.add("Bella");
        while(lista.size() != 0){
            System.out.println(lista.remove()); //aqui eu vou remover os itens na ordem e eles serão impressos no console
        }

    }
}
