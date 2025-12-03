import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibrarySystem system = new LibrarySystem();

        while (true) {
            System.out.println("\n=== 도서 관리 시스템 ===");
            System.out.println("1. 도서 정보 저장");
            System.out.println("2. 도서 검색 ");
            System.out.println("3. 전체 도서 출력");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                // [A] 도서 정보 저장
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

            } else if (menu == 2) {
                // [B] 검색 (4개 모두 입력)
                System.out.println("\n=== 도서 검색 (정확히 모두 입력) ===");

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

            } else if (menu == 3) {
                system.printAllBooks();

            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}