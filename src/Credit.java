public class Credit {
    public double calculate(double s, double n1) {
        Stepen raz = new Stepen(); // s - сумма платежа, n1 срок кредита (в месяцах)
        double m = raz.pow(n1); // выражение m значение забирает из n1
        double p1 = 0.008325; // const. ежемесяная ставка %
        double result = s * (p1 + (p1 / (m - 1))); // формула расчёта ежемесячного платежа
        return result;
    }
}
