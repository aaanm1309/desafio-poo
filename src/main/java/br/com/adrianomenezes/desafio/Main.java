package br.com.adrianomenezes.desafio;

import br.com.adrianomenezes.desafio.dominio.Curso;
import br.com.adrianomenezes.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("cusro java");
        curso1.setDescricao("descricao do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("cusro js");
        curso2.setDescricao("descricao do curso de js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria 1");
        mentoria1.setDescricao("descricao mentoria 1");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso1.calcularXp());
        System.out.println(curso2);
        System.out.println(curso2.calcularXp());
        System.out.println(mentoria1);
        System.out.println(mentoria1.calcularXp());
    }
}
