public class Variable {
    public static void main(String[] args) {
        String name = "Rizky";
        byte umur = 25;

        final float phi = 3.14F;

        // sejak java 10 support var dan harus langsung diinisiasi
        var firstName = "Rizky";
        var lastName = "Kurniawan";
        var age = 25;

        System.out.println(firstName + " " + lastName + " umur " + age);
    }
}
