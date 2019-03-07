package cho7;

public class UUser {
    private int id;
    private String name;

    public UUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
