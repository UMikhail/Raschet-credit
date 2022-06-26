public class Credit {
    public double calculate(double money, double term) {
        Degree exp = new Degree(); // money - сумма кредита, term срок кредита (в месяцах)
        double m = exp.pow(term); // выражение m значение забирает из term
        double bet = 9.99; // процентная ставка
        double p1 = bet / 12 / 100; // const. ежемесяная ставка %
        double result = money * (p1 + (p1 / (m - 1))); // формула расчёта ежемесячного платежа
        return result;
    }
}
