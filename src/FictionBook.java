public class FictionBook extends Book{
    String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(int bookcode, String name, double price, String author, String category) {
        super(bookcode, name, price, author);
        this.category = category;
    }
}
