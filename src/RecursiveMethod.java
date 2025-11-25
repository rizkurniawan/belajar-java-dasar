public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorial(5));
    }

    // factorial menggunakan loop
    static int factorialLoop(int n) {
        int hasil = 1;

        for (int counter = 1; counter <= n; counter++) {
            hasil *= counter;
        }
        return hasil;
    }

    // factorial menggunakan recursive method
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
