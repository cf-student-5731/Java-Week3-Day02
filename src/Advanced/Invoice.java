package Advanced;

import java.util.ArrayList;


class Position{
    private int quantity;
    private Product product;

    public Position(int quantity, Product product) {
        setQuantity(quantity);
        setProduct(product);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

public class Invoice{
    private int number;
    ArrayList<Position> positions = new ArrayList<>();

    public Invoice(int number) {
        setNumber(number);
    }

    public void addPosition(int quantity, Product product) {
        Position position = new Position(quantity, product);
        positions.add(position);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Position> getPositions() {
        return new ArrayList<>(positions);
    }

    public int getNumber() {
        return number;
    }

    public void printInvoice(){
        float totalExcl = 0f;
        float totalIncl = 0f;
        System.out.println("Invoice Nr.:" + getNumber());
        for (Position p : positions){
            System.out.printf("%-20s %-5.2f -  %.0f%s   qnt: %-5d ---> %5.2f excl.%n", (p.getProduct().getName()).toUpperCase(), p.getProduct().getPrice(), (p.getProduct().getTaxPercentage()*100),"%", p.getQuantity(), (p.getProduct().getPrice()*p.getQuantity()));
            totalExcl += (p.getProduct().getPrice()*p.getQuantity());
            totalIncl += (p.getProduct().getPrice()*p.getQuantity()*(p.getProduct().getTaxPercentage()+1f));
        }
        System.out.println();
        System.out.printf("%-20s %5.2f%n", "Total before Tax:" ,totalExcl);
        System.out.printf("%-20s %5.2f%n", "Tax", totalIncl-totalExcl);
        System.out.printf("%-20s %5.2f%n", "Total after Tax:", totalIncl);
        System.out.println("---------------------------------------------------------------");
        System.out.println();
    }

    public float getSumExcl(){
        float sum = 0f;
        for (Position p : positions){
            sum += p.getProduct().getPrice()*p.getQuantity();
        }
        return sum;
    }

    public float getSumIncl(){
        float sum = 0f;
        for (Position p : positions){
            sum += (p.getProduct().getPrice()*p.getQuantity()*(p.getProduct().getTaxPercentage()+1f));
        }
        return sum;
    }



}
