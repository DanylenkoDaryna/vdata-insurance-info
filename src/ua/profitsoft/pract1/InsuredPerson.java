package ua.profitsoft.pract1;


/**
 * Этот класс нужен, чтобы хранить информацию о застрахованных клиентах
 *
 * @author Дарина Даниленко
 */
public class InsuredPerson {

    private String flname;// - ФИО
    private double personalCost;//- Стоимость страховки (для данного лица)
    private MyDate bdate;//- Дата рождения

    /**
     * конструктор
     *
     * @param name строка ФИО застрахованного лица
     * @param d    дата рождения лица
     * @param cost индивидуальная стоимость страховки
     */
    public InsuredPerson(String name, MyDate d, double cost) {
        this.setFlname(name);
        this.setBdate(new MyDate(d.getDay(), d.getMonth(), d.getYear()));
        this.setPersonalCost(cost);
    }


    /**
     * геттер
     *
     * @return строку ФИО застрах. лица
     */
    public String getFlname() {
        return flname;
    }

    /**
     * сеттер
     *
     * @param flname строка ФИО застрах. лица
     */
    public void setFlname(String flname) {
        this.flname = flname;
    }

    /**
     * геттер
     *
     * @return вещественное значение индивидуальной стоимости страховки
     */
    public double getPersonalCost() {
        return personalCost;
    }

    /**
     * сеттер
     *
     * @param personalCost вещественное значение индивидуальной стоимости страховки
     */
    public void setPersonalCost(double personalCost) {
        this.personalCost = personalCost;
    }

    /**
     * переопределенный метод toString для читаемости основной инфы по Застрахованному лицу
     *
     * @return строку с инфой: ФИО, дата рождения, индивид стоимость страховки
     */
    @Override
    public String toString() {
        return "(FIO:" + this.getFlname() + "\t Date:" + this.getBdate().toString() + "\t Cost:" + this.getPersonalCost() + ")";

    }

    /**
     * геттер
     *
     * @return объект типа МуDate - дату рождения
     */
    public MyDate getBdate() {
        return bdate;
    }

    /**
     * сеттер
     *
     * @param bdate объект типа МуDate - дата рождения
     */
    public void setBdate(MyDate bdate) {
        this.bdate = bdate;
    }
}
