public class Student {
    private String name;
    private int age;
    private String section;
    public Student(){
        name = "No name yet.";
        age = 0;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age, String section){
        this.name = name;
        this.age = age;
        this.section = section;
    }
    public void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(section);
    }
    public static void main(String[]args){
        Student stud = new Student("Sandro", 21, "BSIT 2-A");
        stud.print();
        Student stud2 = new Student();
        stud2.print();
    }
}
