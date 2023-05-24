package ru.netology.services;

public class MonthNumberCalc {
    public int calculation(int income, int expenses, int threshold) {
        int numberOfMonth = 0; //количество свободных месяцев
        int currentSum = 0;    //начальная сумма на счету фрилансера

        for (int i = 1; i <= 12; i++) {
//Если сумма на счету меньше пороговой, то фрилансер работает, на счет начисляются деньги и вычитаются расходы
            if (currentSum < threshold) {
                currentSum = currentSum + income - expenses;
            } else {
//Если сумма на счету больше пороговой, то фрилансер неработает, количество месяцев увеличивается на 1,
//из суммы на счету вычитаеются расходы и сумма уменьшается в три раза из-за расходов на отдых
                numberOfMonth = numberOfMonth + 1;
                // i++;
                currentSum = (currentSum - expenses) / 3;
            }
        }

        return numberOfMonth;
    }
}
