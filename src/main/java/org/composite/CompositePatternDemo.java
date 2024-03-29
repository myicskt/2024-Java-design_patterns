package org.composite;

public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee CEO = new Employee("smith hurt", "ceo",340000);
        Employee salesHead = new Employee("patrick ", "Head of sales",240000);
        Employee marketingHead = new Employee("aline", "Marketing Head",210000);


        CEO.add(marketingHead);
        CEO.add(salesHead);

        Employee sales = new Employee("Jeremy","sales", 13000);
        Employee sales2 = new Employee("Jeremy","sales", 13000);

        salesHead.add(sales);
        salesHead.add(sales2);

        displayOrganazationHierarcy(CEO);



    }

    public static void displayOrganazationHierarcy(Employee ceo){

        for (Employee sub :ceo.getReporte()) {
            System.out.println("--"+sub );
            if(!sub.getReporte().isEmpty()){
                displayOrganazationHierarcy(sub);
            }

        }
    }
}
