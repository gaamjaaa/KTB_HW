import java.time.LocalDate;

public class BorrowableItem extends LibraryItem {
    private boolean borrowStatus;
    private LocalDate dueDate;

    public BorrowableItem(String title, String publisher, String location) {
        super(title, publisher, location);
        this.borrowStatus = false;
        this.dueDate = null;
    }

    public void borrowItem() {
        if (borrowStatus) {
            System.out.println("이미 대여 중인 도서입니다.");
            System.out.println("반납 예정일: " + getDueDateText());
            return;
        }

        borrowStatus = true;
        dueDate = LocalDate.now().plusDays(7);

        System.out.println("도서가 대여되었습니다.");
        System.out.println("반납 예정일: " + getDueDateText());
    }

    public void returnItem() {
        if (!borrowStatus) {
            System.out.println("대여 중인 도서가 아닙니다.");
            System.out.println("현재 대여 상태: " + getBorrowStatusText());
            return;
        }

        borrowStatus = false;
        dueDate = null;

        System.out.println("도서가 반납되었습니다.");
        System.out.println("현재 대여 상태: " + getBorrowStatusText());
    }

    public void showBorrowStatus() {
        System.out.println("현재 대여 상태: " + getBorrowStatusText());
        System.out.println("반납 예정일: " + getDueDateText());
    }

    protected String getBorrowStatusText() {
        return borrowStatus ? "대여 중" : "대여 가능";
    }

    protected String getDueDateText() {
        return dueDate == null ? "없음" : dueDate.toString();
    }
}
