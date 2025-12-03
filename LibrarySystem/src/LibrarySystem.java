import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private List<Book> books = new ArrayList<>();

    // 도서 등록 (테스트용)
    public void addTestBook(int id, String title) {
        books.add(new Book(id, title));
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

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
// 도서관 관리 프로젝트 v1.0 - LibrarySystem 클래스
// https://github.com/yahahahoho/Java-Library-System.git
