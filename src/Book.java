public class Book extends BorrowableItem {
    private final String author;
    private final String category;
    private final int pageCount;

    public Book(String title, String publisher, String location,
                String author, String category, int pageCount) {
        super(title, publisher, location);
        this.author = author;
        this.category = category;
        this.pageCount = pageCount;
    }

    public void showBookInfo() {
        showInfo();
        System.out.println("저자: " + author);
        System.out.println("분류: " + category);
        System.out.println("페이지 수: " + pageCount);
        System.out.println("대여 상태: " + getBorrowStatusText());
        System.out.println("반납 예정일: " + getDueDateText());
    }

    public void showAuthor() {
        System.out.println("저자: " + author);
    }

    public void showCategory() {
        System.out.println("분류: " + category);
    }
}
