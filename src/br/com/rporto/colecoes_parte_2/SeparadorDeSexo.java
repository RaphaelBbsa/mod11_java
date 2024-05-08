package br.com.rporto.colecoes_parte_2;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class SeparadorDeSexo {
    public static void main(String[] args){
        System.out.println("****Olá, vamos separar as pessoas em 2 grupos, sendo um de meninos e outro de meninas! ****");
       List <Pessoa> pessoas = iniciaSeparador();
        separarSexo(pessoas);


    }

    private static void separarSexo(List<Pessoa> pessoas) {
        List<Pessoa> masculino  = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        for (Pessoa pessoa: pessoas) {
            if (pessoa.getSexo().equalsIgnoreCase("M")) {
                masculino.add(pessoa);
            } else if (pessoa.getSexo().equalsIgnoreCase("F")) {
                feminino.add(pessoa);
            }
        }
            System.out.println("O grupo de homens é:");
            for (Pessoa m : masculino) {
                System.out.println(m.getNome());
            }

            System.out.println("O grupo de mulheres é:");
            for (Pessoa f : feminino) {
                System.out.println(f.getNome());
            }

    }


    private static List<Pessoa> iniciaSeparador() {
            List<Pessoa> pessoas = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            String continua;
            do {
                System.out.println("Digite o seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite o seu sexo. Utilize M para masculino ou F para feminino: ");
                String sexo = sc.nextLine();

                while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                    System.out.println("Você digitou um sexo inválido. Utilize M para masculino ou F para feminino. Tente novamente: ");
                    sexo = sc.nextLine();
                }

                Pessoa pessoa = new Pessoa();
                pessoa.setNome(nome);
                pessoa.setSexo(sexo);

                pessoas.add(pessoa);

                System.out.println("Deseja adicionar outra pessoa? (S/N)");
                continua = sc.nextLine();

                while (!continua.equalsIgnoreCase("S") && !continua.equalsIgnoreCase("N")) {
                    System.out.println("Resposta inválida. Digite S para sim ou N para não. Tente novamente: ");
                    continua = sc.nextLine();
                }
            } while (continua.equalsIgnoreCase("S"));
        return pessoas;
    }

    }




