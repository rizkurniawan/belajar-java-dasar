public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {100, 100, 100, 100, 100, 95};
        sayCongrats("Eko", values);

        sayCongrats2("Rizky", 100, 100, 100, 100, 100, 100);
    }

    // versi array
    static void sayCongrats(String name, int[] values) {
        int total = 0;
        int pembagi = values.length;

        for (int value : values) {
            total += value;
        }

        int rataRata = total / pembagi;
        System.out.println("Selamat " + name + " milai rata-rata kamu adalah " + rataRata);
    }

    // versi variable argument
    static void sayCongrats2(String name, int... values) {
        int total = 0;
        int pembagi = values.length;

        for (int value : values) {
            total += value;
        }

        int rataRata = total / pembagi;
        System.out.println("Selamat " + name + " milai rata-rata kamu adalah " + rataRata);
    }
}
