public class OperasiBoolean {
    public static void main(String[] args) {

        final byte kkm = 70;

        byte nilaiUjianTulis = 90;
        byte nilaiUjianPraktek = 70;

        if (nilaiUjianTulis >= kkm && nilaiUjianPraktek >= kkm) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
