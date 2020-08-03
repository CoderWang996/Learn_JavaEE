package domain;

public class card {
    private Integer id;
    private Integer number;
    private person p;

    public person getP() {
        return p;
    }

    public void setP(person p) {
        this.p = p;
    }

    public card() {
    }

    public card(Integer id, Integer number) {
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "card{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
