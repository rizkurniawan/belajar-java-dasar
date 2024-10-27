public class KonversiNumber {
    public static void main(String[] args) {
        // automatically widening conversion (byte -> short -> int -> long -> float -> double)
        byte iniByte = 120;
        short iniShort = iniByte;
        int iniInteger = iniShort;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInteger);

        // manually narrowing conversion (double -> float -> long -> int -> short -> byte)
        int iniInteger2 = 1000;
        byte iniByte2 = (byte) iniInteger2;

        System.out.println(iniInteger2);
        System.out.println(iniByte2);
    }
}
