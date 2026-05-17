public class Magazine extends NonBorrowableItem {
    private final int issueNumber;
    private final String publicationMonth;
    private final String topic;

    public Magazine(String title, String publisher, String location, String useRule,
                    int issueNumber, String publicationMonth, String topic) {
        super(title, publisher, location, useRule);
        this.issueNumber = issueNumber;
        this.publicationMonth = publicationMonth;
        this.topic = topic;
    }

    public void showIssueInfo() {
        showInfo();
        System.out.println("발행 호수: " + issueNumber + "호");
        System.out.println("발행 월: " + publicationMonth);
        showUseRule();
    }

    public void showTopic() {
        System.out.println("잡지 주제: " + topic);
    }
}
