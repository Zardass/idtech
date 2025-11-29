public class Person {
    private String name;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
    }
}
