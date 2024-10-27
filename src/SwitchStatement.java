public class SwitchStatement {
    public static void main(String[] args) {
        // switch biasa
        var nilai = 'C';

        switch (nilai) {
            case 'A':
                System.out.println("Good Job");
                break;
            case 'B':
                System.out.println("Nice Try");
                break;
            case 'C':
                System.out.println("Dont Give Up");
                break;
            default:
                System.out.println("Awkokwaokawok");
        }

        // switch lambda (java 14 up)
        switch (nilai) {
            case 'A' -> System.out.println("Good Job");
            case 'B' -> System.out.println("Nice Try");
            case 'C' -> System.out.println("Dont Give Up");
            default -> System.out.println("Awkokwaokawok");
        }

        // switch yield (java 14 up)
        String ucapan = switch (nilai) {
            case 'A':
                yield "Good Job";
            case 'B':
                yield "Nice Try";
            case 'C':
                yield "Dont Give Up";
            default:
                yield "Awkokwaokawok";
        };
        System.out.println(ucapan);

    }
}
