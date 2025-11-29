public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.print("Name: " + name);
        System.out.println(" Age: " + age);

    }

}
