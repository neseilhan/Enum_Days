public enum Enum_days {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int day;

    private Enum_days(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}