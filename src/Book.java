public class    Book {
    private int bookcode;
    private String name;
    private double price;
    private String author;

    public Book(){

    }
    public Book(int bookcode, String name, double price, String author) {
        this.bookcode = bookcode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookcode() {
        return bookcode;
    }

    public void setBookcode(int bookcode) {
        this.bookcode = bookcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

