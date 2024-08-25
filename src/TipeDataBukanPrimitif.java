public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        // beda dengan tipe data primitif rata2 di penulisan, bukan primitif diawali huruf kapital
        // tipe data bukan primitif default value nya null

        String name = "Rizky Kurniawan";
        Short age = 23;
        Boolean isMarried = false;

        System.out.println(name);
        System.out.println(age);
        System.out.println(isMarried);

        // konversi tipe data primitif - tipe data bukan primitif
        int ammount = 100;

        Integer iniAmmount = ammount;

        short iniShort = iniAmmount.shortValue();
        long iniInt = iniAmmount.longValue();
        float iniFloat = iniAmmount.floatValue();

    }
}
