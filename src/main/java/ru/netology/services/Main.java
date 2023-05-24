package ru.netology.services;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MonthNumberCalc calculation = new MonthNumberCalc();

        // Расчет количества месяцев для отдыха фрилансера зарабатывающего
        // 100 тыс. рублей в месяц, тратящего 60 тыс. рублей в месяц, при пороговой сумме - 150 тыс. рублей
        int NofM = calculation.calculation(100000, 60000, 150000);
        System.out.print("Months to be off = " + NofM);

    }
}