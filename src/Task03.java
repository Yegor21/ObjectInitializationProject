import java.sql.SQLOutput;

public class Task03 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 9.5, true );
    //    student.name = "Alex";
    //    student.age = 20;
    //    student.mark = 9.5;
    //    student.alive = true;

        System.out.println(student.getInfo());

        Student student2 = new Student("Anna", 18, 8, true);
    //    student.name = "Anna";
    //    student.age = 18;
    //    student.mark = 8;
    //    student.alive = true;

        System.out.println(student2.getInfo());

        Student student3 = new Student("Harry", 21, 10, true);
    //    student.name = "Harry";
    //    student.age = 21;
    //    student.mark = 10;
    //    student.alive = true;

        System.out.println(student3.getInfo());
    }
}
