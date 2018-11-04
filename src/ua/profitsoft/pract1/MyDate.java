package ua.profitsoft.pract1;

/**
 * Этот класс нужен для более удобного хранения и вывода даты
 *
 * @author Дарина Даниленко
 */
public class MyDate {

    private int day;
    private int month;
    private int year;

    /**
     * конструктор MyDate
     *
     * @param nday   день
     * @param nmonth месяц
     * @param nyear  год
     */
    public MyDate(int nday, int nmonth, int nyear) {
        this.setDay(nday);
        this.setMonth(nmonth);
        this.setYear(nyear);
    }

    /**
     * переопределенный метод toString для удобства чтения объекта класса MyDate
     *
     * @return строку день.месяц.год(прим. 2.8.2004)
     */
    @Override
    public String toString() {
        return this.getDay() + "." + this.getMonth() + "." + this.getYear();
    }

    /**
     * геттер
     *
     * @return день даты
     */
    public int getDay() {
        return day;
    }

    /**
     * сеттер
     *
     * @param day день даты
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * геттер
     *
     * @return месяц даты
     */
    public int getMonth() {
        return month;
    }

    /**
     * сеттер
     *
     * @param month месяц даты
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * геттер
     *
     * @return год даты
     */
    public int getYear() {
        return year;
    }

    /**
     * сеттер
     *
     * @param year год даты
     */
    public void setYear(int year) {
        this.year = year;
    }
}
