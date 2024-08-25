public class Variable {
    public static void main(String[] args) {

        String name = "Rizky Kurniawan";
        int age = 23;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        var firstName = "Eko";
        var lastName = "Kurniawan";

        System.out.println(firstName);
        System.out.println(lastName);

        //error, harus langsung diinisiasi nilainya
        //var fullName;

        //final sama dengan const pada bahasa pemrograman lain
        final String fullName = "Rizky Kurniawan";

    }
}
