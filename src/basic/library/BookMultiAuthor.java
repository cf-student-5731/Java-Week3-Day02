package basic.library;

import basic.Author;

import java.util.Arrays;

public class BookMultiAuthor {
    private String name;
    private Author[] author;
    private double price;
    private int quantity;


    public BookMultiAuthor(String name, Author[] author, double price, int quantity) {
        setName(name);
        setAuthor(author);
        setPrice(price);
        setQuantity(quantity);
    }

    public BookMultiAuthor(String name, Author[] author, double price) {
        setName(name);
        setAuthor(author);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Arrays.toString(author);
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BookMultiAuthor{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}