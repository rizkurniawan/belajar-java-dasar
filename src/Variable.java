public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Rizky Kurniawan";

        System.out.println(name);

        Byte age = 23;

        // sejak java 10, pakai keyword var tidak harus nulis tipe datanya dan harus langsung inisialisai nilainya
        var firstName = "Rizky";
        var lastName = "Kurniawan";

        System.out.println(firstName + " " + lastName);

        // final atau const
        final String address = "Tangerang";
        final var phi = 3.14;

        System.out.println(address);
        System.out.println(phi);
    }
}
