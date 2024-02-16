public class Student extends Profile {
    private int sId;
    private String sName;
    private int sAge;

    public Student(String name, int age) {
        super(name, age);
        this.sName = name;
        this.sAge = age;
        this.sId = super.id;
    }

    String getsName() {
        return sName;
    }

    int getsAge() {
        return sAge;
    }

    int getsId() {
        return sId;
    }

    void setsName(String sName) {
        this.sName = sName;
    }

    void setsAge(int sAge) {
        this.sAge = sAge;
    }

    void setsId(int sId) {
        this.sId = sId;
    }
}