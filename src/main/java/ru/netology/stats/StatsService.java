package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public long amountSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }


    public long averageSales(long[] sales) {
        long sum = amountSales(sales);
        return sum / sales.length;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int belowAverageSales(long[] sales) {
        long averageMonth = averageSales(sales);
        int month = 0;
        for (long number : sales) {
            if (number < averageMonth) {
                month = month + 1;
            }
        }
        return month;
    }


    public int higherAverageSales(long[] sales) {
        long averageMonth = averageSales(sales);
        int month = 0;
        for (long number : sales) {
            if (number > averageMonth) {
                month = month + 1;
            }
        }
        return month;


    }
}


