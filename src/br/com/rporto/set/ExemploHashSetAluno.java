package br.com.rporto.set;
import br.com.rporto.domain.Aluno;

import java.util.*;

/**
 * Para não repetir os objetos na lista de alunos que eu vou fazer chamando a classe Aluno
 * eu preciso implementar o equals e hashcode
 */

public class ExemploHashSetAluno {
    public static void main (String[] args){
        exemploListaSimples();

    }

    private static void exemploListaSimples() {
        Set<Aluno> novosAlunos = new HashSet<Aluno>();
        Aluno a = new Aluno ("João Mateus", "Java", '8', "12");
        Aluno b = new Aluno ("Bia Silva", "Java", '2', "12");
        novosAlunos.add(a);
        novosAlunos.add(b);
        System.out.println(novosAlunos);

    }
}
