public class Book {

    private String title;
    private String author;
    private int price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;

    }
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}
