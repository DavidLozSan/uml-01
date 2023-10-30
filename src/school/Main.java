package school;

import configurar_ordenador.Procesador;

public class Main {
    public static void main(String[] args) {
        Students students1 = new Students();
        students1.setDni("0001M");
        students1.setName("Pepe");
        students1.setLastName("Garcia");

        System.out.println(students1.getDni());

        Courses courses = new Courses();
        courses.setCode(1);
        courses.setName("1º DAM");

        System.out.println(courses.getName());

        Subjects subjects1 = new Subjects();
        subjects1.setCode(1);
        subjects1.setCourses(courses);
        subjects1.setName("Entornos de Desarrollo");

        System.out.println(subjects1.getName());

        Enrolment enrolment1 = new Enrolment();
        enrolment1.setStudents(students1);
        enrolment1.getSubjects().get(0).getCourses().getName();


    }
}
