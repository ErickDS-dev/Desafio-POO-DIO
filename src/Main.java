import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devErick = new Dev();
        devErick.setNome("Erick");
        devErick.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Incritos" + devErick.getConteudosInscritos());
        devErick.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos" + devErick.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devErick.getConteudosConcluidos());
        System.out.println("XP:" + devErick.calcularTotalXp());

        System.out.println("----------");

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos" + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos" + devEduardo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devEduardo.getConteudosConcluidos());
        System.out.println("XP:" + devEduardo.calcularTotalXp());
    }
}
