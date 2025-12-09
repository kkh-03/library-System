import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibrarySystemTest {

    @Test
    void testBorrowAndReturn() {
        LibrarySystem system = new LibrarySystem();
        system.addTestBook(1, "자바");

        // 대출 성공
        assertTrue(system.borrowBook(1));

        // 이미 대출된 책 대출 → 실패
        assertFalse(system.borrowBook(1));

        // 반납 성공
        assertTrue(system.returnBook(1));

        // 이미 반납된 책 반납 → 실패
        assertFalse(system.returnBook(1));
    }
}
