public class NonBorrowableItem extends LibraryItem {
    private final String useRule;

    public NonBorrowableItem(String title, String publisher, String location, String useRule) {
        super(title, publisher, location);
        this.useRule = useRule;
    }

    public void showUseRule() {
        System.out.println("이용 규칙: " + useRule);
    }
}
