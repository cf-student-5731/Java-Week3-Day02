package Advanced;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Invoice> invoices = new ArrayList<>();

    public Customer(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addInvoice(Invoice invoice){
        invoices.add(invoice);
    };


    public void printInvoices(){
        float totalExcl = 0f;
        float totalIncl = 0f;
        System.out.println();
        System.out.println(getName()+"'s INVOICES");
        for(Invoice i : invoices){
            i.printInvoice();
            totalExcl += i.getSumExcl();
            totalIncl += i.getSumIncl();

        }
        System.out.println("OVER ALL:");
        System.out.printf("%-20s %5.2f%n", "Total before Tax:" ,totalExcl);
        System.out.printf("%-20s %5.2f%n", "Tax", totalIncl-totalExcl);
        System.out.printf("%-20s %5.2f%n", "Total after Tax:", totalIncl);

        System.out.println("===============================================================");
    }

    public float getSumExcl(){
        float sum = 0f;
        for (Invoice i : invoices){
            sum += i.getSumExcl();
        }
        return sum;
    }

    public float getSumIncl(){
        float sum = 0f;
        for (Invoice i : invoices){
            sum += i.getSumIncl();
        }
        return sum;
    }

}
