//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car = new Car("porsche", "911", 2025);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        Student student1 = new Student("Zarda", 21);
        Student student2 = new Student("Gular", 21);
        Student student3 = new Student("Daniz", 22);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        Book book1 = new Book();
        Book book2 = new Book("Little prince","Antoine de Saint-Exupéry",23);
        Book book3 = new Book("yeraltindan notlar","dostoyevski");

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        Person person1 = new Person();
        person1.setName("Zarda");
        person1.setHeight(1.63);

        System.out.println(person1.getName());
        System.out.println(person1.getHeight());

        Rectangle rectangle = new Rectangle(4,2);
        rectangle.getArea();
        rectangle.getPerimeter();

        Address address1 = new Address("Narimanov st","Baku",1004);
        Address address2 = new Address("Nizami st","Baku",2004);

        Employee employee1 = new Employee("Zarda",3000,address1);
        Employee employee2 = new Employee("Gular",2000,address2);

        employee1.showDetails();
        employee2.showDetails();



    }
}