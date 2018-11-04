package ua.profitsoft.pract1;

import java.util.*;

/**
 * Этот класс нужен для примера инициализации и наполнения объекта Договор, с выводом на консоль основных атрибутов
 * договора и общей стоимости страховки
 *
 * @author Дарина Даниленко
 */
public class Storage {

    public static void main(String args[]) {
        System.out.print("Contains in storage:");

        Client first = new Client(Type.LEGAL, "\"StarLife\"", "sq. Constitutciy 17");
        ArrayList<InsuredPerson> firstList = new ArrayList<>();
        firstList.add(new InsuredPerson("Pavlik Viktor", new MyDate(1, 12, 1995), 123.50));
        firstList.add(new InsuredPerson("Chelentano Adriano", new MyDate(20, 8, 1971), 1150));
        Contract ID41 = new Contract(41, new MyDate(1, 9, 2018),
                new MyDate(1, 10, 2018), new MyDate(1, 10, 2020),
                first, firstList);
        System.out.print(ID41.toString());
        ID41.TotalCost();

        Client seckond = new Client(Type.NATURAL, "Petrichenko A.V.", "st. Klochkovskaya, 111-A");
        ArrayList<InsuredPerson> secList = new ArrayList<>();
        secList.add(new InsuredPerson("Ivashenko I.N.", new MyDate(3, 10, 1982), 220.55));
        secList.add(new InsuredPerson("Danylchenko D.H.", new MyDate(14, 12, 1997), 49.99));
        secList.add(new InsuredPerson("ProfITsoft", new MyDate(7, 8, 2002), 0.0));

        Contract ID42 = new Contract(42, new MyDate(17, 8, 2015),
                new MyDate(17, 9, 2002), new MyDate(17, 9, 2019),
                seckond, secList);
        System.out.print(ID42.toString());
        ID42.TotalCost();

    }

}
