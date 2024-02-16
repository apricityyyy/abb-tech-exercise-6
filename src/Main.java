public class Main {
    public static void main(String[] args) {
        GenericStorage<Profile> storage = new GenericStorage<>(Profile.class);

        // students
        Student student1 = new Student("Ilhama", 20);
        Student student2 = new Student("Zumrud", 20);

        // teachers
        Teacher teacher1 = new Teacher("Tom", 30);
        Teacher teacher2 = new Teacher("Jerry", 35);

        storage.addItem(student1);
        storage.addItem(teacher1);
        storage.addItem(student2);
        storage.addItem(teacher2);
        storage.displayAllItems();

        storage.searchItem(2);
        storage.searchItem(100);
        storage.removeItem(storage.searchItem(2));
        storage.displayAllItems();
    }
}
