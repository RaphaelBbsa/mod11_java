package br.com.rporto.list;

import br.com.rporto.domain.Aluno;
import br.com.rporto.domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Estava dando erro no meu código, pois na classe aluno eu criei 4 argumentos que era sala, nota etc..
 * só que eu não estava colocando o número total de argumentos, ou seja, eu tenho sempre que preencher todos os argumentos que criei.
 *
 */

public class ArrayListAluno {
    public static void main(String args []){
        exemploListaSimplesOrdenada();

    }

    private static void exemploListaSimplesOrdenada (){
        System.out.println("****ExemploListaSimplesOrdenada****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno ("João da Silva", "Linux Básico", 0, "Sala A");
        Aluno b = new Aluno("Raphael Porto",  "Ebac TI",2, "Sala D");
        Aluno c = new Aluno("Isaias",  "JAVA Fullstack",8, "Sala B");

        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenação: " + lista);
        ComparaNotaAluno compara = new ComparaNotaAluno(); //RESUMO DO QUE EU FIZ AQUI --> Ao fazer new ComparaNotaAluno(), você está criando uma nova instância (objeto) da classe ComparaNotaAluno. Isso significa que você está reservando espaço na memória para armazenar os dados e o comportamento definidos pela classe ComparaNotaAluno.
        Collections.sort(lista, compara);
        System.out.println("Lista ordenada: " + lista);

    }


}


