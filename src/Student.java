public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;

    public Student(){
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    //  full constructor with params/args
    public Student(String n, int a, double m, boolean al){
        name = n;
        age = a;
        mark = m;
        alive = al;
    }

    //  full constructor with params/args
    public Student(String n) {
        name = n;
    }

    //  full constructor with params/args
    public Student(double m) {
        mark = m;
    }

    public String getInfo(){
        return name + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
    }
}
