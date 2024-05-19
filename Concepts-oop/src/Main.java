import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Course course1 = new Course();

        course1.setTitle("Mathematics Essentyals");
        course1.setDescription("Learn the main concepts about mathematics");
        course1.setWorkload(240);
        System.out.println(course1);

        Course course2 = new Course();

        course2.setTitle("Mathematics Essentyals 2");
        course2.setDescription("Learn the main concepts about mathematics");
        course2.setWorkload(240);
        System.out.println(course2);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("Math");
        mentoring1.setDescription("Math learning path");
        mentoring1.setDate(LocalDate.now());
        System.out.println(mentoring1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Advanced Python for Cybersec");
        bootcamp.setDescription("Learn basics concepts from Python applied to Cybersec");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);

        Dev dev1 = new Dev();
        dev1.setName("Alicia");
        dev1.enrollBootcamp(bootcamp);
        Dev dev2 = new Dev();
        dev2.setName("Mary");
        dev2.enrollBootcamp(bootcamp);


        System.out.println("Contents subscribed: " +dev1.getContentInitiaded());
        System.out.println("Contents subscribed: " +dev2.getContentInitiaded());
    }
}
