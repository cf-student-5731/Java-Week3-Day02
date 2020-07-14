package Advanced;

import java.util.ArrayList;

public class myShop {

    public static void main(String[] args) {
        Product c01 = new Product("toiletPaper", 19.90f, Product.Type.COMMODITY);
        Product c02 = new Product("Hammer", 49.90f, Product.Type.COMMODITY);
        Product c03 = new Product("Knife", 9.90f, Product.Type.COMMODITY);
        Product c04 = new Product("Hammer", 49.90f, Product.Type.COMMODITY);

        Product f01 = new Product("Sandwich", 4.90f, Product.Type.FOOD);
        Product f02 = new Product("Banana", 1.90f, Product.Type.FOOD);
        Product f03 = new Product("Apple", 0.90f, Product.Type.FOOD);
        Product f04 = new Product("Burger", 13.90f, Product.Type.FOOD);

        Product d01 = new Product("Water", 3.90f, Product.Type.DRINKS);
        Product d02 = new Product("Apple Juice", 9.90f, Product.Type.DRINKS);
        Product d03 = new Product("Orange Juice", 13.90f, Product.Type.DRINKS);
        Product d04 = new Product("Water with Sugar", 1.90f, Product.Type.DRINKS);


        System.out.println();
        Invoice i01 = new Invoice(1);
        i01.addPosition(15, c01);
        i01.addPosition(10, f01);
        i01.addPosition(3, d03);
//        i01.printInvoice();

        Invoice i02 = new Invoice(2);
        i02.addPosition(4, d02);
        i02.addPosition(7, f03);
//        i02.printInvoice();

        Invoice i03 = new Invoice(3);
        i03.addPosition(4, c04);
        i03.addPosition(2, f04);
        i03.addPosition(3, d01);

        Invoice i04 = new Invoice(4);
        i04.addPosition(7, d04);
        i04.addPosition(12, c03);
        i04.addPosition(9, f02);


        Customer boban = new Customer("boban");
        boban.addInvoice(i01);
        boban.addInvoice(i02);
//        boban.printInvoices();

        Customer john = new Customer("john");
        john.addInvoice(i03);
        john.addInvoice(i04);
//        john.printInvoices();

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(boban);
        customers.add(john);

        float totalExcl = 0f;
        float totalIncl = 0f;
        for(Customer c : customers){
            c.printInvoices();
            totalExcl += c.getSumExcl();
            totalIncl += c.getSumIncl();
        }
        System.out.println();
        System.out.printf("%-30s %5.2f%n", "Total of Day before Tax:" ,totalExcl);
        System.out.printf("%-30s %5.2f%n", "Tax of Day", totalIncl-totalExcl);
        System.out.printf("%-30s %5.2f%n", "Total of Day after Tax:", totalIncl);
        System.out.println("---------------------------------------------------------------");
        System.out.println();


    }



}
