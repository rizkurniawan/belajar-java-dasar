public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Eko", "Rizky", "Budi", "Ucup", "Otong"
        };

        // versi for
        System.out.println("Versi For");
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // versi for each
        System.out.println("Versi For Each");
        for (var name : names) {
            System.out.println(name);
        }

    }
}
