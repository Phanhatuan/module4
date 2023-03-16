package ss4.baiTap.BT1.model;

public class Email {
    private String language;
    private int pageSize;
    private boolean spamFilter;
    private String Signature;

    public Email(String language, int pageSize, boolean spamFilter, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        Signature = signature;
    }

    public Email() {

    }

    @Override
    public String toString() {
        return "Email{" +
                "language='" + language + '\'' +
                ", pageSize=" + pageSize +
                ", spamFilter=" + spamFilter +
                ", Signature='" + Signature + '\'' +
                '}';
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
