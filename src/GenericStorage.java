public class GenericStorage<T extends Profile> {
    private final Profile[] profiles = new Profile[1000];
    private int length = 0;
    private final int[] counts = new int[2];
    private final Class<T> allowedType; // for runtime checking

    public GenericStorage(Class<T> allowedType) {
        this.allowedType = allowedType;
    }

    public void addItem(T item) {
        if ((length + 1) > 1000) {
            System.out.println("No more than 1000 profiles are allowed.");
            return;
        }

        this.profiles[length++] = item;
        if (item instanceof Student) this.counts[0]++;
        else if (item instanceof Teacher) this.counts[1]++;

        System.out.println("Item added successfully.");
    }

    public void removeItem(T item) {
        for (int index = 0; index < length; index++) {
            if (this.profiles[index].equals(item)) {
                if (this.profiles[index] instanceof Student) this.counts[0]--;
                else if (this.profiles[index] instanceof Teacher) this.counts[1]--;

                // Calculate the number of elements to shift left.
                int numMoved = length - index - 1;
                if (numMoved > 0) {
                    System.arraycopy(this.profiles, index + 1, this.profiles, index, numMoved);
                }
                this.profiles[--length] = null; // Decrement length and clear last element
                System.out.println("Item removed successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public T searchItem(int id) {
        for (int i = 0; i < this.length; i++) {
            Profile itm = this.profiles[i];
            if (this.allowedType.isInstance(itm) && itm.id == id) {
                System.out.println("Item found.");
                return allowedType.cast(itm); // Safe casting to avoid warnings
            }
        }

        System.out.println("Item does not exist.");
        return null;
    }

    public void displayAllItems() {
        for (Profile itm : this.profiles) {
            if (itm instanceof Student) {
                System.out.println("Student ID: " + itm.id + "; Name: " + itm.name + "; Age: " + itm.age);
                System.out.println("====================================================================");
            } else if (itm instanceof Teacher) {
                System.out.println("Teacher ID: " + itm.id + "; Name: " + itm.name + "; Age: " + itm.age);
                System.out.println("====================================================================");
            }
        }

        System.out.println("Total students: " + this.counts[0]);
        System.out.println("Total teachers: " + this.counts[1]);
    }

    public Profile[] getProfiles() {
        return profiles;
    }
}
