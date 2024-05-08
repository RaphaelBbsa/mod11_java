package br.com.rporto.set;
import br.com.rporto.domain.Aluno;

import java.util.*;


/**
 * HashSet não tem ordem e o acesso é mais rápido que o TreeSet, mas nada garante a ordem dos elementos.
 * Não repete valores na lista
 * @author rapha
 */

public class ExemploHashSet {
    public static void main(String[] args){
        exemploListaSimples();
        exemploOrdemAscendente();

        
    }

    private static void exemploOrdemAscendente() {
        System.out.println("*****exemploComOrdem ******");
        Set<String> lista1= new HashSet<>();
        lista1.add ("João Silva");
        lista1.add("Ana Silva");
        lista1.add("Mario Lucio");
        lista1.add("Mario Lucio"); //Note que ao compilar o código, o Mario Lucio não repete
        //Collections.sort(lista1); o collections aqui daria errado pq o collections espera uma lista List. Para resolver isso, eu deveria converter a lista Hash em List normal assim;
        // List <String> listaOrdenada = new ArrayList <> (lista1); Collections.sort (listaOrdenada);
        System.out.println(lista1);
    }

    private static void exemploListaSimples() {
        System.out.println("*****exemploListaSimples ******");
        Set<String> lista1= new HashSet<>();
        lista1.add ("João Silva");
        lista1.add("Ana Silva");
        lista1.add("Mario Lucio");
        lista1.add("Mario Lucio"); //Note que ao compilar o código, o Mario Lucio não repete
        System.out.println(lista1);

    }
}
