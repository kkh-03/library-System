import java.util.ArrayList;

public class LibrarySystem {

    private ArrayList<Book> books = new ArrayList<>();

    // A. 도서 추가
    public void addBook(String title, String author, String publisher, int year) {

        if (title.isEmpty() || author.isEmpty() ||
                publisher.isEmpty() || year <= 0) {
            System.out.println("저장 실패: 입력값이 잘못됨");
            return;
        }

        Book b = new Book(title, author, publisher, year);
        books.add(b);
        System.out.println("도서 저장 완료! (ID: " + b.getId() + ")");
    }

    // B. 도서 검색 (4개 모두 일치)
    public void searchBook(String title, String author, String publisher, int year) {
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().equals(title) &&
                    b.getAuthor().equals(author) &&
                    b.getPublisher().equals(publisher) &&
                    b.getYear() == year) {

                System.out.println(b);
                found = true;
            }
        }

        if (!found) System.out.println("검색 결과가 없습니다.");
    }

    // 전체 출력
    public void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("저장된 도서가 없습니다.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    // 도서 대출
    public boolean borrowBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (b.isBorrowed()) return false;
                b.borrow();
                return true;
            }
        }
        return false;
    }

    // 도서 반납
    public boolean returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (!b.isBorrowed()) return false;
                b.returnBook();
                return true;
            }
        }
        return false;
    }

    // 목록 출력
    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
