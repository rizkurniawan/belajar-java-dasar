public class SwitchStatement {
    public static void main(String[] args) {
        Character nilai = 'A';

        // model umum
        switch (nilai) {
            case 'A':
                System.out.println("Anda lulus dengan predikat memuaskan");
                break;
            case 'B':
                System.out.println("Anda lulus dengan predikat baik");
                break;
            case 'C':
                System.out.println("Anda lulus dengan predikat cukup baik");
                break;
            default:
                System.out.println("Maaf anda tidak lulus");
        }

        // model lambda switch
        switch (nilai) {
            case 'A' -> System.out.println("Anda lulus dengan predikat memuaskan");
            case 'B' -> System.out.println("Anda lulus dengan predikat baik");
            case 'C' -> System.out.println("Anda lulus dengan predikat cukup baik");
            default -> System.out.println("Anda tidak lulus wkwkw");
        }

        // yield untuk mengembalikan nilai
        String ucapan;
        ucapan = switch (nilai) {
            case 'A': yield "Mantap memuaskan";
            case 'B': yield "Mantap baik";
            case 'C': yield "Mantap cukup baik";
            default: yield "kaga lulus lu akwoakwo";
        };

        System.out.println(ucapan);
    }
}
