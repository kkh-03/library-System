import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibrarySystem system = new LibrarySystem();

        while (true) {
            System.out.println("\n=== 도서 관리 시스템 ===");
            System.out.println("1. 도서 저장");
            System.out.println("2. 도서 검색");
            System.out.println("3. 전체 도서 출력");
            System.out.println("4. 도서 대출");
            System.out.println("5. 도서 반납");
            System.out.println("6. 도서 목록 보기");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("도서명: ");
                String title = sc.nextLine();
                System.out.print("저자: ");
                String author = sc.nextLine();
                System.out.print("출판사: ");
                String publisher = sc.nextLine();
                System.out.print("출판 연도: ");
                int year = sc.nextInt();
                sc.nextLine();

                system.addBook(title, author, publisher, year);
            }
            else if (menu == 2) {
                System.out.print("도서명: ");
                String title = sc.nextLine();
                System.out.print("저자: ");
                String author = sc.nextLine();
                System.out.print("출판사: ");
                String publisher = sc.nextLine();
                System.out.print("출판 연도: ");
                int year = sc.nextInt();
                sc.nextLine();

                system.searchBook(title, author, publisher, year);
            }
            else if (menu == 3) {
                system.printAllBooks();
            }
            else if (menu == 4) {
                System.out.print("대출할 도서 ID: ");
                int id = sc.nextInt();

                if (system.borrowBook(id)) System.out.println("대출 완료!");
                else System.out.println("대출 실패");
            }
            else if (menu == 5) {
                System.out.print("반납할 도서 ID: ");
                int id = sc.nextInt();

                if (system.returnBook(id)) System.out.println("반납 완료!");
                else System.out.println("반납 실패");
            }
            else if (menu == 6) {
                system.showBooks();
            }
            else if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        sc.close();
    }
}
