public class Stepen {
    public static double pow (double powValue) {
        double result = 1; // метод расчёта степеней (зависит от ежемесячной ставки %)
        for (double a = 1; a <= powValue; a++) {
            result = result * 1.008325;
        }
        return result;
    }
}
