package br.com.rporto.domain;
import java.util.Comparator;

/**
 * @author rapha
 */

public class ComparaNotaAluno implements Comparator <Aluno> {
    public int compare(Aluno o1, Aluno o2){
        return Double.compare(o1.getNota(), o2.getNota());
    }
}
