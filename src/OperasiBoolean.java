public class OperasiBoolean {
    public static void main(String[] args) {
        int nilaiAbsen = 70;
        int nilaiAkhir = 85;

        boolean lulusAbsen = nilaiAbsen >= 70;
        boolean lulusNilai = nilaiAkhir >= 70;

        boolean lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
