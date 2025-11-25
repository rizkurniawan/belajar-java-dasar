public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Rizky", "Kurniawan");
        sayHello("Eko", "Khannedy");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName);
    }
}
