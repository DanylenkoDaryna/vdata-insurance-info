package ua.profitsoft.pract1;

/**
 * Этот класс нужен, чтобы хранить информацию о клиенте в договоре
 *
 * @author Дарина Даниленко
 */
public class Client {

    private Type person;// тип: физ. или юр. лицо
    private String name;//- ФИО (для физ лиц)- Название организации (для юр. лиц)
    private String adress;//- Адрес

    /**
     * конструктор с параметрами для Клиента
     *
     * @param pers  одно из значений перечисления, тип: физ. или юр. лицо
     * @param names ФИО (для физ лиц)- Название организации (для юр. лиц)
     * @param adr   Адрес
     */
    public Client(Type pers, String names, String adr) {
        this.setPerson(pers);
        this.setName(names);
        this.setName(adr);
    }

    /**
     * Переопределение метода toString для читаемого вывода информации по объекту типа Клиент
     *
     * @return строку с информацией: тип(физ\юрид лицо)+ ФИО\название организации+ адрес
     */
    @Override
    public String toString() {
        return "Person:" + this.getPerson() + "\tName:" + this.getName() + "\tAdress:" + this.getAdress();
    }

    /**
     * геттер
     *
     * @return одно из значений перечисления Type, физ. или юр. лицо
     */
    private Type getPerson() {
        return person;
    }

    /**
     * сеттер
     *
     * @param person одно из значений перечисления Type, физ. или юр. лицо
     */
    public void setPerson(Type person) {
        this.person = person;
    }

    /**
     * геттер
     *
     * @return строку ФИО (для физ лиц), Название организации (для юр. лиц)
     */
    public String getName() {
        return name;
    }

    /**
     * @param name строка ФИО (для физ лиц)- Название организации (для юр. лиц)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * геттер
     *
     * @return строку адреса клиента
     */
    public String getAdress() {
        return adress;
    }

    /**
     * сеттер
     *
     * @param adress строка адреса Клиента
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }
}

/**
 * Перечисление для определения лица Клиента: LEGAL - юридическое, NATURAL - физическое
 */
enum Type {
    NATURAL,//физическое лицо
    LEGAL//юридическое лицо
}