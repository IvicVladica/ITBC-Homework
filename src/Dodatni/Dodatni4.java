package Dodatni;//4. Написати програм који исписује природне бројеве до унетог броја на сл. начин
//        Ако је број дељив са 3 - Исписујемо Fizz
//        Ако је број дељив са 5 - Исписујемо Buzz
//        Ако је број дељив са 3 и са 5 - Исписујемо FizzBuzz
//        Ако није испуњен ни један услов изнад - Исписујемо тај број
//        Пример тока програма:
//        Унесите број: 15
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz

import java.util.Scanner;

public class Dodatni4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++) {
            if (i%3 == 0 && i%5 ==0) {
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
    }
}
}
