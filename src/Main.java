public class Main {
    public static void main(String[] args) {
        int account = 5; // изначально на счету
        int refill = 300; // сумма пополнения
        int bonus;
        if (refill >=1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int finalAccount = account + refill + bonus;
        if (bonus == 0) {
            System.out.println("Бонусов нет, итоговая сумма на счету клиента - " + finalAccount+ "₽.");
        } else {
            System.out.println("Клиент пополнил счёт на " + refill + "₽. Бонус равен " + bonus + "₽, итоговая сумма на счету клиента - " + finalAccount + "₽.");
        }
    }
}