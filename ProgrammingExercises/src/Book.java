public abstract class Book {
    private String bookTitle;
    double bookPrice;

    public Book(String title) {
        bookTitle = title;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public abstract void setPrice();
}
