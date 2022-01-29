import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String [] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao");
        curso1.setCargaHoraria(30);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao 2");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria descrita");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Jesus");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jesus: " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos Inscritos Jesus: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jesus: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Louis");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Louis: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos Louis: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Louis: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());




    }
}
