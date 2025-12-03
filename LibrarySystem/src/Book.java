public class Book {
    private static int autoId = 1;

    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, String publisher, int year) {
        this.id = autoId++;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.borrowed = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public int getYear() { return year; }

    public boolean isBorrowed() { return borrowed; }
    public void borrow() { borrowed = true; }
    public void returnBook() { borrowed = false; }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " - " + author +
                " / " + publisher + " (" + year + ")" +
                (borrowed ? "  ▶ 대출중" : "  ▶ 대출 가능");
    }
}
