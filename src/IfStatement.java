public class IfStatement {
    public static void main(String[] args) {
        var nilaiA = 80;
        var nilaiB = 90;

        if (nilaiA >= 70 && nilaiB >= 70) {
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Maaf, coba lagi tahun depan");
        }

        if (nilaiA >= 90 && nilaiB >= 90) {
            System.out.println("Nilai A");
        } else if (nilaiA >= 75 && nilaiB >= 75) {
            System.out.println("Nilai B");
        } else if (nilaiA >= 60 && nilaiB >= 60) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }
    }
}
