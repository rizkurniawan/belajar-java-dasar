public class Break {
    public static void main(String[] args) {
        Byte counter = 1;

        while (true) {
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }
    }
}
