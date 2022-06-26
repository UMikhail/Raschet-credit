public class Degree {
    public static double pow(double powValue) {
        double result = 1; // метод расчёта степеней (зависит от ежемесячной ставки %)
        for (double a = 1; a <= powValue; a++) {
            double bet = 9.99; // процентная ставка такая же как и в Degree
            result = result * (1 + (bet / 12 / 100));
        }
        return result;
    }
}
