package ua.profitsoft.pract1;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/**
 *This class is used to contain the main info about Insured Persons that mentioned in the contract:  FIO(first,
 * middle, last name), personal cost of Insurance for person, date of birth
 *
 * @author Daryna
 */
public class InsuredPerson {

    private String flname;
    private double personalCost;
    private LocalDate btdate;


    /** Constructs a new Insured Person with the specified parameters of this person
     * @param name String FIO(first, middle, last name)
     * @param btdate LocalDate of birth
     * @param cost double personal cost of Insurance
     */
    public InsuredPerson(String name, LocalDate btdate, double cost) {
        this.setFlname(name);
        this.setPersonalCost(cost);
        this.setBtdate(btdate);
    }

    /**
     * Overrided method toString() that prints the main info about object InsuredPerson in readable state
     *
     * @return String with all the attributes of class InsuredPerson: FIO, date of birth, personal cost of Insurance
     */
    @Override
    public String toString() {

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "(FIO:" + this.getFlname() + "\t Date:" + this.getBtdate().format(form) + "\t Cost:" + this.getPersonalCost() + ")";

    }

    public String getFlname() {
        return flname;
    }

    public void setFlname(String flname) {
        this.flname = flname;
    }

    public double getPersonalCost() {
        return personalCost;
    }

    public void setPersonalCost(double personalCost) {
        this.personalCost = personalCost;
    }

    public LocalDate getBtdate() {
        return btdate;
    }

    public void setBtdate(LocalDate btdate) {
        this.btdate = btdate;
    }
}
