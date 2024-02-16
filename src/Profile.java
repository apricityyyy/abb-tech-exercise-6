public class Profile {
    protected static int MEMBER_ID = 0;
    protected String name;
    protected int age;
    protected int id;

    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = MEMBER_ID++;
    }
}
