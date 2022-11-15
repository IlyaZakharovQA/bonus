public class Main {
    public static void main(String[] args) {
        int account = 50; // изначально на счету
        int refillBonus = 1000; // условие начисления бонусов
        int refill = 2500; // сумма пополнения
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