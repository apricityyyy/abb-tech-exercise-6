public class Teacher extends Profile {
    private String tName;
    private int tAge;
    private int tId;

    public Teacher(String name, int age) {
        super(name, age);
        this.tName = name;
        this.tAge = age;
        this.tId = super.id;
    }

    String gettName() {
        return tName;
    }

    int gettAge() {
        return tAge;
    }

    int gettId() {
        return this.tId;
    }

    void settName(String tName) {
        this.tName = tName;
    }

    void settAge(int tAge) {
        this.tAge = tAge;
    }

    void settId(int tId) {
        this.tId = tId;
    }
}