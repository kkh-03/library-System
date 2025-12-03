import java.util.ArrayList;

public class LibrarySystem {

    private ArrayList<Save> books = new ArrayList<>();

    // [A] 도서 정보 저장
    public void addBook(String title, String author, String publisher, int year) {

        if (title == null || title.isEmpty()
                || author == null || author.isEmpty()
                || publisher == null || publisher.isEmpty()
                || year <= 0) {

            System.out.println("저장에 실패했습니다.");
            return;
        }

        Save book = new Save(title, author, publisher, year);
        books.add(book);
        System.out.println("도서가 저장되었습니다.");
    }

    // [B] 검색 (4가지 속성이 모두 일치해야 검색됨)
    public void searchBook(String title, String author, String publisher, int year) {
        System.out.println("\n[검색 결과]");
        boolean found = false;

        for (Save b : books) {
            if (b.getTitle().equals(title) &&
                    b.getAuthor().equals(author) &&
                    b.getPublisher().equals(publisher) &&
                    b.getYear() == year) {

                printBook(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("입력한 모든 정보와 일치하는 도서를 찾을 수 없습니다.");
        }
    }

    // 전체 도서 출력
    public void printAllBooks() {
        System.out.println("\n[전체 도서 목록]");

        if (books.isEmpty()) {
            System.out.println("저장된 도서가 없습니다.");
            return;
        }

        for (Save b : books) {
            printBook(b);
        }
    }

    // 도서 정보 출력
    private void printBook(Save b) {
        System.out.println(
                "도서명: " + b.getTitle() +
                        ", 저자: " + b.getAuthor() +
                        ", 출판사: " + b.getPublisher() +
                        ", 출판 연도: " + b.getYear()
        );
    }
}

