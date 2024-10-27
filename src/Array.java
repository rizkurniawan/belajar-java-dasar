public class Array {
    public static void main(String[] args) {
        // cara 1: membuat array
        String[] members;
        members = new String[3];

        members[0] = "Eko";
        members[1] = "Kurniawan";
        members[2] = "Khannedy";

        System.out.println(members[0]);
        System.out.println(members[1]);
        System.out.println(members[2]);

        // cara 2: membuat array
        String[] students = {"Budi", "Rahmat", "Andi"};

        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);

        // cara 3: membuat array
        int[] numbers = new int[] {100, 80, 90};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // menghapus element di array (tidak ada, paling diganti jadi null / 0)
        numbers[1] = 0;
        System.out.println(numbers[1]);

        // mengukur panjang array
        System.out.println(numbers.length);

        // array multidimensi
        String[][] namaNama = {
                {"Eko", "Kurniawan"},
                {"Rizky", "Kurniawan"},
                {"Budi Nugraha"}
        };

        System.out.println(namaNama[1][0]);
    }
}
