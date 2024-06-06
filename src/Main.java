public class Main {
    public static void main(String[] args) {

        Enum_days gunPzt = Enum_days.PAZARTESI;
        System.out.println(gunPzt.ordinal()); // Dizideki indeksini verir.
        System.out.println(gunPzt.name()); // Sabit'in adını döndürür.

        Enum_days[] values = Enum_days.values(); // Tüm sabitlerini döndürür.

        Enum_days gun = Enum_days.valueOf("PAZARTESI"); // String'i enum'a dönüştürür.
    }
}