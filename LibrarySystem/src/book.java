public class Book {
    private int id;
    private String title;
    private boolean borrowed;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.borrowed = false;
    }

    public int getId() {
        return id;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        borrowed = true;
    }

    public void returnBook() {
        borrowed = false;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + (borrowed ? " (대출중)" : " (대출 가능)");
    }
}