package br.com.rporto.queue;


import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.Deque;
import java.util.ArrayDeque;



public class ArrayDequeEx {
    public static void main(String[] args){
        acessandoDaFila();

    }
    private static void acessandoDaFila(){
        System.out.println("****ACESSANDO DA FILA*****");
        Deque<String> lista = new ArrayDeque<>();
        lista.add("Bragantino");
        lista.add("Flamengo");
        lista.add("Botafogo");

        Deque<String> lista2 = new ArrayDeque<>();
        lista2.add("Lutz");
        lista2.add("Eslen");

        lista.addAll(lista2);
        System.out.println(lista);

        System.out.println("Pegando o primeiro elemento da lista 1: " + lista.element());
        System.out.println("Pegando o primeiro elemento da lista 1, exemplo 2: " + lista.getFirst());
        System.out.println("Pegando o último elemento da lista 1: " + lista.getLast());

        boolean remover = lista.remove(2);

        System.out.println(remover);





    }
}
