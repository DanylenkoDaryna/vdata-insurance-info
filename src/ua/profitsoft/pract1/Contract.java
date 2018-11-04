package ua.profitsoft.pract1;

import java.util.ArrayList;

/**
 * Этот класс нужен, чтобы вмещать основную информацию о Договоре: номере, клиентах, застрахованных лицах, датах
 *
 * @author Дарина Даниленко
 */
public class Contract {

    private int id;//Номер
    private MyDate acceptDate;//Дата заключения
    private MyDate startDate, endDate;//аты начала и окончания действия
    private Client man;//страховальщик
    private ArrayList<InsuredPerson> personList;//страхователи

    /**
     * Конструктор с параметрами для Договора
     *
     * @param number  идентифицирует Договор
     * @param accDate дата заключения Договора
     * @param start   дата начала действия Договора
     * @param end     дата окончания действия Договора
     * @param human   Клиент
     * @param myList  список застрахованных лиц - дженерик типа InsuredPerson
     */
    public Contract(int number, MyDate accDate, MyDate start, MyDate end, Client human, ArrayList<InsuredPerson> myList) {
        this.setId(number);
        this.setAcceptDate(accDate);
        this.setStartDate(start);
        this.setEndDate(end);
        this.setMan(human);
        this.setPersonList(myList);
    }


    /**
     * Переопределенный метод вывода основной информации по Договору в читаемом виде
     *
     * @return строка
     */
    @Override
    public String toString() {
        String border = "\n----------------------------------------------------\n";
        return border + "ContractID:\t" + this.getId() + "\nAcceptDate:\t" + this.getAcceptDate().toString() +
                "\nStartDate:\t" + this.getStartDate().toString() + "\nEndDate:\t" + this.getEndDate().toString()
                + "\nClient:\t" + this.getMan().toString() + "\nPersonList:" + this.getPersonList();
    }

    /**
     * метод, который выводит общую стоимость страховки по договору (как сумма по всем застрахованным лицам)
     * перебирает коллекцию и суммирует все индивидуальные стоимости застрахованных лиц
     */
    public void TotalCost() {
        double result = 0;
        for (InsuredPerson p : this.getPersonList()) {
            result += p.getPersonalCost();
        }
        System.out.println("\nTotal insurance cost:\t" + result);
    }

    /**
     * геттер
     *
     * @return Номер, идентифицирует Договор
     */
    public int getId() {
        return id;
    }

    /**
     * сеттер -устанавливает
     *
     * @param id идентифицирует Договор
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * геттер
     *
     * @return ссылку на объект типа Клиент
     */
    public Client getMan() {
        return man;
    }

    /**
     * сеттер
     *
     * @param man ссылка на объект типа Клиент
     */
    public void setMan(Client man) {
        this.man = man;
    }

    /**
     * геттер
     *
     * @return атрибут список застрахованных лиц
     */
    public ArrayList<InsuredPerson> getPersonList() {
        return personList;
    }

    /**
     * сеттер
     *
     * @param personList список застрахованных лиц
     */
    public void setPersonList(ArrayList<InsuredPerson> personList) {
        this.personList = personList;
    }

    /**
     * геттер
     *
     * @return дату заключения Договора
     */
    public MyDate getAcceptDate() {
        return acceptDate;
    }

    /**
     * сеттер
     *
     * @param acceptDate дата заключения Договора
     */
    public void setAcceptDate(MyDate acceptDate) {
        this.acceptDate = acceptDate;
    }

    /**
     * геттер
     *
     * @return дату начала действия Договора
     */
    public MyDate getStartDate() {
        return startDate;
    }

    /**
     * сеттер
     *
     * @param startDate дата начала действия Договора
     */
    public void setStartDate(MyDate startDate) {
        this.startDate = startDate;
    }

    /**
     * геттер
     *
     * @return дату конца действия Договора
     */
    public MyDate getEndDate() {
        return endDate;
    }

    /**
     * сеттер
     *
     * @param endDate дата конца действия Договора
     */
    public void setEndDate(MyDate endDate) {
        this.endDate = endDate;
    }
}
