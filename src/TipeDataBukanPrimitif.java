public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 1000;
        String name = "Rizky";
        Long amount = 23000L;

        // Konversi Tipe Data Bukan Primitif ke Tipe Data Primitif
        int iniIntegerPrimitif = iniInteger;

        // Konversi Tipe Data Bukan Primitif ke Tipe Data Primitif Berbeda
        int agePrimitif = amount.intValue();
        short agePrimitif2 = amount.shortValue();

        System.out.println(agePrimitif);
        System.out.println(agePrimitif2);
    }
}
