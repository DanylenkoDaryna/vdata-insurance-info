package ua.profitsoft.pract1;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/**
 *This class is used to contain the main info about client`s Contract: identifier, Client, Insured Persons, dates
 * @author Daryna
 */
public class Contract {

    private int id;
    private LocalDate acceptDate;
    private LocalDate startDate, endDate;
    private Client man;
    private ArrayList<InsuredPerson> personList;


    /**Constructs a new Contract with the specified info about Client, dates, list of insured persons
     * @param number identifies the Contract
     * @param accDate date of conclusion of our Contract
     * @param start date when Contract starts to act
     * @param end date when Contract ends to act
     * @param human  Client(type) that initiate this Contract
     * @param myList List of insured persons(generic type InsuredPerson)
     */
    public Contract(int number, LocalDate accDate, LocalDate start, LocalDate end, Client human, ArrayList<InsuredPerson> myList) {
        this.setId(number);
        this.setAcceptDate(accDate);
        this.setStartDate(start);
        this.setEndDate(end);
        this.setMan(human);
        this.setPersonList(myList);
    }


    /**
     * Overrided method that prints the main info about object Contract
     * Return String with all the attributes of class in readable state
     *
     * @return StringBuilder
     */
    @Override
    public String toString() {

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String border = "\n----------------------------------------------------\n";
        return border + "ContractID:\t" + this.getId() + "\nAcceptDate:\t" + this.getAcceptDate().format(form) +
                "\nStartDate:\t" + this.getStartDate().format(form) + "\nEndDate:\t" + this.getEndDate().format(form)
                + "\nClient:\t" + this.getMan().toString() + "\nPersonList:" + this.getPersonList();
    }

    /**
     * Method that counts and prints the total cost of insurance by the Contract (as the sum of all insured persons)
     * enumerates the collection and summarizes all the individual values of the insured persons
     */
    public void TotalCost() {
        double result = 0;
        for (InsuredPerson p : this.getPersonList()) {
            result += p.getPersonalCost();
        }
        System.out.println("\nTotal insurance cost:\t" + result);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getMan() {
        return man;
    }

    public void setMan(Client man) {
        this.man = man;
    }

    public ArrayList<InsuredPerson> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<InsuredPerson> personList) {
        this.personList = personList;
    }


    public LocalDate getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(LocalDate acceptDate) {
        this.acceptDate = acceptDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
