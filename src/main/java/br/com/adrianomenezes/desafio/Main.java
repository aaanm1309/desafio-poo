package br.com.adrianomenezes.desafio;

import br.com.adrianomenezes.desafio.dominio.Bootcamp;
import br.com.adrianomenezes.desafio.dominio.Curso;
import br.com.adrianomenezes.desafio.dominio.Dev;
import br.com.adrianomenezes.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao do curso de js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria 1");
        mentoria1.setDescricao("descricao mentoria 1");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devXpto = new Dev();
        devXpto.setNome("XPTO");
        devXpto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos XPTO" + devXpto.getConteudosInscritos());
        devXpto.progredir();
        devXpto.progredir();
        System.out.println("Conteudos Inscritos XPTO" + devXpto.getConteudosInscritos());
        System.out.println("Conteudos Concluidos XPTO" + devXpto.getConteudosConcluídos());
        System.out.println("XP: " + devXpto.calcularTotalXp());

        Dev devXpto2 = new Dev();
        devXpto2.setNome("XPTO 2");
        devXpto2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos XPTO" + devXpto2.getConteudosInscritos());
        devXpto2.progredir();
        devXpto2.progredir();
        devXpto2.progredir();
        System.out.println("Conteudos Inscritos XPTO" + devXpto2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos XPTO" + devXpto2.getConteudosConcluídos());
        System.out.println("XP: " + devXpto2.calcularTotalXp());


//        System.out.println(curso1);
//        System.out.println(curso1.calcularXp());
//        System.out.println(curso2);
//        System.out.println(curso2.calcularXp());
//        System.out.println(mentoria1);
//        System.out.println(mentoria1.calcularXp());
    }
}
