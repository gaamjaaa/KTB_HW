public class LibraryItem {
    private final String title;
    private final String publisher;
    private String location;

    public LibraryItem(String title, String publisher, String location) {
        this.title = title;
        this.publisher = publisher;
        this.location = location;
    }

    public void showInfo() {
        System.out.println("제목: " + title);
        System.out.println("출판사: " + publisher);
        System.out.println("자료 위치: " + location);
    }

    public void moveLocation(String location) {
        this.location = location;
        System.out.println("자료 위치가 변경되었습니다.");
        System.out.println("현재 위치: " + this.location);
    }
}
