public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 90, 50, 50, 50};
        sayCongrats("Eko", values);

        sayCongrats2("Rizky", 90, 90, 85, 80, 75);
    }

    // cara biasa
    static void sayCongrats(String name, int[] values) {
        var total = 0;

        for (var value : values) {
            total += value;
        }

        var nilaiRataRata = total / values.length;

        if (nilaiRataRata >= 75) {
            System.out.println("Selamat "+ name + " lulus");
        } else {
            System.out.println("Maaf "+ name + " tidak lulus");
        }
    }

    // variable argument -> mirip rest parameter di javascript
    static void sayCongrats2(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var nilaiRataRata = total / values.length;

        if (nilaiRataRata >= 75) {
            System.out.println("Selamat "+ name + " lulus");
        } else {
            System.out.println("Maaf "+ name + " tidak lulus");
        }
    }
}
