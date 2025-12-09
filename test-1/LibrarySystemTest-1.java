import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibrarySystemTest {

    @Test
    void addBook() {
        LibrarySystem system = new LibrarySystem();

        // 정상 입력
        assertDoesNotThrow(() -> {
            system.addBook("책1", "저자1", "출판사1", 2000);
        });

        //  오류: 출판사 누락(null)
        assertDoesNotThrow(() -> {
            system.addBook("책1", "저자1", null, 2000);
        });
    }

    @Test
    void searchBook() {
        LibrarySystem system = new LibrarySystem();
        system.addBook("책1", "저자1", "출판사1", 2000);

        // 정상 입력
        assertDoesNotThrow(() -> {
            system.searchBook("책1", "저자1", "출판사1", 2000);
        });

        //  오류: 제목 틀림
        assertDoesNotThrow(() -> {
            system.searchBook("없는책", "저자1", "출판사1", 2000);
        });
    }

    @Test
    void printAllBooks() {
        LibrarySystem system = new LibrarySystem();

        //  오류: 책이 없음
        assertDoesNotThrow(system::printAllBooks);

        //  정상: 책 추가 후 출력
        system.addBook("책1", "저자1", "출판사1", 2000);

        assertDoesNotThrow(system::printAllBooks);
    }
}

