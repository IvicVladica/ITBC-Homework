package Test1;//1. (20п) Написати програм који исписује таблицу множења за 1 цифру (од 1 до 9)
//        Нпр ако је цифра 5 (Ако пишете функцију, цифра је параметар, иначе је сместите у променљиву и тако је користите)
//        1 2 3 4 5 6 7 8 9
//        5 5 10 15 20 25 30 35 40 45
//        Не мора бити исписано на овај начин, битно је да се испише таблица за цифру 5
//        нпр. 5 10 15 20 25 30 35 40 45

public class Zadatak1 {
    public static void mnozenje(int x) {
        int sum = 1;
        for (int i = 1; i <= 9; i++) {
            sum = x * i;
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        int a = 8;
        mnozenje(a);

    }

}
