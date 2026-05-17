import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book(
                "자바의 정석",
                "도우출판",
                "2층 컴퓨터 서가",
                "남궁성",
                "컴퓨터",
                1022
        );

        while (true) {
            printMenu();
            int menu;

            try {
                menu = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 메뉴를 선택해 주세요.");
                System.out.println();
                continue;
            }

            switch (menu) {
                case 1:
                    book.showInfo();
                    break;
                case 2:
                    book.showBookInfo();
                    break;
                case 3:
                    book.showBorrowStatus();
                    break;
                case 4:
                    book.borrowItem();
                    break;
                case 5:
                    book.returnItem();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택해 주세요.");
                    break;
            }

            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("===== 도서관 도서 관리 프로그램 =====");
        System.out.println("1. 도서 기본 정보 출력");
        System.out.println("2. 도서 상세 정보 출력");
        System.out.println("3. 대여 상태 확인");
        System.out.println("4. 도서 대여");
        System.out.println("5. 도서 반납");
        System.out.println("0. 종료");
        System.out.print("메뉴 선택: ");
    }

}
