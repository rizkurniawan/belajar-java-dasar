public class IfStatement {
    public static void main(String[] args) {
        Byte nilaiAkhir = 80;
        Character nilaiHuruf;

        if (nilaiAkhir >= 90) {
            nilaiHuruf = 'A';
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = 'B';
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = 'C';
        } else {
            nilaiHuruf = 'D';
        }

        if (nilaiHuruf == 'D') {
            System.out.println("Maaf, anda tidak lulus");
        } else {
            System.out.println("Selamat, anda lulus dengan nilai " + nilaiHuruf);
        }
    }
}
