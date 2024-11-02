package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Если денег хватает для отдыха
                count++;
                money = (money - expenses) / 3; // тратим на отдых и уменьшаем в три раза
            } else {
                // Если денег не хватает, идем работать
                money += income - expenses; // заработок минус расходы
            }
        }
        return count;
    }
}
