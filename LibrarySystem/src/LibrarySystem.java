import java.util.ArrayList;
import java.util.TreeMap;

public class LibrarySystem {

    private ArrayList<Book> bookList = new ArrayList<>();
    private TreeMap<Integer, Book> bookMap = new TreeMap<>();

    // A. 도서 추가
    public void addBook(String title, String author, String publisher, int year) {

        if (title.isEmpty() || author.isEmpty() ||
                publisher.isEmpty() || year <= 0) {
            System.out.println("저장 실패: 입력값이 잘못됨");
            return;
        }

        Book b = new Book(title, author, publisher, year);

        bookList.add(b);   // 출력용 전체 리스트
        bookMap.put(b.getId(), b); // ID 기반 빠른 조회

        System.out.println("도서 저장 완료! (ID: " + b.getId() + ")");
    }

    // B. 도서 검색 (ID 기반 - TreeMap)
    public void searchBook(int id) {
        if (!bookMap.containsKey(id)) {
            System.out.println("검색 결과 없음");
            return;
        }

        System.out.println(bookMap.get(id));
    }

    // C. 전체 도서 출력
    public void printAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("저장된 도서가 없습니다.");
            return;
        }

        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    // D. 도서 대출 - TreeMap 기반 빠른 접근
    public boolean borrowBook(int id) {
        Book b = bookMap.get(id);

        if (b == null) return false;
        if (b.isBorrowed()) return false;

        b.borrow();
        return true;
    }

    // E. 도서 반납
    public boolean returnBook(int id) {
        Book b = bookMap.get(id);

        if (b == null) return false;
        if (!b.isBorrowed()) return false;

        b.returnBook();
        return true;
    }

    // F. 목록 출력 (ID 순)
    public void showBooks() {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}
