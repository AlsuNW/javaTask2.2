public class Main {
    public static void main(String[] args) {
        int onAccount = 300;
        int replenishment = 1200;
        int bonusPrice = 100;
        int accountTotal;
        int bonusAmount;

        if(replenishment > 1000) {
            bonusAmount = replenishment / bonusPrice;
        } else {
            bonusAmount = 0;
        }
        accountTotal = onAccount + replenishment + bonusAmount;

        System.out.println("Бонус равен " + bonusAmount);
        System.out.println("Итоговая сумма на счету клиента равна " + accountTotal);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
