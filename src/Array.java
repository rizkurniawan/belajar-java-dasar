public class Array {
    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "Rizky";
        names[1] = "Kurniawan";

        System.out.println(names[0] + " " + names[1]);

        Integer[] number = {
          10, 20, 80
        };

        // tidak bisa menghapus, solusinya dibuat jadi 0
        number[0] = 0;

        // array 2 dimensi
        String[][] name = {
                {"Eko", "Kurniawan"},
                {"Rizky", "Kurniawan"}
        };

        System.out.println(name[1][0] + " " + name[1][1]);
    }
}
