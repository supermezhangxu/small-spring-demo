public class User {
    private String name;
    private Integer id;
    private Boolean isTall;

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public User(String name, Boolean isTall) {
        this.name = name;
        this.isTall = isTall;
    }

    public User(Integer id, Boolean isTall) {
        this.id = id;
        this.isTall = isTall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getTall() {
        return isTall;
    }

    public void setTall(Boolean tall) {
        isTall = tall;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isTall=" + isTall +
                '}';
    }
}
