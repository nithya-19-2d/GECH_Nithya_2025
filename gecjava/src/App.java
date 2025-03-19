import gecjava.src.student.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student(21, "Mohan");
        System.out.println("the std1 detailes are\n");
        System.out.println("id: " + std1.stdID);
        System.out.println("Name: " + std1.stdName);

    }
}
