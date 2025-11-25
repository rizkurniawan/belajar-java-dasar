public class Scope {
    public static void main(String[] args) {
        sayHello("Rizky");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);

        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        // tidak bisa manggil variabel hi disini
    }
}
