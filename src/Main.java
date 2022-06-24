public class Main {
    public static void main(String[] args) {

        Credit service = new Credit();
        double x =  service.calculate(1000000, 12); // пример расчёта на 12 месяцев
        double y =  service.calculate(1000000, 24); // пример расчёта на 24 месяца
        double z =  service.calculate(1000000, 36); // пример расчёта на 36 месяцев
        System.out.println("Сумма ежемесячного платежа на 1 год: " + x);
        System.out.println("Сумма ежемесячного платежа на 2 года: " + y);
        System.out.println("Сумма ежемесячного платежа на 3 года: " + z);

    }
}
