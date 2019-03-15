package Text06;

public class Card {
    private String hs;
    private String sz;

    public Card() {}

    public Card(String hs, String sz) {
        this.hs = hs;
        this.sz = sz;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    public void showCard() {
        System.out.print(hs + sz + "\t");
    }
}
