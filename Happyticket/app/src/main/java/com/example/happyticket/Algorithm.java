package com.example.happyticket;

public class Algorithm {
    // создание пустого конструктора
    public Algorithm() {
    }

    // метод определения счастливого билета по Питерской системе
    public static boolean isHappyStPetersburg(int x) {
        int s1 =0, s2 = 0;
        for(int i = 0; i < 3; i++) {
            s1 += x % 10;
            x = x / 10;
            s2 += x % 10;
            x = x / 10;
        }
        if (s1 == s2)
            return true;
        else
            return false;
    }


    // метод определения следующего счастливого билета (быстрее)
    public int nextHappyStPetersburg(String input) {
        int inputInt = Integer.parseInt(input); // конвертирование данных из String в int
        int count = 0; // задание счётчика

        for (int i = inputInt; i < 1_000_000; i++) { // цикл проверки и поиски счастливого билета
            int s1 = i%10 + (i/100)%10 + (i/10_000)%10; // подсчёт суммы последних трёх чисел
            int j = i / 10;
            int s2 = j%10 + (j/100)%10 + (j/10_000)%10; // подсчёт суммы первых трёх чисел
            if (s1 == s2) { // проверка счастливого билета
                break; // выброс из цикла
            } else { // иначе
                count++; // увеличение счётчика на единицу
            }
        }

        return inputInt + count; // вывод счастливого билета
    }


}
