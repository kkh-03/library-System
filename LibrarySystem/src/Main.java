import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LibrarySystem system = new LibrarySystem();
        Scanner sc = new Scanner(System.in);

        // 테스트용 책
        system.addTestBook(1, "자바 프로그래밍");
        system.addTestBook(2, "자료구조");
        system.addTestBook(3, "운영체제");

        while (true) {
            System.out.println("\n=== 도서 대출/반납 시스템 ===");
            System.out.println("1. 도서 대출");
            System.out.println("2. 도서 반납");
            System.out.println("3. 도서 목록 보기");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("대출할 도서 ID: ");
                int id = sc.nextInt();
                if (system.borrowBook(id)) System.out.println(">> 대출 성공!");
                else System.out.println(">> 대출 실패 (이미 대출중이거나 없는 책)");

            } else if (menu == 2) {
                System.out.print("반납할 도서 ID: ");
                int id = sc.nextInt();
                if (system.returnBook(id)) System.out.println(">> 반납 성공!");
                else System.out.println(">> 반납 실패 (이미 반납되었거나 없는 책)");

            } else if (menu == 3) {
                System.out.println("\n=== 도서 목록 ===");
                system.showBooks();

            } else if (menu == 4) {
                System.out.println("프로그램 종료");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        //https://github.com/yahahahoho/Java-Library-System.git
        //도서관 관리 프로젝트 v1.0개발
        sc.close();
    }
}