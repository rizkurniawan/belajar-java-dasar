public class Array {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "Eko";
        arrayString[1] = "Kurniawan";
        arrayString[2] = "Khannedy";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        // cara lain buat array (1)
        String[] arrayName = new String[] {
                "Budi", "Nugraha"
        };

        System.out.println(arrayName[0]);
        System.out.println(arrayName[1]);

        // ganti data
        arrayName[1] = "Nugroho";

        System.out.println(arrayName[1]);

        // cara lain buat array (2)
        int[] arrayInt = {
                10, 20, 30, 40, 50
        };

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);

        // array method
        System.out.println(arrayInt.length);


    }
}
